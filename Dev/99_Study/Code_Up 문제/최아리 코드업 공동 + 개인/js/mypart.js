// 문제 1578 최댓값 함수
// mymax 함수를 구현하여 두 정수 중 큰 수를 출력한다.
// 입력 : 5 7
// 출력 : 7

// let nums = prompt("두 정수를 입력해주세요.").split(" ").map(Number);

// function mymax() {
//     let result = Math.max(...nums);
//     alert(result)
// }

// mymax()

// TODO: 문제 1602 절대값 함수 (2인) *Math.abs() -> 절대값 구하기 함수 (Absolute Value)
// 입력된 n의 절대값을 출력한다.
// 실수값일 경우 불필요한 0을 출력하지 않는다.
// 입력 : -2.56
// 출력 : 2.56

// let num = Number(prompt("수를 입력하세요."));

// alert(Math.abs(num))

// TODO: 문제 1284 암호 해독 (2인) ***
// n을 두 소수의 곱으로 나타낼 수 있으면 두 수를 오름차순으로 출력한다.
// (단, 가능한 소수 중 가장 작은 소수와의 곱으로 나타낸다.)
// 하고, 그렇지 않으면 "wrong number"를 출력한다.
// 소수 : 1과 자기 자신만을 약수로 가지는 수다.
// 입력 : 21
// 출력 : 3 7

// *무조건 약수의 개수가 4개가 된다.
// 정확히 2개의 약수를 가진 수를 소수라고 합니다
// 소수 구하고 그 안에 또 if로 걸러내기

// let num = Number(prompt("수를 입력하세요."));
// let result = 0; 
// let result2= "";
// let count = 0;

// for (i = 2; i < num; i++) {
//     if(num%i==0) {
//         for(j=2; j<i; j++) {
//             if(i%j==0) { // 소수가 아니면
//                 result2 = "wrong"
//             } 
//         }
//         result = result +  i + " " // 약수부터 구하고 (1과 자기자신 제외) // "3 7"
//         count++
//     }
//   }

// if (count == 2&&result2!=="wrong") {
//   alert(result);
// } 
// else {
//   alert("wrong number");
// }

// 문제 1294 시저의 암호 2 (2인)
// 씨저의 암호문을 출력한다.(암호문에 쓰인 알파벳보다 3만큼 이동한 알파벳으로 치환)
// 입력 : never trust brutus
// 출력 : qhyhu wuxvw euxwxv

// let words = prompt("문장을 입력하세요.").split(" "); //[never, trust, brutus]

// let first = words[0]; // "naver"
// let second = words[1]; // "trust"
// let third = words[2]; // "brutus"

// let result1 = 0
// let result2 = 0
// let result3 = 0

// for(i=0; i<first.length; i++) {
//     result1 = result1 + (first[i].charCodeAt(0) + 3) + " "; // "n n n n n (공백)" -> n(숫자)로 변환
// }
// for(i=0; i<second.length; i++) {
//     result2 = result2 + (second[i].charCodeAt(0) + 3) + " "; // "n n n n n (공백)" -> n(숫자)로 변환
// }
// for(i=0; i<third.length; i++) {
//     result3 = result3 + (third[i].charCodeAt(0) + 3) + " "; // "n n n n n n (공백)" -> n(숫자)로 변환
// }

// let result1_2 = result1.split(" ") // [n, n, n, n, n, (공백)]
// let result2_2 = result2.split(" ")
// let result3_2 = result3.split(" ")

// let final1 = ""
// let final2 = ""
// let final3 = ""

// for(i=0; i<result1_2.length-1; i++) {
//     final1 = final1 + String.fromCodePoint(result1_2[i]);
// }
// for(i=0; i<result2_2.length-1; i++) {
//     final2 = final2 + String.fromCodePoint(result2_2[i]);
// }
// for(i=0; i<result3_2.length-1; i++) {
//     final3 = final3 + String.fromCodePoint(result3_2[i]);
// }

// alert(final1+ " " + final2 + " " + final3)

// 문제 1206 배수
// b가 a의 배수이면 "a*x=b"를 출력하고,
// a가 b의 배수이면 "b*x=a"를 출력하고,
// 배수관계가 아니면 "none"을 출력하시오.
// 입력 : 4 12
// 출력 : 4*3=12

// let nums = prompt("두 정수를 입력해주세요.").split(" ").map(Number); // [a, b]

// let a = nums[0];
// let b = nums[1]

// if(b%a==0) {
//     result1 = b/a
//     alert(a + "*" + result1 + "=" + b)
// }
// else if(a%b==0) {
//     result1 = a/b
//     alert(b + "*" +result1 + "=" + a)
// }
// else {
//     alert("none")
// }

// 문제 1218 삼각형 판단하기 (2인)
// 세 변의 길이가 같은 경우 : 정삼각형
// 두 변의 길이가 같은 경우 : 이등변삼각형
// a2 + b2 = c2일 경우(피타고라스 정리) : 직각삼각형
// 위의 조건에 맞지 않는 일반 삼각형일 경우 : 삼각형
// 삼각형이 아닐 경우 : 삼각형아님
// (a ≤ b ≤ c)
// 입력 : 3 3 3
// 출력 : 정삼각형

// let nums = prompt("두 정수를 입력해주세요.").split(" ").map(Number); // [a, b, c]

// let a = nums[0];
// let b = nums[1];
// let c = nums[2];

// if(a==b&&b==c&&c==a) {
//     alert("정삼각형")
// }
// else if(a==b||b==c||c==a) {
//     alert("이등변삼각형")
// }
// else if(a*a + b*b == c*c) {
//     alert("직각삼각형")
// }
// else {
//     alert("삼각형")
// }

// if(nums.length!=3||c>=a+b) {
//     alert("삼각형아님")
// }

// 문제 1222 축구의 신 2
// 입력 : 80 5 7
// 출력 : same
// 현재 경기타임에 축구의 신 성익이를 투입하여 1반이 이길 수 있으면 "win", 동점이 되면 "same", 투입해도 이기지 못하면 "lose"를 출력하시오.
// (성익이는 해당 시간에 1반에만 투입되며, 성익이가 투입되면 성익이 외에는 양팀 모두 골을 넣지 못한다.)

// let num = prompt("시간과 점수를 입력하세요.").split(" ").map(Number); // [80, 5, 7] ( 현재 경기 타임,  1반득점, 2반득점 )
// let time = 90 - num[0];
// // let score = Math.floor(time/5 + num[1] + 1);
// let score1 = time/5 + num[1]; //1반의 총 득점

// if(score1 > num[2]) {
//     alert("win")
// }
// else if(score1 == num[2]) {
//     alert("same")
// }
// else {
//     alert("lose")
// }

// 문제 1231 계산기 1
// 연산식의 형식은 정수+정수 또는 정수-정수 또는 정수*정수 또는 정수/정수의 형태이다.
// 입력 : 10+10
// 출력 : 20

// let num = prompt("연산식을 입력하세요."); // [10+10]

// let myadd = 0;
// let result1 = 0;

// let myminus = 0;
// let result2 = 0;

// let mymulti = 0;
// let result3 = 0;

// let mydiv = 0;
// let result4 = 0;

// for(i=0; i<num.length; i++) {
//     if(num[i]=="+") {
//         myadd = num.split("+") // [n, +, n]
//         result1 = Number(myadd[0]) + Number(myadd[1]);
//         alert(result1)
//     }
//     else if(num[i]=="-") {
//         myminus = num.split("-") // [n, -, n]
//         result2 = myminus[0] - myminus[1];
//         alert(result2)
//     }
//     else if(num[i]=="*") {
//         mymulti = num.split("*") // [n, *, n]
//         result3 = mymulti[0] * mymulti[1];
//         alert(result3)
//     }
//     else if(num[i]=="/") {
//         mydiv = num.split("/") // [n, *, n]
//         result4 = mydiv[0] / mydiv[1];
//         alert(result4)
//     }
// }
