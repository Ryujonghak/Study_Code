// 자바 스크립트를 가장 마지막에 실행하게 해줌.
//  ->  보통 html head 부분에 자바 스크립트를 작성할 경우에 사용
window.onload = function () {
    // 특수함수 : 익명함수(이름이 없는 함수) -> 1회용 함수
    // 함수를 써야하는 상황이지만 굳이 이름을 붙일 필요가 없는 경우
    document.querySelector(`#app`).innerHTML = `테스트`;
}

// 버튼 테스트
function buttonClick() {
    alert(`Click`);
}