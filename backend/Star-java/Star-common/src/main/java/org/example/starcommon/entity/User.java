package org.example.starcommon.entity;

import lombok.Data;

//使用简化方法
@Data
public class User {
    private String  user_id    ;
    private String  user_name  ;
    private String  email      ;
    private String  password   ;
    private Integer  sex        ;
    private String  homeip     ;
    private String  birthday   ;
    private String  introduction;
    private String  jointime   ;
    private Integer  status     ;
    private Integer  coin       ;
    private String  notice     ;
    private Integer  show       ;
    private String  pic        ;
}
