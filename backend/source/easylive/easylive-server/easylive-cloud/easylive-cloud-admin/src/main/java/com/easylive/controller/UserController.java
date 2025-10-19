package com.easylive.controller;

import com.easylive.api.consumer.WebClient;
import com.easylive.entity.query.UserInfoQuery;
import com.easylive.entity.vo.ResponseVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@Validated
public class UserController extends ABaseController {

    @Resource
    private WebClient webClient;

    @RequestMapping("/loadUser")
    public ResponseVO loadUser(UserInfoQuery userInfoQuery) {
        return getSuccessResponseVO(webClient.loadUser(userInfoQuery));
    }

    @RequestMapping("/changeStatus")
    public ResponseVO changeStatus(String userId, Integer status) {
        webClient.changeStatus(userId, status);
        return getSuccessResponseVO(null);
    }
}
