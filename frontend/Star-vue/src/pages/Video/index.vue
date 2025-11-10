<template>
  <div class="video">
    <div class="title">
      <Blank></Blank>
    </div>
    <div class="main">
      <div class="left">
        <div class="video_box">
          <div class="top">
            <div class="title">测试视频</div>
            <div class="number">
              <div>播放量</div>
              <div>弹幕数</div>
              <div>2025年10月27日23:38:48</div>
              <div>自制</div>
            </div>
          </div>
          <div class="v">
            <img src="../../../public/茉莉.png" alt="" />
          </div>
          <div class="more"></div>
          <div class="info">
            <div>点赞</div>
            <div>投币</div>
            <div>收藏</div>
            <div>转发</div>
          </div>
        </div>
        <div class="tap"></div>
        <div class="commit">
          <div class="title">评论</div>
          <div class="commit_box">
            <div class="pic">
              <img src="../../../public/头像.png" alt="" />
            </div>
          </div>
          <div class="commit_list">
            <div class="commit_item">
              <div class="pic">
                <img src="../../../public/头像.png" alt="" />
              </div>
              <div class="info">
                <div class="name">萝卜开会</div>
                <div class="time">2025年10月27日23:38:48</div>
                <div class="content">我吃瓜了</div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="right">
        <div class="right_t">
          <div class="face">
            <div class="pic"><img src="" alt="" /></div>
          </div>
          <div class="ind">
            <div class="name">萝卜开会</div>
            <div class="tip">我是一个小萝卜~~~~</div>
            <div class="box">
              <el-button>私信</el-button>
              <el-button type="danger">关注</el-button>
            </div>
          </div>
        </div>
        <div class="right_m">
          <div class="ad">
            <div class="v"><img src="" alt="" /></div>
            <div class="info">
              <div class="title">广告</div>
              <div class="up">官方</div>
              <div class="other">
                <div class="show">虚位以待</div>
              </div>
            </div>
          </div>
        </div>
        <div class="right_b">
          <div class="ad">
            <div class="v"><img src="" alt="" /></div>
            <div class="info">
              <div class="title">中华人民共和国万岁!</div>
              <div class="up">up:暗夜星辰</div>
              <div class="other">
                <div class="show">播放量</div>
                <div class="bullet">弹幕</div>
              </div>
            </div>
          </div>
          <div class="ad">
            <div class="v"><img src="" alt="" /></div>
            <div class="info">
              <div class="title">中华人民共和国万岁!</div>
              <div class="up">up:暗夜星辰</div>
              <div class="other">
                <div class="show">播放量</div>
                <div class="bullet">弹幕</div>
              </div>
            </div>
          </div>
          <div class="ad">
            <div class="v"><img src="" alt="" /></div>
            <div class="info">
              <div class="title">中华人民共和国万岁!</div>
              <div class="up">up:暗夜星辰</div>
              <div class="other">
                <div class="show">播放量</div>
                <div class="bullet">弹幕</div>
              </div>
            </div>
          </div>
          <div class="ad">
            <div class="v"><img src="" alt="" /></div>
            <div class="info">
              <div class="title">中华人民共和国万岁!</div>
              <div class="up">up:暗夜星辰</div>
              <div class="other">
                <div class="show">播放量</div>
                <div class="bullet">弹幕</div>
              </div>
            </div>
          </div>
          <div class="ad">
            <div class="v"><img src="" alt="" /></div>
            <div class="info">
              <div class="title">中华人民共和国万岁!</div>
              <div class="up">up:暗夜星辰</div>
              <div class="other">
                <div class="show">播放量</div>
                <div class="bullet">弹幕</div>
              </div>
            </div>
          </div>
          <div class="ad">
            <div class="v"><img src="" alt="" /></div>
            <div class="info">
              <div class="title">中华人民共和国万岁!</div>
              <div class="up">up:暗夜星辰</div>
              <div class="other">
                <div class="show">播放量</div>
                <div class="bullet">弹幕</div>
              </div>
            </div>
          </div>
          <div class="ad">
            <div class="v"><img src="" alt="" /></div>
            <div class="info">
              <div class="title">中华人民共和国万岁!</div>
              <div class="up">up:暗夜星辰</div>
              <div class="other">
                <div class="show">播放量</div>
                <div class="bullet">弹幕</div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script lang="ts" setup name="">
import { ref } from 'vue'
import Blank from '../../compontents/Title/blank.vue'
</script>
<style lang="scss" scoped>
// 48.62vw 1.777
.video {
  width: 100vw;
  min-height: 90vh;
  // 上面空10vh
  .title {
    width: 100%;
    height: 10vh;
  }
  .main {
    width: 100%;
    height: 100%;
    padding-left: 12.6vw;
    padding-right: 12.6vw;
    display: flex;
    flex-flow: row;
    .left {
      width: 65%;
      height: 100%;
      .tap {
        width: 100%;
        height: 2vh;
      }

      .commit {
        width: 100%;
        margin-top: 2vh;
        .title {
          font-size: 2.2vh;
          font-weight: 500;
          margin-bottom: 1.5vh;
        }

        .commit_box {
          width: 100%;
          height: 6vh;
          display: flex;
          align-items: center;
          background-color: rgb(248, 248, 248);
          border-radius: 8px;
          padding: 0 1vw;
          box-shadow: rgb(143, 143, 143) 0 0 1px;
          .pic {
            height: 70%;
            aspect-ratio: 1;
            border-radius: 50%;
            overflow: hidden;
            img {
              width: 100%;
              height: 100%;
              object-fit: cover;
            }
          }
        }

        .commit_list {
          width: 100%;
          margin-top: 2vh;
          display: flex;
          flex-direction: column;
          gap: 1.8vh;

          .commit_item {
            display: flex;
            gap: 1vw;
            .pic {
              height: 5vh;
              aspect-ratio: 1;
              border-radius: 50%;
              overflow: hidden;
              img {
                width: 100%;
                height: 100%;
                object-fit: cover;
              }
            }
            .info {
              flex: 1;
              display: flex;
              flex-direction: column;
              gap: 0.4vh;
              .name {
                font-size: 1.6vh;
                font-weight: 500;
              }
              .time {
                font-size: 1.2vh;
                color: rgb(153, 153, 153);
              }
              .content {
                font-size: 1.5vh;
                line-height: 1.6;
                margin-top: 0.5vh;
              }
            }
          }
        }
      }
      .video_box {
        width: 100%;
        height: 100vh;
        .top {
          width: 100%;
          height: 14vh;
          background-color: rgb(255, 255, 255);
          display: flex;
          flex-flow: column;
          .title {
            width: 100%;
            margin-top: 2vh;
            font-size: 3.1vh;
            font-weight: 500;
            margin-bottom: 1vh;
            padding-left: 0.5vw;
          }
          .number {
            width: 100%;
            height: 23%;
            display: flex;
            flex-flow: row;
            justify-content: left;
            color: rgb(179, 179, 179);
            font-size: 1.7vh;
            gap: 2vw;
            padding-left: 0.5vw;
          }
        }
        .v {
          width: 100%;
          aspect-ratio: 1.7768;
          img {
            width: 100%;
            height: 100%;
            object-fit: cover;
            object-position: center;
          }
        }
        .more {
          width: 100%;
          height: 6vh;
          background-color: rgb(248, 248, 248);
          display: flex;
          flex-flow: row;
          border-radius: 0 0 10px 10px;
          box-shadow: rgb(143, 143, 143) 0 0 1px;
        }
        .info {
          width: 100%;
          height: 5vh;
          margin-top: 3vh;
          display: flex;
          flex-flow: row;
          justify-content: left;
          gap: 1.5vw;
          border-radius: 10px;
          background-color: rgb(248, 248, 248);
          box-shadow: rgb(143, 143, 143) 0 0 1px;
        }
      }
    }
    .right {
      width: 26.8vw;
      padding-left: 2.4vw;
      height: 100%;
      .right_t {
        width: 100%;
        aspect-ratio: 3.3;
        display: flex;
        flex-flow: row;
        .pic {
          height: 100%;
          aspect-ratio: 1;
          border-radius: 50%;
          padding: 20px;
          img {
            width: 100%;
            height: 100%;
            object-fit: cover;
            border-radius: 50%;
            border: 2px solid rgb(63, 177, 248);
          }
        }
        .ind {
          width: 80%;
          height: 100%;
          display: flex;
          flex-flow: column;
          padding: 15px;
          gap: 0.5vh;
          .name {
            font-size: 1vw;
            font-weight: 500;
          }
          .tip {
            font-size: 0.8vw;
            color: rgb(153, 153, 153);
          }
          .box {
            width: 100%;
            height: 40%;
            .el-button {
              width: 40%;
              flex: 1;
              height: 100%;
              font-size: 1vw;
            }
          }
        }
      }
      .right_m {
        width: 100%;
        aspect-ratio: 2.2;
        .ad {
          width: 100%;
          height: 15vh;
          display: flex;
          flex-flow: row;
          background-color: rgb(255, 255, 255);
          .v {
            height: 90%;
            aspect-ratio: 1.7768;
            padding: 10px;
            border-radius: 5px;
            img {
              width: 100%;
              height: 100%;
              object-fit: cover;
              object-position: center;
              border-radius: 5px;
            }
          }
          .info {
            height: 100%;
            display: flex;
            flex-flow: column;
            padding: 10px;
            gap: 0.5vh;
            .title {
              font-size: 1vw;
              font-weight: 400;
            }
            .up {
              font-size: 0.8vw;
              color: rgb(153, 153, 153);
            }
            .other {
              width: 100%;
              height: 20%;
              display: flex;
              flex-flow: row;
              justify-content: space-between;
              .show {
                font-size: 0.8vw;
                color: rgb(153, 153, 153);
              }
              .bullet {
                font-size: 0.8vw;
              }
            }
          }
        }
      }
      .right_b {
        width: 100%;
        min-height: 70vh;
        display: flex;
        flex-flow: column;
        .ad {
          width: 100%;
          height: 15vh;
          display: flex;
          flex-flow: row;
          background-color: rgb(255, 255, 255);
          .v {
            height: 90%;
            aspect-ratio: 1.7768;
            padding: 10px;
            border-radius: 5px;
            img {
              width: 100%;
              height: 100%;
              object-fit: cover;
              object-position: center;
              border-radius: 5px;
            }
          }
          .info {
            height: 100%;
            display: flex;
            flex-flow: column;
            padding: 10px;
            gap: 0.5vh;
            .title {
              font-size: 1vw;
              font-weight: 400;
            }
            .up {
              font-size: 0.8vw;
              color: rgb(153, 153, 153);
            }
            .other {
              width: 100%;
              height: 20%;
              display: flex;
              flex-flow: row;
              justify-content: space-between;
              .show {
                font-size: 0.8vw;
                color: rgb(153, 153, 153);
              }
              .bullet {
                font-size: 0.8vw;
              }
            }
          }
        }
      }
    }
  }
}
</style>
<!-- 这两天搁置 -->
