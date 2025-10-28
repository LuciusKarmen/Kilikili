<!-- components/Login.vue -->
<template>
  <!-- 遮罩层，点击可关闭 -->
  <div class="login-overlay" v-if="show" @click="close">
    <div class="login-box" @click.stop>
      <div class="login_form">
        <div class="title">
          <div class="login">登录</div>
          <div class="reg">注册</div>
        </div>
        <div class="form">
          <el-form>
            <el-form-item label="账号">
              <el-input placeholder="请输入用户名/邮箱"></el-input>
            </el-form-item>
            <el-form-item label="密码">
              <el-input placeholder="请输入密码"></el-input>
            </el-form-item>
            <el-form-item label="验证码">
              <el-input placeholder="请输入验证码"></el-input>
              <div>1</div>
            </el-form-item>
            <el-button>清空</el-button>
            <el-button type="primary">确认</el-button>
          </el-form>
        </div>
      </div>
      <!-- 两个部分 -->
      <!-- <div class="reg_form">
        <el-form>
          <el-form-item label="账号">
            <el-input placeholder="请输入用户名"></el-input>
          </el-form-item>
          <el-form-item label="密码">
            <el-input placeholder="请输入密码"></el-input>
          </el-form-item>
          <el-form-item label="确认密码">
            <el-input placeholder="请确认密码"></el-input>
          </el-form-item>
          <el-form-item label="邮箱">
            <el-input placeholder="请输入邮箱"></el-input>
            <button>发送</button>
          </el-form-item>
          <el-form-item label="验证码"> </el-form-item>
        </el-form>
      </div> -->
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
    display: flex;
    flex-direction: column;
    justify-content: space-around;
    position: relative;
    .login_form {
      position: absolute;
      top: 10%;
      left: 30%;
      width: 40%;
      height: 70%;
      display: flex;
      flex-direction: column;
      background-color: rgba($color: #e9e9e9, $alpha: 0.8);
      border: 2px solid rgb(255, 255, 255);
      border-radius: 10px;
      .title {
        display: flex;
        justify-content: space-around;
        font-size: 3vh;
      }
      .form {
        display: flex;
        flex-direction: column;
        justify-content: space-around;
        .el-input {
          width: 80%;
          height: 5vh;
          margin: 0 auto;
        }
      }
    }
  }
}
</style>
