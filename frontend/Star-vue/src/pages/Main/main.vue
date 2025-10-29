<template>
  <div class="main">
    <div class="header">
      <Title></Title>
    </div>
    <div class="classic">
      <div class="master">
        <div><img src="../../../public/火.png" alt="" /></div>
        <div>站长推荐</div>
      </div>
      <div class="classify">
        <div class="table">
          <div class="class">模版</div>
          <div class="class">模版</div>
          <div class="class">模版</div>
          <div class="class">模版</div>
          <div class="class">模版</div>
          <div class="class">模版</div>
          <div class="class">模版</div>
          <div class="class">模版</div>
          <div class="class">模版</div>
          <div class="class">模版</div>
          <div class="class">模版</div>
          <div class="class">模版</div>
          <div class="class">模版</div>
          <div class="class">模版</div>
          <div class="class">模版</div>
          <div class="class">更多</div>
        </div>
      </div>
      <div class="other">
        <img src="../../../public/Starlogo.png" alt="" class="logo" />
      </div>
    </div>
    <div class="top_v">
      <!-- 设计轮播图 -->
      <div class="lun">
        <img
          src="../../../public/ex/Snipaste_2025-10-24_16-00-12.png"
          alt=""
          class="tu"
          @click="show_example"
        />
      </div>
      <!-- 推荐 -->
      <div class="show">
        <div class="video_box">
          <div class="video">
            <img src="../../../public/ex/Snipaste_2025-10-24_15-58-19.png" alt="" />
          </div>
          <!-- <div>时间</div>
          <div>数据</div> -->
          <div class="title">什么叫口碑，这TM就叫口碑</div>
          <div class="bottom">
            <div class="user">暗夜星辰</div>
            <div class="time">1小时前</div>
          </div>
        </div>
        <div class="video_box">
          <div class="video">
            <img src="../../../public/ex/Snipaste_2025-10-24_15-59-31.png" alt="" />
          </div>
          <!-- <div>时间</div>
          <div>数据</div> -->
          <div class="title">《原神》奈芙尔角色PV</div>
          <div class="bottom">
            <div class="user">暗夜星辰</div>
            <div class="time">1小时前</div>
          </div>
        </div>
        <div class="video_box">
          <div class="video">
            <img src="../../../public/ex/Snipaste_2025-10-24_15-59-46.png" alt="" />
          </div>
          <!-- <div>时间</div>
          <div>数据</div> -->
          <div class="title">《雷军请回答》DAY 2？</div>
          <div class="bottom">
            <div class="user">暗夜星辰</div>
            <div class="time">1小时前</div>
          </div>
        </div>
        <div class="video_box">
          <div class="video">
            <img src="../../../public/ex/Snipaste_2025-10-24_16-00-20.png" alt="" />
          </div>
          <!-- <div>时间</div>
          <div>数据</div> -->
          <div class="title">你不准喜欢她</div>
          <div class="bottom">
            <div class="user">暗夜星辰</div>
            <div class="time">1小时前</div>
          </div>
        </div>
        <div class="video_box">
          <div class="video">
            <img src="../../../public/ex/Snipaste_2025-10-24_16-00-34.png" alt="" />
          </div>
          <!-- <div>时间</div>
          <div>数据</div> -->
          <div class="title">顶级智斗</div>
          <div class="bottom">
            <div class="user">暗夜星辰</div>
            <div class="time">1小时前</div>
          </div>
        </div>
        <div class="video_box">
          <div class="video">
            <img src="../../../public/ex/Snipaste_2025-10-24_16-00-49.png" alt="" />
          </div>
          <!-- <div>时间</div>
          <div>数据</div> -->
          <div class="title">S15 4K极清直播间</div>
          <div class="bottom">
            <div class="user">暗夜星辰</div>
            <div class="time">1小时前</div>
          </div>
        </div>
      </div>
    </div>
    <!-- 视频矩阵 -->
    <div class="bottom_v">
      <div class="video_box" v-for="(item, index) in 30" :key="index">
        <div class="video">
          <img src="../../../public/ex/Snipaste_2025-10-24_16-00-20.png" alt="" />
        </div>
        <!-- <div>时间</div>
          <div>数据</div> -->
        <div class="title">你不准喜欢她</div>
        <div class="bottom">
          <div class="user">暗夜星辰</div>
          <div class="time">1小时前</div>
        </div>
      </div>
    </div>
  </div>
</template>
<script lang="ts" setup name="">
import { ref } from 'vue'
import Title from '../../compontents/Title/index.vue'
import router from '@/router'
const show_example = () => {
  console.log('show_example')
  router.push('/video')
}
</script>
<style lang="scss" scoped>
.main {
  width: 100vw;
  min-height: 100vh;
  background-color: azure;
  .header {
    width: 100%;
    height: 22vh;
  }
  .classic {
    width: 100%;
    height: 15vh;
    flex-direction: row;
    display: flex;
    background-color: rgb(255, 255, 255);
    .master {
      width: 10%;
      height: 100%;
      background-color: rgb(255, 255, 255);
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
      overflow: hidden;
    }
    .classify {
      width: 66%;
      height: 100%;
      background-color: rgb(255, 255, 255);
      .table {
        width: 100%;
        height: 100%;
        display: grid;
        grid-template-columns: repeat(8, 1fr);
        padding: 30px;
        gap: 20px;
        .class {
          padding: 2px;
          text-align: center;
          font-size: 20px;
          color: rgb(155, 155, 155);
          background-color: rgb(255, 255, 255);
          border-radius: 10px;
          cursor: pointer;
          box-shadow: 0 0 10px rgba(186, 186, 186, 0.5);
        }
      }
    }
    // 知识点伪元素的妙用
    .other::before {
      content: '';
      position: absolute;
      left: 0;
      top: 10%;
      height: 80%;
      width: 1px; /* 加竖线这个倒是第一次见到 */
      background-color: rgb(123, 123, 123);
    }
    .other {
      width: 22%;
      height: 100%;
      position: relative;
      padding-left: 3%;
      .logo {
        height: 90%;
        margin-top: 5%;
      }
    }
  }
  .top_v {
    width: 100%;
    height: 63vh;
    padding-left: 4vw;
    padding-right: 4vw;
    display: flex;
    flex-flow: row;

    .lun {
      width: 38vw;
      height: 100%;
      .tu {
        width: 100%;
        height: 95%;
        padding-top: 5%;
      }
    }
    .show {
      margin-left: 3vw;
      width: 51vw;
      height: 100%;
      display: grid;
      grid-template-columns: repeat(3, 1fr);
      gap: 1vw;
      height: 95%;
      padding-top: 2%;
      .video_box {
        .video {
          width: 100%;
          height: 70%;
          overflow: hidden; /* 可选：防止溢出 */
          position: relative;
          background-color: #000; /* 黑色背景更像视频封面 */

          img {
            width: 100%;
            height: 100%;
            object-fit: cover; // 关键：裁剪填满
            object-position: center; // 居中对齐
            display: block; // 去除底部默认间隙
          }
        }
        .title {
          width: 100%;
          height: 20%;
          font-size: 25px;
          padding: 5px;
          font-weight: 500;
        }
        .bottom {
          width: 100%;
          height: 10%;
          display: flex;
          justify-content: space-between;
          flex-flow: row;
          padding: 5px;
        }
      }
    }
  }
  .bottom_v {
    width: 100%;
    padding-left: 4vw;
    padding-right: 4vw;
    display: grid;
    grid-template-columns: repeat(5, 1fr);
    gap: 1vw;
    .video_box {
      width: 100%;
      .video {
        width: 100%;
        height: 70%;
        // overflow: hidden; /* 可选：防止溢出 */
        position: relative;
        background-color: #000;

        img {
          width: 100%;
          height: 100%;
          object-fit: cover; // 关键：裁剪填满
          object-position: center; // 居中对齐
          display: block; // 去除底部默认间隙
        }
      }
      .title {
        width: 100%;
        height: 20%;
        font-size: 25px;
        padding: 5px;
        font-weight: 500;
      }
      .bottom {
        width: 100%;
        height: 10%;
        display: flex;
        justify-content: space-between;
        flex-flow: row;
        padding: 5px;
      }
    }
  }
}
@media (max-width: 768px) {
}
</style>
