import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'main',
      component: () => import('../pages/Main/main.vue'),
    },
    {
      path: '/our',
      name: 'our',
      component: () => import('../pages/Our/index.vue'),
    },
    {
      path: '/message',
      name: 'message',
      component: () => import('../pages/Message/index.vue'),
    },
    {
      path: '/video/{id}',
      name: 'video',
      component: () => import('../pages/Video/index.vue'),
    },
    {
      path: '/uc',
      name: 'uc',
      component: () => import('../pages/UserCentre/index.vue'),
    },
    {
      path: '/platform',
      name: 'platform',
      component: () => import('../pages/Platform/index.vue'),
    },
  ],
})

export default router
