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
        <div class="commit"></div>
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
          <div class="ad"></div>
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
// 48.62vw 1.7768
.video {
  width: 100vw;
  min-height: 100vh;
  .main {
    width: 100%;
    height: 100vh;
    padding-left: 12.6vw;
    padding-right: 12.6vw;
    display: flex;
    flex-flow: row;
    .left {
      width: 65%;
      height: 100%;
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
          height: 10vh;
          margin-top: 3vh;

          display: flex;
          flex-flow: row;
          justify-content: space-around;
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
        background-color: rgb(48, 224, 255);
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
