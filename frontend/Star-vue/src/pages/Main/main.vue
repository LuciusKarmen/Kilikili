<template>
  <div class="main">
    <div class="header"></div>
    <div class="classic"></div>
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
</script>
<style lang="scss" scoped>
.main {
  width: 100%;
  .header {
    width: 100%;
    height: 22vh;
    background-color: aqua;
  }
  .classic {
    width: 100%;
    height: 15vh;
    background-color: rgb(216, 254, 78);
  }
  .top_v {
    width: 100%;
    height: 63vh;
    background-color: rgb(41, 255, 18);
  }
}
</style>
