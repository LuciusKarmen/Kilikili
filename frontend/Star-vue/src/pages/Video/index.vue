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
          <div class="right_t_l">1</div>
          <div class="right_t_r">2</div>
        </div>
        <div class="right_b"></div>
      </div>
    </div>
  </div>
</template>
<script lang="ts" setup name="">
import { ref } from 'vue'
import Blank from '../../compontents/Title/blank.vue'
</script>
<style lang="scss" scoped>
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
          height: 55vh;
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
        height: 30vh;
        background-color: rgb(238, 91, 91);
      }
      .right_b {
        width: 100%;
        min-height: 70vh;
        background-color: rgb(204, 255, 0);
      }
    }
  }
}
</style>
