// <기초6. 함수>
// 문제 1526
// 출력 : Hello
// function basic() {
//     alert( "Hello" );
//   }
//   basic();

// 문제 1527
// 출력 : 123

// function basic() {
//     alert("123");
// }

// basic();

// 문제 1528
// 출력 : *

// function basic() {
//     alert("*")
// }

// basic()

// 문제 1529
// 출력 : **

// function basic() {
//     alert("**")
// }

// basic()

// 문제 1530
// 입력 :
// 출력 : A

// let basic = function() {
//     alert("A")
// }

// basic()

// 문제 1531
// 출력 : 1

// function basic() {
//     alert(1)
// }

// basic()

// 문제 1532
// 출력 : -2147483649

// let basic = function() {
//     alert(-2147483649)
// }

// basic()

// 문제 1533
// 출력 : 3.140000

// let basic = function() {
//     alert("3.140000")
// }

// basic()

// 문제 1534
// 출력 : 3.1415926535897

// function basic() {
//     alert(3.1415926535897)
// }

// basic()

// 문제 1535
// 가장 큰 값이 처음 나타나는 위치를 출력한다.
// 입력 : 5
//        1 3 2 1 3
// 출력 : 2

// let num1 = Number(prompt("수를 입력하세요."));
// let num2 = prompt("수를 입력하세요.").split(" ").map(Number);
// let result = 0;
// let max = Math.max(...num2) //3

// function basic() {
//   for (i = 0; i < num1; i++) {
//     if (num2[i] == max) {
//       result = num2[i];
//       break;
//     }
//   }
//   alert(i+1);
// }

// basic();

// 문제 1536
// 입력 : 5
// 가장 작은 값을 출력한다.
// 1 3 2 1 3
// 출력 : 1

// let num1 = Number(prompt("수를 입력하세요."));
// let num2 = prompt("수를 입력하세요.").split(" ").map(Number);

// function min() {
//     alert(Math.min(...num2))
//   }

//   min()

// 문제 1537
// 1 이 입력되면 hello, 2 가 입력되면 world 를 출력한다.
// 입력 : 2
// 출력 : world

// let num = Number(prompt("수를 입력하세요."));

// function result() {
//     if(num==1) {
//         alert("hello")
//     }
//     else if(num==2) {
//         alert("world")
//     }
// }

// result()

// 문제 1538
// 홀수가 입력되면 odd, 짝수가 입력되면 even을 출력한다.
// 입력 : 2
// 출력 : even

// let num = Number(prompt("수를 입력하세요."));

// function result() {
//     if(num%2==0) {
//         alert("even")
//     }
//     else {
//         alert("odd")
//     }
// }

// result()

// 문제 1539
// 0 이 입력되면 false, 그 외에는 true를 출력한다.
// 입력 : -1
// 출력 : true

// let num = Number(prompt("수를 입력하세요."));

// function result() {
//     if(num==0) {
//         alert("false")
//     }
//     else {
//         alert("true")
//     }
// }

// result()

// 문제 1540
// 0 이 입력되면 zero, 그 외에는 non zero를 출력한다.
// 입력 : -1
// 출력 : non zero

// let num = Number(prompt("수를 입력하세요."));

// function result() {
//     if(num==0) {
//         alert("zero")
//     }
//     else {
//         alert("non zero")
//     }
// }

// result()

// 문제 1541
// 음수(-) 가 입력되면 negative, 0 이 입력되면 zero, 그 외에는 positive  를 출력한다.
// 입력 : 2
// 출력 : positive

// let num = Number(prompt("수를 입력하세요."));

// function result() {
//     if(num<0) {
//         alert("negative")
//     }
//     else if(num==0) {
//         alert("zero")
//     }
//     else {
//         alert("positive ")
//     }
// }

// result()

// TODO: 문제 1542 *소수구하기
// 소수(prime)가 입력되면 prime, 합성수(composite)가 입력되면 composite 를 출력한다.
// 입력 : 997
// 출력 : prime

// let num = Number(prompt("숫자를 입력하세요."));

// function isPrime() {
//   if (num == 2) {
//     alert("prime");
//   } else if (num <= 1) {
//     alert("not prime");
//   }
//   for (let i = 2; i < num; i++) {
//     if (num % i === 0) {
//       //이 부분에서 num이  다른 수로 나눠떨어진다면 소수가 아님
//       alert("not prime");
//       break;
//     } else {
//       alert("prime");
//       break;
//     }
//   }
// }

// isPrime()

// 문제 1543
// 입력 : 3
// 출력 : love
//        love
//        love

// let num = Number(prompt("수를 입력하세요."));
// let result = ""

// function love() {
//     for(i=0; i<num; i++) {
//         result = result + "love" + "\n"
//     }
// }
// love()
// alert(result)

// 문제 1544
// 입력 : 5
// 출력 : *****

// let num = Number(prompt("수를 입력하세요."));
// let result = ""

// function star() {
//     for(i=1; i<=num; i++) {
//         result = result + "*"
//     }
//     alert(result)
// }

// star()

// 문제 1545
// 0 이 입력되면 zero, 그 외에는 non zero 를 출력한다.
// 입력 : -1
// 출력 : non zero

// let num = Number(prompt("수를 입력하세요."));

// function basic() {
//     if(num==0) {
//         alert("zero")
//     }
//     else {
//         alert("non zero")
//     }
// }

// basic()

// 문제 1546
// 양수인 경우 plus, 음수인 경우 minus, 0 인 경우 zero를 판별하여 출력하시오.
// 입력 : -1
// 출력 : minus

// let num = Number(prompt("수를 입력하세요."));

// function basic() {
//     if(num>0) {
//         alert("plus")
//     }
//     else if(num<0) {
//         alert("minus")
//     }
//     else {
//         alert(" zero")
//     }
// }

// basic()

// 문제 1547
// 소수인 경우 prime, 합성수인 경우 composite 를 출력한다.
// 입력 : 9973
// 출력 : prime

// 문제 1548
// 90 점 이상 ~ 100점 이하 : A
// 80 점 이상 ~ 90점 미만 : B
// 70 점 이상 ~ 80점 미만 : C
// 60 점 이상 ~ 70점 미만 : D
// 60 점 미만 : F
// 입력 : 89
// 출력 : B

// let num = Number(prompt("수를 입력하세요."));

// function grade() {
//   if (90 <= num && num <= 100) {
//     alert("A");
//   }
//   else if (80 <= num && num < 90) {
//     alert("B");
//   }
//   else if (70 <= num && num < 80) {
//     alert("C");
//   }
//   else if (60 <= num && num < 70) {
//     alert("D");
//   }
//   else if (num < 60) {
//     alert("F");
//   }
// }

// grade()

// TODO: 문제 1549 *Math.abs() -> 절대값 구하기 함수 (Absolute Value)
// 절대값 출력
// 입력 : -2147484648
// 출력 : 2147484648

// let num = Number(prompt("수를 입력하세요."));

// alert(Math.abs(num))

// 문제 1550
// 입력된 정수의 양의 제곱근의 정수부분만 출력한다.
// 입력 : 16
// 출력 : 4

// let num = Number(prompt("수를 입력하세요."));

// alert(Math.sqrt(num))

// 문제 1551
// 첫 줄에 데이터의 개수 n,
// 두 번째 줄에 n개의 데이터가 공백을 두고 입력된다.
// 세 번째 줄에 찾아야하는 값 k가 입력된다.
// k값이 가장 처음 나타나는 위치를 출력한다.
// (k값이 저장되어있지 않은 경우에는 –1을 출력한다.)
// 입력 : 5
//        5 2 3 2 4
//        2
// 출력 : 2

// let num1 = Number(prompt("데이터의 개수를 입력하세요."));
// let num2 = prompt("데이터를 입력하세요.").split(" ");
// let num3 = prompt("찾아야하는 값을 입력하세요.");
// let result = ""

// function basic() {
//     for(i=0; i<num1; i++) {
//         if(num2[i]==num3) {
//             result = num2[i];
//             break
//         }
//     }
//     alert(result)
// }

// basic()

// 문제 1552
// 소수 부분만 출력한다.
// 입력 : 3.14159265358979
// 출력 : 0.14159265358979

// let num = Number(prompt("수를 입력하세요."));

// function result() {
//     alert(num%1)
// }

// result()

// TODO: 문제 1553 *Math.ceil() : 올림함수
// 정수로 올림(ceiling)한 값을 출력한다.
// 입력 : -1.1
// 출력 : -1

// let num = Number(prompt("수를 입력하세요."));

// alert(Math.ceil(num))

// TODO: 문제 1554 *Math.floor() : 내림함수
// 정수로 내림(flooring)한 값을 출력한다.
// 입력 : -1.1
// 출력 : -2

// let num = Number(prompt("수를 입력하세요."));

// alert(Math.floor(num))

// 문제 1555
// 1부터 n까지의 정수합을 출력한다.
// 입력 : 9999999
// 출력 : 49999995000000

// let num = Number(prompt("수를 입력하세요."));
// let result = 0;

// function sum() {
//     for(i=1; i<=num; i++) {
//         result = result + i;
//     }

//     alert(result)
// }

// sum(num)

// 문제 1556
// n! 값을 출력한다.(1부터 n까지 모두 곱한 수)
// 입력 : 5
// 출력 : 120

// let num = Number(prompt("수를 입력하세요."));
// let result = 1;

// function fac() {
//     for(i=1; i<=num; i++) {
//         result = result*i;
//     }
//     alert(result)
// }

// fac()

// TODO: 문제 1557 *약수개수 & count++
// n의 약수의 개수를 출력한다.
// 입력 : 8
// 출력 : 4

// let num = Number(prompt("수를 입력하세요."));
// let result = "";
// let count = 0;

// function fac() {
//     for(let i=1; i<=num; i++) {
//         if(num%i==0) {
//             count++
//         }
//     }
//     alert(count)
// }

// fac()

// 문제 1558
// n의 수를 거꾸로 뒤집은 수를 출력한다.
// 입력 : 12305
// 출력 : 50321

// let num = prompt("수를 입력하세요.");
// let result = ""

// function rev() {
//     for(i=4; i>=0; i--) {
//         result = result + num[i]
//     }
//     alert(result)
// }

// rev(num)

// 문제 1559
// 두 정수의 합을 출력한다.
// 입력 : 2147483647 2147483647
// 출력 : 4294967294

// let nums = prompt("수를 입력하세요.").split(" ").map(Number);

// function sum() {
//     alert(nums[0]+nums[1])
// }

// sum()

// 문제 1560
// 두 수의 차이값을 출력한다.
// 입력 : 1 2147483648
// 출력 : 2147483647

// let nums = prompt("수를 입력하세요.").split(" ").map(Number);

// function result() {
//     if(nums[0]<nums[1]) {
//         alert(nums[1]-nums[0]);
//     }
//     else if(nums[0]=nums[1]) {
//         alert(nums[1]-nums[0]);
//     }
//     else if(nums[0]>nums[1]) {
//         alert(nums[0]-nums[1]);
//     }
// }

// result(nums)

// 문제 1561
// 두 수 중 큰 값을 출력한다.
// 입력 : 123 456
// 출력 : 456

// let nums = prompt("수를 입력하세요.").split(" ").map(Number);

// function max() {
//     alert(Math.max(...nums))
// }

// max()

// 문제 1562
// 두 수 중 작은 값을 출력한다.
// 입력 : 123 456
// 출력 : 123

// let nums = prompt("수를 입력하세요.").split(" ").map(Number);

// function min() {
//     alert(Math.min(...nums))
// }

// min()

// TODO: 문제 1563 *compare() : 비교함수
// 세 수 중 중간 값을 출력한다.
// 입력 : 2147483646 2147483647 2147483647
// 출력 : 2147483647

// let nums = prompt("세 수를 입력하세요.").split(" ").map(Number);
// let result1 = 0;

// function mid() {
//   result1 = nums.sort(function compare(a, b) {
//     return a - b;
//   });
//   alert(result1[1]);
// }

// mid();

// 문제 1564 *최대공약수
// 두 수의 최대공약수를 출력한다.
// (최대공약수는 두 수의 공통적인 약수 중에서 가장 큰 약수를 의미한다.)
// 입력 : 160 96
// 출력 : 32

// let nums = prompt("수를 입력하세요.").split(" ").map(Number); // [160, 96]
// let result = "";
// let result2 = "";

// for (i = 1; i <= nums[0]; i++) {
//     if(nums[0]%i==0) {
//         result += i + " " // 1 2 4 5 8 10 16 20 32 40 80 160 (공백)
//     }
// }

// for (i = 1; i <= nums[1]; i++) {
//     if(nums[1]%i==0) {
//         result2 += i + " " // 1 2 3 4 6 8 12 16 24 32 48 96 (공백)
//     }
// }

// let result_1 = result.split(" ").map(Number); //[1,2,4,5,8,10,16,20,32,40,80,160,0]
// let result2_1 = result2.split(" ").map(Number); //[1,2,3,4,6,8,12,16,24,32,48,96,0]
// let result3 = ""

// for(i=0; i<result_1.length-1; i++) {
//     for(j=0; j<result2_1.length-1; j++) {
//         if(result_1[i] == result2_1[j]) {
//             result3 = result3 + result2_1[j] + " "; // 1 2 4 8 16 32 (공백)
//         }
//     }
// }

// let result3_1 = result3.split(" ").map(Number); // [1,2,4,8,16,32,0]
// let final = Math.max(...result3_1)

// alert(final)

// TODO: 문제 1565 *최소공배수
// 두 수의 최소공배수를 출력한다.
// 입력 : 192 72
// 출력 : 576

// let result = 1;

// let nums = prompt("수를 입력하세요.").split(" ").map(Number); 

// while(true){
//   if((result % nums[0] == 0) && (result % nums[1] == 0)){
//     break;
//   }
//   result++;
// }

// alert(result);

// 문제 1566
// a 를 n 번 거듭제곱한 결과를 출력한다.
// 입력 : 2 61
// 출력 : 2305843009213693952

// let nums = prompt("수를 입력하세요.").split(" ").map(Number);
// let result = 1;

// function basic() {
//     for(i=1; i<=nums[1]; i++) {
//         result = result*nums[0]
//     }
//     alert(result)
// }

// basic()

// 문제 1567
// 입력된 데이터 배열(num2부분)의 [a, b] 구간의 부분합을 출력한다.
// 입력 : 5
//        1 5 4 3 2
//        2 4
// 출력 : 12

// let num1 = Number(prompt("데이터의 개수를 입력하세요."));
// let num2 = prompt("데이터를 입력하세요.").split(" ").map(Number);
// let num3 = prompt("찾아야하는 값의 부분을 입력하세요.").split(" ").map(Number);
// let result = 0;

// function part() {
//     for(i=num3[0]-1; i<=num3[1]-1; i++) {
//         result = result + num2[i]
//     }
//     alert(result)
// }

// part()

// TODO: 문제 1568 *다시
// 참고) indexOf 함수는 문자열에서만 가능하다!
// 입력된 데이터 배열의 [a, b] 구간에서 최대값이 처음 나타나는 위치를 출력한다.
// 입력 : 5
//        1 5 4 3 2
//        3 5
// 출력 : 3

// let num1 = Number(prompt("데이터의 개수를 입력하세요."));
// let num2 = prompt("데이터를 입력하세요.").split(" "); //[1, 5, 4, 7, 9]
// let num3 = prompt("값을 입력하세요.").split(" ");
// let a = num3[0] - 1 // 2
// let b = num3[1] - 1 // 4
// let result = ""; // "4 3 2 (공백)"

// function findNum() {
//     for(i=a; i<=b; i++){
//         result = result + num2[i];
//     }
// }

// findNum()

// let result2 = result.split("").map(Number) // [4, 3, 2]
// let result3 = Math.max(...result2) // 4
// let final = 0;

// for(i=0; i<num2.length; i++) {
//     if(num2[i] == result3) {
//         final = i
//         break
//     }
// }

// alert(final + 1)

// let num1 = Number(prompt("데이터의 개수를 입력하세요."));
// let num2 = prompt("데이터를 입력하세요.").split(" "); // [1, 5, 4, 3, 2]
// let num3 = prompt("찾아야하는 값의 부분을 입력하세요.").split(" "); // [3, 5]
// let result = ""; // 4 3 2 (공백)
// let result2 = result.split(" ").map(Number); //[4, 3, 2, (공백)]

// int maxi(int k, int p)
// {
//     int max=d[a];
//     int fin;
//     int i;
//     for (i = a+1; i <= b; i++)
//     {
//         if (max < d[i])
//         {
//             fin =i;
//             max = d[i];
//         }
//         if (max > d[i])
//         {
//             fin = a;
//             max = d[i - 1];
//         }
//         if (max == d[i])
//         {
//             fin = i-1;
//             max = d[i];
//         }
//     }
//     return fin;
// }

// TODO: 문제 1569 *다시
// 입력된 값이 저장된 위치를 출력한다.
// (입력된 값이 저장되어있지 않으면 –1 을 출력한다.)
// 입력 : 5
//        1 3 5 7 9
//        3

// 출력 : 2

// let num1 = prompt("데이터의 개수를 입력하세요.");
// let num2 = prompt("데이터를 입력하세요.").split(" "); //[1,3,5,7,9]
// let num3 = prompt("찾아야하는 값을 입력하세요.");
// let result = -1;

// function findNum() {
//     for(i=0; i<num1; i++){
//         if(num2[i]==num3) {
//             result = i+1
//         }
//     }
//     if(result==-1) {
//         alert(-1)
//     } else {
//         alert(result)
//     }
// }

// findNum()

// 풀이2) *.indexOf() 함수 사용 but 결과 다르게 나와서 x 참고만 하기
// .indexOf() -> 그 값이 배열에 있으면 인덱스 번호 없으면 -1 출력하는 함수

// let num1 = prompt("데이터의 개수를 입력하세요.");
// let num2 = prompt("데이터를 입력하세요.").split(" ").map(Number); //[1,3,5,7,9]
// let num3 = Number(prompt("찾아야하는 값을 입력하세요."));

// function findNum() {
//     let result = num2.indexOf(num3);

//     alert(result)
// }

// findNum()

// 문제 1570
// 입력된 값보다 크거나 같은 값이 저장되어있는 처음 위치를 출력한다.
// (입력된 값이 저장되어있는 모든 값보다 크면 n+1 을 출력한다.)
// 입력 : 5
//        1 3 5 7 9
//        4
// 출력 : 3

// let num1 = Number(prompt("데이터의 개수를 입력하세요."));
// let num2 = prompt("데이터를 입력하세요.").split(" ").map(Number); //[1,3,5,7,9]
// let num3 = Number(prompt("찾아야하는 값을 입력하세요."));
// let result = -1;

// function findNum() {
//     for(i=0; i<num1; i++){
//         if(num2[i]>=num3) {
//             result = i+1
//             break
//         }
//     }
//     if(result==-1) {
//         alert(num1+1) // 모든 값보다 크면 n+1
//     } else {
//         alert(result)
//     }
// }

// findNum()

// 문제 1571
// 입력된 값보다 큰 값이 저장된 처음 위치를 출력한다.
// (입력된 값이 저장되어있는 모든 값보다 크거나 같으면 n+1 값을 출력한다.)
// 입력 : 5
//        1 3 5 7 9
//        4
// 출력 : 3

// let num1 = Number(prompt("데이터의 개수를 입력하세요."));
// let num2 = prompt("데이터를 입력하세요.").split(" ").map(Number); //[1,3,5,7,9]
// let num3 = Number(prompt("값을 입력하세요."));
// let result = -1;

// function findNum() {
//     for(i=0; i<num1; i++){
//         if(num2[i]>num3) {
//             result = i + 1
//             break
//         }
//     }
//     if(result==-1) {
//         alert(num1+1) // 모든 값보다 크면 n+1
//     } else {
//         alert(result)
//     }
// }

// findNum()

// -------------------------------------------------------------------------------------- 위까지는 공동부분

// 문제 1576
//
// 입력 :
// 출력 :

// 문제 1577
//
// 입력 :
// 출력 :

// 문제 1578
//
// 입력 :
// 출력 :

// 문제 1579
//
// 입력 :
// 출력 :

// 문제 1580
//
// 입력 :
// 출력 :

// 문제 1581
//
// 입력 :
// 출력 :

// 문제 1602
//
// 입력 :
// 출력 :

// 문제 1610
//
// 입력 :
// 출력 :

// 문제 1615
//
// 입력 :
// 출력 :

// 문제 1620
//
// 입력 :
// 출력 :
