// 문제 1
// var num = Number(prompt("입력해주세요."));
// var a = "";

// for (var i = 0; i < 3; i++) {
//     a = a + num + "\n";
// }
// alert(`${a}`);

// 문제 2
// var num = Number(prompt("입력해주세요."));
// var num1 = Number(prompt("입력해주세요."));
// var a = "";

// for (var i = 0; i < num1; i++) {
//     a = a + num;
// }
// alert(`${a}`);

// let a = 5;
// alert(`${(-1 * a)}`);

// let e = 0;

// for (i = 1; i = 1;) {
//     alert(`yes`);
//     e += 1;
//     if (e == 2) {
//         break;
//     }
// }

// let array = [1, 2, 3, 4, 5];

// for (let i = 0; i < array.length; i++) {
//     alert(`${array[i]}`);
// }

//모던 자바 스크립트 
// for (var i in array) {
//     alert(`${array[i]}`);
// }

// for (var value of array) {
//     alert(`${array[value]}`);
// }

// let todos = ["우유구매", "업무 메일 확인하기", "필라테스 수업"];
// let array = "";
// let a = 1;

// for (i in todos) {
//     array += a + "번째 할일 : " + todos[i] + "\n";
//     a++;
// }

// for (i = 0; i < todos.length; i++) {
//     array += (i+1) + "번째 할일 : " + todos[i] + "\n";
// }

// alert(array);


// while (true) {
//     let num = Number(prompt("숫자를 입력해주세요(3 입력 시 중단합니다.)"));
//     if (num == 3) {
//         alert(`중단합니다.`);
//         break;
//     }
// }

// while (true) {
//     let num = Number(prompt("숫자를 입력해주세요(0 입력 시 중단합니다.)"));
//     if (num >= 3 && num <= 6) {
//         alert(`봄입니다.`);
//     } else if (num >= 7 && num <= 9) {
//         alert(`여름입니다.`);
//     } else if (num >= 10 && num <= 12) {
//         alert(`가을입니다.`);
//     } else if (num >= 1 && num <= 2) {
//         alert(`겨울입니다.`);
//     } else if (num == 0) {
//         alert(`종료됩니다.`);
//         break;
//     } else {
//         alert(`다시 입력 바랍니다.`);
//     }
// }

// while (true) {
//     var id = prompt("ID 입력");
//     if (id == 'admin') {
//         alert(`해당 콘텐츠 이용이 가능합니다.`);
//     } else {
//         var level = Number(prompt(`회원 레벨을 입력해주세요.`));
//         if (level >= 1 && level <= 7) {
//             alert(`해당 콘텐츠 이용이 가능합니다.`);
//         } else {
//             alert(`해당 콘텐츠에 접근할 수 없습니다.`);
//         }
//     }
// }

// var num = Number(prompt("입력해주세요."));
// var array = "";

// for (var i = 0; i < num; i++) {
//     array += '<img src="./img/bear.jpg">' + "\n" + "<br>";
// }

// var str = document.getElementById("result")
// str.innerHTML = array;

// var array1 = '<img src="./img/prod1.jpg">';
// var array2 = '<img src="./img/prod2.jpg">';

// while (true) {
//     var num = Number(prompt("입력해주세요."));
//     if (num % 2 == 0) {
//         alert(`짝수`);
//         var str = document.getElementById("result").innerHTML = array1;
//         break;
//     } else if (num % 2 == 1) {
//         alert(`홀수`);
//         var str = document.getElementById("result").innerHTML = array2;
//         break;
//     } else { alert(`Please enter a number`); }
// }

