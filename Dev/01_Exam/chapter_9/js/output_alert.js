// break, 123alpha, has space(공백) -> 식별자(변수, 상수) X
// let 식별자(변수, 상수)-> 식별자라는 것을 알려줌.
// let alpha = "값을 입력해 주세요";
// alert : 자바 스크립트 알림창
// alert(alpha);
// alert(123);

// 자료형 : 문자열, 숫자, boolean(참,거짓)

//prompt 입력창 함수
// let beta = prompt(alpha);

// 자바 스크립트 화면 출력 방법
// 첫 번째 화면출력 방법 : alert() 
// alert(beta);

// 두 번째 화면출력 방법 : console.log()
// console.log("Hello world!");

// 세번째 화면출력 방법 : document.write()
// document.write("Hello world!");

// 네번째 화면출력 방법 : document.queryselector()
// document.querySelector("#app").innerHTML = "Hello world!";

// 특수 연산자 : ++, --
// for (var i = 1; i <= 3; i++) {
// alert(i); };

// let alpha = 10;
// 축약형 사칙연산자 (+, -, /, *, %)
// alpha += 1;
// alpha = alpha + 1;
// alert(alpha);

// let c = "문자를 입력해주세요!";
// let alpha = prompt(c);;
// let beta = prompt(c);;
// let d = beta+" "+alpha;
// alert(d);

// let alpha = prompt("정수를 입력해주세요!")
// for (var i = 1; i <= 3; i++) {
//     alpha = alpha + "\n";
// }
// alert(alpha);

// let alpha = prompt("문자열을 입력해주세요");
// let beta = prompt("문자열을 입력해주세요");
// alert(beta + alpha);

// let c = prompt("수를 입력해주세요");
// let d = prompt("수를 입력해주세요");
// alert(c ** d);

// let a = Number(prompt("입력"));
// let b = Number(prompt("입력"));
// let c = Number(prompt("입력"));

// let sum1 = a + b + c;
// let avg1 = sum1 / 3;

// alert(sum1 + " " + avg1.toFixed(2));

// alert("'hello'");
// alert('"hello"');
// alert('"C:\\Download\\hello.js"');

// alert(), console.log() 출력은 태그가 없기 때문에 HTML X, TEXT O
// HTML Body에서 태그 출력해야 HTML O

// alert("┌┳┐\n" + "┠╀┫\n" + "┗┻┛");
// alert("\u250c\u252c\u2510\n\u251c\u253c\u2524\n\u2514\u2534\u2518");

let a = Number(prompt("입력"));
let b = Number(prompt("입력"));

alert((a + b) + "\n" + (a - b) + "\n" + (a * b) + "\n" + (a / b) + "\n" + (a % b).toFixed(2));