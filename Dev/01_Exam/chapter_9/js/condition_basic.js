// if(조건문) for(반복문)

// let alpha = Number(prompt("정수입력"));

// if (alpha != null) {
//     alert("공백이 입력되었습니다.");
// }
// else if (100 < alpha) {
//     alert("100 > alpha = false");
// }
// else if (100 > alpha) {
//     alert("100 > alpha = true");
// }
// else {
//     alert("잘못된 입력");
// }

// var date = new Date();
// var hours = date.getHours();

// if (0 >= hours && hours < 12) {
//     alert("오전");
//     alert(hours);
// }
// else if (hours >= 12 && hours <= 24) {
//     alert("오후");
//     alert(hours);
// }
// else {
//     alert("잘못된 입력");
// }

// for (var i = 0; i < 5; i++) {
//     alert("경고");
// }

// 통계관련 웹 애플리케이션을 만들때 누적합 사용   
// var i = 0;
// var n1 = 0;

// while (i < 100) {
//     i++;
//     n1 += i;
// }
// alert(n1);

// let inch = Number(prompt("숫자입력"));
// alert((inch) + " inch는 " + (inch * 2.54) + " cm입니다.");

//모던 자바스크립트 : 여러가지 문법 추가.
// alert(`${inch}inch는 ${inch * 2.54}cm입니다.`);

// let char = prompt("입력");
// alert(`${char[2]}${char[1]}${char[0]}`);

// let num = prompt("입력");
// alert(`${num[0] * 1000}\n${num[1] * 100}\n${num[2] * 10}\n${num[3] * 1}`);

// let num = Number(prompt("숫자 입력"));
// if (num % 2 == 0) {
//     alert(`${num}은 짝수입니다.`);
// } else if (num % 2 == 1) {
//     alert(`${num}은 홀수입니다.`);
// } else {
//     alert(`잘못된 입력입니다.`);
// }

// let num = Number(prompt("입력"));

// if (num >= 5) {
//     alert(`${num}은 5이상의 수 입니다.`);
// } else if (num < 5) {
//     alert(`${num}은 5 미만의 수 입니다.`);
// } else {
//     alert(`잘못된 입력입니다.`);
// }

// 3항 연산자
// let num = Number(prompt("입력"));
// num = (num >= 5) ? alert(`5이상`) : alert(`5미만`);

// let num = Number(prompt("입력"));

// if (num >= 4.0 && num <= 4.5) {
//     alert(`교수님의 사랑`);
// } else if (num >= 3.0 && num < 4.0) {
//     alert(`현 체제의 수호자.`);
// } else if (num >= 2.0 && num < 3.0) {
//     alert(`일탈을 꿈꾸는 소시민`);
// } else if (num < 2.0) {
//     alert(`오락문화의 선구자`);
// } else {
//     alert(`잘못된 입력입니다.`);
// }


// 문자열.split() : ("")""안의 내용을 뺴고 연속으로 이어줌.

let alpha = prompt("문자열");
let beta = "";

for (let i = 0; i < alpha.length; i++) {
    beta = beta + alpha[i] + "\n";
}
alert(beta);
// alert(alpha.length);