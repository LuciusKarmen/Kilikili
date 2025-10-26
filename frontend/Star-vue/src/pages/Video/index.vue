<template>
  <div class="video">
    <div class="title">
      <Blank></Blank>
    </div>
    <div class="main">
      <div class="left">
        <div class="video_box">
          <div class="top"></div>
          <div class="v"></div>
          <div class="more"></div>
          <div class="info"></div>
        </div>
        <div class="commit"></div>
      </div>
      <div class="right">
        <div class="right_t"></div>
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
  background-color: rgb(127, 255, 42);
  .main {
    width: 100%;
    height: 100vh;
    padding-left: 12.6vw;
    padding-right: 12.6vw;
    background-color: rgb(255, 215, 166);
    display: flex;
    flex-flow: row;
    .left {
      width: 65%;
      height: 100%;
      background-color: aqua;
      .video_box {
        width: 100%;
        height: 100vh;
        .top {
          width: 100%;
          height: 10vh;
          background-color: rgb(255, 255, 255);
        }
        .v {
          width: 100%;
          height: 50vh;
          background-color: rgb(208, 53, 255);
        }
        .more {
          width: 100%;
          height: 5vh;
          background-color: rgb(22, 166, 255);
        }
        .info {
          width: 100%;
          height: 5vh;
          background-color: rgb(255, 121, 121);
        }
      }
    }
    .right {
      width: 26.8vw;
      padding-left: 2.4vw;
      height: 100%;
      background-color: rgb(255, 58, 209);
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
