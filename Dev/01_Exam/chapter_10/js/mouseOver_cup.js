function mouseOver() {
    document.querySelector(`#cover`).src = `./images/easys-2.jpg`;
}

function mouseOut() {
    document.querySelector(`#cover`).src = `./images/easys-1.jpg`;
}

// document.querySelector(`#cover`).onmouseover = mouseOver;
// document.querySelector(`#cover`).onmouseout = mouseOut;

// 함수를 이용해서 마우스 오버, 클릭 이벤트를 사용하는 방법
// 바닐라 스크립트 : 순수 자바스크립트 문법
// 요즘 추세 : 바닐라 스크립트 -> jQuery -> react, vue 사용
document.querySelector(`#cover`).addEventListener(`mouseover`, mouseOver, false);
document.querySelector(`#cover`).addEventListener(`mouseout`, mouseOut, false);