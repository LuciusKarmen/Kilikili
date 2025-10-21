package org.example.starcommon.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Action {
    private Integer actionId;

    /**
     * 视频ID
     */
    private String videoId;

    /**
     * 视频用户ID
     */
    private String videoUserId;

    /**
     * 评论ID
     */
    private Integer commentId;

    /**
     * 评论 视频
     */

    private String targetType;

    /**
     * 0:评论喜欢点赞 1:举报屏蔽 2:视频点赞 3:视频收藏 4:视频投币
     */
    private Integer actionType;

    /**
     * 数量
     */
    private Integer actionCount;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 操作时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date actionTime;

}
