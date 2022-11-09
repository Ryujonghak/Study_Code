// // 1001
// // printf()를 이용해 다음 단어를 출력하시오: Hello

//     alert("Hello")

// // 1002
// // 출력: Hello World(공백포함, 대소문자에 주의한다.)

//     alert("Hello World")

// // 1003
// // Hello
// // World (두 줄에 걸쳐 줄을 바꿔 출력)

//     alert("Hello"+"\n"+"World")

// // 1004
// // 'Hello' 단어를 출력하시오

//     alert("'Hello'")

// // 1005
// // "Hello World" (단, 큰따옴표도 함께 출력한다.)

//     alert('"Hello"')

// // 1006    
// // "!@#$%^&*()"(단, 큰따옴표도 함께 출력한다.)    

//     alert('"!@#$%^&*( )"')

// // 1007
// // "C:\Download\hello.cpp" (단, 큰따옴표도 함께 출력한다.)

//     alert('"C:\\DOwnload\\hello.cpp"')

// // 1008
// // ┌┬┐
// // ├┼┤
// // └┴┘

//     alert("\u250c\u252c\u2510\n\u251c\u253c\u2524\n\u2514\u2534\u2518");

// // 1010
// // 정수형(int)으로 변수를 선언하고, 변수에 정수값을 저장한 후 변수에 저장되어 있는 값을 그대로 출력

//     let n = Number(prompt("정수를 입력하세요"));
//     alert(n);

//     let n1 = 3
//     console.log(n1)

// // 1011
// // 문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후 변수에 저장되어 있는 문자를 그대로 출력

//     let char = String(prompt("문자를 입력하세요"));
//     alert(char);

//     let char1 = 코딩
//     console.log(char1)
    
// // 1012
// // 실수형(float)로 변수를 선언하고 그 변수에 실수값을 저장한 후 저장되어 있는 실수값을 출력

//    let float = prompt("실수를 입력하세요");
//    alert(float);

//     let float1 = 12.3
//     console.log(float1);

// // 1013
// // 2개의 정수가 공백으로 구분되어 입력되면 그대로 출력

//     let int = prompt("정수 2개를 공백을 두고 입력하세요")
//     let result = int.split(" "); 
//     alert(result[0]+" "+result[1]);

// // 1014
// //2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력(공백으로 구분)

//     let char = prompt("문자 2개를 공백을 두고 입력하세요")
//     let result = char.split(" "); 
//     alert(result[1]+" "+result[0]);

// // *1015
// // 실수(float)1개를 입력받아 소수점 셋째 자리에서 반올림하여 둘째 자리까지 출력
// // const : 상수(변하지 않는 값)을 선언할 때 사용
// // toFixed(2)_소숫점자르기 => 소숫점 셋째자리 반올림하여 (둘째)자리 까지만 출력

//     let float = Number(prompt("실수를 입력하세요"));
//     document.write("입력값 : " + float + "      출력값 : " + float.toFixed(2))

// // 1017
// // 정수 1개를 입력받아 공백을 사이에 두고 3번 출력

//     let num = Number(prompt("정수를 입력하세요"))
//     alert(num+" "+num+" "+num)

// //1018
// // 시(hour)와 분(minute)이 ":" 으로 구분되어 입력
// // 입력받은 시간을 "시:분" 형식으로 출력(그대로출력)

//     let clock = prompt("시와 분을 입력하세요(00:00)").split(":")
//     alert(clock[0]+"시 : "+clock[1]+"분")

// //1019
// //입력: 2013.8.5
// //출력: 2013.08.05
// //조잡한데..?

//     let date = prompt("날짜를 입력하세요 0000.0.0").split(".")
//     alert(date[0]+".0"+date[1]+".0"+date[2])

// // 1020
// // 주민번호 앞 6자리와 뒷 7자리가 '-'로 구분되어 입력
// // 주민번호 13자리를 모두 붙여 출력

//     let num = prompt("주민번호를 입력하세요 111111-1111111")
//     let result1 = num.split("-")
//     alert(result1[0]+result1[1])

// // 1021
// // 입력받은거 그대로 출력하기

//     let word = prompt("단어를 입력하세요")
//     alert(word)

// // 1022
// // 공백 문자가 포함되어 있는 문장을 입력받고 그대로 출력

//     let word = prompt("문장을 입력하세요")
//      alert(word)

// // 1023
// // 실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력

//     let num = prompt("실수를 입력하세요").split(".")
//     let a = num[0]
//     let b = num[1]
//     document.write(a+"<br>"+b)

//* 줄띄우기, ''묶기 안함
// // 1024
// // 단어의 문자(영어)를 하나씩 나누어 한 줄에 한 개씩 ' '로 묶어서 출력

//     let eng = prompt("영단어를 입력하세요").split("")
//     let a = []
//     document.write(eng)

// // 1025
// // 다섯자리 수 입력받아 각 자리의 숫자를 분리해 한 줄에 하나씩 [ ]속에 넣어 출력

//     let inp = prompt("다섯자리 숫자를 입력해주세요");
//     let 만 = "[" + inp[0] +"0000"+ "]" +"\n";
//     let 천 = "["+ inp[1] +"000" + "]"+"\n";
//     let 백 = "["+ inp[2] +"00" + "]"+ "\n";
//     let 십 = "["+ inp[3] +"0" + "]"+"\n";
//     let 일 = "["+ inp[4] + "]"+"\n";
//     alert(만+천+백+십+일);

// // 1026
// // 입력되는 시:분:초 에서 분만 출력

//     let time = prompt("시간을 입력하세요. (00:00:00)");
//     let result = time.split(":");
//     alert(result[1]);

// // 1027
// // 년월일이 '.'(닷)으로 구분되어 입력되면 일월년으로 바꾸어 '-'(대쉬, 마이너스)로 구분해 출력

//     let year = prompt("년.월.일을 입력하세요. (0000.00.00)");
//     let result = year.split(".");
//     alert(result[2]+"-"+result[1]+"-"+result[0]);

// // 1028, 1029, 1030
// // 입력된 정수를 그대로 출력

//     let num = prompt("정수를 입력하세요")
//     document.write(num)

// // 1031
// // 10진수를 입력받아 8진수(octal)로 출력
// // .toString(진수)
// // 입력받은 숫자 타입의 값은 문자열로 되어 있어 산술 연산을 적용할 수가 없음
// // 그러므로 형 변환(Type Casting)이 필요하며 이 때 parseInt()사용
// // 소수를 가진 문자열을 처리하기 위해서는 parseFloat() 함수를 이용
// // parsInt('string', radix): n진수에서 10진수로 변환할 때
// // let decimal = parseInt(num, 2) (num, 8) (num, 16) 2진수-10진수, 8진수-10, 16-10
// // n진수를 parseInt 함수를 이용해 10진수로 변환 후, toString 함수를 이용해 n진수로 변환
// // let octal = parseInt(num, 16).toString(8); 16진수(hex)를 8진수(octal)로

//     let num = prompt("정수를 입력하세요")
//     let result = parseInt(num).toString(8)
//     document.write(result);

// // 1032
// // 10진수를 입력받아 16진수(hexadecimal)로 출력

//     let num1 = prompt("정수를 입력하세요")
//     let hex = parseInt(num1, 10).toString(16)
//     document.write(hex);

// // 1033
// // 10진수를 입력받아 16진수(hexadecimal)로 출력(대문자)
// // .toUpperCase()

//      let num1 = prompt("정수를 입력하세요")
//      let hex = parseInt(num1, 10).toString(16).toUpperCase()
//      document.write(hex);

//                 // function decToHex(num){
//                 //     return num.toString(16).toUpperCase()
//                 // }
//                 // document.write(decToHex(255));

// // 1034
// // 8진수로 입력된 정수 1개를 10진수로 바꾸어 출력

//      let num = prompt("8진수 정수를 입력하세요")
//      let int = parseInt(num, 8).toString(10)
//      document.write(int);

// // 1035
// // 16진수로 입력된 정수 1개를 8진수로 바꾸어 출력

//      let num1 = prompt("16진수 정수를 입력하세요")
//      let octal = parseInt(num1, 16).toString(8)
//      alert(octal);

// // 1036
// // 영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력
// // .charCodeAt()

//     let eng = prompt("알파벳 하나를 입력하세요")
//     let num = eng.charCodeAt();
//     alert(num);

// // 1037
// // 10진 정수 1개를 입력받아 아스키 문자로 출력(0 ~ 255 범위의 정수만 입력)
// // String.fromCharCode()

//     let num = prompt("정수 하나를 입력하세요")
//     let eng = String.fromCharCode(num)
//     alert(eng);

// // 1038, 1039
// // 2개의 정수가 공백으로 구분되어 입력, 합을 출력
// // 문자열로 받으니까 숫자로 변경해줘야함(Number)
    
//     let num = prompt("정수 두 개를 입력하세요(공백으로 구분)").split(" ")
//     let a = Number(num[0]);
//     let b = Number(num[1]);
//     document.write(a+b)
    
// // 1040
// // 입력된 정수의 부호를 바꿔 출력

//     let num = prompt("정수를 입력하세요")
//     document.write(-num)

// // 1041
// // 영문자 1개를 입력받아 그 다음 문자를 출력
// // 아스키 코드 이용

//      let eng = prompt("알파벳 하나를 입력하세요")
//      let next = eng.charCodeAt()
//      let result = next+1
//      document.write(String.fromCharCode(result));

// // 1042
// // 정수 2개(a, b) 를 입력받아 a를 b로 나눈 몫을 출력
// // Math.floor() 소수점 이하 버림

//     let num = prompt("정수 두 개를 입력하세요(공백으로 구분)").split(" ");
//         let a = num[0]
//         let b = num[1] 
//         alert(Math.floor(a/b))

// // 1043
// // 정수 2개(a, b) 를 입력받아 a를 b로 나눈 나머지를 출력

//     let num = prompt("정수 두 개를 입력하세요(공백으로 구분)").split(" ");
//         let a = num[0]
//         let b = num[1] 
//         alert(a%b)

// // 1044
// // 정수를 1개 입력받아 1만큼 더해 출력

//     let num = Number(prompt("정수를 입력하세요"))
//         alert(num+1)

// // 1045
// // 정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값(셋째자리에서 반올림) 출력(줄띄우기)
  
//     let num = prompt("정수 두 개를 입력하세요(공백으로 구분)").split(" ");
//     let 합 = Number(num[0]) + Number(num[1])
//     let 차 = Number(num[0]) - Number(num[1])
//     let 곱 = Number(num[0]) * Number(num[1])
//     let 몫 = Math.floor(Number(num[0]) / Number(num[1]))
//     let 나머지 = Number(num[0]) % Number(num[1])
//     let 나눈값 = (Number(num[0]) / Number(num[1])).toFixed(2)

//     document.write("합 :"+합+"\n"+"차 : "+차 +"\n"+"곱 :"+곱+"\n"+"몫 :"+몫+"\n"+"나머지 :"+나머지+"\n"+"나눈값 :"+나눈값)

// // 1046
// // 정수 3개를 입력받아 합과 평균 출력

//     let num = prompt("정수 세 개를 입력하세요(공백으로 구분)").split(" ");
//     let sum = Number(num[0]) +Number(num[1]) +Number(num[2])
//     let avg = (Number(num[0]) +Number(num[1]) +Number(num[2]))/3
//     alert("합 : "+sum+"\n"+"평균 : "+avg)

// // 1047
// // 정수 1개를 입력받아 2배 곱해 출력

//     let num = Number(prompt("정수 하나를 입력하세요"));
//     alert(num*2)

// //* 1048
// // 정수 2개(a, b)를 입력받아 a를 2의 b배 곱한 값으로 출력 (0 <= a <= 10, 0 <= b <= 10)

//     let num2 = prompt("정수 두 개를 입력하세요(공백으로 구분)").split(" ");
//     let a = num[0]
//     let b = num[1] 
//     alert()
    

// // 1049
// // 두 정수(a, b)를 입력받아 a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력

//     let num = prompt("정수 두 개를 입력하세요(공백으로 구분)").split(" ");
//     let a = num[0]
//     let b = num[1] 
//     if(a>b){
//         alert("1");
//     } else if(a<=b){
//         alert("0")
//     }

// // 1050
// //두 정수(a, b)를 입력받아 a와 b가 같으면 1을, 같지 않으면 0을 출력

//     let num = prompt("정수 두 개를 입력하세요(공백으로 구분)").split(" ");
//     let a = num[0]
//     let b = num[1] 
//     if(a==b){
//         alert("1");
//     } else if(a!==b){
//         alert("0")
//     }        

// // 1051
// // 두 정수(a, b)를 입력받아 b가 a보다 크거나 같으면 1을, 그렇지 않으면 0을 출력

//     let num = prompt("정수 두 개를 입력하세요(공백으로 구분)").split(" ");
//     let a = num[0]
//     let b = num[1] 
//     if(b>=a){
//         alert("1");
//     } else alert("0")

// //1052
// // 두 정수(a, b)를 입력받아 a와 b가 서로 다르면 1을, 그렇지 않으면 0을 출력

//     let num = prompt("정수 두 개를 입력하세요(공백으로 구분)").split(" ");
//     let a = num[0]
//     let b = num[1] 
//     if(b!=a){
//         alert("1");
//     } else alert("0")

// // 1053
// // 1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때 반대로 출력

//     let num = prompt("0과 1 중 하나를 입력하세요")
//     if(num==0){
//         alert("1");
//     } else if(num==1){
//         alert("0");
//     } else alert("0과 1만 입력하세요")
    

// // 1055
// // 1 또는 0의 2개의 정수가 공백을 두고 입력 1이 하나라도 들어갈 경우 1을, 그 외 0 출력

//     let num = prompt("1과 0 중에서 두 개를 입력하세요(공백으로 구분)").split(" ");
//     let a = num[0]
//     let b = num[1] 
//     if(a==1 || b==1){
//         alert("1");
//     } else alert("0")

// // 1056
// // 1 또는 0의 2개의 정수를 입력, 입력값이 서로 다를 경우 1, 그 외 0 출력

//     let num = prompt("1과 0 중에서 두 개를 입력하세요(공백으로 구분)").split(" ");
//     let a = num[0]
//     let b = num[1] 
//     if(a!==b){
//         alert("1");
//     } else alert("0")

// // 1057
// // 두 개의 참(1) 또는 거짓(0)이 입력될 때, 참/거짓이 서로 같을 때에만 1 출력

//     let num = prompt("1과 0 중에서 두 개를 입력하세요(공백으로 구분)").split(" ");
//     let a = num[0]
//     let b = num[1] 
//     if(a==b){
//         alert("1");
//     } else alert("0");

// // 1058 
// //두 개의 참(1) 또는 거짓(0)이 입력될 때, 모두 거짓일 때(둘 다 0)에만 1 출력, 그 외 0출력

//     let num = prompt("1과 0 중에서 두 개를 입력하세요(공백으로 구분)").split(" ");
//     let a = num[0]
//     let b = num[1] 
//     if(a,b==0){
//         alert("1");
//     } else alert("0");

// 1059~1062 비트 pass

// // 1063
// // 두 정수가 공백을 두고 입력 (-2147483648 ~ +2147483647) 두 정수 중 큰 값을 10진수로 출력
// split 쓸 때 Number(prompt(""))로 감싸니까 작동 안함

//     let num = prompt("정수 두 개를 입력하세요(공백으로 구분)").split(" ")
//     let a = num[0];
//     let b = num[1];
    
//     if(a>b){
//         alert(a)
//     } else if(a<b){
//         alert(b)
//     } else alert("두 정수가 같습니다")

// // 1064
// // 입력된 세 정수 a, b, c 중 가장 작은 값을 출력

//     let [a, b, c] = prompt("정수 3개를 입력하세요(공백으로 구분)").split(" ")
//     alert(Math.min(a,b,c))

// // 1065
// // 세 정수 a, b, c가 입력되었을 때, 짝수만 출력

//     let num = prompt("정수 3개를 입력하세요(공백으로 구분)").split(" ")
//     let a = num[0]
//     let b = num[1]
//     let c = num[2]
//     let result = ""

//     for( let i = 0; i<num.length; i++){
//         if(num[i]%2==0){
//             result = result + num[i] + "\n"
//         }
//     }
//     alert(result)

// // 1066
// // 세 정수 a, b, c가 입력되었을 때, 줄바꿔 짝(even)/홀(odd) 출력

//     let num = prompt("정수 3개를 입력하세요(공백으로 구분)").split(" ")
//     // let a = num[0]
//     // let b = num[1]
//     // let c = num[2]
//     let result = ''
//         for(let i = 0; i<num.length; i++){
//             if(num[i]%2==0){
//                 result= result + "even"+"\n"
//             }else {
//                 result= result + "odd"+"\n"
//             }
//         }
//         alert(result)

// // 1067
// // 정수 1개가 입력되었을 때, 첫 줄에 음(minus)/양(plus)과 둘째줄에 짝(even)/홀(odd)을 출력

//     let num = prompt("정수 1개를 입력하세요");
//     let result = ""
//     let result2 = ""
//     if(num>=0){
//         result = result + "plus" + "\n"
//     } else result = result + "minus" + "\n"
    
//     if(num%2==0){
//         result = result +"even"
//     } else result = result + "odd" + "\n"
//     alert(result + "\n" + result2)

// // 1068
// // 점수를 입력받으면 평가기준에 따라 등급을 출력
// // 90 ~ 100 : A
// // 70 ~   89 : B
// // 40 ~   69 : C
// //  0 ~   39 : D

//     let score = prompt("점수를 입력하세요")
//     if(score>=0 && score<=39){
//         alert("D")
//     } else if(score>=40 && score<=69){
//         alert("C")
//     } else if(score>=70 && score<=89){
//         alert("B")
//     } else if(score>=90 && score<=100){
//         alert("A")
//     }

// // 1069
// // 등급에 따라 내용을 출력
// // A : best!!!, B : good!!, C : run!, D : slowly~, 나머지 문자들 : what?

//     let grade = prompt("학점 등급을 입력하세요")
//     if(grade=="A"||grade=="a"){
//         alert("best!!!")
//     } else if(grade=="B"||grade=="b"){
//         alert("good!!")
//     } else if(grade=="C"||grade=="c"){
//         alert("run!")
//     } else if(grade=="D"||grade=="d"){
//         alert("slowly~")
//     } else alert("what?")

// // 1070
// // 월이 입력되면 계절을 출력
// // 12, 1, 2 : winter/ 3, 4, 5 : spring/ 6, 7, 8 : summer/ 9, 10, 11 : fall

//     let season = Number(prompt("월을 입력하세요"))
//     if(season==1 || season==2 || season==12){
//         alert("winter")
//     } else if(3<=season && season<6){
//         alert("spring")
//     } else if(6<=season && season<9){
//         alert("summer")
//     } else if(9<=season && season<12){
//         alert("fall")
//     }

//*모르겠음
// // *1071
// // 정수 여러개 입력받고, 입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 종료.(0은 출력하지 않음)
// // split으로 쪼갠걸 어떻게 불러와서 비교하는지 모르겠다. break도 언제 넣는걸까

    //  while(true){
    //      let num = Number(prompt("정수를 여러 개 입력하세요(공백으로 구분)").split(" "))
    //      let arr = [i]
    //      if(arr==0){
    //         break;
    //      } result = result +num[i] + "\n"
    //      alert(result)
    //     }    
     
//*모르겠음
// // 1072
// // n개의 정수를 한 개씩 줄을 바꿔 출력한다.

//     let num = prompt("정수를 입력하세요").split
//     let result = ""
//     for(let i=0; i<num.length; i++){
//         result = result + "\n"
//     } alert(result)

// // 1073
// // 0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단

//     let num = 0;
    
//     while(true){
//         let num = Number(prompt("정수를 입력하세요"))
        
//         if(num==0){
//             alert("중단합니다.")
//             break;
//         } else {document.write(num +"<br>")}
//     }

// //1074, 1075
// //정수(1 ~ 100) 1개가 입력되었을 때 카운트다운으로 출력

//     let num2 = prompt("정수를 입력하세요")
//     let result2=''
    
//     for(let i=num2; 0<i; i--){
//         if(i==0){
//             break;
//         }
//         result2=result2+"\n"+i
//     }   alert(result2)

// // *1076
// // a부터 입력한 문자까지 순서대로 공백을 두고 출력
// //문자-> 아스키코드
// //"a".charCodeAt(0)
// //a:97(초기값)
// //z:122(종료값)

//     let result = '';
//     let eng = prompt("알파벳 하나를 입력하세요")
//     let num = eng.charCodeAt();
//     //alert(num);

//     for(let i= 97; i<=num; i++) {
//     result += " "+ String.fromCharCode(i);
//     }
//     alert(result);

// // 1077
// // 정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 줄바꿔 출력

//     result=""
//     let num = Number(prompt("정수 하나를 입력하세요(0 ~ 100)"))
//     for(let i=0; i<=num; i++){
//         result=result+"\n"+i
//     }
//     alert(result)

// // 1078
// // 정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.

//     let num = Number(prompt("정수 하나를 입력하세요(1~100"))
//     let sum = 0;
//     for(let i=1; i<=num; i++){
//         if(num%2==0)
//         sum+=i;
//     }alert(sum)

// // *1079
// // q가 입력될 때까지 입력된 문자를 줄을 바꿔 한 줄씩 출력한다.
// // boolean에서 true=1.  while(1) = while(true)
// // let a = 0
// // while(조건식){
// //  조건문
// //  (조건 충족시) i++ (실행문   )
// //  출력 (document.write())
// // }
   
//     while(true){
//         let char = prompt("알파벳 하나를 입력하세요(q를 누르면 종료)")
//         if(char=="q"){
//             break;
//         }
//         else{ document.write(char+"<br>")
//             //alert(char) 로 하면 입력받는거 바로바로 뜨고 break때는 안뜸
//         }
//     }

// // 1080
// // 1, 2, 3 ... 을 계속 더해 나갈 때,그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지 계속 더하는 프로그램
// // 즉, 1부터 n까지 정수를 계속 더한다고 할 때, 어디까지 더해야 입력한 수보다 같거나 커지는지 알아보고자 하는 문제

//     let int = Number(prompt("정수를 입력하세요"))
//     let sum = 0
//     for(let i=1; i<int; i++){
//         sum += i;
//         if(sum>=int){
//             alert(i);
//             break;
//         }
//     }

// // 1081
// // 1부터 n까지, 1부터 m까지 숫자가 적힌 서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력
// // 숫자 2개 받아서 나올 수 있는 모든 경우의 수 조합 (1~10), (1~10)

//     let num = prompt("정수 2개를 공백을 두고 입력하세요").split(" ")
//     let n = num[0]
//     let m = num[1]
//     for(let i=1; i<=n; i++){
//         for(let j=1; j<=m; j++){
//             document.write(i, " " ,j+"<br>")
//         }
//     } document.write(i, " ", j)
        
// // 1082
// // 입력된 16진수에 1~F까지 순서대로 곱한, 16진수 구구단을 줄을 바꿔 출력. 계산 결과도 16진수로 출력
// // i<=15는 16진수라 그런가
        
//         let num = prompt("16진수로 한 자리 수를 입력하세요(A ~ F 까지)")
//         let num16 = num.toString(16) // 입력받은 문자열, 16진수로 바꾸기       
//         let change = parseInt(num16, 16).toString(10)  // 입력받은 16진수를 10진수로 바꾸기
//         let result = ""
//         for(let i=1; i<=15; i++){
//             result=result+num +"*" +i.toString(16) + "="+(i*change).toString(16)+"\n"
//             }   alert(result)     

// // 1083
// // 10 보다 작은 정수 1개가 입력되면, 1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데,
// // 3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X 를 출력

//     let num2 = prompt("1~9까지의 수 하나를 입력하세요")
//     let result = ""
//     for(let i=1; i<=num2; i++){
//        if(i==3 || i==6 || i==9){
//         document.write("X" + "\n")
//        }
//        else document.write(i + "\n")
//     }

// // 1084
// // 빨녹파(r, g, b) 빛의 강약에 따른 가짓수(0 ~ 128))가 공백을 사이에 두고 입력. 
// // 만들 수 있는 rgb 색의 정보를 오름차순 줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력
// // 3 3 3 은 각 색깔 빛에 대해서 그 강약에 따라 0~2까지 3가지의 색이 있음을 의미함

//     let rgb = prompt("r g b에 해당하는 숫자 3개를 입력하세요. (0~128, 공백으로 구분)").split(" ")
//     let r = Number(rgb[0])
//     let g = Number(rgb[1])
//     let b = Number(rgb[2])
//     let result = ""

//     for(let i=0; i<r; i++){
//         for(let j=0; j<g; j++){
//             for(let k=0; k<b; k++){
//                 result = result + i + j + k + "\n"
//             }
//         }
//     }alert(result)

// // 1085
// // h, b, c, s 가 공백을 두고 입력(h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수)
// // MB 단위로 바꾸어 출력(단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력)

//     let [h, b, c, s] = prompt("h, b, c, s를 공백을 두고 입력하세요").split(" ")
//     let MB = (h*b*c*s)/(1024*1024*8)
//     alert(MB.toFixed(1)+" MB")

// // 1086
// // w, h, b 입력받아 MB 단위로 바꾸어 소수점 셋째 자리에서 반올림해 둘째 자리까지 출력

//     let [w, h, b] = prompt("w, h, b를 공백을 두고 입력하세요").split(" ")
//     let bit = w*h*b
//     let byte = bit/(1024*1024*8)
//     alert(byte.toFixed(2) + "MB")

// // 1087
// // 입력받은 수를 1부터 순서대로 계속 더해가다가, 그 합이 입력된 정수보다 커지거나 같아지는 경우, 그때까지의 합을 출력
// // 누적합이니까 let result=0

//     let result=0
//     let num = Number(prompt("정수를 입력하세요"))
//     for(let i=1; i<num; i++){
//         result += i
//         if(result>=num){
//             alert(result)
//             break;
//         }
//     }
 
// // 1088
// // 1부터 입력한 정수까지 1씩 증가시켜 출력하는데 3의 배수는 출력x
// // break;하면 출력 안됨   

//     let result = ""
//     let num = Number(prompt("정수를 입력하세요"))
//     for(let i=1; i<=num; i++){
//         if(i%3 == 0){
//             continue;
//         } result = result + i +"\n"
//     } document.write(result)

// // 1089
// // 시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가 공백을 두고 입력, n번째 수 출력
   
//     let result = 0
//     let num = prompt("시작 값, 등차 값, 몇번째 수인지 공백을 두고 입력하세요").split(" ")
//     let a = Number(num[0])
//     let d = Number(num[1])
//     let n = Number(num[2])

//     for(let i=a; i<=n; i++){
//         result = a+d*(n-1)
//     }alert(result)
    

// 1090
// 시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가 공백을 두고 입력, n번째 수를 출력

    // let num1 = prompt("시작 값, 등비 값, 몇번째 수인지 공백을 두고 입력하세요").split(" ")
    // let a1 = Number(num1[0])
    // let r1 = Number(num1[1])
    // let n1 = Number(num1[2])
    // let result1 = a1*r1;
    // for(let i=2; i<n1; i++){
    //     result1 = result1*r1
    // }alert(result1)

// // 1091
// // 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째인지를 나타내는 정수(n)가 공백을 두고 입력된다. 수열 규칙 찾아서 n번째 수를 출력
// // 입력: 1 -2 1 8
// // 출력: -85
// // (a*m) + d
// // 몇 번째인지 이니까 연산은 n-1번 해야함

//     let num = prompt("시작 값(a), 곱할 값(m), 더할 값(d)을 입력하세요 (공백으로 구분)").split(" ")
//     let a = Number((num[0]))
//     let m = Number((num[1]))
//     let d = Number((num[2]))
//     let n = Number((num[3]))
//     let result = a
   
//     for(let i=1; i<=n-1; i++){
//         result = (result*m)+d
//     }alert(result)

// // 1092
// // 3명이 다시 만나 문제를 푸는 날 (3 7 9  의 최소공배수), 100이하의 자연수
// // split 이랑 쓸 때 Number를 앞이 아닌 뒤에 쓰니까 됨

//     let num = prompt("3명이 오는 주기를 공백을 두고 입력하세요").split(" ").map(Number)
//     let a = num[0]
//     let b = num[1]
//     let c = num[2]
//     for(let i=1; i<=100; i++){
//         if(i%a==0 && i%b==0 && i%c==0){
//             result = i;
//             break;
//         }
//     }alert(result)


// // 1093
// // 출석 번호를 n번 무작위로 불렀을 때, 각 번호(1 ~ 23)가 불린 횟수를 각각 출력
// // split은 문자열 나누는거라 prompt Number로 바꾸면 안됨

//     let num = Number(prompt("출석번호를 부른 횟수를 입력하세요"));
//     let nums = prompt("랜덤번호 n개를 공백을 두고 입력하세요").split(" ");
//     let result = new Array(24);  //번호들 배열(1~23번)
    
//     for(let i=0; i<result.length; i++){
//         result[i] = 0; // 초기화
//     } 
//     for(let i=0; i<num; i++){
//         result[nums[i]-1] += 1; // 번호 누적
//     } alert(result)


// // 1094
// // 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력, n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력
// // 출석을 부른 번호 순서를 바꾸어 공백을 두고 출력
// // 입력) 10
// //       10 4 2 3 6 6 7 9 8 5
// // 출력) 5 8 9 7 6 6 3 2 4 10

//     let num = Number(prompt("출석번호를 부른 횟수를 입력하세요"))
//     let nums = (prompt("랜덤번호 n개를 공백을 두고 입력하세요")).split(" ")
//     let renums = nums.reverse()
//     let result = ""

//     for(let i=0; i<num; i++){
//         result = result + renums[i] + " "
//     }alert(result)

// // 1095
// // 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력, n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력
// // 출석을 부른 번호 중에 가장 빠른 번호를 1개만 출력
// // 입력) 10
// //       10 4 2 3 6 6 7 9 8 5
// // 출력) 2

//     let num = Number(prompt("출석번호를 부른 횟수를 입력하세요"))
//     let nums = (prompt("랜덤번호 n개를 공백을 두고 입력하세요")).split(" ")
//     alert(Math.min(...nums))



//todo 코드업) https://codeup.kr/problemsetsol.php?psid=23

