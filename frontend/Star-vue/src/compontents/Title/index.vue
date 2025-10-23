<template>
  <div class="title">
    <div class="bar">
      <div class="left">
        <div class="bar_item"><img src="../../../public/首页.png" alt="" class="p" />首页</div>
        <div class="bar_item"><img src="../../../public/共享.png" alt="" class="p" />星辰论坛</div>
        <div class="bar_item"><img src="../../../public/收藏.png" alt="" class="p" />游戏中心</div>
        <div class="bar_item"><img src="../../../public/分享.png" alt="" class="p" />聊天室</div>
        <div class="bar_item"><img src="../../../public/评论.png" alt="" class="p" />关于我们</div>
      </div>
      <div class="mid"></div>
      <div class="right">
        <div class="bar_item">头像</div>
        <div class="bar_item"><img src="../../../public/私信.png" alt="" class="p" />消息</div>
        <div class="bar_item"><img src="../../../public/定位.png" alt="" class="p" />我的</div>
        <div class="bar_item"><img src="../../../public/添加.png" alt="" class="p" />创作中心</div>
        <button class="btn">上传</button>
      </div>
    </div>
  </div>
</template>
<script lang="ts" setup name="Title">
import { ref } from 'vue'
</script>
<style lang="scss" scoped>
.title {
  width: 100vw;
  height: 22vh;
  background-image: url('../../../public/face.png');
  background-size: cover;
  background-position: center 44%;
  background-repeat: no-repeat;
  .bar {
    width: 100%;
    height: 8vh;
    display: flex;
    justify-content: space-between;
    align-items: center;
    color: aliceblue;
    font-weight: 600;
    .left {
      width: 40%;
      display: flex;
      justify-content: space-around;
      align-items: center;
      .bar_item {
        width: 20%;
        height: 100%;
        font-size: 2.2vh;
        .p {
          width: 3vh;
          height: 3vh;
          vertical-align: middle; // 关键：与文字垂直居中对齐
          margin-right: 0.5vh; // 和文字之间加点空隙
        }
        &:hover {
          // 向上移动一点
          transform: translateY(-0.5vh);
        }
      }
    }
    .mid {
      width: 20%;
      height: 60%;
      background-color: rgb(244, 244, 244);
      border: 1px solid rgb(68, 68, 68);
      border-radius: 20px;
    }
    .right {
      width: 40%;
      display: flex;
      justify-content: space-around;
      .bar_item {
        width: 20%;
        height: 100%;
        font-size: 2.2vh;
        .p {
          width: 3vh;
          height: 3vh;
          vertical-align: middle; // 关键：与文字垂直居中对齐
          margin-right: 0.5vh; // 和文字之间加点空隙
        }
        &:hover {
          // 向上移动一点
          transform: translateY(-0.5vh);
        }
      }
    }
  }
}
</style>
