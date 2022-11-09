// 문서 객체 모델 : Document Object Model

// document.querySelector('h1').style.backgroundColor = 'red';
// document.querySelector('h2').style.color = 'red';


// let headers = document.querySelectorAll(`h1`);
// querySelectorAll()로 불러들이면 []배열로 받아들인다.

// for (let i = 0; i < headers.length; i++) {

//     let header = headers[i];

//     header.style.backgroundColor = `red`;
//     header.style.color = `orange`;
//     header.innerHTML = `From JavaScript`;
// }

// innerHTML은 태그안에 삽입하지만 
// textContent는 텍스트만 출력해 보여준다.

// 태그, id, class, name 등을 지정하여 불러올수 있다.
// document.getElementById()
// document.getElementsByClassName()
// document.getElementsByName()
// document.getElementsByTagName()

// js에서도 css처럼 img 태그 속성값을 조절할 수 있다.

// id가 app인 태그를 선택하여 clock에 담음.
let clock = document.querySelector(`#app`);

// setInterval(function() {}, ms(초)) : ms(초)만큼 간격을 두고 계속 실행해주는 함수.
setInterval(function () {
    var now = new Date();
    clock.innerHTML = now.toString();
}, 1000)