package org.example.starcommon.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

//使用简化方法
@Data
public class User {
    private String  user_id    ;
    private String  user_name  ;
    private String  email      ;
    private String  password   ;
    private Integer  sex        ;
    private String  home_ip     ;
    private String  birthday   ;
    private String  introduction;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private Date join_time;
    private Integer  status     ;
    private Integer  coin       ;
    private String  notice     ;
    private Integer  show       ;
    private String  pic        ;
    private Integer  role      ;

}
