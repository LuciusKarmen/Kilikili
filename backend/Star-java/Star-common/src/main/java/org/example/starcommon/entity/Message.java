package org.example.starcommon.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Message {

    private String message_id;

    private String user_id;

    private String video_id;

    private String message_type;

    private String send_user_id;

    private String read_type;
//    0:未读   1:已读
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private Date create_time;

    private String extend_json;


}
