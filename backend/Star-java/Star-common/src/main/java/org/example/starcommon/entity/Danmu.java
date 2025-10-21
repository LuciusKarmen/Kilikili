package org.example.starcommon.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Danmu {

    private Long id;              // 弹幕ID

    private String videoId;       // 视频ID

    private String userId;        // 用户ID

    private String userName;      // 用户名（冗余，避免查询）

    private String userPic;       // 用户头像（冗余）

    private String content;       // 弹幕内容（文本）

    private Double time;          // 出现时间（秒），如 123.45 表示 2:03.45

    private Integer type;         // 类型：0-滚动, 1-顶部, 2-底部, 3-逆向, 4-精准（高级）

    private Integer color;        // 颜色（RGB值，如 0xFFFFFF 白色）

    private Integer fontSize;     // 字号：0-小, 1-中, 2-大

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;      // 发送时间

    private Integer status;       // 状态：0-屏蔽, 1-正常
}