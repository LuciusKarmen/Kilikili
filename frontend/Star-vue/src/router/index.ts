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
  ],
})

export default router
