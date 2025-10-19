package com.easylive.aspect;

import com.easylive.annotation.RecordUserMessage;
import com.easylive.api.consumer.InteractClient;
import com.easylive.entity.enums.ResponseCodeEnum;
import com.easylive.entity.vo.ResponseVO;
import com.easylive.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

@Component("userMessageOperationAspect")
@Aspect
@Slf4j
public class UserMessageOperationAspect {

    private static final String PARAMETERS_VIDEO_ID = "videoId";

    private static final String PARAMETERS_AUDIT_REJECT_REASON = "reason";

    @Resource
    private InteractClient interactClient;


    @Around("@annotation(com.easylive.annotation.RecordUserMessage)")
    public ResponseVO interceptorDo(ProceedingJoinPoint point) throws Exception {
        try {
            ResponseVO result = (ResponseVO) point.proceed();
            Method method = ((MethodSignature) point.getSignature()).getMethod();
            RecordUserMessage recordUserMessage = method.getAnnotation(RecordUserMessage.class);
            if (recordUserMessage != null) {
                saveUserMessage(point.getArgs(), method.getParameters());
            }
            return result;
        } catch (BusinessException e) {
            log.error("全局拦截器异常", e);
            throw e;
        } catch (Exception e) {
            log.error("全局拦截器异常", e);
            throw e;
        } catch (Throwable e) {
            log.error("全局拦截器异常", e);
            throw new BusinessException(ResponseCodeEnum.CODE_500);
        }
    }


    private void saveUserMessage(Object[] arguments, Parameter[] parameters) {
        String videoId = null;
        String content = null;
        for (int i = 0; i < parameters.length; i++) {
            if (PARAMETERS_VIDEO_ID.equals(parameters[i].getName())) {
                videoId = (String) arguments[i];
            } else if (PARAMETERS_AUDIT_REJECT_REASON.equals(parameters[i].getName())) {
                content = (String) arguments[i];
            }
        }
        //管理端获取不到用户信息，系统发送，不需要用户id
        interactClient.saveUserMessage(videoId, content);
    }
}