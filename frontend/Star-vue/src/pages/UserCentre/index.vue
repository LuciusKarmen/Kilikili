<template>
  <div class="user">
    <div class="title">
      <ucTitle></ucTitle>
    </div>
    <div class="top">
      <div class="bar_left">
        <div class="a">主页</div>
        <div class="a">视频</div>
        <div class="a">收藏</div>
      </div>
      <div class="bar_right">
        <div class="box">
          <div class="a">关注数</div>
          <div class="b">0</div>
        </div>
        <div class="a">粉丝数</div>
        <div class="b">0</div>
        <div class="a">播放量</div>
        <div class="b">0</div>
        <div class="a">点赞数</div>
        <div class="b">0</div>
      </div>
    </div>
    <div></div>
  </div>
</template>
<script lang="ts" setup name="">
import { ref } from 'vue'
import ucTitle from '../../compontents/Title/uctitle.vue'
</script>
<style lang="scss" scoped>
.user {
  width: 100vw;
  height: 100vh;
  .top {
    width: 100vw;
    height: 10vh;
    background-color: aqua;
    display: flex;
    justify-content: space-between;
  }
}
</style>
