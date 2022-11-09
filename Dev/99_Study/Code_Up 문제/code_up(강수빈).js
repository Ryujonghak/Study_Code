// 1057번

// let inp= Number(prompt("정수를 입력하세요"));
// let num= Number(prompt("정수를 입력하세요"));

// alert(Math.min(inp,num));

// let inp=prompt("정수를 입력하세요").split('');

// alert(Math.min(inp));

// 1285번

// let inp=prompt('');

// alert(eval(inp));

// 1201번

// let inp=Number(prompt("정수를 입력하세요"));

// if (inp>0){
//     alert("양수")
// }
// else if(inp<0){
//     alert("음수")
// }
// else if(inp == 0){
//     alert("0")
// };

//1207번

// let inp=prompt("0 또는 1을 입력하세요").split(' ');
// let num=0;
// for(let i=0; i<inp.length; i++){

//     num += Number(inp[i]);
// }

// if (num == 1){
//     alert("도")
// }
// else if (num == 2){
//     alert("개")
// }
// else if (num == 3){
//     alert("걸")
// }
// else if (num == 4){
//     alert("윷")
// }

//1224번

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));
// let c=Number(prompt("정수를 입력하세요"));
// let d=Number(prompt("정수를 입력하세요"));

// if(a/b > c/d){
//     alert(">")
// }
// else if(a/b == c/d){
//     alert("=")
// }
// else if(a/b < c/d){
//     alert("<");
// }





//개인 공통

//1110번

// let a=Number(prompt("정수를 입력하세요"));
// alert(a);

// //1111번

// let a=Number(prompt("정수를 입력하세요"));
// alert(a+"%");

//1112번

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// alert(a) , alert(b);

//1113번
// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// alert(b) , alert(a);

//1114번

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// alert(a+b);

//1115번
// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// alert(a+b);

//1116번

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// alert("a+b="+(a+b)+"\n"+"a-b="+(a-b)+"\n"+"a*b="+(a*b)+"\n"+"a/b="+(a/b));

//1117번

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// let num= (a*b).toFixed(2);
// alert(num);

//1118번
// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// let num= ((a*b)/2).toFixed(1);
// alert(num);

//1119번
// let a=Number(prompt("정수를 입력하세요"));

// alert(a*24);

//1120번
// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));
// let c=Number(prompt("정수를 입력하세요"));

// let avg=((a+b+c)/3).toFixed(2);
// alert(avg)

//1121번
// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// alert(a%b);

//1122번

// let a=Number(prompt("정수를 입력하세요"));

// alert((a/60).toFixed(0) +"\n"+  a%60);

//1123번

// let a=Number(prompt("정수를 입력하세요"));

// let num= 9 / 5 * a+ 32
// alert(num.toFixed(3));

//1125번

// var decimal = Number(prompt("정수를 입력하세요"));
// var octal = decimal.toString(8);
// var hex = decimal.toString(16);

// alert(octal+"\n"+hex);

//1131번

// let inp=prompt("문자를 입력하세요");
// alert(inp);

//1132번

// let inp=prompt("문자를 입력하세요");
// alert(inp);

//1133번
// let inp=prompt("문자를 입력하세요");
// alert(inp);

//1135번

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// if(a>=b){
//     alert("1")
// }
// else{alert("0")}

//1136
// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// if(a=b){
//     alert("1")
// }
// else{alert("0")}

//1137

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// if(a!=b){
//     alert("1")
// }
// else{alert("0")}

//1138
// let a=Number(prompt("0또는 1을 입력하세요"));

// if(a != 0){
//     alert("1");
// }
// else if (a != 1){
//     alert("0");
// }

//1139

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// if(a ==1 && b ==1){
//     alert("1");
// }
// else{alert("0");}

//1140

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// if(a ==1 || b ==1){
//     alert("1");
// }
// else{alert("0");}

//1149

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// if(a>b){
//     alert(a)
// }
// else if(a<b){
//     alert(b);
// }

//1150

// let a=prompt("정수를 입력하세요").split(' ');

// alert(Math.min(...a));

//1151

// let a=Number(prompt("정수를 입력하세요"));

// if(a <=10){
//     alert("small")
// }

//1152

// let a=Number(prompt("정수를 입력하세요"));

// if(a <10){
//     alert("small")
// }
// else if(a >=10){
//     alert("big")
// }

//1153
// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// if(a>b){
//     alert(">")
// }
// else if(a<b){
//     alert("<")
// }
// else if(a=b){
//     alert("=")
// }

//1154
// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// if(a>b){
//     alert(a-b)
// }
// else if(b>a){
//     alert(b-a)
// }

//1155
// let a=Number(prompt("정수를 입력하세요"));

// if( a % 7==0){
//     alert("multiple")
// }
// else{alert("not multiple")}

//1156

// let a=Number(prompt("정수를 입력하세요"));

// if(a % 2 ==0){
//     alert("even")
// }
// else if(a % 2 ==1){
//     alert("odd")
// }

//1157

// let a=Number(prompt("정수를 입력하세요"));

// if(a>=50 && a<=60){
//     alert("win")
// }
// else{alert("lose")}

//1158

// let a=Number(prompt("정수를 입력하세요"));

// if(a>=30 && a<=40 || a>=60 && a<=70){
//     alert("win")
// }
// else{alert("lose")}

//1159

// let a=Number(prompt("정수를 입력하세요"));

// if( a>=50 && a<=70 || a % 6 ==0){
//     alert("win")
// }
// else{alert("lose")}

//1160

// let a=Number(prompt("정수를 입력하세요"));

// if(a == 1 || a== 3 || a == 5 || a== 7 ){
//     alert("oh my god");
// }
// else{ alert("enjoy");}

//1161

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// if(a % 2 == 1){
//     alert("홀수");
// }
// else if(a % 2 == 0){
//     alert("짝수 +");

//     if( b % 2 == 1){
//         alert("홀수");
//      if(a+b % 2 == 0)
//         alert("짝수")}
//     else if ( b % 2 == 0){
//         alert("짝수 =");

//      if(a+b % 2 == 1){
//         alert("홀수");
//      }
//     }

//  }

//1162

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));
// let c=Number(prompt("정수를 입력하세요"));

// if(((a-b)+c) % 10 == 0){
//     alert("대박")
// }
// else{ alert("그럭저럭");}

//1163

/* let a=Number(prompt("정수를 입력하세요"));
let b=Number(prompt("정수를 입력하세요"));
let c=Number(prompt("정수를 입력하세요"));

let num = (a+b+c).toString();


if(num[1] % 2 == 0){
    alert("대박");
}
else{alert("그럭저럭");}
 */

//1164

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));
// let c=Number(prompt("정수를 입력하세요"));

// if(a <= 170 || b<= 170 || c <= 170){
//     alert("CRASH");
// }
// else{alert("PASS");}

//TODO 1165

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// if( a <= 90){

//     a += 5
//     b += 1

//     if( a <= 90){
//         a += 5
//         b += 1

//         if( a <= 90){
//             a +=5
//             b +=1
//             if( a <= 90){
//                 a +=5
//                 b +=1
//                 if( a <= 90){
//                     a +=5
//                     b +=1
//                 }else{ alert(b)};

//             }else{ alert(b)};

//         }else{ alert(b)};

//     }else{ alert(b)};

// }else{ alert(b)};

//1166

// let a=Number(prompt("정수를 입력하세요"));

// if(a % 400 == 0 || a % 4 == 0 && a % 100 !=0 ){
//     alert("LEAP");
// }
// else{ alert("Normal");}

//1167

// let a=prompt("정수를 입력하세요").split(' ');

// a.sort();

// alert(a[1]);

//TODO 1168

//TODO 1169

//1170

// let a=prompt("정수를 입력하세요").split(' ');

// if(a[2]<10){
//     a[2]="0"+a[2];
// }

// alert(a);

//1171

// let a=prompt("정수를 입력하세요").split(' ');

// if(a[2]<999 && a[1]<10){
//     a[2]="0"+a[2]
//     a[1]="0"+a[1];
// }

// alert(a);

//1172

// let a=prompt("정수를 입력하세요").split(' ');

// a.sort();

// alert(a);

//1173

// let a=prompt("정수를 입력하세요").split(' ');

// if(a[1] < 30){
//     a[0] = a[0]-1;
//     a[1] = (a[1]-30)+60;
// }
// else{a[1] = a[1]-30;}

// alert(a);

//1251

// let result="";

// for(let i=1; i<=100; i++){
//     result +=i+" ";
// }

// alert(result);

//1252

// let a=Number(prompt("정수를 입력하세요"));

// let result="";

// for(let i=1; i<=a; i++){

//     result +=i+" ";
// }

// alert(result);

//1253

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// let result="";

// if(a>b){
//     for(let i=b; i<=a; i++){

//         result += i+"";
//     }
// }else{
//     for (i=a; i<=b; i++)

//     result += i+"";
// }

// alert(result);

//1254

// let a=prompt("정수를 입력하세요").charCodeAt();
// let b=prompt("정수를 입력하세요").charCodeAt();

// let result="";

// for(i=a; i<=b; i++){
//     let c= String.fromCharCode(i);
//     result += c+"";
// }

// alert(result);

//1255

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// let result="";

// for(let i=a; i<=b; i+=0.01){

//     result += i.toFixed(2)+"";
//   }

// alert(result);

//1256

// let a=Number(prompt("정수를 입력하세요"));

// let result="";

// for(let i=0; i<a; i++){

//     result=document.write("*");
// }

// alert(result);

//1257

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// let result ="";

// for(let i=a; i<b ; i++){

//     if(i % 2 ==1){
//         alert(i);
//     }
// }

//1258

// let a=Number(prompt("정수를 입력하세요"));

// let result = 0;

// for( i=0 ; i<=a; i++){

//     result+= i;
// }

// alert(result);

//1159
// let a=Number(prompt("정수를 입력하세요"));

// let result =0;

// for(i=1; i<=a; i++){

//     if(i % 2 == 0 ){

//         result += i;
//     }
// }
// alert(result);

//1260

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// let result =0;

// for(i=a; i<=b; i++){

//     if(i % 3 == 0){
//        result += i;
//     }
// }
// alert(result);

//1261

// let a=prompt("정수를 입력하세요").split(' ');

// for(i=1; i<=a.length; i++){

//     if(i % 5 == 0){

//         alert(i);
//     }

// }

//1262

// let a=prompt("정수를 입력하세요");

// let result="";

//    for(let i=a; i<10; i++){

//     for(let j=1; j<10; j++){

//      result += (i +"*" + j +"=" + (i*j) +"\n");
//     }}

// alert(result);

//1266

// let a=Number(prompt("정수를 입력하세요"));
// let b=prompt("정수를 입력하세요").split(' ');

// let result=0;

// for(i=0; i<a; i++){

//     result += Number(b[i]);

//  }

// alert(result);

//1267

// let a=Number(prompt("정수를 입력하세요"));
// let b=prompt("정수를 입력하세요").split(' ');

// let result=0;

// for(let i=0; i<a; i++){

//     if(b[i] % 5 ==0){

//         result += Number(b[i]);
//     }
// }
// alert(result);

//1268

// let a=Number(prompt("정수를 입력하세요"));
// let b=prompt("정수를 입력하세요").split(' ');

// let result=0;

// for( let i=0; i<a; i++){
//     if(b[i] % 2 == 0){
//         result++;
//     }
// }

// alert(result);

//1269

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));
// let c=Number(prompt("정수를 입력하세요"));
// let d=Number(prompt("정수를 입력하세요"));

// result=a;

// for (i=0; i<(d-1); i++){
//     result = (result*b)+c;
// }

// alert(result);

//1270

// let a=Number(prompt("정수를 입력하세요"));

// let count=0;

// for( let i=0; i<=a; i++){
//     i += "";

//         if(i[i.length-1] == "1"){
//             count++;
//         }

// }

// alert(count);

//1271

// let a=Number(prompt("정수를 입력하세요"));
// let b=prompt("정수를 입력하세요").split(' ');

// let c=0;
// for(let i=0; i<=a; i++){
//     c= Math.max(...b);
// }

// alert(c);

//1272

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// let c=[1, 10, 2, 20, 3, 30, 4, 40, 5, 50, 6, 60, 7, 70, 8, 80, 9, 90, 10, 100, 11, 110, 12, 120];

// let d= "" + (c[a-1] +c[b-1]);

// alert(d);

//1273

// let a=Number(prompt("정수를 입력하세요"));

// let result="";
// for(let i=1; i<=a; i++){

//     if( a % i == 0){
//         result += i;
//     }
// }

// alert(result);

//1274
// let a=Number(prompt("정수를 입력하세요"));

// for(i=2; i<a; i++){

//     if(a % i ==0){
//         alert("not prime");
//     }
//     else{alert("prime");}
// }

// alert(a);

//1275

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// let result=Math.pow(a, b);

// alert(result);

//1276

// let a=Number(prompt("정수를 입력하세요"));

// function factorial(n) {
//     return (n != 1) ? n * factorial(n - 1) : 1;
//   }

//   alert( factorial(a));

//TODO 1277

// let a=Number(prompt("정수를 입력하세요"));
// let b=prompt("정수를 입력하세요").split(' ');

// for(i=0; i<a; i++){
//     alert(b[0],b[(a)],b[a-1])
// }

//1278

// let a=prompt("정수를 입력하세요");

// document.write(a.length);

//1279

// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// let result=0;

// for (let i=a; i<=b; i++){
//     if( i % 2 == 0){
//         result=result-i;
//     }else{
//         result=result+i;
//     }
// }
// alert(result);

//1280
// let a=Number(prompt("정수를 입력하세요"));
// let b=Number(prompt("정수를 입력하세요"));

// let result=0;

// for (let i=a; i<=b; i++){
//     if( i % 2 == 0){
//         result=result-i;
//         document.write("-"+i);
//     }else{
//         result=(result+i);
//         document.write("+"+i);
//     }

// }
// document.write("="+result);

//1402

// let b=prompt("정수를 입력하세요").split(' ');

// let reverse = [...b].reverse();

// alert(reverse);

//TODO 1403
// let b=prompt("정수를 입력하세요").split(' ');
// let a="";
// for(let i in b){

// }

// alert(a);

//TODO 1620

// let a = prompt("정수를 입력하세요").split('');
// let b = null;

// while (true) {
//   for (let i = 0; i <= a.length; i++) {
//     b += Number(a[i]) + 0;
//   }
//   if (b <= 9) {
//     alert(b);
//     break;
//   }

//   a = b.toString();
//   a.split('');
//   b=0;
// }

// let num = prompt(`입력해주세요`).split('');
// let sum = null;

// alert(num.length);
// while (true) {
//     for (let i = 0; i < num.length; i++) {
//         sum += Number(num[i]) + 0;
//         // alert(sum);
//     }
//     if (sum <= 9) {
//         alert("최종: " + sum);
//         break;
//     }
//     num = sum.toString();
//     num.split('');
//     sum = 0;
// }

//1675

//입력 : qhyhu wuxvw euxwxv
//출력 : never trust brutus
let input = prompt(`입력`);
let num = Number(prompt(`수 입력`));
let output = solution(input, num);
alert(output);

function solution(s, n) {
    var chars =
        "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXY                          ";
    return s
        .split("")
        .map((e) => chars[chars.indexOf(e) + n])
        .join("");
}


//1226
// let lotto = [13, 23, 24, 35, 40, 45, 7];
// let num = prompt(`입력`).split(` `);
// let count = 0;
// let lucky = 0;

// for (let i = 0; i < lotto.length; i++) {
//     for (let j = 0; j < num.length; j++) {
//         if (lotto[i] == num[j]) {
//             if (num[j] == "7") {
//                 lucky++;
//             }
//             count++;
//         }
//     }
// }
// if (count <= 2) {
//     alert(`꽝`);
// } else if (count == 3) {
//     alert(`5등`);
// } else if (count == 4) {
//     alert(`4등`);
// } else if (count == 5) {
//     alert(`3등`);
// } else if (count == 5 && lucky == 1) {
//     alert(`2등`);
// } else if (count == 6) {
//     alert(`1등`);
// }