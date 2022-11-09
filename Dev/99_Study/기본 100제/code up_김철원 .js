// 코드업 문제
// 번호 1001 
// 문제 : 다음 단어를 출력하시오 Hello
// 입력 : 
// 출력 : Hello

// alert("Hello");

// 번호 1002
// 문제 : Hello World 이번에는 공백()을 포함한 문장을 출력한다.
// 입력 : 
// 출력 : Hello World

// alert("Hello World");

// 번호 1003
// 문제 : 줄을 바꿔 출력해야 한다.
// 입력 : 
// 출력 : Hello
//      : World

// alert("Hello"+ "\n" +"World");

// 번호 1004
// 문제 : 작은 따옴표(single quotation mark)가 들어있는 특수한 형태의 출력문
// 입력 : 
// 출력 : 'Hello'

// alert("'Hello'");

// 번호 1005
// 문제 : 큰따옴표(double quotation mark)가 포함된 다음 문장을 출력하시오.
// 입력 : 
// 출력 : "Hello World"

// alert('"Hello World"');

// 번호 1006
// 문제 :  특수문자 출력하기
// 입력 : 
// 출력 : "!@#$%^&*()" (단, 큰따옴표도 함께 출력한다.)

// alert('"!@#$%^&*()"');

// 번호 1007
// 문제 : 다음 경로를 출력하시오
// 입력 :
// 출력 : "C:\Download\hello.cpp" (단, 큰따옴표도 함께 출력한다.)

// alert('"C:\\Download\\hello.cpp"');

// 번호 1008
// 문제 : 유니코드 출력하기
// 입력 :
// 출력 :┌┬┐
//       ├┼┤
//       └┴┘

// alert("\u250C"+"\u252C"+"\u2510"+"\n"+"\u251C"+"\u253C"+"\u2524"+"\n"+"\u2514"+"\u2534"+"\u2518");



// 번호 1010
// 문제 : 정수 1개가 입력된다 입력된 정수를 그대로 출력한다. 
// 입력 : 15
// 출력 : 15

// (자바스크립트에서는 정수와 실수를 따로 구분하지 않고, 모든 수를 실수 하나로만 표현합니다.)
// let inp = Number(prompt("정수 1개가 입력된다."));
// alert(inp);

// 번호 1011
// 문제 : 문자 1개가 입력된다. 입력된 문자를 그대로 출력한다.
// 입력 : p
// 출력 : p

// let inp = prompt("문자 1개가 입력된다.");
// alert(inp);

// 번호 1012
// 문제 : 실수값 1개가 입력된다. 입력된 실수값을 그대로 출력한다. 
// 입력 : 1.414213
// 출력 : 1.414213

// (자바스크립트에서는 정수와 실수를 따로 구분하지 않고, 모든 수를 실수 하나로만 표현합니다.)
// let inp = Number(prompt("실수 1개가 입력된다."));
// alert(inp);

// 번호 1013
// 문제 : 정수 2개를 입력받아 그대로 출력해보자.
// 입력 : 1 2 (2개의 정수가 공백으로 구분되어 입력된다.)
// 출력 : 1 2 

// let inp = prompt("실수 2개가 입력된다.").split(" ");
// alert(inp[0]+" "+inp[1]);

// 번호 1014
// 문제 : 2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
// 입력 : A b
// 출력 : b A

// let inp = prompt("두 문자가 입력된다.").split(" ");
// alert(inp[1]+" "+inp[0]);

// 번호 1015
// 문제 : 실수(float) 1개를 입력받아 저장한 후,저장되어 있는 값을 소수점 셋 째 자리에서 반올림하여 소수점 이하 둘 째 자리까지 출력하시오.
// 입력 : 1.59254
// 출력 : 1.59

// let inp = Number(prompt("실수가 입력된다."));
// let flo = inp.toFixed(2);
// alert(flo);

// 번호 1017
// 문제 : 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.
// 입력 : 125
// 출력 : 125 125 125

// let inp = Number(prompt("정수가 입력된다."));
// alert(inp+" "+inp+" "+inp);

// 번호 1018
// 문제 : 시간 입력받아 그대로 출력하기
// 입력 : 3:16
// 출력 : 3:16

// let inp = prompt("시간이 입력된다.");
// alert(inp);

// 번호 1019 
// 문제 : 연월일 입력받아 그대로 출력하기
// 입력 : 2013.8.5
// 출력 : 2013.08.05

// let inp = prompt("날짜가 입력된다.").split(".");
// if(inp[1]<10){
//     if(inp[2]<10){
//         alert(inp[0]+"."+"0"+inp[1]+"."+"0"+inp[2]);
//     }else{
//         alert(inp[0]+"."+"0"+inp[1]+"."+inp[2]);
//     }    
// }else if(inp[2]<10){
//     alert(inp[0]+"."+inp[1]+"."+"0"+inp[2]);
// }else{
//     alert(inp[0]+"."+inp[1]+"."+inp[2]);
// }

// 번호 1020
// 문제 : 주민번호 입력받아 형태 바꿔 출력하기
// 입력 : 000907-1121112
// 출력 : 0009071121112

// let inp = prompt("주민번호가 입력된다.").split("-");
// alert(inp[0]+inp[1]);

// 번호 1021
// 문제 : 단어 1개 입력받아 그대로 출력하기
// 입력 : Informatics
// 출력 : Informatics

// let inp = prompt("단어 1개가 입력된다.").split("");
// let result = "";
// for(let i=0;i<inp.length;i++){
//     result +=inp[i];
// }alert(result);

// 번호 1022
// 문제 : 문장 1개 입력받아 그대로 출력하기, 공백이 포함되어 있는 한 문장이 입력된다.
// 입력 : Programming is very fun!!
// 출력 : Programming is very fun!!

// let inp = prompt("단어 1개가 입력된다.");
// alert(inp)

// 번호 1023
// 문제 : 실수 1개 입력받아 부분별로 출력하기
// 입력 : 1.414213
// 출력 : 1
//      : 414213
// let inp = prompt("실수가 입력된다.").split(".");
// alert(inp[0]+"\n"+inp[1]);

// 번호 1024
// 문제 : 단어 1개 입력받아 나누어 출력하기
// 입력 : Boy
// 출력 : 'B'
//      : 'o'
//      : 'y'
// let inp = prompt("단어 1개가 입력된다.");
// let inp2 = "'"+inp[0]+"'"+"\n";
// let inp3 = "'"+inp[1]+"'"+"\n";
// let inp4 = "'"+inp[2]+"'";
// alert(inp2+inp3+inp4);

// 번호 1025
// 문제 : 정수 1개 입력받아 나누어 출력하기
// 입력 : 75254
// 출력 : [70000]
// 출력 : [5000]
// 출력 : [200]
// 출력 : [50]
// 출력 : [4]

// let inp =prompt("정수 1개가 입력된다.");
// let 만 = "["+inp[0]+"0000"+"]"+"\n";
// let 천 = "["+inp[1]+"000"+"]"+"\n";
// let 백 = "["+inp[2]+"00"+"]"+"\n";
// let 십 = "["+inp[3]+"0"+"]"+"\n";
// let 일 = "["+inp[4]+"]";

// alert(만+천+백+십+일);

// 번호 1026
// 문제 : 시분초 입력받아 분만 출력하기
// 입력 : 17:23:57
// 출력 : 23

// let inp =prompt("시간이 입력된다.").split(":");
// alert(inp[1]);

// 번호 1027
// 문제 : 년월일 입력 받아 형식 바꿔 출력하기
// 입력 : 2014.07.15
// 출력 : 15-07-2014

// let inp =prompt("날짜가 입력된다.").split(".");
// alert(inp[2]+"-"+inp[1]+"-"+inp[0])

// 번호 1028
// 문제 : 정수 1개 입력받아 그대로 출력하기2 
// 입력 : 2147483648
// 출력 : 2147483648

// (자바스크립트는 정수형 소수형 구분없이 Number라는 자료형 밖에 없다. 범위? 9007199254740991 ~ -9007199254740991)
// let inp =Number(prompt("정수가 입력된다."));
// alert(inp);

// 번호 1029
// 문제 : 실수 1개 입력받아 그대로 출력하기2 
// 입력 : 3.14159265359
// 출력 : 3.14159265359

// (자바스크립트는 정수형 소수형 구분없이 Number라는 자료형 밖에 없다. 범위? 9007199254740991 ~ -9007199254740991)
// let inp =Number(prompt("실수가 입력된다."));
// alert(inp);

// 번호 1030
// 문제 : 정수 1개 입력받아 그대로 출력하기3 
// 입력 : -2147483649
// 출력 : -2147483649

// (자바스크립트는 정수형 소수형 구분없이 Number라는 자료형 밖에 없다. 범위? 9007199254740991 ~ -9007199254740991)
// let inp =Number(prompt("정수가 입력된다."));
// alert(inp);

// 번호 1031
// 문제 :10진 정수 1개 입력받아 8진수로 출력하기
// 입력 : 10
// 출력 : 12

// let inp =Number(prompt("정수 입력하시오"));
// let inp2 = (inp).toString(8);
// alert(inp2);

// 번호 1032
// 문제 : 10진 정수 입력받아 16진수로 출력하기1
// 입력 : 255
// 출력 : ff

// let inp =Number(prompt("정수 입력하시오"));
// let inp2 = inp.toString(16);
// alert(inp2);

// 번호 1033
// 문제 : 10진 정수 입력받아 16진수로 출력하기2
// 입력 : 255
// 출력 : FF (대문자)

// let inp =Number(prompt("정수 입력하시오"));
// let inp2 = inp.toString(16).toUpperCase();
// alert(inp2);

// 번호 1034
// 문제 : 8진수 정수 1개 입력받아 10진수로 출력하기
// 입력 : 13
// 출력 : 11
// 입력을 받을때 부터 8진수로 받는 방법을 모르겠음

// let octal =Number(prompt("정수 입력하시오"));
// let decimal = parseInt(octal, 8);
// alert(decimal);

// 번호 1035
// 문제 : 16진수 정수1개 입력받아 8진수로 출력하기
// 입력 : f
// 출력 : 17

// let inp =prompt("입력하시오");
// let hex = (inp).toString(16);
// let inp2 = parseInt(hex, 16).toString(8);
// alert(inp2);


// 1036
// 문제 :영문자 1개 입력받아 10진수로 출력하기
// 입력 : A
// 출력 : 65

// let inp = prompt();
// alert(inp.charCodeAt([0]));

// 1037
// 문제 : 정수 입력받아 아스키 문자로 출력하기
// 입력 : 10진 정수 1개(0 ~ 255 범위)가 입력된다.
// 출력 :아스키코드 값을 문자로 출력한다.
// 입력 예시 : 65
// 출력 예시 : A

// let inp = prompt();
// alert(String.fromCharCode(inp));

// 1038
// 문제 : 정수 2개 입력받아 합 출력하기1
// 입력 : 2개의 정수가 공백으로 구분되어 입력된다.
// 출력 : 두 정수의 합을 출력한다.
// 입력 예시 : 123 -123
// 출력 예시 : 0

// let inp = prompt("정수 2개를 입력받기").split(" ");
// let inp2 = -inp[1]
// alert(inp[0]-inp2); 

// 1039
// 문제 : 정수 2개 입력받아 합 출력하기2
// 입력 : 2개의 정수가 공백으로 구분되어 입력된다.
// 출력 : 두 정수의 합을 출력한다.
// 입력 예시 : 2147483648 2147483648
// 출력 예시 : 4294967296

// let inp = prompt("정수 2개를 입력받기").split(" ");
// let inp2 = -inp[1]
// alert(inp[0]-inp2); 

// 1040
// 문제 : 정수 1개 입력받아 부호 바꿔 출력하기
// 입력 : 정수 1개가 입력된다.
// 출력 : 부호를 바꿔 출력한다.
// 입력 예시 : -1
// 출력 예시 : 1

// let inp = Number(prompt("정수 1개를 입력받기"));
// alert(-inp);

// 1041
// 문제 : 문자 1개 입력받아 다음 문자 출력하기
// 입력 : 영문자 1개가 입력된다
// 출력 : 다음 문자를 출력한다.
// 입력 예시 : a
// 출력 예시 : b

// let inp = prompt("문자 1개를 입력받기"); 
// let inp2 = inp.charCodeAt(0); //문자를 10진수로 변환
// let inp3 = (inp2+1);	// 10진수 +1
// let inp4 = String.fromCharCode(inp3); // 10진수+1을 문자로 변환
// alert(inp4); //문자 출력

// 1042 
// 문제 : 정수 2개 입력받아 나눈 몫 출력하기
// 입력 : 정수 2개(a, b)가 공백을 두고 입력된다.
// 출력 : a를 b로 나눈 몫을 출력한다.
// 입력 예시 : 1 3
// 출력 예시 : 0

// let inp = prompt("정수 2개를 입력받기").split(" ");
// let inp2 = (inp[0]/inp[1]).toFixed(0);  // .toFixed(0) : 소수점 자르기
// alert(inp2);

// 1043
// 문제 : 정수 2개 입력받아 나눈 나머지 출력하기
// 입력 : 정수 2개(a, b)가 공백을 두고 입력된다.
// 출력 : a 를 b로 나눈 나머지를 출력한다.
// 입력 예시 : 10 3
// 출력 예시 : 1

// let inp = prompt("정수 2개를 입력받기").split(" ");
// let inp2 = inp[0]%inp[1]
// alert(inp2);

// 1044
// 문제 : 정수 1개 입력받아 1 더해 출력하기
// 입력 : 정수 1개가 입력된다.
// 출력 : 입력된 정수에 1을 더해 출력한다.
// 입력 예시 : 2147483647
// 출력 예시 : 2147483648

// let inp = Number(prompt("정수 1개를 입력받기"));
// let sum = (inp+1);
// alert(sum);

// 1045
// 문제 : 정수 2개 입력받아 자동 계산하기
// 입력 : 정수 2개가 공백을 두고 입력된다.
// 출력 : 첫 줄에 합
// 둘째 줄에 차,
// 셋째 줄에 곱,
// 넷째 줄에 몫,
// 다섯째 줄에 나머지,
// 여섯째 줄에 나눈 값을 순서대로 출력한다.
// (실수, 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력)
// 입력 예시 : 10 3
// 출력 예시 : 13
//                7
//                30
//                3
//                1
//                3.33

// let inp = prompt("정수 2개를 입력받기").split(" ");
// let inp2 = -inp[1];
// let inp3 = (inp[0]-inp[1])+"\n";
// let inp4 = (inp[0]*inp[1])+"\n";
// let inp5 = (inp[0]/inp[1]).toFixed(0)+"\n";
// let inp6 = (inp[0]%inp[1])+"\n";
// let inp7 = (inp[0]/inp[1]).toFixed(2)+"\n";
// alert((inp[0]-inp2)+"\n"+inp3+inp4+inp5+inp6+inp7);

// 1046
// 문제 : 정수 3개 입력받아 합과 평균 출력하기
// 입력 : 정수 3개가 공백을 두고 입력된다.
// 출력 : 합과 평균을 줄을 바꿔 출력한다
// 입력 예시 :1 2 3
// 출력 예시 6
//            2.0

// let array = prompt().split(" ");
// let array0 = Number(array[0]);
// let array1 = Number(array[1]);
// let array2 = Number(array[2]);

// let sum = (array0+array1+array2)/3;
// let sum2 = sum.toFixed(1)
// alert(array0+array1+array2 +"\n"+ (sum2));



// 1047
// 문제 : 정수 1개 입력받아 2배 곱해 출력하기
// 입력 : 1024
// 출력 : 2048

// let inp = Number(prompt("정수 1개를 입력받기"));
// alert(inp*2);

// 1048
// 문제 :한 번에 2의 거듭제곱 배로 출력하기
// 입력 :1 3
// 출력 : 8

// let inp = prompt("정수 2개를 입력받기").split(" ");
// let inp2 = 2**inp[1]
// let inp3 = inp[0]
// alert(inp3*inp2);

// 1049
// 문제 :두 정수 입력받아 비교하기1
// 입력 : 9 1
// 출력 : 1
// let inp = prompt("정수 2개를 입력받기").split(" ");
// if (inp[0]>inp[1]){
//     alert(1);
// }else{
//     alert(0);
// }

// 1050
// 문제 :  두 정수 입력받아 비교하기2
// 입력 : 두 정수 a, b가 공백을 두고 입력된다.
// 출력 : a와 b의 값이 같은 경우 1을, 그렇지 않은 경우 0을 출력한다.
// 입력 예시 : 0 0
// 출력 예시 : 1

// let inp = prompt().split(" ");
// let inp0 = Number(inp[0]);
// let inp1 = Number(inp[1]);
// if(inp0 == inp1){
//     alert(1)
// }

// 1051
// 문제 : 두 정수 입력받아 비교하기3
// 입력 : 두 정수 a, b가 공백을 두고 입력된다.
// 출력 : b가 a보다 크거나 같은 경우 1을, 그렇지 않은 경우 0을 출력한다.
// 입력 예시 : 0 -1
// 출력 예시 : 0

// let inp = prompt().split(" ");
// let inp0 = Number(inp[0]);
// let inp1 = Number(inp[1]);
// if(inp0 <= inp1){
//     alert(1);
// }else{
//     alert(0);
// }

// 1052
// 문제 : 두 정수 입력받아 비교하기4
// 입력 : 두 정수 a, b가 공백을 두고 입력된다.
// 출력 : a와 b가 다른 경우 1을, 그렇지 않은 경우 0을 출력한다.
// 입력 예시 : 0 1
// 출력 예시 : 1

// let inp = prompt().split(" ");
// let inp0 = Number(inp[0]);
// let inp1 = Number(inp[1]);
// if(inp0 != inp1){
//     alert(1);
// }else{
//     alert(0);
// }

// 1053
// 문제 : 참 거짓 바꾸기
// 입력 : 정수 1개가 입력된다.(단, 0 또는 1 만 입력된다.)
// 출력 : 입력된 값이 0이면 1, 1이면 0을 출력한다.
// 입력 예시 : 1
// 출력 예시 : 0

// let inp = prompt();
// if(inp == 0){
//     alert(1);
// }else{
//     alert(0);
// }

// 1054
// 문제 : 둘 다 참일 경우만 참 출력하기
// 입력 : 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.
// 출력 : 둘 다 참(1)일 경우에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
// 입력 예시 : 1 1
// 출력 예시 : 1

// let inp = prompt().split(" ");
// let inp0 = Number(inp[0]);
// let inp1 = Number(inp[1]);
// if(inp0 == 1 && inp1 == 1){
//     alert(1);
// }else{
//     alert(0);
// }
// 1055
// 문제 : 하나라도 참이면 참 출력하기
// 입력 : 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.
// 출력 : 하나라도 참일 경우 1을 출력하고, 그 외의 경우에는 0을 출력한다.
// 입력 예시 : 1 1
// 출력 예시 : 1

// let inp = prompt().split(" ");
// let inp0 = Number(inp[0]);
// let inp1 = Number(inp[1]);
// if(inp0 == 1 || inp1 == 1){
//     alert(1);
// }else{
//     alert(0);
// }

// 1056 
// 문제 : 참/거짓이 서로 다를 때에만 참 출력하기
// 입력 : 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.
// 출력 : 참/거짓이 서로 다를 때에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
// 입력 예시 : 1 1
// 출력 예시 : 0

// let inp = prompt().split(" ");
// let inp0 = Number(inp[0]);
// let inp1 = Number(inp[1]);
// if(inp0 != inp1){
//     alert(1);
// }else{
//     alert(0);
// }

// 1057
// 문제 : 참/거짓이 서로 같을 때에만 참 출력하기
// 입력 : 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.
// 출력 : 참/거짓이 서로 같을 때에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
// 입력 예시 : 0 0
// 출력 예시 : 1

// let inp = prompt().split(" ");
// let inp0 = Number(inp[0]);
// let inp1 = Number(inp[1]);
// if(inp0 == inp1 && inp1 == inp0){
//     alert(1);
// }else{
//     alert(0);
// }

// 1058 
// 문제 : 둘 다 거짓일 경우만 참 출력하기
// 입력 : 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.
// 출력 : 둘 다 거짓일 경우에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
// 입력 예시 : 0 1
// 출력 예시 : 0

// let inp = prompt().split(" ");
// let inp0 = Number(inp[0]);
// let inp1 = Number(inp[1]);
// if(inp0 == 0 && inp1 == 0){
//     alert(1);
// }else{
//     alert(0);
// }

// 1059
// 문제 : 비트단위로 NOT 하여 출력하기
// 입력 :정수 1개가 입력된다.
// 출력 : 비트 단위로 1 -> 0, 0 -> 1로 바꾼 후 그 값을 10진수로 출력한다.

// let inp = Number(prompt());
// let inp2 = ~inp;
// alert(inp2);

// 1060
// 문제 :비트단위로 AND 하여 출력하기
// 입력 : 2개의 정수가 공백을 두고 입력된다.
// 출력 : 두 정수를 비트단위(bitwise)로 and 계산을 수행한 결과를 10진수로 출력한다.

// let inp = prompt().split(" ");
// let inp1 = Number(inp[0])
// let inp2 = Number(inp[1])
// let inp3 = inp1&inp2;
// alert(inp3);

// 1061
// 문제 : 비트단위로 OR 하여 출력하기
// 입력 : 2개의 정수가 공백을 두고 입력된다.
// 출력 : 두 정수를 비트단위(bitwise)로 or 계산을 수행한 결과를 10진수로 출력한다.
// let inp = prompt().split(" ");
// let inp1 = Number(inp[0])
// let inp2 = Number(inp[1])
// let inp3 = inp1|inp2;
// alert(inp3);

// 1062
// 문제 : 비트단위로 XOR 하여 출력하기
// 입력 : 2개의 정수가 공백을 두고 입력된다.
// 출력 : 두 정수를 비트단위(bitwise)로 xor 계산을 수행한 결과를 10진수로 출력한다.

// let inp = prompt().split(" ");
// let inp1 = Number(inp[0])
// let inp2 = Number(inp[1])
// let inp3 = inp1^inp2;
// alert(inp3);

// 1063
// 문제 : 두 정수 입력받아 큰 수 출력하기
// 입력 : 두 정수가 공백을 두고 입력된다
// 출력 : 두 정수 중 큰 값을 10진수로 출력한다.
// let inp = prompt().split(" ").map(Number);
// let inp2 = Math.max(...inp);
// alert(inp2);

// 1064
// 문제 : 정수 3개 입력받아 가장 작은 수 출력하기
// 입력 : 3개의 정수가 공백으로 구분되어 입력된다.
// 출력 : 가장 작은 값을 출력한다.
// let inp = prompt().split(" ").map(Number);
// let inp2 = Math.min(...inp);
// alert(inp2);

// 1065
// 문제 : 정수 3개 입력받아 짝수만 출력하기
// 입력 : 세 정수 a, b, c 가 공백을 두고 입력된다.
// 출력 : 짝수만 순서대로 줄을 바꿔 출력한다.
 

// let inp = prompt().split(" ").map(Number);
// let result = "";
// for(let i = 0; i<inp.length; i++){
//     if(inp[i]%2 == 0){
//         result = result+inp[i]+"\n";
//     }
// }alert(result);

// 1066
// 문제 : 정수 3개 입력받아 짝/홀 출력하기
// 입력 : 세 정수 a, b, c 가 공백을 두고 입력된다.
// 출력 : 입력된 순서대로 짝(even)/홀(odd)을 줄을 바꿔 출력한다.
// let result = "";
// let inp = prompt().split(" ").map(Number);
// for(let i = 0; i<inp.length; i++){
//     if(inp[i]%2 == 0){
//         result = result + "even" + "\n";
//     }else{
//         result = result + "odd" + "\n";
//     }
// }alert(result);

// 1067
// 문제 : 정수 1개 입력받아 분석하기
// 입력 : 정수 1개가 입력된다.
// 출력 : 입력된 정수에 대해
// 	첫 줄에 minus 나 plus 를 출력하고,
// 	두 번째 줄에 odd 나 even 을 출력한다.

// let result = "";
// let inp = prompt().map(Number);
// for(let i = 0; i<inp.length; i++){
//     if(inp<0){
//         result = result + "minus" + "\n";
//     }else{
//         result = result + "plus" + "\n";
//     }if(inp[i]%2 == 0){
//         result = result + "even" + "\n";
//     }else{
//         result = result + "odd" + "\n";
//     }
// }alert(result);

// 1068
// 문제 :정수 1개 입력받아 평가 출력하기
// 입력 : 정수(0 ~ 100) 1개가 입력된다.
// 출력 : 평가 결과를 출력한다.

// let inp = Number(prompt());
// if(inp >= 90 && inp<=100){
//     alert("A");
// }else if(inp >= 70 && inp <= 89){
//     alert("B");
// }else if(inp >= 40 && inp <= 69){
//     alert("C");
// }else if(inp >= 0 && inp <= 39){
//     alert("D");
// }

// 1069
// 문제 : 평가 입력받아 다르게 출력하기
// 입력 : 영문자 1개가 입력된다.
// 출력 : 평가내용에 따라 다른 내용이 출력된다.

// let inp = prompt();
// if(inp == "A" ){
//     alert("best!!!");
// }else if(inp == "B" ){
//     alert("good!!");
// }else if(inp == "C" ){
//     alert("run!");
// }else if(inp == "D" ){
//     alert("slowly~");
// }else{
//     alert("what?");
// }

// 1070
// 문제 : 월 입력받아 계절 출력하기
// 입력 : 월을 의미하는 1개의 정수가 입력된다.(1 ~ 12)
// 출력 : 계절 이름을 출력한다.

// let inp = Number(prompt());
// if(inp == 1 || inp == 2 || inp==12){
//     alert("winter");
// }else if(inp >= 3 && inp <= 5){
//     alert("spring");
// }else if(inp >= 6 && inp <= 8){
//     alert("summer");
// }else if(inp >= 9 && inp <= 11){
//     alert("fall");
// }

// 1071                                                              반복문 없이 하는 방법을 모르겠어요
// 문제 : 0 입력될 때까지 무한 출력하기1
// 입력 : 정수가 순서대로 입력된다.
// 	-2147483648 ~ +2147483647, 단 개수는 알 수 없다.
// 출력 : 입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 종료한다.
// 	(0은 출력하지 않는다.)

// let inp = Number(prompt());
// let result = 0;
// if(inp != 0){
//     result+= inp+"\n";
// }else{
//     alert(result);
// } <-틀린거

// 1072                                                           반복문없이 N개의 정수를 구하는방법을 모르겠어요
// 문제 : 정수 입력받아 계속 출력하기
// 입력 : 첫 줄에 정수의 개수 n이 입력되고,
// 	두 번째 줄에 n개의 정수가 공백을 두고 입력된다.
// 	-2147483648 ~ +2147483647, 단 n의 최대 개수는 알 수 없다.
// 출력 : n개의 정수를 한 개씩 줄을 바꿔 출력한다.


// 1073
// 문제 : 0 입력될 때까지 무한 출력하기2
// 입력 : 정수가 순서대로 입력된다.
// 	-2147483648 ~ +2147483647, 단 개수는 알 수 없다.
// 출력 : 입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 종료한다.
// 	(0은 출력하지 않는다.)

// let inp = prompt().split(" ");
// let result = "";
// for(let i = 0;i<inp.length;i++){
//     if(inp[i] == "0"){
//         alert(result);
//         break;
//     }
//     result += inp[i]+"\n";
// }

// 1074
// 문제 : 정수 1개 입력받아 카운트다운 출력하기1
// 입력 : 정수 1개가 입력된다.
// 	(1 ~ 100)
// 출력 : 1씩 줄이면서 한 줄에 하나씩 1이 될 때까지 출력한다.

// let inp = Number(prompt());
// let result = "";
// for(let i =0; i<inp;i++){
//     result = result + (inp-i) + "\n";
// }alert(result);

// 1075
// 문제 : 정수 1개 입력받아 카운트다운 출력하기2
// 입력 : 정수 1개가 입력된다.
// 출력 : 1씩 줄이면서 한 줄에 하나씩 0이 될 때까지 출력한다.

// let inp = Number(prompt());
// let result = 0;
// for(let i =inp; i>0;i--){
//     result = result + (i-1) + "\n";
// }alert(result);

// 1076
// 문제 : 문자 1개 입력받아 알파벳 출력하기
// 입력 : 영문자 1개가 입력된다.
// 출력 : a부터 입력한 문자까지 순서대로 공백을 두고 출력한다.

// let inp = prompt();
// let inp2 = inp.charCodeAt(0)
// let result = "";
// for(let i =97; i<=inp2;i++){
//     result = result + " " + String.fromCharCode(i);
// }alert(result);

// 1077
// 문제 : 정수 1개 입력받아 그 수까지 출력하기
// 입력 : 정수 1개가 입력된다.
// 출력 :0부터 그 수까지 줄을 바꿔 한 개씩 출력한다.
// let inp = Number(prompt());
// let result = "";
// for(let i =0; i<=inp;i++){
//     result = result + i + "\n";
// }alert(result);

// 1078
// 문제 : 짝수 합 구하기
// 입력 : 정수 1개가 입력된다.
// 출력 : 1부터 입력된 수까지 짝수의 합을 출력한다.

// let inp = Number(prompt());
// let result = 0;
// for(let i =0; i<=inp;i++){
//     if(i % 2 == 0){
//         result = result + i;
//     }
// }alert(result);

// 1079
// 문제 : 원하는 문자가 입력될 때까지 반복 출력하기
// 입력 : 문자들이 1개씩 계속해서 입력된다.
// 출력 : 'q'가 입력될 때까지 입력된 문자를 줄을 바꿔 한 줄씩 출력한다.

// 위에꺼는 문자가 1개씩 입력될때
// let inp = prompt();
// let result = "";
// if(inp != "q"){
//     result = result + inp +"\n";
// }else {
//     alert(result+inp)
// }

// 밑에꺼는 문자가 여러개 입력 될때
// let inp = prompt().split(" ");
// let result = "";
// for(let i = 0; i<inp.length;i++){
//     if(inp[i] != "q"){
//         result = result + inp[i] +"\n";
//     }else {
//         alert(result+inp[i])
//     }
// }

// 1080
// 문제 :언제까지 더해야 할까?
// 입력 : 정수 1개가 입력된다.
// 출력 : 1, 2, 3, 4, 5 ... 를 순서대로 계속 더해 합을 만들어가다가,
// 	입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력한다.

// let inp = Number(prompt());
// let result = 0;
// for(let i =0; i<inp;i++){
//     result += i;
//     if(result>=inp){
//         alert(i);
//         break;
//     }
// }

// 1081
// 문제 : 주사위를 2개 던지면?
// 입력 : 주사위 2개의 면의 개수 n, m이 공백을 두고 입력된다.
// 출력 : 나올 수 있는 주사위의 숫자를 한 세트씩 줄을 바꿔 모두 출력한다.
// 	첫 번째 수는 n, 두 번째 수는 m으로 고정해 출력하도록 한다.


// let inp = prompt("첫번째 주사위").split(" ").map(Number);
// let result = "";
// for(let i = 1; i<=inp[0]; i++){
//     for(let j = 1; j<=inp[1]; j++){
//         result += i +  " " + j +"\n";
//     }
// }alert(result);

// 1082 
// 문제 : 16진수 구구단
// 입력 : 16진수로 한 자리 수가 입력된다.
// 	단, A ~ F 까지만 입력된다.
// 출력 : 입력된 16진수에 1~F까지 순서대로 곱한, 16진수 구구단을 줄을 바꿔 출력한다.
// 	계산 결과도 16진수로 출력해야 한다.


// let inp = prompt(); //입력 받기
// let hex = inp.toString(16); //입력 받은 값 16진수로 변환
// let dec = parseInt(hex, 16); // 16진수를 10진수로 변환
// let result = ""; // 결과값 선언
// for(let i = 0; i<=15; i++){
//     result += inp + "*" + (i).toString(16).toUpperCase() + "=" + (dec*i).toString(16).toUpperCase() + "\n";
// }alert(result);


// 1083
// 문제 : 3 6 9 게임의 왕이 되자!
// 입력 : 10 보다 작은 정수 1개가 입력된다.
// 출력 : 1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데,
// 	3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X 를 출력한다.

// let inp = prompt();
// let result = "";
// for(let i=1;i<=inp; i++){
//     if(i % 3 == 0){
//         result += "X ";
//         continue;
//     }
//     result += i +" ";
// }alert(result);

// 1084
// 문제 : 빛 섞어 색 만들기
// 입력 : 빨녹파(r, g, b) 각 빛의 강약에 따른 가짓수(0 ~ 128))가 공백을 사이에 두고 입력된다.
// 	예를 들어, 3 3 3 은 각 색깔 빛에 대해서 그 강약에 따라 0~2까지 3가지의 색이 있음을 의미한다.
// 출력 : 만들 수 있는 rgb 색의 정보를 오름차순(계단을 올라가는 순, 12345... abcde..., 가나다라마...)으로
// 	줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력한다.

// let inp = prompt().split(" ").map(Number);
// let result = "";
// let result2 = (inp[0]*inp[1]*inp[2]);
// for(let i =0;i<inp[0];i++){
//     for(let j =0;j<inp[1];j++){
//         for(let k =0;k<inp[2];k++){
//             result += i + " " + j + " " + k + "\n";
//         }
//     }
// }alert(result+result2);

// 1085
// 문제 :  소리 파일 저장용량 계산하기
// 입력 : h, b, c, s 가 공백을 두고 입력된다.
// 	h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.
// 출력: 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
// 	단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.

// let inp = prompt().split(" ").map(Number);
// let byte = inp[0]*inp[1]*inp[2]*inp[3];
// let bit = byte/8;
// let KBb = bit/1024;
// let MBb = KBb/1024;
// let result = "";
// if(bit>8){
//     if(KBb>1024){
//         if(MBb>1024){
//             // return;
//         }else{
//             result = MBb.toFixed(1)+" MB";
//         }
//     }else{
//         result = KBb.toFixed(1)+" KB";
//     }
// }else{
//     result = bit.toFixed(1)+" bit";
// }alert(result);

// 1086
// 문제 : 그림 파일 저장용량 계산하기
// 입력 : w, h, b 가 공백을 두고 입력된다.
// 단, w, h는 모두 정수이고 1~1024 이다. b는 40이하의 4의 배수이다.
// 출력 :필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
// 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력한 뒤 MB를 출력한다.

// let inp = prompt().split(" ").map(Number);
// let byte = inp[0]*inp[1]*inp[2];
// let bit = byte/8;
// let KBb = bit/1024;
// let MBb = KBb/1024;
// let result = "";
// if(bit>8){
//     if(KBb>1024){
//         if(MBb>1024){
//             // return;
//         }else{
//             result = MBb.toFixed(2)+" MB";
//         }
//     }else{
//         result = KBb.toFixed(2)+" KB";
//     }
// }else{
//     result = bit.toFixed(2)+" bit";
// }alert(result);

// 1087
// 문제 : 여기까지! 이제 그만~
// 입력 :언제까지 합을 계산할 지, 정수 1개를 입력받는다.
// 단, 입력되는 자연수는 100,000,000이하이다.
// 출력 :1, 2, 3, 4, 5 ... 순서대로 계속 더해가다가, 그 합이 입력된 정수보다 커지거나 같아지는 경우,
// 그때까지의 합을 출력한다.

// let inp = Number(prompt());
// let result = 0;
// for(let i = 0; i<inp; i++){
//     result += i;
//     if(result >= inp){
//         break;
//     }
// }alert(result);


// 1088
// 문제 : 3의 배수는 통과?
// 입력 : 정수 1개를 입력받는다.
// 출력 : 1부터 입력한 정수보다 작거나 같을 때까지 1씩 증가시켜 출력하되
// 	3의 배수는 출력하지 않는다.
// for문 돌려서 i가 %3==0 일때 continue 하면 3의 배수가 빠지고 for문이 계속 돔

// let inp = Number(prompt());
// let result = "";
// for(let i = 1; i<=inp; i++){
//     if(i%3 == 0){
//         continue;
//     }
//     result += i+" "; 
// }alert(result);

// 1089
// 문제 : 수 나열하기1
// 입력 : 시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가
// 출력 : n번째 수를 출력한다.

// let inp = prompt().split(" ").map(Number);
// let inp2 = inp[0];
// let inp3 = inp[1];
// let inp4 = inp[2];
// let result = inp2;
// for(let i = 1; i<inp4; i++){
//     result += inp3;
// }alert(result);


// 1090
// 문제 : 수 나열하기2
// 입력 : 시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가
// 공백을 두고 입력된다.(모두 0 ~ 10)
// 출력 : n번째 수를 출력한다.

// let inp = prompt().split(" ").map(Number);
// let inp2 = inp[0];
// let inp3 = inp[1];
// let inp4 = inp[2];
// let result = inp2;
// for(let i = 1; i<inp4; i++){
//     result = result*inp3;
// }alert(result);

// 1091
// 문제 : 수 나열하기3
// 입력 : 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 인지를 나타내는 정수(n)가
// 	공백을 두고 입력된다.(a, m, d는 -50 ~ +50, n은 10이하의 자연수)
// 출력 : n번째 수를 출력한다.

// let inp = prompt().split(" ").map(Number);
// let inp2 = inp[0];
// let inp3 = inp[1];
// let inp4 = inp[2];
// let inp5 = inp[3];
// let result = inp2;
// for(let i = 1; i<inp5; i++){
//     result = (result*inp3+inp4);
// }alert(result);

// 1092
// 문제 : 함께 문제 푸는 날
// 입력 : 같은 날 동시에 가입한 인원 3명이 규칙적으로 방문하는,
// 	방문 주기가 공백을 두고 입력된다. (단, 입력값은 100이하의 자연수이다.)
// 출력 : 3명이 다시 모두 함께 방문해 문제를 풀어보는 날(동시 가입/등업 후 며칠 후?)을 출력한다.


// let inp = prompt().split(" ").map(Number);
// let inp1 = inp[0]
// let inp2 = inp[1]
// let inp3 = inp[2]
// for(let i = 1; true; i++){
//     if(i%inp1==0 && i%inp2==0 && i%inp3==0){
//         result = i;
//         break;
//     }
// }alert(result);


// 1093
// 문제 : 이상한 출석 번호 부르기1
// 입력 : 첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력된다. (1 ~ 10000)
// 두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 공백을 두고 순서대로 입력된다.
// 출력 : 1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력한다.

// let n = Number(prompt());              // n번 부를 횟수
// let inp = prompt().split(" ");         // 불린번호들
// let result = new Array(24);

// for(let i=0;i<result.length; i++){
//     result[i] = 0;
// }

// for(let i=0; i<n;i++){
//     result[inp[i]-1] += 1;
// }alert(result.toString());

// 1094
// 문제 : 이상한 출석 번호 부르기2
// 입력 : 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
//      n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.
// 출력 : 출석을 부른 번호 순서를 바꾸어 공백을 두고 출력한다.

// let inp = Number(prompt());          //n번 부를 횟수
// let inp2 = prompt().split(" ");       // 불린번호들
// let inp3 = inp2.reverse();           // 불린번호 역순
// let result = "";
// for(let i = 0; i<inp; i++){
//     result += inp3[i] +" ";        // (,) 없애고 한줄로 표현
// }
// alert(result);


// 1095
// 문제 : 이상한 출석 번호 부르기3
// 입력 : 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
// n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.
// 출력 : 출석을 부른 번호 중에 가장 빠른 번호를 1개만 출력한다.

// let inp = Number(prompt());
// let inp2 = prompt().split(" ");
// alert(Math.min(...inp2))



// 못푼문제 1071, 1072

// 1071,1072 반복문 없이는 못풀겠어요