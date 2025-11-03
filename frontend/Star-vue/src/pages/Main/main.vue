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
// 基础变量（可选）
$breakpoint-mobile: 768px;
$gap-lg: 1vw;
$gap-sm: 2vw;

.main {
  width: 100vw;
  min-height: 100vh;
  background-color: azure;
  font-size: 16px; // 基准字体大小

  .header {
    width: 100%;
    height: 22vh;
  }

  .classic {
    width: 100%;
    height: 15vh;
    display: flex;
    flex-direction: row;
    background-color: #fff;

    .master {
      width: 10%;
      height: 100%;
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
      overflow: hidden;

      img {
        width: 60%;
        height: auto;
      }

      div:last-child {
        font-size: 0.9rem;
        color: #333;
        margin-top: 0.3rem;
      }
    }

    .classify {
      width: 66%;
      height: 100%;

      .table {
        width: 100%;
        height: 100%;
        display: grid;
        grid-template-columns: repeat(8, 1fr);
        padding: 1.5rem;
        gap: 1rem;

        .class {
          padding: 0.3rem;
          text-align: center;
          font-size: 0.95rem;
          color: #9b9b9b;
          background-color: #fff;
          border-radius: 0.6rem;
          cursor: pointer;
          box-shadow: 0 0 10px rgba(186, 186, 186, 0.5);
          transition: all 0.2s ease;

          &:hover {
            color: #000;
            transform: scale(1.05);
          }
        }
      }
    }

    .other {
      width: 22%;
      height: 100%;
      position: relative;
      padding-left: 3%;

      &::before {
        content: '';
        position: absolute;
        left: 0;
        top: 10%;
        height: 80%;
        width: 1px;
        background-color: #7b7b7b;
      }

      .logo {
        height: 90%;
        margin-top: 5%;
      }
    }
  }

  .top_v {
    width: 100%;
    height: auto;
    min-height: 63vh;
    padding-left: 4vw;
    padding-right: 4vw;
    // 两个在一行
    display: grid;
    grid-template-columns: repeat(2, 1fr);
    gap: 2vh;

    .lun {
      width: 38vw;
      height: 93%;
      margin-top: 3%;

      .tu {
        width: 100%;
        height: 100%;
        border-radius: 12px;
        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
      }
    }

    .show {
      margin-left: 3vw;
      width: 51vw;
      display: grid;
      grid-template-columns: repeat(3, 1fr);
      gap: $gap-lg;
      padding-top: 2%;

      .video_box {
        display: flex;
        flex-direction: column;
        width: 100%;

        .video {
          width: 100%;
          height: 0;
          padding-bottom: 56.25%; // 16:9 比例
          position: relative;
          background-color: #000;
          border-radius: 8px;
          overflow: hidden;

          img {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            object-fit: cover;
            object-position: center;
            display: block;
          }
        }

        .title {
          font-size: 1rem;
          font-weight: 500;
          padding: 0.5rem 0.5rem 0;
          color: #333;
          white-space: nowrap;
          overflow: hidden;
          text-overflow: ellipsis;
        }

        .bottom {
          display: flex;
          justify-content: space-between;
          padding: 0 0.5rem;
          font-size: 0.85rem;
          color: #777;
        }
      }
    }
  }

  .bottom_v {
    width: 100%;
    padding: 2vh 4vw;
    display: grid;
    grid-template-columns: repeat(5, 1fr);
    gap: $gap-lg;

    .video_box {
      display: flex;
      flex-direction: column;

      .video {
        width: 100%;
        height: 0;
        padding-bottom: 56.25%; // 16:9
        position: relative;
        background-color: #000;
        border-radius: 8px;
        overflow: hidden;

        img {
          position: absolute;
          top: 0;
          left: 0;
          width: 100%;
          height: 100%;
          object-fit: cover;
          object-position: center;
          display: block;
        }
      }

      .title {
        font-size: 0.95rem;
        font-weight: 500;
        padding: 0.5rem 0.5rem 0;
        color: #333;
        white-space: nowrap;
        overflow: hidden;
        text-overflow: ellipsis;
      }

      .bottom {
        display: flex;
        justify-content: space-between;
        padding: 0 0.5rem;
        font-size: 0.8rem;
        color: #888;
      }
    }
  }
}

@media (max-width: $breakpoint-mobile) {
  .main {
    .classic {
      height: auto;
      min-height: 100px;
      flex-direction: column;
      padding: 0.5rem 0;

      .master {
        width: 100%;
        height: 35px;
        flex-direction: row;
        justify-content: flex-start;
        gap: 1rem;
        padding-left: 1rem;

        img {
          width: 20px;
          height: 20px;
        }

        div:last-child {
          font-size: 0.95rem;
          color: #ff4d4f;
        }
      }

      .classify {
        width: 100%;
        height: 60px;
        overflow-x: auto;
        overflow-y: hidden;
        -webkit-overflow-scrolling: touch;
        white-space: nowrap;
        padding: 0.5rem 1rem;

        .table {
          display: flex;
          width: max-content;
          gap: 0.8rem;
          padding: 0;

          .class {
            font-size: 0.8rem;
            padding: 0.4rem 0.6rem;
            min-width: 60px;
            text-align: center;
          }
        }
      }

      .other {
        width: 100%;
        height: 50px;
        display: flex;
        align-items: center;
        justify-content: center;
        padding: 0;

        &::before {
          display: none;
        }

        .logo {
          height: 60%;
          max-height: 36px;
        }
      }
    }

    .top_v {
      padding: 1rem;
      grid-template-columns: 1fr;
      gap: 1.2rem;

      .lun {
        width: 100%;
        max-width: 100%;
        padding-bottom: 56.25%;
      }

      .show {
        width: 100%;
        grid-template-columns: repeat(2, 1fr);
        gap: 1rem;
      }
    }

    .bottom_v {
      padding: 1rem;
      grid-template-columns: repeat(2, 1fr);
      gap: 1rem;
    }
  }
}
</style>
