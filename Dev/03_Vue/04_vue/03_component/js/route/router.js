// 각각 객체 정의
// 필수(****) : 뷰라우터 == 메뉴달기
// Home 객체 
// `<div>Home 페이지입니다.</div>`
let Home = {
    template: `<div>Home 페이지입니다</div>`
}
let Main = {
    template: `<div>main 페이지입니다</div>`
}
let Login = {
    template: `<div>login 페이지입니다</div>`
}
let Board = {
    template: `<div>Board 페이지입니다</div>`
}
// Board 객체 
// `<div>Board 페이지입니다.</div>`


// path : URL -> 실행 컴포넌트 : ex) /main -> Main 컴포넌트 실행
let routes = [
    // Home : path: "/", component: Home
    {
        path: "/",
        component: Home
    },      
    {
        path: "/main",
        component: Main
    },    
    {
        path: "/login",
        component: Login
    },    
    {
        path: "/board",
        component: Board
    },
    // Board : path: "/board", component: Board
];

// 뷰에서 메뉴 생성 == 뷰라우터 생성
let router = new VueRouter({
    routes
});

// 뷰생성 = 메뉴에 함께
let app = new Vue({
    router
}).$mount("#app");