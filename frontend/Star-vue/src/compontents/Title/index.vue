<template>
  <div class="title">
    <div class="bar">
      <div class="left">
        <div class="bar_item"><img src="../../../public/首页.png" alt="" class="p" />首页</div>
        <div class="bar_item"><img src="../../../public/我的.png" alt="" class="p" />星辰论坛</div>
        <div class="bar_item"><img src="../../../public/收藏.png" alt="" class="p" />游戏中心</div>
        <div class="bar_item"><img src="../../../public/我的.png" alt="" class="p" />聊天室</div>
        <div class="bar_item"><img src="../../../public/我的.png" alt="" class="p" />关于我们</div>
      </div>
      <div class="mid"></div>
      <div class="right">
        <div class="bar_item_p"><img src="../../../public/" alt="" /></div>
        <div class="bar_item"><img src="../../../public/私信.png" alt="" class="p" />消息</div>
        <div class="bar_item"><img src="../../../public/我的.png" alt="" class="p" />我的</div>
        <div class="bar_item"><img src="../../../public/添加.png" alt="" class="p" />创作中心</div>
        <el-button type="danger" size="large">添加作品</el-button>
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
  background-position: center 41%;
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
      .btn {
        background: palevioletred;
      }
      .bar_item_p {
        background-color: rgb(255, 255, 255);
        border-radius: 50%;
        width: 5vh;
        height: 5vh;
        border: 2px solid rgb(16, 16, 16);
        overflow: hidden;
        box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
        transition: transform 0.2s ease;
        :hover {
          transform: scale(1.1);
        }
      }
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
