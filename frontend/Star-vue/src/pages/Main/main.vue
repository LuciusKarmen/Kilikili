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
        </div>
      </div>
      <div class="other"></div>
    </div>
    <div class="top_v">
      <!-- 设计轮播图 -->
      <div></div>
      <!-- 推荐 -->
      <div></div>
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
    background-color: aqua;
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
      .table {
        display: grid;
        grid-template-columns: repeat(6, 1fr);
        .class {
          width: 20%;
          height: 50%;
          background-color: rgb(32, 245, 206);
          border-radius: 20px;
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
      background-color: black;
    }
    .other {
      width: 22%;
      height: 100%;
      position: relative;
    }
  }
  .top_v {
    width: 100%;
    height: 63vh;
    background-color: rgb(41, 255, 18);
  }
}
@media (max-width: 768px) {
}
</style>
