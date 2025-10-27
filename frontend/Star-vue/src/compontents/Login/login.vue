<!-- components/Login.vue -->
<template>
  <!-- 遮罩层，点击可关闭 -->
  <div class="login-overlay" v-if="show" @click="close">
    <div class="login-box" @click.stop>
      <!-- 这里是你的登录内容 -->
      <h2>登录 / 注册</h2>
      <form>
        <input type="text" placeholder="用户名" />
        <input type="password" placeholder="密码" />
        <button type="submit">登录</button>
      </form>
      <button @click="close">关闭</button>
    </div>
  </div>
</template>

<script lang="ts" setup>
import { defineProps, defineEmits } from 'vue'

// 接收 show 属性，通过 v-model 控制
defineProps<{
  show: boolean
}>()

const emit = defineEmits(['update:show'])

const close = () => {
  emit('update:show', false)
}
</script>

<style scoped>
.login-overlay {
  position: fixed;
  top: 0;
  left: 0;
  width: 100vw;
  height: 100vh;
  background-color: rgba(0, 0, 0, 0.5); /* 半透明遮罩 */
  display: flex;
  justify-content: center;
  align-items: center;
  z-index: 2000; /* 要高于其他内容 */
}

.login-box {
  background: white;
  padding: 2rem;
  border-radius: 12px;
  box-shadow: 0 10px 30px rgba(0, 0, 0, 0.3);
  width: 90%;
  max-width: 400px;
  text-align: center;
}
</style>
