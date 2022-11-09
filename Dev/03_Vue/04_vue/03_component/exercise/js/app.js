// 전역 컴포넌트
Vue.component("child-component", {
    /* html */
    template:
    `
        <div class="container">
            <p>자식 컴포넌트 입니다.</p>
        </div>
    `
})

// 문제 : comp-article 전역 컴포넌트 생성
// <div>
// <div class="article">
//     Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ducimus distinctio quidem eveniet libero saepe maiores optio cupiditate sequi suscipit doloremque. Dolores officia iure deleniti delectus nemo porro libero facilis cum.
// </div>
// </div>
Vue.component("comp-article", {
    /* html */
    template:
    `
    <div>
        <div class="article">
            Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ducimus distincti
            <child-component></child-component>
        </div>
    </div>        
    `
})

// Vue 생성
new Vue({
    el: "#app"
})