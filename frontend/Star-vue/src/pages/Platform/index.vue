<template>
  <div class="pf">
    <div class="top">
      <div class="logo"><img src="../../../public/Starlogo.png" alt="" /></div>
      <div class="back" @click="home">回到主页</div>
    </div>
    <div class="left">
      <div class="pro">首页</div>
      <div class="pro">内容管理</div>
      <div class="pro">稿件审核</div>
      <div class="pro">数据中心</div>
      <div class="pro">粉丝管理</div>
      <div class="pro">社区公约</div>
    </div>
    <div class="right"></div>
  </div>
</template>
<script lang="ts" setup name="">
import { ref } from 'vue'
import router from '@/router'
const home = () => {
  router.push('/')
}
</script>
<style lang="scss" scoped>
.pf {
  width: 100vw;
  height: 100vh;
  .top {
    width: 100%;
    height: 8%;
    box-shadow: 0 0 10px rgba(186, 186, 186, 0.5);
    display: flex;
    justify-content: left;
    align-items: center;
    .logo {
      width: 10%;
      height: 100%;
      display: flex;
      justify-content: center;
      align-items: center;
      img {
        width: 70%;
        height: 70%;
        object-fit: cover;
        object-position: center;
      }
    }
    .back {
      color: rgb(156, 156, 156);
      font-weight: 500;
      font-size: 2vh;
      cursor: pointer;
    }
  }
  .left {
    width: 13%;
    height: 92%;
    display: flex;
    flex-flow: column;
    box-shadow: 0 0 10px rgba(186, 186, 186, 0.5);
    .pro {
      width: 100%;
      height: 13%;
      display: flex;
      justify-content: left;
      align-items: center;
      padding-left: 2vw;
      color: rgb(0, 0, 0);
      font-size: 2vh;
      font-weight: 500;
      cursor: pointer;
      &:hover {
        background-color: rgb(145, 145, 145);
        color: rgb(76, 76, 76);
      }
      &.active {
        background-color: rgb(151, 151, 151);
        color: rgb(120, 120, 120);
      }
      &:last-child {
        border-radius: 0 0 10px 10px;
      }
    }
  }
  .right {
    position: absolute;
    top: 8%;
    left: 13%;
    width: 87%;
    height: 92%;
    background-color: rgb(240, 240, 240);
  }
}
</style>
