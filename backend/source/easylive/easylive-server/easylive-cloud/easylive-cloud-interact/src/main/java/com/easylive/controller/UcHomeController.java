package com.easylive.controller;

import com.easylive.annotation.GlobalInterceptor;
import com.easylive.entity.enums.UserActionTypeEnum;
import com.easylive.entity.query.UserActionQuery;
import com.easylive.entity.vo.PaginationResultVO;
import com.easylive.entity.vo.ResponseVO;
import com.easylive.service.UserActionService;
import com.easylive.service.VideoCommentService;
import com.easylive.service.VideoDanmuService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.NotEmpty;

@RestController
@Validated
@RequestMapping("/uhome")
public class UcHomeController extends ABaseController {

    @Resource
    private UserActionService userActionService;

    @Resource
    private VideoDanmuService videoDanmuService;

    @Resource
    private VideoCommentService videoCommentService;

    @RequestMapping("/loadUserCollection")
    @GlobalInterceptor
    public ResponseVO loadUserCollection(@NotEmpty String userId, Integer pageNo) {
        UserActionQuery actionQuery = new UserActionQuery();
        actionQuery.setActionType(UserActionTypeEnum.VIDEO_COLLECT.getType());
        actionQuery.setUserId(userId);
        actionQuery.setPageNo(pageNo);
        actionQuery.setQueryVideoInfo(true);
        actionQuery.setOrderBy("action_time desc");
        PaginationResultVO resultVO = userActionService.findListByPage(actionQuery);
        return getSuccessResponseVO(resultVO);
    }
}
