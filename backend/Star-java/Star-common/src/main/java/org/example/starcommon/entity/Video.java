package org.example.starcommon.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

//记住自己的设计核心先上传再发布
@Data
public class Video {

      private String video_id;
      private String title;
      private String pic;
      private String showtime;
      private String introduction;
      private String tap;
      private Integer show_number;
      private Integer like_number;
      private Integer coin_number;
      private Integer save_number;
      private Integer bullet_number;
      private String cate;
      private String interaction;
      private Integer is_author;
//      0:自制

      @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
      private Date add_time;

      private Integer status;

      //0:活着 1：小黑屋

      private String video_file_id;   // 源视频文件的 fileId


}
