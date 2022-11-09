new Vue({
    el: "#app",
    data() {
        return {
            advice: "데이터 로딩중....."
        }
    },
    // Vue 생성되자마자 실행되는 이벤트
    created() {
        axios.get("https://api.adviceslip.com/advice") // 서버 요청
        .then((response) => {
            console.log(response);
            this.advice = response.data.slip.advice;
        })
        .catch((err) => {
            console.log(err);
        })

    },
})