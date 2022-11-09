import { createRouter, createWebHistory } from 'vue-router'

// 메뉴를 다는 부분
const routes = [
  // root : home == url : http://localhost:8080/
  {
    path: '/', //경로
    name: 'home', //경로를 메뉴를 불러올수 있음.
    component: () => import('../views/HomeView.vue') //메뉴를 클릭했을 때 실행되는 컴포넌트
    // () => import('주소') : import가 함수 또한 지원하기 때문에 화살표함수를 이용한 사용이 가능.
  },
  {
    path: '/about',
    name: 'about',
    component: () => import('../views/AboutView.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
