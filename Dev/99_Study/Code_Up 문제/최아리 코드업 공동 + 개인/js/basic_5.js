// <기초5-1. 1차원 배열>
// 문제 1402
// 입력 : 5
//        1 3 5 6 8
// 출력 : 8 6 5 3 1

// let num1 = Number(prompt("개수를 입력하세요."));
// let num2 = prompt("정수를 입력하세요.").split(" ");
// let result = ""

// for(let i=num1-1; i>=0; i--) {
//     result = result + num2[i] + " ";
// }
// alert(result)

// 문제 1403
// 입력 : 3
//        1 2 3
// 출력 : 1
//        2
//        3
//        1
//        2
//        3

// let num1 = Number(prompt("개수를 입력하세요."));
// let num2 = prompt("정수를 입력하세요.").split(" ");
// let result = ""

// for(i=0; i<num1; i++) {
//     result = result + num2[i] + "\n";
// }

// alert(result+result)

// TODO: 문제 1405 *다시
//
// 입력 : 5
//        1 2 3 4 5
// 출력 : 1 2 3 4 5
//        2 3 4 5 1
//        3 4 5 1 2
//        4 5 1 2 3
//        5 1 2 3 4

// let num1 = Number(prompt("개수를 입력하세요.")); // 5
// let num2 = prompt("정수를 입력하세요.").split(" "); // [1, 2, 3, 4, 5]
// let first = "";

// for (let i = 0; i < num1; i++) {
//   for (let j = i; j < num1; j++) {
//     first = first + num2[j] + " ";
//   }
//   for (let j = 0; j < i; j++) {
//     first = first + num2[j] + " ";
//   }
//   first += "\n"
// }

// alert(first);

// 배열에 1부터 n까지 값을 넣어놓고 반복을 하면서 배열 값을 순서대로 출력하고 첫번째를 마지막으로 옮기면서 n번 반복?

// 문제 1407
// 입력 : abC Def gh
// 출력 : abCDefgh

// let char = prompt("입력하세요.").split(" ");
// let result = ""

// for(i=0; i<char.length; i++) {
//     result = result + char[i];
// }

// alert(result)

// 문제 1409
// k번째 숫자가 무엇이었는지 출력한다.
// 입력 : 10 9 8 7 6 5 4 3 2 1
//        3
// 출력 : 8

// let num1 = prompt("숫자를 입력하세요.").split(" ");
// let num2 = Number(prompt("개수를 입력하세요."));

// alert(num1[num2-1]);

// 문제 1410
// 여는 괄호의 개수와 닫힌 괄호의 개수를 출력한다.
// 입력 : ((())()(()))
// 출력 : 6 6

// let char = prompt("입력하세요.");
// let count=0;
// let count1=0;

// for(let i=0; i<char.length; i++) {

//     if(char[i]=='(') {
//         count++
//     }
//     if(char[i]==')') {
//         count1++
//     }
// }

// alert(count + " " + count1)

// 문제 1411
// 첫 줄에는 한 장을 잃어버리기 전 카드의 전체 장수 N이 주어져 있다. 잃어버린 카드는?
// 입력 : 10
//        3
//        4
//        1
//        10
//        2
//        6
//        7
//        5
//        9
// 10 3 4 1 10 2 6 7 5 9
// 출력 : 8

// let num = prompt("정수를 입력하세요.").split(" ").map(Number);
// let result = 0
// let result1 = 0

// for(i=1; i<num.length; i++) {
//     result = result + num[i]
// }

// for(i=1; i<=num.length; i++) {
//     result1 = result1 + i
// }

// alert(result1-result)

// TODO: 문제 1412 *다시보기
// 입력 : oh! my god!
// 출력 : a:0
//        b:0
//        c:0
//        d:1
//        e:0
//        f:0
//        g:1
//        h:1
//        i:0
//        j:0
//        k:0
//        l:0
//        m:1
//        n:0
//        o:2
//        p:0
//        q:0
//        r:0
//        s:0
//        t:0
//        u:0
//        v:0
//        w:0
//        x:0
//        y:1
//        z:0

// let all = prompt("문장을 입력하세요.").split(" ").join(""); // [oh!mygod!]
// let result = "";

// for (i = 0; i < all.length; i++) {
//   result = result + all[i].charCodeAt(0) + " "; // 111 104 33 109 121 103 111 100 33 (공백)
// }

// let result2 = result.split(" "); // [ 111,104,33,109,121,103,111,100,33,(공백) ]
// let final = "";


// // count에 배열 추가
// let count = new Array(26);

// for (let i = "a".charCodeAt(0); i <= "z".charCodeAt(0); i++) {
//   count[i] = 0;
// }


// for(let i = "a".charCodeAt(0); i <= "z".charCodeAt(0); i++) { // 97 ~ 122

//     for(let j=0; j<result2.length-2; j++) { // index: 0~8
//         if(i == result2[j]) {
//             count[i]++
//         }
//     }
//     final = final + String.fromCharCode(i) + ":" + count[i] + "<br>";

// } 

// document.querySelector("#app").innerHTML = final

// 문제 1416
// 2진수로 변환해서 출력한다.
// 입력 : 7
// 출력 : 111

// let num = Number(prompt("숫자를 입력하세요."))
// let bi = parseInt(num, 10).toString(2); // 10진수를 2진수로

// alert(bi)

// TODO: 문제 1420 *객체정의해서 푸는 방법 (선생님 풀이법)
// 세 번째로 높은 학생의 이름을 출력한다.
// 입력 : 5
//        minsu 78
//        gunho 64
//        sumin 84
//        jiwon 96
//        woosung 55

// minsu 78 gunho 64 sumin 84 jiwon 96 woosung 55
// 출력 : minsu

// let num = Number(prompt("숫자를 입력하세요."))
// let grade = prompt("입력하세요.").split(" "); //[minsu, 78, gunho, 64, sumin, 84, jiwon, 96, woosung, 55]
// let result = ""

// for(let i=0; i<grade.length; i++) {
//     if(i%2==1) {
//         result = result + grade[i] + " ";
//     }
// }

// let result2 = result.split(" "); // [78, 64, 84, 96, 55]

// result2.sort(function(a, b){
//     return b - a;
//   });

// let result3 = result2[2]; // 세 번째로 높은 점수 => 78
// let result4 = grade.indexOf(result3); //1

// alert(grade[result4-1])

// 문제 1425
// 학생 자리 앉히기
// 입력 : 9 6
//        160 165 164 165 150 165 168 145 170
// 출력 : 145 150 160 164 165 165
//        165 168 170

// let stu = prompt("입력하세요.").split(" ").map(Number)

// let num1 = prompt("입력하세요.").split(" ").map(Number);
// let result1 = num1.sort(function (a, b) {
//   return a - b;
// }); // 학생 키를 작은 수부터 큰 수까지

// let first = "";
// let second = "";

// for (i = 0; i < stu[1]; i++) {
//     first = first + result1[i] + " ";
// }
// for (i=stu[1]; i<stu[0]; i++) {
//     second = second + result1[i] + " ";
// }

// alert(first + "\n" + second)

// TODO: 문제 1430 *.indexOf() 함수 활용
// M개의 각각의 질문에 대해 그 숫자가 있었으면 1을 출력, 없었으면 0을 하나씩 차례대로 출력한다.
// 입력 : 5 (데이터 수)
//        2 52 23 55 100 (데이터)
//        4 (문제 수)
//        5 2 55 99 (문제)
// 출력 : 0 1 1 0

// let datanum = Number(prompt("숫자를 입력하세요."));
// let data = prompt("입력하세요.").split(" "); // [2,52,23,55,100]
// let quenum = Number(prompt("숫자를 입력하세요."));
// let que = prompt("입력하세요.").split(" "); // [5, 2, 55, 99]
// let result = ""

// for (i = 0; i < quenum; i++) {
//   if (data.indexOf(que[i]) >= 0) {
//     que[i] =  "1";
//   }
//   else {
//     que[i] =  "0";
//   }
//   result = result + que[i] + " "
// }

// alert(result)

// TODO: 문제 1440 *다시
//
// 입력 : 5
//        1 2 3 2 1
// 출력 : 1: < < < =
//        2: > < = >
//        3: > > > >
//        4: > = < >
//        5: = < < <

// let num = Number(prompt("숫자를 입력하세요."));
// let nums = prompt("입력하세요.").split(" ").map(Number); // [1,2,3,4,5]
// let result = ""

// for(i=0; i<num; i++) {
//   result += (i+1) + ":"
//     for(j=0; j<num; j++) {
//         if(i == j) {
//           continue
//         } 
//         else if (nums[i]<nums[j]) {
//           result += "<"
//         }
//         else if (nums[i]==nums[j]) {
//           result += "="
//         }
//         else if (nums[i]>nums[j]) {
//           result += ">"
//         } 
        
//     }
//     result += "\n"
// }

// alert(result)

// <기초5-2. 문자열>
// 문제 1131
// 입력 : a
// 출력 : a

// let char = prompt("문자를 입력해주세요.")

// alert(char)

// 문제 1132
// 입력 : cat
// 출력 : cat

// let word = prompt("문자를 입력해주세요.")

// alert(word)

// 문제 1133
// 입력 : black sheep wall
// 출력 : black sheep wall

// let words = prompt("입력해주세요.")

// alert(words)

// TODO: 문제 1295 *아스키코드 이용하기
// 대소문자를 서로 변환한 결과를 출력한다.
// 입력 : CodeChallenge2014withMSP
// 출력 : cODEcHALLENGE2014WITHmsp

// 소문자 : 97~122
// 대문자 : 65~90

// let char = prompt("문자를 입력해주세요.");
// let result = ""

// for (i = 0; i < char.length; i++) {
//   if (97 <= char[i].charCodeAt(0) && char[i].charCodeAt(0) <= 122) {
//     // 소문자면
//     result += char[i].toUpperCase();
//   }
//   else if (65 <= char[i].charCodeAt(0) && char[i].charCodeAt(0) <= 90) {
//     // 대문자면
//     result += char[i].toLowerCase();
//   } else if (0<=char[i]&&char[i]<=9) {
//     // 숫자면
//     result += char[i]
//   }
// }

// alert(result)

// 문제 1406
// love가 입력되면 I love you.를 출력하시오. 만약 다른 단어가 입력되면 아무것도 출력하지 않는다.
// 입력 : love
// 출력 : I love you.

// let word = prompt("문자를 입력해주세요.");

// if(word=="love") {
//     alert("I" + " " + word + " " + "you")

// } else {null}

// TODO: 문제 1407 *공백 제거 함수: .trim() .replace()
// 입력 : abC Def gh
// 출력 : abCDefgh

// let words = prompt("입력해주세요.").replace(/ /g,"")
// alert(words)

// 문제 1408
//[어떤 인터넷 서비스의 2가지 암호화 방법]
// - 입력받은 문자의 ASCII 코드값 + 2
// - (입력받은 문자의 ASCII 코드값 * 7) % 80 + 48
// 입력 : TEST
// 출력 : VGUV
//        L3EL

// let word = prompt("문자를 입력해주세요.");
// let result1 = ""
// let result2 = ""

// for(i=0; i<4; i++) {
//     result1 = result1 +  (word[i].charCodeAt(0) + 2) + " ";
// }
// for(i=0; i<4; i++) {
//     result2 = result2 + ((word[i].charCodeAt(0)*7)%80 + 48) + " ";
// }

// let result1_2 = result1.split(" ")
// let result2_2 = result2.split(" ")

// let final1 = ""
// let final2 = ""

// for(i=0; i<4; i++) {
//     final1 = final1 + String.fromCodePoint(result1_2[i]);
// }
// for(i=0; i<4; i++) {
//     final2 = final2 + String.fromCodePoint(result2_2[i]);
// }

// alert(final1 + "\n" + final2)

// 문제 1410
// 여는 괄호의 개수와 닫힌 괄호의 개수를 출력한다.
// 입력 : ((())()(()))
// 출력 : 6 6

// let char = prompt("입력하세요.");
// let count=0;
// let count1=0;

// for(let i=0; i<char.length; i++) {

//     if(char[i]=='(') {
//         count++
//     }
//     if(char[i]==')') {
//         count1++
//     }
// }

// alert(count + " " + count1)

// 문제 1414 *count++
// ① 첫 번째 줄에는 문자열에서 찾은 “C”의 개수를 출력한다.
// ② 두 번째 줄에는 문자열에서 찾은 “CC”의 개수를 출력한다.
// 입력 : cCCc
// 출력 : 4
//        3

// let char = prompt("입력하세요.");
// let a = "CC";
// let b = "cC";
// let c = "Cc";
// let d = "cc";
// let count = 0;
// let count2 = 0;

// for (i = 0; i < char.length; i++) {
//   if (char[i].indexOf("C") >= 0 || char[i].indexOf("c") >= 0) {
//     count++;
//   }
// }

// if (char.indexOf(a)) {
//   count2++;
// } if (char.indexOf(b)) {
//   count2++;
// } if (char.indexOf(c)) {
//   count2++;
// } if (char.indexOf(d)) {
//   count2++;
// }

// alert(count + "\n" + count2);

// 문제 1418
// 소문자 t의 위치를 공백으로 분리하여 모두 출력하시오.
// 입력 : test
// 출력 : 1 4

// let word = prompt("입력하세요.")
// let result = 0;

// for(i=0; i<word.length; i++) {
//     if(word[i]=="t") {
//         result = result + (i+1) + " "
//     }
// }

// alert(result)

// 문제 1419
// 소문자 love가 몇 번 나오는지 출력한다.
// 입력 : love lovely
// 출력 : 2

// let words = prompt("입력하세요.").split(" ")
// let result = 0;
// let result2 = 0;

// for(i=0; i<words.length; i++) {
//     if(words[i].indexOf("love")>=0) {
//         result = 1;
//     }
//     else {
//         result = 0;
//     }
//     result2 = result2 + result;
// }

// alert(result2)

// 문제 1733
// 대문자 IOI가 입력되면,
// IOI is the International Olympiad in Informatics.를 출력하고,
// 그 외에는 I don't care.를 출력하시오.
// 입력 : IOI
// 출력 : IOI is the International Olympiad in Informatics.

// let word = prompt("입력하세요.");

// if(word == "IOI") {
//     alert("IOI is the International Olympiad in Informatics.")
// }
// else {
//     alert("I don't care.")
// }

// 문제 1734
// welcome! ID 형태로 출력한다.
// 입력 : anaki
// 출력 : welcome! anaki

// let ID = prompt("ID를 입력하세요.")

// alert("welcom!" + " " + ID)

// TODO: 문제 1754
// 작은수 큰수 순서로 출력한다. (같은 숫자는 입력되지 않는다.)
// 입력 : 9999999999999999999999999 9999999999999999999999998
// 출력 : 9999999999999999999999998 9999999999999999999999999
// 큰 수라 숫자로 비교 말고 문자로 비교하기 (아스키코드상 비교되어 나온다.)

// let nums = prompt("입력하세요.").split(" ");

// if(nums[0]>nums[1]) {
//     alert(nums[1] + " " + nums[0])
// } else if(nums[0]<nums[1]) {
//     alert(nums[0] + " " + nums[1])
// } else {}

// 문제 1990
// 3의 배수이면 1을 출력하고, 아니면 0을 출력한다.
// 입력 : 3321
// 출력 : 1

// let num = Number(prompt("숫자를 입력하세요."))

// if(num%3==0) {
//     alert(1)
// } else {
//     alert(0)
// }

// 문제 2721
// 순환 문자열이면 good을 출력, 아니면 bad를 출력하시오.
// 입력 : turtle
//        error
//        robot
// 출력 : good

// let word1 = prompt("입력하세요.");
// let word2 = prompt("입력하세요.");
// let word3 = prompt("입력하세요.");

// if(word1[word1.length-1] == word2[0] && word2[word2.length-1] ==  word3[0]) {
//     alert("good")
// } else {
//     alert("bad")
// }
