// 문제 1251
// 1부터 100까지 공백으로 띄워 하나씩 출력한다.

// let result = "";

// for(i=1; i<=100; i++) {
//     result = result + " " + i;
// }

// alert(result)

// 문제 1252
// 입력 : 5
// 출력 : 1 2 3 4 5

// let num = Number(prompt("정수를 입력하세요."))
// let result = ""

// for(i=1; i<=num; i++) {
//     result = result + " " + i;
// }

// alert(result)

// 문제 1253
// a와 b 사이의 정수들을 오름차순으로 출력한다.
// 입력 : 3 8
// 출력 : 3 4 5 6 7 8

// let num = prompt("수를 입력하세요.").split(" ").map(Number);
// let result = ""

// for(i=num[0]; i<=num[1]; i++) {
//     result = result + " " + i;
// }

// alert(result)

// TODO: 문제 1254 *아스키코드 변환
// 두 알파벳 사이의 모든 알파벳을 출력한다.
// 입력 : d g
// 출력 : d e f g

// let num = prompt("알파벳을 입력하세요.").split(" ");
// let first = num[0].charCodeAt(0);
// let second = num[1].charCodeAt(0);
// let result = "";

// for(i=first; i<=second; i++) {
//     result = result + " " + String.fromCharCode(i);
// }

// alert(result)

// 문제 1255
// a와 b사이의 수를 0.01간격으로 오름차순으로 출력하시오.
// 입력 : 2.00 2.03
// 출력 : 2.00 2.01 2.02 2.03

// let num = prompt("수를 입력하세요.").split(" ").map(Number);
// let result="";

// for(i=num[0]*100; i<=num[1]*100+1; i++) {
//     result = result + " " + (i/100).toFixed(2);
// }

// alert(result)

// 문제 1256
// 입력 : 5
// 출력 : *****

// let num = Number(prompt("정수를 입력하세요."))
// let result = ""

// for(i=0; i<num; i++) {
//     result = result + "*"
// }
// alert(result)

// 문제 1257
// a~b의 홀수를 모두 출력한다.
// 입력 : 2 7
// 출력 : 3 5 7

// let num = prompt("수를 입력하세요.").split(" ").map(Number);
// let result = "";

// for(let i=num[0]; i<=num[1]; i++) {
//     if(i%2!=0) {
//         result = result + " " + i
//     }
// }

// alert(result)

// 문제 1258
// 1부터 n까지의 합을 출력한다.
// 입력 : 100
// 출력 : 5050

// let num = Number(prompt("정수를 입력하세요."))
// let result = 0;

// for(let i=1; i<=num; i++) {
//     result = result + i;
// }

// alert(result)

// 문제 1259
// 1부터 n까지의 짝수의 합을 출력하시오.
// 입력 : 5
// 출력 : 6

// let num = Number(prompt("정수를 입력하세요."))
// let result = 0;

// for(let i=1; i<=num; i++) {
//     if(i%2==0) {
//         result = result + i;
//     }
// }

// alert(result)

// 문제 1260
// a~b까지의 수 중 3의 배수의 합을 출력한다.
// 입력 : 3 7
// 출력 : 9

// let num = prompt("수를 입력하세요.").split(" ").map(Number);
// let result = 0;

// for(let i=num[0]; i<=num[1]; i++) {
//     if(i%3==0) {
//         result = result + i;
//     }
// }

// alert(result)

// 문제 1261
// 10개의 수 중 5의 배수가 있으면 그 중 하나만 출력하고, 없다면 0을 출력한다.
// 입력 : 1 2 3 4 5 6 7 8 9 10
// 출력 : 5

// let num = prompt("수를 입력하세요.").split(" ").map(Number);
// let result = 0;

// for(let i=0; i<=num.length; i++) {
//     if(num[i]%5==0) {
//         result = num[i]
//         break
//     } else {
//       result
//     }
// }

// alert(result)

// 문제 1265
// 입력 : 3
// 출력 : 3*1=3
//        3*2=6
//        3*3=9
//        3*4=12
//        3*5=15
//        3*6=18
//        3*7=21
//        3*8=24
//        3*9=27

// let num = Number(prompt("정수를 입력하세요."))
// let result =0;

// for(let i=num; i<=num; i++) {
//     for(let j=1; j<=9; j++) {
//         result = result + i + "*" + j + "=" + i*j + "\n";
//     }
// }

// alert(result)

// 문제 1266
// n개의 정수들의 합을 출력한다.
// 입력 : 5
//        3 5 7 7 2
// 출력 : 24

// let num1 = Number(prompt("개수를 입력하세요."))
// let num2 = prompt("정수를 입력하세요.").split(" ").map(Number);
// let result = 0;

// for(i=0; i<num1; i++) {
//     result = result + num2[i];
// }

// alert(result)

// 문제 1267
// n개의 자연수들 중 5의 배수의 합을 출력한다.
// 입력 : 5
//        3 5 7 15 2
// 출력 : 20

// let num1 = Number(prompt("개수를 입력하세요."))
// let num2 = prompt("정수를 입력하세요.").split(" ").map(Number);
// let result = 0;

// for(i=0; i<num1; i++) {

//     if(num2[i]%5==0) {
//         result = result + num2[i];
//     }

// }

// alert(result)

// 문제 1268
// n개의 자연수들 중 짝수의 개수를 출력한다.
// 입력 : 5
//        3 5 7 15 2
// 출력 : 1

// let num1 = Number(prompt("개수를 입력하세요."))
// let num2 = prompt("정수를 입력하세요.").split(" ").map(Number);
// let count = 0;

// for(i=0; i<num1; i++) {

//     if(num2[i]%2==0) {
//         count++
//     }

// }

// alert(count)

// 문제 1269
// 시작 값(a), 곱할 값(b), 더할 값(c), 몇 번째 항인지 나타내는 정수(n)
// 입력 : 2 -1 3 5
// 출력 : 2

// let num = prompt("정수를 입력하세요.").split(" ").map(Number);
// let result = 1;

// for(let i=1; i<=num[3]-1; i++) {
//     result = result*num[1]+num[2];
// }
// let result2 = num[0]*result

// alert(result2)

// TODO: 문제 1270 *count++
// 맨 마지막 자리에 1이 몇 번 들어 있는지 출력한다.
// 입력 : 35
// 출력 : 4

// let num = Number(prompt("개수를 입력하세요."))
// let count = 0

// for(let i=1; i<=num; i++) {

//     if(i%10==1) {
//         count++
//     }
// }

// alert(count)

// TODO: 문제 1271 *(...arr)
// N개의 정수 중 최댓값을 찾아 출력한다.
// 입력 : 5
//        3 1 29 31 21
// 출력 : 31

// let num1 = Number(prompt("개수를 입력하세요."))
// let num2 = prompt("정수를 입력하세요.").split(" ").map(Number);

// alert(Math.max(...num2))

// 문제 1272
// 존과 밥이 받는 금액의 합을 출력한다. (1, 10, 2, 20, 3, 30, ...)
// 입력 : 1 2
// 출력 : 11

// let num = prompt("정수를 입력하세요.").split(" ").map(Number);
// let result1 = 0;
// let result2 = 0;

// if (num[0] % 2 == 1) {
//   result1 = (num[0] + 1) / 2;
// } else {
//   result1 = (num[0] / 2) * 10;
// }
// if (num[1] % 2 == 1) {
//   result2 = (num[1] + 1) / 2;
// } else {
//   result2 = (num[1] / 2) * 10;
// }

// alert(result1 + result2);

// 문제 1273
// N의 약수를 오름차순으로 출력한다. => 약수: 나누었을때의 나머지가 0이 되는 수 (최대 자기자신의 값)
// 입력 : 6
// 출력 : 1 2 3 6

// let num = Number(prompt("숫자를 입력하세요."))
// let result = ""

// for(let i=1; i<=num; i++) {
//   if(num%i==0) {
//     result = result + i + " ";
//   }
// }

// alert(result)

// TODO: 문제 1274 *소수구하기
// 입력으로 주어진 수가 소수이면 "prime"을 출력, 소수가 아니면 "not prime"을 출력한다.
// 입력 : 7
// 출력 : prime

// let num = Number(prompt("숫자를 입력하세요."));

// if (num == 2) {
//   alert("prime");
// }
// else if(num <= 1) {
//     alert("not prime")
// }
// for (let i = 2; i < num; i++) {
//   if (num % i === 0) {
//     //이 부분에서 num이  다른 수로 나눠떨어진다면 소수가 아님
//     alert("not prime");
//     break
//   } else {
//     alert("prime")
//     break
//   }
// }

// 문제 1275
// nk(승)의 결과를 출력한다.
// 입력 : 3 3
// 출력 : 27

// let num = prompt("숫자를 입력하세요.").split(" ").map(Number);
// let result = 1;

// for(let i=0; i<num[1]; i++) {
//     result = result*num[0]
// }

// alert(result)

// 문제 1276
// n!의 값을 출력한다. (팩토리얼)
// 입력 : 5
// 출력 : 120

// let num = Number(prompt("숫자를 입력하세요."));
// let result = 1;

// for (i=5; i>0; i--) {
//     result = result*i;
// }

// alert(result)

// 문제 1277
// 첫번째, 중간, 마지막 데이터 값을 출력한다.
// 입력 : 7
//        2 4 7 3 1 2 5
// 출력 : 2 3 5

// let num1 = Number(prompt("개수를 입력하세요."));
// let num2 = prompt("정수를 입력하세요.").split(" ");
// let first = "";
// let second = "";
// let third = "";
// let result =""

// for(let i=0; i<num1; i++) {
//     if(i==0) {
//         first = num2[i];
//     }
//     if(i==(num1-1)/2) {
//         second = num2[i];
//     }
//     if(i==num1-1) {
//         third = num2[i];
//     }
//     result = first + " " + second + " " + third
// }

// alert(result)

// 풀이 2)

// let num1 = Number(prompt("개수를 입력하세요."));
// let num2 = prompt("정수를 입력하세요.").split(" ");

// let first = num2[0];
// let second = num2[(num1-1)/2];
// let third = num2[num1-1];
// let result =""

// result = first + " " + second + " " + third

// alert(result)

// TODO: 문제 1278 *.length - 문자열 길이
// 그 숫자가 몇 자릿수 인지 출력하시오.
// 입력 : 932
// 출력 : 3

// let num = prompt("숫자를 입력하세요.");

// alert(num.length)

// 문제 1279
// a, b 사이의 수 중 홀수는 더하고 짝수는 뺀 결과를 출력하시오.
// 입력 : 5 10
// 출력 : -3

// let num = prompt("숫자를 입력하세요.").split(" ").map(Number);
// let result1 = 0;
// let result2 = 0;

// for(i=num[0]; i<=num[1]; i++) {
//     if(i%2==1) {
//         result1 = result1 + i;
//     }
//     if(i%2==0) {
//         result2 = result2 + i;
//     }
// }

// alert(result1-result2)

// TODO: 문제 1280 *다시 풀어보기
// 홀수는 더하고 짝수는 빼는 식을 보여준 후 결과를 출력하시오.
// 입력 : 5 7
// 출력 : +5-6+7=6

// let num = prompt("숫자를 입력하세요.").split(" ").map(Number);
// let result1 = "";
// let result2 = 0;

// for(let i=num[0]; i<=num[1]; i++) {
//     if(i%2==1) {
//         result1 = result1 + "+" + i;
//         result2 = result2 + i;
//     }
//     else if(i%2==0) {
//         result1 = result1 + "-" +i;
//         result2 = result2 - i;
//     };
// }

// alert(result1+"="+result2)

// 문제 1281
// 홀수는 더하고 짝수는 뺀 식을 보여준후 결과를 출력한다.
// 입력 : 5 7
// 출력 : 5-6+7=6

// let num = prompt("숫자를 입력하세요.").split(" ").map(Number);
// let result1 = "";
// let result2 = 0;

// for(let i=num[0]; i<=num[1]; i++) {
//     if(i%2==1) {
//         if(i==num[0]) {
//             result1 = result1 + i;
//         } else {
//             result1 = result1 + "+" + i;
//         }
//         result2 = result2 + i;
//     }
//     if(i%2==0) {
//         if(i==num[0]) {
//             result1 = result1 + i;
//         } else {
//             result1 = result1 + "-" +i;
//         }
//         result2 = result2 - i;
//     };
// }

// alert(result1+"="+result2)

// -------------------------------------------------------------------------------------- 위까지는 공동부분

// 문제 1282
//
// 입력 :
// 출력 :

// 문제 1283
//
// 입력 :
// 출력 :

// 문제 1284
//
// 입력 :
// 출력 :

// 문제 1285
//
// 입력 :
// 출력 :

// 문제 1286
//
// 입력 :
// 출력 :

// 문제 1287
//
// 입력 :
// 출력 :

// 문제 1294
//
// 입력 :
// 출력 :

// 문제 1295
//
// 입력 :
// 출력 :

// 문제 1675
//
// 입력 :
// 출력 :
