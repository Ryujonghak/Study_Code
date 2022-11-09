// <기초2. 입출력문 및 연산자>
// 문제 1110
// 입력 : 5
// 출력 : 5

// let num = Number(prompt("정수를 입력하세요."))
// document.querySelector("#app").innerHTML = num

// 문제 1111
// 입력 : 35
// 출력 : 35%

// let num = Number(prompt("정수를 입력하세요."))
// document.querySelector("#app").innerHTML = num + "%"

// 문제 1112
// 입력 : 5 7
// 출력 : 5 7

// let num = prompt("정수를 입력하세요.").split(" ")
// document.querySelector("#app").innerHTML = num[0] + " " + num[1]

// 문제 1113
// 입력 : 1 2
// 출력 : 2 1

// let num = prompt("정수를 입력하세요.").split(" ")
// document.querySelector("#app").innerHTML = num[1] + " " + num[0]

// 문제 1114
// 두정수의 합을 출력한다.
// 입력 : 5 7
// 출력 : 12

// let num = prompt("정수를 입력하세요.").split(" ");
// let first = Number(num[0]);
// let second = Number(num[1]);

// document.querySelector("#app").innerHTML = first + second;

// 문제 1115
// 두 정수의 합을 출력한다. (두 수는 int 범위를 넘어선 64비트 정수형 값)
// 입력 : 11111111111 22222222222
// 출력 : 33333333333

// let num = prompt("정수를 입력하세요.").split(" ");
// let first = Number(num[0]);
// let second = Number(num[1]);

// document.querySelector("#app").innerHTML = first + second;

// 문제 1116
// 입력 : 3 2
// 출력 : 3+2=5
//        3-2=1
//        3*2=6
//        3/2=1

// let num = prompt("정수를 입력하세요.").split(" ");
// let first = Number(num[0]);
// let second = Number(num[1]);

// document.querySelector("#app").innerHTML =
// first + "+" + second + "=" + (first + second) + "<br>"
// + first + "-" + second + "=" + (first - second) + "<br>"
// + first + "*" + second + "=" + (first * second) + "<br>"
// + first + "/" + second + "=" + (first % second) + "<br>"

// 문제 1117
// 두 실수의 곱을 소수 둘째자리까지 출력한다.
// 입력 : 1.23 4.56
// 출력 : 5.61

// let num = prompt("정수를 입력하세요.").split(" ");
// let first = Number(num[0]);
// let second = Number(num[1]);

// document.querySelector("#app").innerHTML = (first*second).toFixed(2);

// 문제 1118
// 삼각형의 넓이를 소수 첫째자리까지 출력한다. (삼각형의 넓이 = 밑변 * 높이 / 2 => 밑변(a)과 높이(b))
// 입력 : 5 2
// 출력 : 5.0

// let num = prompt("정수를 입력하세요.").split(" ");
// let first = Number(num[0]);
// let second = Number(num[1]);

// document.querySelector("#app").innerHTML = (first*second/2).toFixed(1);

// 문제 1119
// 일(day)이 입력으로 주어지면 시간으로 변환하시오.
// 입력 : 2
// 출력 : 48

// let num = Number(prompt("정수를 입력하세요."));

// document.querySelector("#app").innerHTML = num*24;

// 문제 1120
// 세 수의 평균을 소수 둘째자리까지 출력하시오.
// 입력 : 1 2 3
// 출력 : 2.00

// let num = prompt("정수를 입력하세요.").split(" ");
// let first = Number(num[0]);
// let second = Number(num[1]);
// let third = Number(num[2]);

// document.querySelector("#app").innerHTML = (first*second*third/3).toFixed(2);

// 문제 1121
// 나머지를 출력한다.
// 입력 : 7 5
// 출력 : 2

// let num = prompt("정수를 입력하세요.").split(" ");
// let result = num[0]%num[1];

// alert (result)

// 문제 1122
// 초 -> 분, 초 순서로 출력한다.
// 입력 : 70
// 출력 : 1 10

// let num = Number(prompt("정수를 입력하세요."));
// let first = Math.floor(num/60);
// let second = num%60

// alert(first + " " + second)

// 문제 1123
// 화씨온도를 소수 셋째자리 까지 출력한다. (실수) -> 화씨 온도 = 9 / 5 * 섭씨온도 + 32
// 입력 : 30
// 출력 : 86.000

// let num = Number(prompt("섭씨온도를 입력하세요."));
// let result = 9/5*num+32;

// alert(result.toFixed(3));

// 문제 1125
// 10진수 입력 -> 8진수와 16진수를 차례대로 출력한다.
// (16진수는 대문자 출력)
// 입력 : 10
// 출력 : 12 A

// let num = Number(prompt("정수를 입력하세요."));

// let octal = parseInt(num, 10).toString(8); // 10진수를 8진수로
// let hex = parseInt(num, 10).toString(16).toUpperCase();

// alert(octal + " " + hex)

// 문제 1131
// 입력 : a
// 출력 : a

// let char = prompt("문자를 입력하세요.");
// alert(char);

// 문제 1132
// 입력 : cat
// 출력 : cat

// let word = prompt("문자를 입력하세요.");
// alert(word);

// 문제 1133
// 입력 : black sheep wall
// 출력 : black sheep wall

// let words = prompt("문자를 입력하세요.");
// alert(words);

// 문제 1135
// a가 b보다 크거나 같을 경우 1, 그렇지 않은 경우 0을 출력한다.
// 입력 : 2 3
// 출력 : 0

// let num = prompt("정수를 입력하세요.").split(" ");
// let result = num.map(value => Number(value));

// if(result[0]>=result[1]) {
//     alert(1)
// }

// else {
//     alert(0)
// }

// 문제 1136
// a와 b가 같을 경우 1, 그렇지 않은 경우 0을 출력한다.
// 입력 : 2 3
// 출력 : 0

// let num = prompt("정수를 입력하세요.").split(" ");
// let result = num.map(value => Number(value));

// if(result[0]==result[1]) {
//     alert(1)
// }

// else {
//     alert(0)
// }

// 문제 1137
// a와 b가 같지 않을 경우 1, 그렇지 않은 경우 0을 출력한다.
// 입력 : 2 3
// 출력 : 1

// let num = prompt("정수를 입력하세요.").split(" ");
// let result = num.map(value => Number(value));

// if(result[0]!==result[1]) {
//     alert(1)
// }

// else {
//     alert(0)
// }

// 문제 1138
// 입력된 논리값의 반대로 출력한다.
// 입력 : 0
// 출력 : 1

// let num = Number(prompt("정수를 입력하세요."));

// if(num==0) {
//     alert(1)
// }

// else if(num==1) {
//     alert(0)
// }

// 문제 1139
// 두 정수의 값이 모두 참(1) 이면 참(1), 하나라도 거짓(0)이면 거짓(0)을 출력한다.
// 입력 : 1 0
// 출력 : 0

// let num = prompt("정수를 입력하세요.").split(" ");
// let result = num.map(value => Number(value));

// if(result[0]==1&&result[1]==1) {
//     alert(1)
// }

// else {
//     alert(0)
// }

// 문제 1140
// 두 정수 중 하나의 값이 참(1) 이면 참(1), 그렇지 않으면 거짓(0)을 출력한다.
// 입력 : 0 1
// 출력 : 1

// let num = prompt("정수를 입력하세요.").split(" ");
// let result = num.map(value => Number(value));

// if(result[0]==1||result[1]==1) {
//     alert(1)
// }

// else {
//     alert(0)
// }

// TODO: 문제 1143 *비트연산자
// 두 정수를 비트단위로 AND 연산한 후 결과를 10진수로 출력한다.
// 입력 : 3 5
// 출력 : 1

// let num = prompt("정수 2개를 입력하세요.").split(" ");

// alert(num[0]&num[1])

// 문제 1144
// 두 정수를 비트단위로 OR 연산한 후 결과를 10진수로 출력한다.
// 입력 : 3 5
// 출력 : 7

// let num = prompt("정수 2개를 입력하세요.").split(" ");

// alert(num[0]|num[1])

// 문제 1147
// a를 x번 SHIFT(<<) 연산한 후 결과를 10진수로 출력한다.
// 입력 : 3 3
// 출력 : 24

// let num = prompt("정수 2개를 입력하세요.").split(" ");

// alert(num[0]<<num[1])

// 문제 1148
// a를 x번 SHIFT(>>) 연산한 후 결과를 10진수로 출력한다.
// 입력 : 4 1
// 출력 : 2

// let num = prompt("정수 2개를 입력하세요.").split(" ");

// alert(num[0]>>num[1])

// 문제 1149
// 두 정수 중 큰 정수를 출력한다.
// 입력 : 2 7
// 출력 : 7

// let num = prompt("정수 2개를 입력하세요.").split(" ").map(Number);
// let max = Math.max(num[0], num[1]);

// alert(max)

// 문제 1150
// 가장 작은 값을 출력한다.
// 입력 : 3 5 2
// 출력 : 2

// let num = prompt("정수 3개를 입력하세요.").split(" ").map(Number);

// let min = Math.min(num[0], num[1], num[2]);

// alert(min)

// <기초3. if ~ else>
// 문제 1151
// 10보다 작은 수가 입력되면 small 을 출력, 10이상이면 아무것도 출력하지 마시오.
// 입력 : 5
// 출력 : small

// let num = Number(prompt("정수를 입력하세요."));

// if(num<10) {
//     alert("small")
// }

// else {
//     alert("")
// }

// 문제 1152
// 10보다 작은 정수가 입력되면 small 을 출력, 그 이상의 수가 입력되면 big 을 출력하시오.
// 입력 : 15
// 출력 : big

// let num = Number(prompt("정수를 입력하세요."));

// if(num<10) {
//     alert("small")
// }

// else {
//     alert("big")
// }

// 문제 1153
// a가 b보다 크면  > 를 출력,
// b가 a보다 크면  < 를 출력,
// a와 b가 같으면  = 를 출력한다.
// 입력 : 2 6
// 출력 : <

// let num = prompt("정수 2개를 입력하세요.").split(" ").map(Number);

// if(num[0]>num[1]) {
//     alert(">")
// }

// else if(num[0]<num[1]) {
//     alert("<")
// }

// else if(num[0]==num[1]) {
//     alert("=")
// }

// TODO: 문제 1154 *Math.max(...arr)
// 큰수 - 작은 수의 값이 출력된다.
// 입력 : 5 7
// 출력 : 2

// let num = prompt("정수 2개를 입력하세요.").split(" ").map(Number);

// let result = Math.max(...num) - Math.min(...num);

// alert(result)

// 문제 1155
// 7의 배수일 경우 multiple를 출력하고, 7의 배수가 아니면 not multiple을 출력하시오.
// 입력 : 9
// 출력 : not multiple

// let num = Number(prompt("숫자를 입력하세요."));

// if(num%7==0) {
//     alert("multiple")
// }

// else {
//     alert("not multiple")
// }

// 문제 1156
// 홀수이면 odd를 출력, 짝수이면 even을 출력하시오.
// 입력 : 5
// 출력 : odd

// let num = Number(prompt("숫자를 입력하세요."));

// if(num%2==0) {
//     alert("even")
// }

// else {
//     alert("odd")
// }

// 문제 1157
// 50이상 60이하이면 win을 출력, 그 외에는 lose를 출력하시오.
// 입력 : 50.213
// 출력 : win

// let num = Number(prompt("점수를 입력하세요."));

// if(50<=num&&num<=60) {
//     alert("win")
// }

// else {
//     alert("lose")
// }

// 문제 1158
// 공이 떨어지는 위치 n이 30≤n≤40 이거나 60≤n≤70 이면, win을 출력, 그외에는 lose를 출력한다.
// 입력 : 50
// 출력 : lose

// let num = Number(prompt("점수를 입력하세요."));

// if(30<=num&&num<=40) {
//     alert("win")
// }
// else if(60<=num&&num<=70) {
//     alert("win")
// }
// else {
//     alert("lose")
// }

// 문제 1159
// 1. 공의 위치가 50m~70m이면 슬기가 이김.
// 2. 공의 위치가 6의 배수이면 슬기가 이김.
// 입력 : 30
// 출력 : win

// let num = Number(prompt("점수를 입력하세요."));

// if(50<=num&&num<=70) {
//     alert("win")
// }
// else if(num%6==0) {
//     alert("win")
// }
// else {
//     alert("lose")
// }

// 문제 1160
//  아르바이트 가는 날(월, 수, 금, 일)이면 "oh my god"를 가는 날이 아니면 "enjoy"를 출력하시오.
// 입력 : 1
// 출력 : oh my god

// let num = Number(prompt("점수를 입력하세요."));

// if(num==1||num==3||num==5||num==7) {
//     alert("oh my god")
// }
// else {
//     alert("enjoy")
// }

// 문제 1161
// 입력 : 2 3
// 출력 : 짝수+홀수=홀수

// let num = prompt("정수 2개를 입력하세요.").split(" ").map(Number);

// if(num[0] % 2 == 0 && num[1] % 2 == 0) {
//     alert("짝수+짝수=짝수");
// } else if(num[0] % 2 == 1 && num[1] % 2 == 0) {
//     alert("홀수+짝수=홀수");
// } else if(num[0] % 2 == 0 && num[1] % 2 == 1) {
//     alert("짝수+홀수=홀수");
// } else {
//     alert("홀수+홀수=짝수");
// }

// 문제 1162
// 년도 - 월 + 일의 마지막 숫자가 0이면 "대박"을 , 그렇지 않으면 "그럭저럭"을 출력하시오.
// 입력 : 1902 2 10
// 출력 : 대박

// let num = prompt("생년월일을 입력하세요.").split(" ").map(Number);
// let result1 = num[0] - num[1] + num[2];

// if(result1 % 10 == 0) {
//     alert("대박")
// }
// else {
//     alert("그럭저럭")
// }

// TODO: 문제 1163 *Math.floor() : 소수점 버림
// 년도 + 월 + 일의 100의 자리가 숫자가 짝수이면 "대박"을 , 그렇지 않으면 "그럭저럭"을 출력하시오.
// 입력 : 1502 2 10
// 출력 : 그럭저럭

// let num = prompt("생년월일을 입력하세요.").split(" ").map(Number);
// let result1 = num[0] + num[1] + num[2];
// let result2 = Math.floor(result1/100%10)

// if(result2%2==0) {
//     alert("대박")
// }
// else {
//     alert("그럭저럭")
// }

// 문제 1164
// 170보다 같거나 작으면 "CRASH"를 출력, 그 보다 크면 "PASS"를 출력하시오.
// 입력 : 170 168 175
// 출력 : CRASH

// let num = prompt("생년월일을 입력하세요.").split(" ").map(Number);

// if(num[0]<=170||num[1]<=170||num[2]<=170) {
//     alert("CRASH")
// }
// else {
//     alert("PASS")
// }

// 문제 1165
// 성익이를 투입하면 우리팀의 최종 득점은 몇 점인지 출력하시오. (현재 경기시간, 우리팀의 득점)
// 입력 : 74 2
// 출력 : 6

// let num = prompt("시간과 점수를 입력하세요.").split(" ").map(Number);
// let time = 90 - num[0];
// let score = Math.floor(time/5 + num[1] + 1);

// alert(score)

// 문제 1166
// 입력받은 자연수가 윤년이라면 "Leap"를 아니라면 "Normal"을 출력한다.
// 입력 : 2012
// 출력 : Leap

// let num = Number(prompt("해를 입력하세요."));

// if(num%400==0) {
//     alert("Leap")
// }

// else {
//     if(num%4==0&&num%100!=0) {
//         alert("Leap")
//     }
//     else {
//         alert("Normal")
//     }
// }

// TODO: 문제 1167 *sort() 함수
// 세 개의 정수를 작은 순서로 나열 했을 때, 두번째 수를 출력한다.
// 입력 : 201 20 3
// 출력 : 20

// let num = prompt("숫자를 입력하세요.").split(" ").map(Number);
// num.sort(function(a, b){
//     return a - b;
//   });

// alert(num[1])

// 문제 1168
// 2012년도에 현재 나이를 출력하시오. - 생년월일(6자리)과 성별정보(1자리)
// 1이면 1900년대 출생 남자, 2이면 1900년대 출생 여자, 3이면 2000년대 출생 남자, 4이면 2000년대 출생 여자
// 입력 : 790101 1
// 출력 : 34

// let num = prompt("숫자를 입력하세요.").split(" ").map(Number);
// let bir = Math.floor(num[0]/10000) //주민 앞 두자리 남음

// if(num[1]==1||num[1]==2) {
//     alert(2012-(bir+1900)+1)
// }
// else if(num[1]==3||num[1]==4) {
//     alert(2012-(bir+2000)+1)
// }

// 문제 1169
// 출생년도 뒤의 두자리와 연도정보(1이면 1900년대, 3이면 2000년대)를 출력한다. (2012년 기준)
// 입력 : 18
// 출력 : 95 1

// let num = Number(prompt("해를 입력하세요."));
// let bir1 = 2012 - num + 1;
// let bir2 = Math.floor((2012 - num + 1)/1000);

// if(bir2==1) {
//     alert(bir1%100 + " " + "1")
// }
// else if(bir2==2) {
//     alert(bir1%100 + " " + "3")
// }

// 문제 1170
// 학번을 붙여서 출력한다. 번호가 10번 미만일때는 0을 붙여 출력한다.
// 입력 : 3 1 2
// 출력 : 3102

// let num = prompt("숫자를 입력하세요.").split(" ");
// let result = ""

// if(num[2]<10) {
//     result = "0" + num[2]
// }
// else {
//     result = num[2]
// }

// alert(num[0] + num[1] + result);

// 문제 1171
// 학번이 총6자리가 되게 출력하시오. 빈 부분은 0으로 채운다.
// (학년: 3이하, 반: 20반이하, 번호, 999번 이하)
// 입력 : 2 7 15
// 출력 : 207015

// 풀이 1
// let num = prompt("숫자를 입력하세요.").split(" ").map(Number);

// alert(100000*num[0]+1000*num[1]+num[2])

// 풀이 2?
// let num = prompt("숫자를 입력하세요.").split(" ");
// let result1 = "";
// let result2 = "";

// if(num[1]<10) {
//     result1 = "0" + num[1]
// }
// else {
//     result1 = num[1]
// }

// if(num[2]<10) {
//     result1 = "00" + num[2]
// }
// else if(10<=num[2]&&num[2]<100) {
//     result1 = "0" + num[2]

// }

// else {
//     result1 = num[2]
// }

// alert(num[0] + result1 + result2);

// 문제 1172
// 낮은 숫자 부터 출력한다.
// 입력 : 8 7 6
// 출력 : 6 7 8

// let num = prompt("숫자를 입력하세요.").split(" ").map(Number);

// num.sort(function(a, b){
//     return a - b;
//   });

// alert(num)

// 문제 1173
// 입력된 시간의 30분 전의 시간을 출력하시오.
// (시의 범위 : 0~ 23)
// (분의 범위 : 0~ 59)
// 입력 : 12 35
// 출력 : 12 5

// let num = prompt("숫자를 입력하세요.").split(" ").map(Number);

//     if(num[1] >= 30){
//         alert(num[0] + " " + (num[1] -30));
//     }
//     else if(num[1] < 30) {
//         alert(num[0] + " " + (59 -30));
//     }
//     else{
//         if(num[0]=0&&num[1]<30)
//         alert((23 - 1) + " " + (num[1] -30));
//     }

// -------------------------------------------------------------------------------------- 위까지는 공동부분

// 문제 1180
// 첫째 줄에 휴지통을 압축했을 때 양을 출력한다.
// 둘째 줄에 그 양이 50이하이면 GOOD 을 출력하고, 50을 넘으면 OH MY GOD 을 출력한다.
// 입력 : 90
// 출력 : 18
//        GOOD

// 문제 1201
// 양수이면 "양수", 음수이면 "음수", 0이면 0을 출력하시오.
// 입력 : 5
// 출력 : 양수

// 문제 1202
// 90점 이상 : A
// 80점 이상 : B
// 70점 이상 : C
// 60점 이상 : D
// 60점 미만 : F
// 입력 : 80
// 출력 : B

// 문제 1203
// BMI 수치	비만 판정
// ~10 이하	정상
// ~20 이하	과체중
// 20 초과	비만
// 입력 : 15
// 출력 : 과체중

// 문제 1204
// 1~99 중 하나가 숫자가 입력되면 영어 서수 표현을 출력하시오.
// 입력 : 2
// 출력 : 2nd

// 문제 1205
// 두 실수 a, b가 입력되면 그 두수를 더하거나 빼거나 곱하거나 나누거나 제곱을 해서 가장 큰 수를 출력하시오.
// 입력 : 1 2
// 출력 : 3.000000

// 문제 1206
// b가 a의 배수이면 "a*x=b"를 출력하고,
// a가 b의 배수이면 "b*x=a"를 출력하고,
// 배수관계가 아니면 "none"을 출력하시오.
// 입력 : 4 12
// 출력 : 4*3=12

// 문제 1207
// 도 : 1개가 뒤집어진 상태
// 개 : 2개가 뒤집어진 상태
// 걸 : 3개가 뒤집어진 상태
// 윷 : 4개가 뒤집어진 상태
// 모 : 하나도 뒤집어지지 않은 상태
// 입력 : 0 0 1 0
// 출력 : 도

// 문제 1210
// 그 번호의 메뉴 칼로리를 계산하여 500보다 크면 "angry", 500이하면 "no angry"를 출력하시오.
// 입력 : 1 2
// 출력 : angry

// 문제 1212
// c < a + b 이면 삼각형이 성립됨.
// 삼각형이 가능하면 "yes", 삼각형을 만들 수 없다면 "no"를 출력하시오.
// 입력 : 2 3 4
// 출력 : yes

// 문제 1214
// 그 달의 마지막 날이 며칠인지 출력한다.
// 입력 : 2009 10
// 출력 : 31

// 문제 1216
//
// 입력 : 10 100 70
// 출력 : advertise

// 문제 1218
// 조건에 따라 삼각형을 출력한다.
// 입력 : 3 3 3
// 출력 : 정삼각형

// 문제 1222
// 현재 경기타임에 축구의 신 성익이를 투입하여 1반이 이길 수 있으면 "win", 동점이 되면 "same",
// 투입해도 이기지 못하면 "lose"를 출력하시오.
// 입력 : 80 5 7
// 출력 : same

// 문제 1224
// a / b  >  c / d  이면  > 를 출력,
// a / b =  c / d  이면  = 를 출력,
// a / b  <  c / d  이면 < 를 출력.
// 입력 : 1 2 3 4
// 출력 : <

// 문제 1226
// 1등 = 1 출력, 2등 = 2 출력, 3등 = 3 출력, 4등 = 4 출력, 5등 = 5 출력, 꽝 = 0 출력
// 입력 : 13 23 24 35 40 45 7
//        2 6 7 23 40 44
// 출력 : 0

// let num1 = prompt("당첨번호를 입력하세요.").split(" "); // [13, 23, 24, 35, 40, 45, 7]
// let num2 = prompt("응모번호를 입력하세요.").split(" ");
// let result = "";

// for (i = 0; i < num1.length - 1; i++) {
//   for (j = 0; j < num2.length; j++) {
//     if (num1[i] == num2[j]) {
//       result = result + num2[j] + " ";
//     }
//   }
// }

// for (i = 0; i < num2.length; i++) {}

// let result2 = result.split(" "); // [23, 40, (공백)]

// if (result2.length == 7) {
//   alert(1);
// } else if (result2.length == 6 && num2.indexOf(num1[6])>0) {
//   alert(2);
// } else if (result2.length == 6) {
//   alert(3);
// } else if (result2.length == 5) {
//   alert(4);
// } else if (result2.length == 4) {
//   alert(5);
// } else if (result2.length <= 3) {
//   alert(0);
// }

// 문제 1228
// 표준몸무게 = (실제 키 - 100) * 0.9
// 비만도 = (실제 몸무게 - 표준몸무게)  * 100 / 표준 몸무게
// 10이하 : 정상
// 10초과 20이하 : 과체중
// 20 초과 : 비만
// 입력 : 170.0 80.0
// 출력 : 비만

// 문제 1229
// 비만도 등급을 출력한다.
// 입력 : 150 60
// 출력 : 과체중

// 문제 1230
// 높이가 170인 차가 잘 통과할 수 있으면 PASS를 출력,
// 170보다 같거나 작으면 CRASH 처음 충돌한 터널 높이를 출력하시오.
// 입력 : 171 168 165
// 출력 : CRASH 168

// 문제 1231
// 계산 결과를 정수로 출력한다.
// 입력 : 10+10
// 출력 : 20
