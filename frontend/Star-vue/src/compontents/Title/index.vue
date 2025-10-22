<template>
  <div class="title">
    <div class="bar"></div>
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
  background-position: center;
  background-repeat: no-repeat;
}
</style>
