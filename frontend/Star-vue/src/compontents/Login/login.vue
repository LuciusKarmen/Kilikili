<!-- src/components/Login/login.vue -->
<template>
  <div class="overlap" v-show="props.show" @click="close">
    <!-- 点击背景关闭 -->
    <div class="box" @click.stop>
      <!-- 关闭按钮 -->
      <div class="close" @click="close">✕</div>

      <!-- 左侧图片区 -->
      <div class="left" v-if="flag">
        <img src="../../../public/9.jpg" alt="登录背景" />
      </div>
      <!-- 注册页面占位（你可以继续扩展） -->
      <div class="left" v-else>
        <img src="../../../public/45.jpg" alt="注册背景" />
      </div>

      <!-- 右侧表单区（登录） -->
      <div class="right" v-if="flag">
        <div class="title">登录</div>
        <div class="name">
          账号
          <el-input v-model="loginForm.username" placeholder="请输入账号" />
        </div>
        <div class="password">
          密码
          <el-input v-model="loginForm.password" type="password" placeholder="请输入密码" />
        </div>
        <div class="yan">
          验证码
          <el-input v-model="loginForm.captcha" placeholder="请输入验证码" />
        </div>
        <div class="btn">
          <el-button type="danger" @click="switchToRegister">前往注册</el-button>
          <el-button @click="handleLogin">登录</el-button>
        </div>
      </div>

      <div class="right" v-else>
        <div class="title">注册</div>
        <div class="name">
          用户名
          <el-input v-model="registerForm.username" placeholder="请输入用户名" />
        </div>
        <div class="password">
          密码
          <el-input v-model="registerForm.password" type="password" placeholder="请输入密码" />
        </div>
        <div class="password">
          确认密码
          <el-input
            v-model="registerForm.confirmPassword"
            type="password"
            placeholder="请确认密码"
          />
        </div>
        <div class="yan">
          验证码
          <el-input v-model="registerForm.captcha" placeholder="请输入验证码" />
        </div>
        <div class="btn">
          <el-button @click="switchToLogin">返回登录</el-button>
          <el-button type="primary" @click="handleRegister">注册</el-button>
        </div>
      </div>
    </div>
  </div>
</template>

<script lang="ts" setup>
import { ref, reactive } from 'vue'

// 接收父组件传来的 show
const props = defineProps<{
  show: boolean
}>()

// 向父组件发送事件
const emit = defineEmits<{
  (e: 'change', val: boolean): void
}>()

// 控制显示登录还是注册
const flag = ref(true) // true: 登录, false: 注册

// 登录表单数据
const loginForm = reactive({
  username: '',
  password: '',
  captcha: '',
})

// 注册表单数据
const registerForm = reactive({
  username: '',
  password: '',
  confirmPassword: '',
  captcha: '',
})

// 切换到注册
const switchToRegister = () => {
  flag.value = false
}

// 切换到登录
const switchToLogin = () => {
  flag.value = true
}

// 登录处理
const handleLogin = () => {
  if (!loginForm.username || !loginForm.password) {
    alert('请填写完整信息')
    return
  }
  console.log('登录数据:', loginForm)
  // 这里可以调用 API
  // 登录成功后可 emit('change', false) 关闭弹窗
  // emit('change', false)
}

// 注册处理
const handleRegister = () => {
  if (!registerForm.username || !registerForm.password || !registerForm.confirmPassword) {
    alert('请填写完整信息')
    return
  }
  if (registerForm.password !== registerForm.confirmPassword) {
    alert('两次密码不一致')
    return
  }
  console.log('注册数据:', registerForm)
  // 调用注册 API
  // 注册成功后可自动跳转登录或关闭
  // emit('change', false)
}

// 关闭弹窗
const close = () => {
  emit('change', false)
}
</script>

<style lang="scss" scoped>
.overlap {
  position: fixed;
  top: 0;
  left: 0;
  width: 100vw;
  height: 100vh;
  background-color: rgba(0, 0, 0, 0.5);
  display: flex;
  justify-content: center;
  align-items: center;
  z-index: 9999;
  backdrop-filter: blur(2px); /* 可选：模糊背景 */
}

.box {
  position: relative;
  width: 60vw;
  height: 80vh;
  max-width: 800px;
  max-height: 600px;
  background-color: white;
  border-radius: 12px;
  overflow: hidden;
  box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
  display: flex;
  font-family: 'Microsoft YaHei', sans-serif;
}

.close {
  position: absolute;
  top: 10px;
  right: 10px;
  width: 30px;
  height: 30px;
  background-color: #999;
  color: white;
  border-radius: 50%;
  text-align: center;
  line-height: 30px;
  font-weight: bold;
  cursor: pointer;
  z-index: 10;
  transition: background-color 0.2s;

  &:hover {
    background-color: #f00;
  }
}

.left {
  width: 50%;
  height: 100%;

  img {
    width: 100%;
    height: 100%;
    object-fit: cover;
    object-position: center;
  }
}

.right {
  width: 50%;
  height: 100%;
  padding: 40px 20px;
  display: flex;
  flex-direction: column;
  justify-content: center;
  gap: 15px;

  .title {
    font-size: 24px;
    font-weight: 600;
    text-align: center;
    margin-bottom: 20px;
    color: #333;
  }

  .name,
  .password,
  .yan {
    display: flex;
    align-items: center;
    font-size: 14px;
    color: #555;

    :deep(.el-input) {
      flex: 1;
      margin-left: 10px;

      .el-input__wrapper {
        box-shadow: 0 0 0 1px #ddd inset;
        border-radius: 4px;

        &:hover {
          box-shadow: 0 0 0 1px #999 inset;
        }
      }
    }
  }

  .btn {
    display: flex;
    justify-content: space-around;
    margin-top: 20px;

    .el-button {
      width: 40%;
      font-weight: 600;
    }
  }
}

// 响应式设计
@media (max-width: 768px) {
  .box {
    width: 90vw;
    height: 70vh;
    flex-direction: column;
  }

  .left,
  .right {
    width: 100%;
    height: 50%;
  }

  .right {
    padding: 20px;
  }
}
</style>
