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
      <div class="other"></div>
    </div>
    <div class="top_v">
      <!-- 设计轮播图 -->
      <div class="lun">
        <img src="../../../public/" alt="" />
      </div>
      <!-- 推荐 -->
      <div class="show">
        <div class="video_box">
          <div class="video"><img src="" alt="" /></div>
          <!-- <div>时间</div>
          <div>数据</div> -->
          <div class="title">测试视频1</div>
          <div class="bottom">
            <div class="user">暗夜星辰</div>
            <div class="time">1小时前</div>
          </div>
        </div>
        <div class="video_box">
          <div class="video"><img src="" alt="" /></div>
          <!-- <div>时间</div>
          <div>数据</div> -->
          <div class="title">测试视频2</div>
          <div class="bottom">
            <div class="user">暗夜星辰</div>
            <div class="time">1小时前</div>
          </div>
        </div>
        <div class="video_box">
          <div class="video"><img src="" alt="" /></div>
          <!-- <div>时间</div>
          <div>数据</div> -->
          <div class="title">测试视频3</div>
          <div class="bottom">
            <div class="user">暗夜星辰</div>
            <div class="time">1小时前</div>
          </div>
        </div>
        <div class="video_box">
          <div class="video"><img src="" alt="" /></div>
          <!-- <div>时间</div>
          <div>数据</div> -->
          <div class="title">测试视频1</div>
          <div class="bottom">
            <div class="user">暗夜星辰</div>
            <div class="time">1小时前</div>
          </div>
        </div>
        <div class="video_box">
          <div class="video"><img src="" alt="" /></div>
          <!-- <div>时间</div>
          <div>数据</div> -->
          <div class="title">测试视频1</div>
          <div class="bottom">
            <div class="user">暗夜星辰</div>
            <div class="time">1小时前</div>
          </div>
        </div>
        <div class="video_box">
          <div class="video"><img src="" alt="" /></div>
          <!-- <div>时间</div>
          <div>数据</div> -->
          <div class="title">测试视频1</div>
          <div class="bottom">
            <div class="user">暗夜星辰</div>
            <div class="time">1小时前</div>
          </div>
        </div>
      </div>
    </div>
    <!-- 视频矩阵 -->
    <div></div>
  </div>
</template>
<script lang="ts" setup name="">
import { ref } from 'vue'
import Title from '../../compontents/Title/index.vue'
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
    .master {
      width: 10%;
      height: 100%;
      background-color: rgb(255, 255, 255);
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
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
          background-color: rgb(243, 243, 243);
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
      background-color: rgb(255, 255, 255);
    }
  }
  .top_v {
    width: 100%;
    height: 63vh;
    background-color: rgb(255, 255, 255);
  }
}
@media (max-width: 768px) {
}
</style>
