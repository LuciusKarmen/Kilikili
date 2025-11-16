<template>
  <div class="title">
    <div class="bar">
      <div class="left">
        <div class="bar_item" @click="home">
          <img src="../../../public/首页.png" alt="" class="p" />首页
        </div>
        <div class="bar_item" @click="bbs">
          <img src="../../../public/我的.png" alt="" class="p" />星辰论坛
        </div>
        <div class="bar_item" @click="game">
          <img src="../../../public/收藏.png" alt="" class="p" />星辰百科
        </div>
        <div class="bar_item" @click="chat">
          <img src="../../../public/我的.png" alt="" class="p" />聊天室
        </div>
        <div class="bar_item" @click="our">
          <img src="../../../public/我的.png" alt="" class="p" />关于我们
        </div>
      </div>
      <div class="mid">
        <div>search</div>
        <div class="tu"><img src="../../../public/搜索.png" alt="" /></div>
      </div>
      <div class="right">
        <el-tooltip content="个人中心" placement="bottom" effect="light">
          <div class="bar_item_p" @click="showLogin = true">
            <img src="../../../public/艾希.png" alt="头像" />
          </div>
        </el-tooltip>
        <div class="bar_item"><img src="../../../public/私信.png" alt="" class="p" />消息</div>
        <div class="bar_item"><img src="../../../public/收藏.png" alt="" class="p" />收藏</div>
        <div class="bar_item" @click="uc">
          <img src="../../../public/我的.png" alt="" class="p" />我的
        </div>
        <div class="bar_item" @click="pf">
          <img src="../../../public/添加.png" alt="" class="p" />创作中心
        </div>
        <el-button type="danger" size="large" @click="pf">添加作品</el-button>
      </div>
    </div>
    <!-- 父组件控制子组件最好的例子
      子组件通过父组件的属性控制，父组件通过事件控制子组件的属性 -->
    <Login :show="showLogin" @change="showLogin = $event"></Login>
  </div>
</template>
<script lang="ts" setup name="Title">
import { ref } from 'vue'
import Login from '../Login/login.vue'
import router from '@/router'
const showLogin = ref(false)

// 跳转页面
const home = () => {
  router.push('/')
}
const uc = () => {
  router.push('/uc')
}
const pf = () => {
  router.push('/platform')
}
const bbs = () => {
  window.open('http://xingchengnet.online:8810')
}
const game = () => {
  window.open('http://xingchengnet.online:7777')
}
const chat = () => {
  window.open('http://xingchengnet.online:8900')
}
const our = () => {
  window.open('http://xingchengnet.online:5280')
}
</script>
<style lang="scss" scoped>
.title {
  width: 100vw;
  height: 22vh;
  background-image: url('../../../public/face.png');
  background-size: cover;
  background-position: center 41%;
  background-repeat: no-repeat;
  cursor: pointer;
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
      border: 1px solid rgb(0, 0, 0);
      border-radius: 10px;
      position: relative;
      .tu {
        width: 4.5vh;
        height: 4.5vh;
        position: absolute;
        top: 0;
        right: 0;
        :hover {
          transform: translateY(-0.5vh);
        }
        img {
          width: 100%;
          height: 100%;
        }
      }
    }
    .right {
      width: 40%;
      display: flex;
      gap: 1.2vh; // 统一间距，比 space-around 更可控
      align-items: center;
      .el-button {
        flex: none;
        width: 5vw; // 或 120px，根据设计调整
        font-size: 1.2vh;
        font-weight: 600;
      }
      .bar_item_p {
        margin-left: 1vw;
        background-color: rgb(255, 255, 255);
        border-radius: 50%;
        width: 6vh;
        height: 6vh;
        border: 2px solid rgb(255, 255, 255);
        overflow: hidden;
        box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
        transition: transform 0.2s ease;
        img {
          width: 100%;
          height: 100%;
          object-fit: cover;
          object-position: center;
          border-radius: 50%;
        }

        :hover {
          transform: scale(1.1);
        }
      }
      .bar_item {
        flex: 1;
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
