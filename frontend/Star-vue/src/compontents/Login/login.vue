<!-- components/Login.vue -->
<template>
  <!-- 遮罩层，点击可关闭 -->
  <div class="login-overlay" v-if="show" @click="close">
    <div class="login-box" @click.stop>
      <div class="title">登录\注册</div>
      <div class="right">
        <div>邮箱</div>
        <div>密码</div>
        <div>验证码</div>
        <button>确认</button>
      </div>
    </div>
  </div>
</template>

<script lang="ts" setup>
import { defineProps, defineEmits } from 'vue'

defineProps<{
  show: boolean
}>()

const emit = defineEmits(['change'])

const close = () => {
  emit('change', false)
}
</script>

<style scoped lang="scss">
.login-overlay {
  position: fixed;
  top: 0;
  left: 0;
  width: 100vw;
  height: 100vh;
  background-color: rgba(0, 0, 0, 0.5);
  /* 半透明 */
  display: flex;
  justify-content: center;
  align-items: center;
  z-index: 2000; /* 遮罩一定要在最上面 */
  .login-box {
    background: white;
    padding: 2rem;
    border-radius: 12px;
    box-shadow: 0 10px 30px rgba(0, 0, 0, 0.3);
    width: 90%;
    width: 1000px;
    height: 750px;
    text-align: center;
    background-image: url('../../../public/姐妹.jpg');
    background-size: cover;
    background-position: center;
    // 背景图片半透明
  }
}
</style>
