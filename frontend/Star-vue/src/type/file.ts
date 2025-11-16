export interface file {
  // private String fileId;           // 唯一ID（UUID）
  // private String fileName;         // 原始文件名，如 "原神教程.mp4"
  // private String filePath;         // 存储路径（如 OSS 的 key / MinIO 路径）
  // private String fileType;         // video / image / audio / doc
  // private Long fileSize;           // 字节大小，如 1048576 = 1MB
  // private String mimeType;         // MIME类型，如 video/mp4, image/jpeg
  // private String uploaderId;       // 上传者用户ID
  // private String relatedType;      // 关联类型：video_cover, avatar, video_source
  // private String relatedId;        // 关联ID：如 video_id 或 user_id
  // private Integer status;          // 状态：0-上传中, 1-成功, 2-失败, 3-已删除, 4-待审核
  // private String storageType;      // 存储类型：local, oss, cos, minio
  // @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  // @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  // private Date uploadTime;
  // private String thumbnailPath;    // 缩略图路径（可选，用于封面/视频首帧）
  // private String metaData;         // 其他元数据（JSON格式）：分辨率、时长、哈希值等

  fileId: string
  fileName: string
  filePath: string
  fileType: string
  fileSize: number
  mimeType: string
  uploaderId: string
  relatedType: string
  relatedId: string
  status: number
  storageType: string
  uploadTime: Date
  thumbnailPath: string
  metaData: string
}
