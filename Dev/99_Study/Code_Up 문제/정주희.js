// //* 개인 1577
// // 절대값 출력
// // https://codeup.kr/problem.php?id=1577

//     let num = Number(prompt("정수를 입력하세요"))
//     let myabs = Math.abs(num)
//     alert(myabs)

// //* 개인 1205
// // 두 실수 a, b가 입력되면 그 두수를 더하거나 빼거나 곱하거나 나누거나 제곱을 해서 가장 큰 수를 출력
// // https://codeup.kr/problem.php?id=1205

//     let nums = prompt("실수 a,b를 공백으로 구분해 입력하세요").split(" ")
//     let a = Number(nums[0])
//     let b = Number(nums[1])
//     let arr = [a+b, a-b, b-a, a*b, a**b, b**a]
//     let max = Math.max.apply(null, arr)

//     document.write(max)

//     // for문으로 하고싶었는데...실패
//     // let result = ""  
//     // for(let i=0; i<arr.length; i++){
//     //     if(arr[i]>=max){
//     //         max = arr[i]
//     //         result = i
//     //     }
//     // }
//     // alert(result)

// //* 개인 1216
// // 입력: 홍보x 수입, 홍보o 수입, 홍보비용
// // 출력: 홍보x 유리하면 "do not advertise", 홍보o 유리하면 "advertise", 차이없으면 "does not matter"
// // https://codeup.kr/problem.php?id=1216
// // 홍보0 이익: 수입b - 홍보비용c 
// // 홍보x 이익: 수입a - 홍보비용c

//     let cost = prompt("홍보 안할때 수입, 홍보 할 때 수입, 홍보비용을 공백을 두고 입력하세요").split(" ")
//     let a = Number(cost[0])
//     let b = Number(cost[1])
//     let c = Number(cost[2])
//     let proO = b-c
//     let proX = a-c

//     if(proO>proX){
//         alert("advertise")
//     } else if(proO<proX){
//         alert("do no advertise")
//     } else alert("does not matter")


// //* 개인 1230
// // 입력: 터널 높이 a, b, c
// // 출력: 높이 170인 차가 통과할 수 있으면 pass, 같거나 작으면 crash+최초 충돌한 터널높이 출력
// // https://codeup.kr/problem.php?id=1230

//     let tunnel = prompt("터널 3개의 높이를 공백을 두고 입력하세요").split(" ")
//     let a = Number(tunnel[0])
//     let b = Number(tunnel[1])
//     let c = Number(tunnel[2])
//     let arr = [a,b,c]
//     let i = 0;

//     for(let i=0; i<arr.length; i++){
//         if(arr[i]<170 || arr[i]==170){
//             alert("CRASH" + " " + arr[i])
//             break;
//         } else alert("PASS")
//     }


//팀 1610 
// 입력: abcdefg
//       2(시작위치) 3(글자개수)
// 출력: cde
// https://codeup.kr/problem.php?id=1610

//         // 100글자 이하 문자열에서 시작위치, 글자 개수를 입력받아 출력한다

//         let k1610c = prompt("문자열을 입력해주세요\n 단 문자열은 100자 이하").split("")

//         // 초기 입력된 문자열이 100자 이하에 해당하는지 확인, 100자를 초과할 경우 alert발생
//         if(k1610c.length > 100)
//         { alert("문자열 입력 조건을 초과하였습니다") }
//         else
//         {
//             // 시작 위치와 글자 갯수를 공백을 두고 입력받는다
//             let k1610 = prompt("시작 위치, 글자 갯수를 입력해주세요").split(" ")
//             let k1610a = Number(k1610[0]) // 시작위치 
//             let k1610b = Number(k1610[1]) // 추출할 글자 갯수

//             // 만약, 입력받은 문자열의 길이보다 시작위치와 글자의 갯수가 초과할 경우 alert 발생. (정상적인 출력 불가)
//             if(k1610c.length < (k1610a+k1610b)) 
//             {
//                 alert("출력 조건이 잘못 입력되었습니다")
//             }
//             else
//             {
//                 // 문자열 길이 조건(100자이하) 과 substring의 조건이 모두 부합할 경우에만 subString()함수를 통해 글자 추출
//                 alert(subString(k1610c, k1610a, k1610b))
//             }            
//         }

//         function subString(arr, st, cnt)
//         {
//             // 추출된 글자를 반환하기 위한 temp 변수 선언
//             let temp="";

//             // 반복문은 배열의 시작위치[i] 부터 [시작위치i+갯수cnt] 까지 탐색한다.
//             for(let i = st ; i < (st+cnt) ; i++)
//             {
//                 temp += arr[i]
//             }
//             // 추출되어 temp에 저장된 문자열을 반환
//             return temp;
//         }



//팀 1615
// 시작 값(a) 마지막 값(b) 입력시, 두 수 사이의 셀프 넘버들의 합을 출력
// https://codeup.kr/problem.php?id=1615
// 1,3,5,7,9,20,31 은 셀프 넘버(공식)
// 배열 2개, 함수 2개


//팀 1283
// 입력: 투자한 액수
//       투자일수
//       일별 변동폭인 데이터가 날짜 갯수(b개)만큼 퍼센트 정수로 입력
// 출력: 순수익(=총 수익(최종 값) - 총 비용(투자한 액수))을 소수점 첫째 자리에서 반올림하여 첫째 줄에 출력
//       이득일 경우 "good", 본전일 경우 "same",  손해일 경우 "bad"
//       ( 0.5>순수익>-0.5이면 순수익은 0)
// https://codeup.kr/problem.php?id=1283


// // 팀 1286
// // 5개의 정수가 한 줄에 하나씩 입력, 최대값 최소값 출력
// // https://codeup.kr/problem.php?id=1286

//     let nums = prompt("정수 5개를 공백으로 구분해 입력하세요").split(" ")
//     let a = Number(nums[0])
//     let b = Number(nums[1])
//     let c = Number(nums[2])
//     let d = Number(nums[3])
//     let e = Number(nums[4])
//     let arr = [a, b, c, d, e]
//     let max = Math.max.apply(null, arr)
//     let min = Math.min.apply(null, arr)

//     document.write("최대값: " + max + " " + "최소값: " + min)
