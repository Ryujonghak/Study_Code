// 소스 추가 : this
function clickFunction() {
    alert(`클릭한 이미지` + this.src);
}
// cup 이미지 선택
// 클릭 이벤트 자바스크립트에서 구현
let cup = document.querySelector(`#cup`);
cup.onclick = clickFunction;

