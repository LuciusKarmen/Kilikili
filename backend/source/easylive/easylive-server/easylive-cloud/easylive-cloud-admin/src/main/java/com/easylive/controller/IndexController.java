package com.easylive.controller;

import com.easylive.api.consumer.WebClient;
import com.easylive.entity.vo.ResponseVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/index")
@Validated
public class IndexController extends ABaseController {
    @Resource
    private WebClient webClient;

    @RequestMapping("/getActualTimeStatisticsInfo")
    public ResponseVO getActualTimeStatisticsInfo() {
        return getSuccessResponseVO(webClient.getActualTimeStatisticsInfo());
    }

    @RequestMapping("/getWeekStatisticsInfo")
    public ResponseVO getWeekStatisticsInfo(Integer dataType) {
        return getSuccessResponseVO(webClient.getWeekStatisticsInfo(dataType));
    }
}
