package com.easylive.api.provider;

import com.easylive.entity.constants.Constants;
import com.easylive.entity.enums.MessageTypeEnum;
import com.easylive.service.UserMessageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(Constants.INNER_API_PREFIX + "/message")
public class UserMessageApi {

    @Resource
    private UserMessageService userMessageService;

    @RequestMapping("/admin/saveUserMessage")
    void saveUserMessage(String videoId, String content) {
        userMessageService.saveUserMessage(videoId, null, MessageTypeEnum.SYS, content, null);
    }
}
