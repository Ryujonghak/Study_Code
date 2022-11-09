// 뷰 생성과 동시에 최초로 실행되는 자바스크립트.
// 모듈(라이브러리) 가져오기(링크).
import { createApp } from 'vue'
import App from './App.vue'
// 라우터 모듈(라이브러리) 가져오기(링크)
import router from './router'
// VueX(공유 저장소) 모듈(라이브러리) 가져오기(링크).
// 참고사항) 리액트 공유저장소를 모방하여 만듬.
import store from './store'

// 3.x 버전에서 뷰를 생성하는 방식.
createApp(App).use(store).use(router).mount('#app')
