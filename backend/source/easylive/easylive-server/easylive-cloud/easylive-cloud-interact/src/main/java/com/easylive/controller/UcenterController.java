package com.easylive.controller;

import com.easylive.annotation.GlobalInterceptor;
import com.easylive.entity.dto.TokenUserInfoDto;
import com.easylive.entity.query.VideoCommentQuery;
import com.easylive.entity.query.VideoDanmuQuery;
import com.easylive.entity.vo.PaginationResultVO;
import com.easylive.entity.vo.ResponseVO;
import com.easylive.service.VideoCommentService;
import com.easylive.service.VideoDanmuService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;

@RestController
@Validated
@RequestMapping("/ucenter")
public class UcenterController extends ABaseController {

    @Resource
    private VideoDanmuService videoDanmuService;

    @Resource
    private VideoCommentService videoCommentService;


    @RequestMapping("/loadComment")
    @GlobalInterceptor(checkLogin = true)
    public ResponseVO loadComment(Integer pageNo, String videoId) {
        TokenUserInfoDto tokenUserInfoDto = getTokenUserInfoDto();
        VideoCommentQuery commentQuery = new VideoCommentQuery();
        commentQuery.setVideoUserId(tokenUserInfoDto.getUserId());
        commentQuery.setVideoId(videoId);
        commentQuery.setOrderBy("comment_id desc");
        commentQuery.setPageNo(pageNo);
        commentQuery.setQueryVideoInfo(true);
        PaginationResultVO resultVO = videoCommentService.findListByPage(commentQuery);
        return getSuccessResponseVO(resultVO);
    }


    @RequestMapping("/delComment")
    @GlobalInterceptor(checkLogin = true)
    public ResponseVO delComment(@NotNull Integer commentId) {
        TokenUserInfoDto tokenUserInfoDto = getTokenUserInfoDto();
        videoCommentService.deleteComment(tokenUserInfoDto.getUserId(), commentId);
        return getSuccessResponseVO(null);
    }

    @RequestMapping("/loadDanmu")
    @GlobalInterceptor(checkLogin = true)
    public ResponseVO loadDanmu(Integer pageNo, String videoId) {
        TokenUserInfoDto tokenUserInfoDto = getTokenUserInfoDto();
        VideoDanmuQuery danmuQuery = new VideoDanmuQuery();
        danmuQuery.setVideoUserId(tokenUserInfoDto.getUserId());
        danmuQuery.setVideoId(videoId);
        danmuQuery.setOrderBy("danmu_id desc");
        danmuQuery.setPageNo(pageNo);
        danmuQuery.setQueryVideoInfo(true);
        PaginationResultVO resultVO = videoDanmuService.findListByPage(danmuQuery);
        return getSuccessResponseVO(resultVO);
    }


    @RequestMapping("/delDanmu")
    @GlobalInterceptor(checkLogin = true)
    public ResponseVO delDanmu(@NotNull Integer danmuId) {
        TokenUserInfoDto tokenUserInfoDto = getTokenUserInfoDto();
        videoDanmuService.deleteDanmu(tokenUserInfoDto.getUserId(), danmuId);
        return getSuccessResponseVO(null);
    }
}
