// C언어 기초 100제
// 문제 1001
// alert("Hello")

// 문제 1002
// alert("Hello World")
// document.write("Hello World")
// console.log("Hello World")
// document.querySelector("#app").innerHTML = "Hello World";

// 문제 1003
// Hello
// World
// 를 출력한다.

// alert("Hello"+"\n"+"World")

// 문제 1004
// 'Hello'
// 를 출력한다.

// alert("'Hello'")

// 문제 1005
// "Hello World"
// 를 출력한다.

// alert('"Hello World"')

// 문제 1006
// "!@#$%^&*()"
// 를 출력한다.

// alert('"!@#$%^&*()"')

// 문제 1007
// "C:\Download\hello.cpp"
// 를 출력한다.

// alert('"C:\\Download\\hello.cpp"')

// 문제 1008
// ┌┬┐
// ├┼┤
// └┴┘
// 를 유니코드를 이용하여 출력한다.

// alert("\u250c\u252c\u2510\n\u251c\u253c\u2524\n\u2514\u2534\u2518");

// 문제 1010
// 입력 : 15
// 출력 : 15 (입력된 정수 그대로 출력하기)

// let num = Number(prompt("정수를 입력하세요."))
// alert(num)

// 문제 1011
// 입력 : p
// 출력 : p

// let char1 = prompt("문자를 입력하세요.")
// alert(char1)

// 문제 1012
// 입력 : 1.414213
// 출력 : 1.414213

// let num = Number(prompt("실수를 입력하세요."))
// alert(num)

// 문제 1013
// 입력 : 1 2
// 출력 : 1 2

// let num = prompt("정수 2개를 입력하세요.").split(" ")
// alert(num[0] + " " + num[1])

// 문제 1014
// 입력 : A b
// 출력 : b A

// let char = prompt("문자 2개를 입력하세요.").split(" ")
// alert(char[1] + " " + char[0])

// 문제 1015
// 실수(float) 1개를 입력받은 후,
// 그 값을 소수점 셋 째 자리에서 반올림하여
// 소수점 이하 둘 째 자리까지 출력하시오.
// 입력 : 1.59254
// 출력 : 1.59

// let num = Number(prompt("실수를 입력하세요."))
// alert(num.toFixed(2))

// 문제 1017
// 입력 : 125
// 출력 : 125 125 125

// let num = prompt("숫자를 입력하세요.");
// alert(num + " " + num + " " + num);

// 문제 1018
// 입력 : 3:16
// 출력 : 3:16

// let num = prompt("정수 2개를 입력하세요.").split(":")
// alert(num[0] + ":" + num[1])

// 문제 1019
// 입력 : 2013.8.5
// 출력 : 2013.08.05

// let num = prompt("날짜를 입력하세요.").split(".")
// alert(num[0] + "." + "0" + num[1] + "." + "0" + num[2])

// 문제 1020
// 입력 : 000907-1121112
// 출력 : 0009071121112

// let num = prompt("주민번호를 입력하세요.").split("-")
// alert(num[0]+num[1])

// 문제 1021
// 입력된 단어를 그대로 출력한다.
// 입력 : Informatics
// 출력 : Informatics

// let char = prompt("단어를 입력하세요.")
// alert(char)

// 문제 1022
// 입력 : Programming is very fun!!
// 출력 : Programming is very fun!!

// let sen = prompt("문장을 입력하세요.")
// alert(sen)

// 문제 1023
// 첫 번째 줄에 정수 부분을, 두 번째 줄에 실수 부분을 출력한다.
// 입력 : 1.414213
// 출력 : 1
//        414213

// let num = prompt("숫자를 입력하세요.").split(".")
// alert(num[0] + "\n" + num[1])

//문제 1024
// .substring(시작인덱스, 종료인덱스);
// .substr(시작인덱스, 길이)
// 입력 : Boy
// 출력 : 'B'
//        'o'
//        'y'

// 풀이 1) => 이렇게 풀 면 되는지..?
// let word = prompt("단어를 입력하세요.")

// let first = "'" + word[0] + "'"
// let second = "'" + word[1] + "'"
// let third = "'" + word[2] + "'"

// alert(first + "\n" + second + "\n" + third)

// 풀이..2?
// let word = prompt("단어를 입력하세요.")

// let first = "'" + word.substring(0,1) + "'"
// let second = "'" + word.substring(1,2) + "'"
// let third = "'" + word.substring(2,3) + "'"

// alert(first + "\n" + second + "\n" + third)

// 문제 1025
// 입력 : 75254
// 출력 : [70000]
//        [5000]
//        [200]
//        [50]
//        [4]

// let num = prompt("숫자를 입력하세요.")

// let first = "[" + num[0] + "0000" + "]"
// let second = "[" + num[1] + "000" + "]"
// let third = "[" + num[2] + "00" + "]"
// let fourth = "[" + num[2] + "0" + "]"
// let fifth = "[" + num[2] + "]"

// alert(first + "\n" + second + "\n" + third + "\n" + fourth + "\n" + fifth);

// let num = prompt("숫자를 입력하세요.")

// let first = "[" + num.substring(0,1) + "0000" + "]"
// let second = "[" + num.substring(1,2) + "000" + "]"
// let third = "[" + num.substring(2,3) + "00" + "]"
// let fourth = "[" + num.substring(3,4) + "0" + "]"
// let fifth = "[" + num.substring(4,5) + "]"

// alert(first+ "\n" + second+ "\n" + third+ "\n" + fourth+ "\n" + fifth)

// 문제 1026
// 분만 출력한다.
// 입력 : 17:23:57
// 출력 : 23

// let num = prompt("시간을 입력하세요.").split(":")
// alert(num[1])

// 문제 1027
// 입력 : 2014.07.15
// 출력 : 15-07-2014

// let num = prompt("시간을 입력하세요.").split(".")
// alert(num[2] + "-" + num[1] + "-" + num[0])

// 문제 1028
// 입력 : 2147483648
// 출력 : 2147483648

// let num = Number(prompt("정수를 입력하세요."))
// alert(num)

// 문제 1029
// 입력 : 3.14159265359
// 출력 : 3.14159265359

// let num = Number(prompt("실수를 입력하세요."))
// alert(num)

// 1030
// 입력 : -2147483649
// 출력 : -2147483649

// let num = Number(prompt("숫자를 입력하세요."))
// alert(num)

// TODO: 1031 진수변환
// 10진수를 8진수로 출력한다.
// 입력 : 10
// 입력 : 12

// let num = Number(prompt("숫자를 입력하세요."))
// let octal = parseInt(num, 10).toString(8); // 10진수를 8진수로

// alert(octal)

// 1032
// 10진수를 16진수(소문자)로 출력한다.
// 입력 : 255
// 출력 : ff

// let num = Number(prompt("숫자를 입력하세요."))
// let hex = parseInt(num, 10).toString(16);

// alert(hex)

// TODO: 1033 대문자 출력
// 16진수(대문자)로 출력한다.
// .toUpperCase() => 대문자로
// 입력 : 255
// 출력 : FF

// let num = Number(prompt("숫자를 입력하세요."));
// let hex = parseInt(num, 10).toString(16).toUpperCase();

// alert(hex)

// 1034
// 8진 정수 하나를 10진수로 바꾸어 출력한다.
// 입력 : 13
// 출력 : 11

// let num = Number(prompt("숫자를 입력하세요."))
// let decimal = parseInt(num, 8).toString(10);

// alert(decimal)

// 1035
// 16진 정수 1개가 입력된다.
// (단, 16진수는 영문 소문자로 입력된다.)
// 8진수로 바꾸어 출력한다.
// 입력 : f
// 출력 : 17

// let num = prompt("숫자를 입력하세요.");
// let hex = parseInt(num, 16).toString(8);

// alert(hex)

// TODO: 1036 아스키코드 => 뒤에 (n) : 배열인덱스번호 의미 => 문자 하나씩만 출력가능(?)
// TODO, char.charCodeAt(0) -> char 문자를 숫자로 출력
// TODO, String.fromCodePoint(code), String.fromCharCode(char2) ??
// 영문자를 아스키코드 값의 10진수로 출력한다.
// 입력 : A
// 출력 : 65

// let char = prompt("문자를 입력하세요.");

// alert(char.charCodeAt(0));

// 1037
// 아스키코드 값을 문자로 출력한다.
// 입력 : 65
// 출력 : A

// let code = prompt("코드를 입력하세요.");

// let result = String.fromCodePoint(code);

// alert(result);

// 1038
// 두 정수의 합을 출력한다.
// 입력 : 123 -123
// 출력 : 0
// let num = prompt("정수 2개를 입력하세요.").split(" ");
// let first = Number(num[0]);
// let second = Number(num[1]);

// alert(first+second)

// 1039
// 두 정수의 합을 출력한다.
// 입력 : 2147483648 2147483648
// 출력 : 4294967296

// let num = prompt("정수 2개를 입력하세요.").split(" ");
// let first = Number(num[0]);
// let second = Number(num[1]);

// alert(first+second)

// 문제 1040
// 부호를 바꿔 출력한다.
// 입력 : -1
// 출력 : 1

// 풀이 1)
// let num = prompt("숫자를 입력하세요.");
// alert(Math.abs(num));

// 풀이 2)
// let num = prompt("숫자를 입력하세요.");
// alert(num[1])

// TODO: 1041 *.charCodeAt(0) -> 문자를 숫자로 출력

// 다음 문자를 출력한다.
// 입력 : a
// 출력 : b

// let char1 = prompt("문자를 입력하세요.");
// let char2 = char1.charCodeAt(0) + 1;

// alert(String.fromCharCode(char2));

// TODO: 문제 1042 *Math.floor()
// a를 b로 나눈 몫을 출력한다.
// Math.floor() : 소수점 이하를 버림한다.
// 입력 : 1 3
// 출력 : 0

// let num = prompt("정수 2개를 입력하세요.").split(" ");

// alert(Math.floor(num[0]/num[1]));

// 1043
// a 를 b로 나눈 나머지를 출력한다.
// 입력 : 10 3
// 출력 : 1

// let num = prompt("정수 2개를 입력하세요.").split(" ");
// alert(num[0]%num[1]);

// 문제 1044
// 입력된 정수에 1을 더해 출력한다.
// 입력 : 2147483647
// 출력 : 2147483648

// let num = Number(prompt("숫자를 입력하세요."));
// alert(num + 1);

// TODO: 문제 1045 *.toFixed()
// 입력 : 10 3
// 출력 : 13
//        7
//        30
//        3
//        1
//        3.33

// .toFixed(소수부분의 자릿수) => 소수점 자르기

// let num = prompt("정수 2개를 입력하세요.").split(" ");
// let first = Number(num[0]);
// let second = Number(num[1]);
// document.querySelector("#class").innerHTML = (first + second) + "<br>" + (first - second) + "<br>" + first * second + "<br>" + Math.floor(first/second) + "<br>"+ first % second + "<br>" + (first/second).toFixed(2)

// 문제 1046
// 합과 평균을 줄을 바꿔 출력한다.
// 평균은 소수점 이하 둘째 자리에서 반올림해서 소수점 이하 첫째 자리까지 출력한다.
// 입력 : 1 2 3
// 출력 : 6
//        2.0

// let num = prompt("정수 2개를 입력하세요.").split(" ");
// let first = Number(num[0]);
// let second = Number(num[1]);
// let third = Number(num[2]);

// document.querySelector("#class").innerHTML = (first + second + third) + "<br>" + ((first + second + third)/3).toFixed(1)

// 문제 1047
// 2배 곱한 정수를 출력한다.
// 입력 : 1024
// 출력 : 2048

// let num = prompt("정수를 입력하세요.");
// alert(num*2)

// 문제 1048
// a 를 2b배(거듭제곱) 만큼 곱한 값을 출력한다.
// 입력 : 1 3
// 출력 : 8

// let num = prompt("숫자 2개를 입력하세요.").split(" ");
// alert(num[0]*(2**num[1]))

// 문제 1049
// a가 b보다 큰 경우 1을, 그렇지 않은 경우 0을 출력한다.
// 입력 : 9 1
// 출력 : 1

// let num = prompt("숫자 2개를 입력하세요.").split(" ");

// if (num[0]>num[1]) {
//     alert(1)
// }
// else {
//     alert(0)
// }

// 문제 1050
// a와 b의 값이 같은 경우 1을, 그렇지 않은 경우 0을 출력한다.
// 입력 : 0 0
// 출력 : 1

// let num = prompt("숫자 2개를 입력하세요.").split(" ");

// if (num[0]==num[1]) {
//     alert(1)
// }
// else {
//     alert(0)
// }

// 문제 1051
// => Number 안 넣어도 되나요? 안 넣어도 값은 나오지만 어쩌면 에러가 날 지도 모르기 때문에 정확한 값을 보려면 Number()씌어 주는게 좋다!
// b가 a보다 크거나 같은 경우 1을, 그렇지 않은 경우 0을 출력한다.
// 입력 : 0 -1
// 출력 : 0
// let num = prompt("숫자 2개를 입력하세요.").split(" ");

// if (num[0]<=num[1]) {
//     alert(1)
// }
// else {
//     alert(0)
// }

// 문제 1052
// a와 b가 다른 경우 1을, 그렇지 않은 경우 0을 출력한다.
// 입력 : 0 1
// 출력 : 1

// let num = prompt("숫자 2개를 입력하세요.").split(" ");

// if (num[0]==num[1]) {
//     alert(0)
// }
// else {
//     alert(1)
// }

// 문제 1053
// 입력된 값이 0이면 1, 1이면 0을 출력한다.
// 입력 : 1
// 출력 : 0

// let num = Number(prompt("숫자를 입력하세요."));

// if(num==0) {
//     alert(1)
// }
// else if(num==1) {
//     alert(0)
// }

// 문제 1054
// 둘 다 참(1)일 경우에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
// 입력 : 1 1
// 출력 : 1

// let num = prompt("숫자 2개를 입력하세요.").split(" ");

// if (num[0]==1&&num[1]==1) {
//     alert(1)
// }
// else {
//     alert(0)
// }

// 문제 1055
// 하나라도 참일 경우 1을 출력하고, 그 외의 경우에는 0을 출력한다.
// &&(교집합) : 둘 다 참(true)이어야 참(true)
// ||(합집합) : 둘 중 하나만 참(true)이여도 참(true)
// 입력 : 1 1
// 출력 : 1

// let num = prompt("숫자 2개를 입력하세요.").split(" ");

// if (num[0]==1||num[1]==1) {
//     alert(1)
// }
// else {
//     alert(0)
// }

// 문제 1056 
// 참/거짓이 서로 다를 때에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
// 입력 : 1 1
// 출력 : 0

// let num = prompt("정수 2개를 입력하세요.").split(" ");

// if(num[0]!==num[1]) {
//     alert(1)
// }
// else {
//     alert(0)
// }

// 문제 1057
// 참/거짓이 서로 같을 때에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
// 입력 : 0 0
// 출력 : 1

// let num = prompt("정수 2개를 입력하세요.").split(" ");

// if(num[0]==num[1]) {
//     alert(1)
// }
// else {
//     alert(0)
// }

// 문제 1058
// 둘 다 거짓일 경우에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
// 입력 : 0 1
// 출력 : 0

// let num = prompt("정수 2개를 입력하세요.").split(" ");

// if(num[0]==0&&num[1]==0) {
//     alert(1)
// }
// else {
//     alert(0)
// }

// TODO: 문제 1059 *비트단위
// 비트 단위로 1 -> 0, 0 -> 1로 바꾼 후 그 값을 10진수로 출력한다.
// 비트 NOT 연산(~) => 비트를 1이면 0으로, 0이면 1로 반전시킴
// 입력 : 2
// 출력 : -3

// let num = prompt("정수를 입력하세요.");

// alert(~num)

// 문제 1060
// 두 정수를 비트단위(bitwise)로 and 계산을 수행한 결과를 10진수로 출력한다.
// 비트 AND 연산(&) => 대응되는 비트가 모두 1이면 1을 반환함
// 입력 : 3 5
// 출력 : 1

// let num = prompt("정수 2개를 입력하세요.").split(" ");

// alert(num[0]&num[1])

// 문제 1061
// 두 정수를 비트단위(bitwise)로 or 계산을 수행한 결과를 10진수로 출력한다.
// 비트 OR 연산(|) => 대응되는 비트 중에서 하나라도 1이면 1을 반환함
// 입력 : 3 5
// 출력 : 7

// let num = prompt("정수 2개를 입력하세요.").split(" ");

// alert(num[0]|num[1])

// 문제 1062
// 두 정수를 비트단위(bitwise)로 xor 계산을 수행한 결과를 10진수로 출력한다.
// 비트 XOR 연산(^) => 대응되는 비트가 서로 다르면 1을 반환함
// 입력 : 3 5
// 출력 : 6

// let num = prompt("정수 2개를 입력하세요.").split(" ");

// alert(num[0]^num[1])

// 문제 1063
// 두 정수 중 큰 값을 10진수로 출력한다.
// 입력 : 123 456
// 출력 : 456

// 풀이1

// let num = prompt("정수 2개를 입력하세요.").split(" ").map(Number);
// let max = Math.max(num[0], num[1]);

// alert(max)

// 풀이2 - split은 각각 Number 붙여줘야한다. 아니면 .map(Number)

// let num = prompt("정수 2개를 입력하세요.").split(" ");

// let first = Number(num[0]);
// let second = Number(num[1]);
// let max = Math.max(num[0], num[1]);

// alert(max)

// 문제 1064
// 가장 작은 값을 출력한다.
// 입력 : 3 -1 5
// 출력 : -1

// let num = prompt("정수 3개를 입력하세요.").split(" ");

// let first = Number(num[0]);
// let second = Number(num[1]);
// let third = Number(num[2]);
// let min = Math.min(num[0], num[1], num[2]);

// alert(min)

// 문제 1065
// 짝수만 순서대로 줄을 바꿔 출력한다.
// 입력 : 1 2 4
// 출력 : 2
//        4

// let num = prompt("정수를 입력하세요.").split(" ");
// let result = "";

// for (i = 0; i < num.length; i++) {
//   if (num[i] % 2 == 0) {
//     result = result + num[i] + "\n" ;
//   }
// }

// alert(result);

// 문제 1066
// 입력된 순서대로 짝(even)/홀(odd)을 줄을 바꿔 출력한다.
// 입력 : 1 2 8
// 출력 : odd
//       even
//       even

// let num = prompt("정수를 입력하세요.").split(" ");
// let result = ""

// for (i = 0; i < num.length; i++) {

//     if(num[i]%2==0) {
//         num[i] = "even";
//     }
//     else {
//         num[i] = "odd";
//     }

//     result = result + num[i] + "\n";
// }

// alert(result)

// 문제 1067
// 입력된 정수에 대해
// 첫 줄에 minus 나 plus 를 출력하고,
// 두 번째 줄에 odd 나 even 을 출력한다.
// 입력 : -2147483648
// 출력 : minus
//        even

// let num = Number(prompt("정수를 입력하세요."));
// let result1 =""
// let result2 = ""

// if(num<0) {
//     result1 = "minus"
// }
// else {
//     result1 = "plus"
// }
// if(num%2==0) {
//     result2 = "even"
// }
// else {
//     result2 = "odd"
// }

// alert(result1 + "\n" + result2)

// 문제 1068
// 점수 범위 : 평가
// 90 ~ 100 : A
// 70 ~ 89 : B
// 40 ~ 69 : C
// 0 ~ 39 : D
// 로 평가되어야 한다.
// 입력 : 73
// 출력 : B

// let num = Number(prompt("점수를 입력하세요."));

// if(90<=num&&num<=100) {
//     alert("A")
// }
// else if(70<=num&&num<=89) {
//     alert("B")
// }
// else if(40<=num&&num<=69) {
//     alert("C")
// }
// else if(0<=num&&num<=39) {
//     alert("D")
// }

// 문제 1069
// 평가 : 내용
// A : best!!!
// B : good!!
// C : run!
// D : slowly~
// 나머지 문자들 : what?
// 입력 : A
// 출력 : best!!!

// let char = prompt("점수를 입력하세요.");

// if(char=="A") {
//     alert("best!!!")
// }
// else if(char=="B") {
//     alert("good!!")
// }
// else if(char=="C") {
//     alert("run!")
// }
// else if(char=="D") {
//     alert("slowly~")
// }
// else {
//     alert("what?")
// }

// 문제 1070
// 월 : 계절 이름
// 12, 1, 2 : winter
// 3, 4, 5 : spring
// 6, 7, 8 : summer
// 9, 10, 11 : fall
// 입력 : 12
// 출력 : winter

// let month = prompt("월을 입력하세요.");

// if(month==12||month==1||month==2) {
//     alert("winter")
// }
// else if(month==3||month==4||month==5) {
//     alert("spring")
// }
// else if(month==6||month==7||month==8) {
//     alert("summer")
// }
// else if(month==9||month==10||month==11) {
//     alert("fall")
// }

// 문제 1071
// 입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 종료한다.
// (0은 출력하지 않는다.)
// 입력 : 7 4 2 3 0 1 5 6 9 10 8
// 출력 : 7
//        4
//        2
//        3

// let num = prompt("정수를 입력하세요.").split(" ");
// let result = "";

// for (i = 0; i < num.length; i++) {

//   if (num[i] == 0) {
//     break;
//   }

//   result = result + num[i] + "\n";

// }

// alert(result);

// 문제 1072
// n개의 정수를 한 개씩 줄을 바꿔 출력한다.
// 입력 : 1 2 3 4 5
// 출력 : 1
//        2
//        3
//        4
//        5

// let num = prompt("정수를 입력하세요.").split(" ");
// let result =""

// for(i=0; i<num.length; i++) {
//     result = result + num[i] + "\n";
// }

// alert(result)

// 문제 1073 
// 입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 종료한다.
// (0은 출력하지 않는다.)
// 입력 : 7 4 2 3 0 1 5 6 9 10 8
// 출력 : 7
//        4
//        2
//        3

// let num = prompt("정수를 입력하세요.").split(" ");
// let result = "";

// for (i = 0; i < num.length; i++) {

//   if (num[i] == 0) {
//     break;
//   }

//   result = result + num[i] + "\n";
// }

// alert(result);

// 문제 1074
// 입력 : 5
// 출력 : 5
//        4
//        3
//        2
//        1

// let num1 = Number(prompt("정수를 입력해 주세요."))
// let result =""

// for (let i=num1; i>0; i--) {
//     result = result + i + "\n"
//   }

// alert (result);

// 문제 1075
// 입력 : 5
// 출력 : 4
//        3
//        2
//        1
//        0

// let num1 = Number(prompt("정수를 입력해 주세요."));
// let num2 = num1 - 1;
// let result ="";

// for (let i=num2; i>=0; i--) {
//     result = result + i + "\n"
//   }

// alert (result);

// TODO: 문제 1076 *String => 숫자를 문자열로 변환하는 함수
// 입력 : f
// 출력 : a b c d e f

// let num = prompt("정수를 입력해 주세요.");
// let result = "";
// let firstCode="a".charCodeAt(0);

// for(let i=firstCode; i<=num.charCodeAt(0); i++) {
//     result = result + String.fromCharCode(i)
// }

// alert(result)

// 문제 1077
// 0부터 그 수까지 줄을 바꿔 한 개씩 출력한다.
// 입력 : 4
// 출력 : 0
//        1
//        2
//        3
//        4

// let num1 = Number(prompt("정수를 입력해 주세요."));
// let result ="";

// for (let i=0; i<=num1; i++) {
//     result = result + i + "\n"
//   }

// alert (result);

// 문제 1078
// 1부터 입력된 수까지 짝수의 합을 출력한다.
// 입력 : 5
// 출력 : 6

// let num1 = Number(prompt("정수를 입력해 주세요."))
// let result=0

// for (let i=1; i<=num1; i++) {
//     if (i % 2 == 0) {
//       result = result +i;
//     }
//   }

// alert(result)

// 문제 1079
// 'q'가 입력될 때까지 입력된 문자를 줄을 바꿔 한 줄씩 출력한다.
// 입력 : x b k d l q g a c
// 출력 : x
//        b
//        k
//        d
//        l
//        q

// let char = prompt("문자를 입력해 주세요.").split(" ");

// let result = ""

// for(i=0; i<char.length; i++) {

//     result = result + char[i] + "\n";

//     if(char[i]=="q") {
//         break
//     };
// }

// alert(result)

// 문제 1080 
// "i <num1;" -> 값이 참이면 돌아가니까 true 넣어도 될 듯!
// 1, 2, 3, 4, 5 ... 를 순서대로 계속 더해 합을 만들어가다가,
// 입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력한다.
// 입력 : 55
// 출력 : 10

// let num1 = Number(prompt("정수를 입력해 주세요."));
// let result = 0;

// for (let i = 1; i <num1; i++) {
//   result = result + i;

//   if (result>=num1) {
//     alert(i);
//     break;
//   }
// }

// 문제 1081
// 나올 수 있는 주사위의 숫자를 한 세트씩 줄을 바꿔 모두 출력한다.
// 첫 번째 수는 n, 두 번째 수는 m으로 고정해 출력하도록 한다.
// 입력 : 2 3
// 출력 : 1 1
//        1 2
//        1 3
//        2 1
//        2 2
//        2 3

// let num = prompt("정수를 입력하세요.").split(" ");
// let result = ""

// for(let i=1; i<=num[0]; i++) {
//     for(let j=1; j<=num[1]; j++) {
//         result = result + i + " " + j + "\n"
//     }
// }

// alert(result)

// TODO: 문제 1082 *16진수 구구단
// 입력된 16진수에 1~F까지 순서대로 곱한, 16진수 구구단을 줄을 바꿔 출력한다.
// 계산 결과도 16진수로 출력해야 한다.
// 입력 : B
// 출력 : B*1=B
//        B*2=16
//        B*3=21
//        B*4=2C
//        B*5=37
//        B*6=42
//        B*7=4D
//        B*8=58
//        B*9=63
//        B*A=6E
//        B*B=79
//        B*C=84
//        B*D=8F
//        B*E=9A
//        B*F=A5

// let hex = prompt("정수를 입력하세요.");
// let result = "";

// let first = parseInt(hex, 16).toString(10)

// for(let i=first; i<=first; i++) {
//     for(let j=1; j<=15; j++) {
//         result = result + hex + "*" + (j).toString(16) + "=" + (i*j).toString(16) + "\n"
//     }
// }

// alert(result.toUpperCase())

// 문제 1083
// 1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데,
// 3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X 를 출력한다.
// 입력 : 9
// 출력 : 1 2 X 4 5 X 7 8 X

// let num = prompt("정수를 입력하세요.");
// let result = ""

// for(let i=1; i<=num; i++) {
//     if(i%3==0) {
//         result = result + " " + "X";
//         continue
//     }
//     result = result + " " + i;
// }

// alert(result)

// 문제 1084
// 만들 수 있는 rgb 색의 정보를 오름차순으로
// 줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력한다.
// 입력 : 2 2 2
// 출력 : 0 0 0
//        0 0 1
//        0 1 0
//        0 1 1
//        1 0 0
//        1 0 1
//        1 1 0
//        1 1 1
//        8

// let num = prompt("색을 입력하세요.").split(" ");
// let result = ""

// for(let i=0; i<num[0]; i++) {
//     for(j=0; j<num[1]; j++) {
//         for(k=0; k<num[2]; k++) {
//             result = result + i + " " + j + " " + k + "\n"
//         }
//     }
// }

// alert(result + "\n" + num[0]*num[1]*num[2])

// TODO: 문제 1085 *toFixed() -> 소수점 반올림 함수
// 필요한 저장 공간을 MB 단위로 바꾸어 출력한다. (음악)
// 단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.
// 입력 : 44100 16 2 10
// 출력 : 1.7 MB

// let num = prompt("입력하세요.").split(" ");
// let bit = num[0]*num[1]*num[2]*num[3]
// let res = bit/(1024*1024*8)

// alert(res.toFixed(1))

// 문제 1086
// 필요한 저장 공간을 MB 단위로 바꾸어 출력한다. (색상)
// 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력한 뒤 MB를 출력한다.
// 입력 : 1024 768 24
// 출력 : 2.25 MB

// let num = prompt("입력하세요.").split(" ");
// let bit = num[0]*num[1]*num[2]
// let res = bit/(1024*1024*8)

// alert(res.toFixed(2))

// 문제 1087
// 1, 2, 3, 4, 5 ... 순서대로 계속 더해가다가, 그 합이 입력된 정수보다 커지거나 같아지는 경우,
// 그때까지의 합을 출력한다.
// 입력 : 57
// 출력 :66

// let num = Number(prompt("정수를 입력하세요."));
// let result = 0;

// for(let i=1; i<num; i++) {
//     result = result + i;

//     if(result>=num) {
//         alert(result)
//         break
//     }
// }

// 문제 1088
// 1부터 입력한 정수보다 작거나 같을 때까지 1씩 증가시켜 출력하되
// 3의 배수는 출력하지 않는다.
// 입력 : 10
// 출력 : 1 2 4 5 7 8 10

// let num = prompt("정수를 입력하세요.");
// let result = ""

// for(let i=1; i<=num; i++) {
//     if(i%3==0) {
//         continue
//     }
//     result = result + " " + i;
// }

// alert(result)

// 문제 1089
// n번째 수를 출력한다. (시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n))
// 입력 : 1 3 5
// 출력 : 13

// let num = prompt("정수를 입력하세요.").split(" ");
// let result = 0;
// let first = Number(num[0]);
// let second = Number(num[1]);
// let third = Number(num[2]);

// for(let i=first; i<=third; i++) {
//     result = first+second*(third-1);
// }

// alert(result)

// 문제 1090
// n번째 수를 출력한다. (시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n))
// 입력 : 2 3 7
// 출력 : 1458

// let num = prompt("정수를 입력하세요.").split(" ");
// let result = 1;
// let first = Number(num[0]);
// let second = Number(num[1]);
// let third = Number(num[2]);

// for(let i=1; i<=third-1; i++) {
//     result = result*second;
// }
// let result2 = first*result

// alert(result2)

// 문제 1091
// n번째 수를 출력한다. (시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 인지를 나타내는 정수(n))
// 입력 : 1 -2 1 8
// 출력 : -85

// let num = prompt("정수를 입력하세요.").split(" ");
// let result = 1;
// let first = Number(num[0]);
// let second = Number(num[1]);
// let third = Number(num[2]);
// let fourth = Number(num[3]);

// for(let i=1; i<=fourth-1; i++) {
//     result = result*second+third;
// }
// let result2 = first*result

// alert(result2)

// 문제 1092 
// 3명이 다시 모두 함께 방문해 문제를 풀어보는 날(동시 가입/등업 후 며칠 후?)을 출력한다.
// 입력 : 3 7 9
// 출력 : 63

// let num = prompt("정수를 입력하세요.").split(" ");
// let result = 0

// for(let i=1; true; i++)
//  {
//     if(i%num[0]==0&&i%num[1]==0&&i%num[2]==0) {
//         result = i
//         alert(result)
//         break
//     }
//  }

// TODO 문제 1093 
// 1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력한다.
// 입력 : 10
//        1 3 2 2 5 6 7 4 5 9
// 출력 : 1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0

// let all = Number(prompt("부른 횟수를 입력하세요."));
// let num = prompt("불린 번호를 입력하세요.").split(" "); // 총 all개

// // 배열의 생성, 0 초기화
// let result = new Array(24);

// for(let i=0; i<result.length; i++) {
//     result[i] = 0;
// }

// for (let i = 0; i<all; i++) {
//     result[num[i]-1] += + 1
// }

// alert(result.toString())

// TODO: 문제 1094 *.reverse() 함수
// 출석을 부른 번호 순서를 바꾸어 공백을 두고 출력한다.
// 입력 : 10
//        10 4 2 3 6 6 7 9 8 5
// 출력 : 5 8 9 7 6 6 3 2 4 10

// *풀이 1 - reverse() 함수 사용

// let all = Number(prompt("부른 횟수를 입력하세요."));
// let num = prompt("불린 번호를 입력하세요.").split(" ").reverse(); // 총 all개

// alert(num)

// *풀이 2

// let all = Number(prompt("부른 횟수를 입력하세요."));
// let num = prompt("불린 번호를 입력하세요.").split(" "); 

// let result = ""

// for(i=all-1; i>=0; i--) {

//     result = result + num[i] + "\n";

// }

// alert(result)

// TODO 문제 1095
// 출석을 부른 번호 중에 가장 빠른 번호를 1개만 출력한다.
// 입력 : 10
//        10 4 2 3 6 6 7 9 8 5
// 출력 : 2

// let all = Number(prompt("부른 횟수를 입력하세요."));
// let num = prompt("불린 번호를 입력하세요.").split(" "); // 총 all개

// alert(Math.min(...num))
