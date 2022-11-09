//샘플 테이블 동적 생성 예제
// let result = "";

// result += "<table border='1'>";
// result += "<tr><th>번호</th><th>제목</th><th>일자</th></tr>";

// let n = 1;
// while (n <= 3) {
//     result += "<tr><td>" + n + "</td><td>안녕하세요</td><td>12-07</td></tr>";
//     n++;
// }
// result += "</table>";
// console.log(result);

// var str = document.getElementById("result")
// str.innerHTML = result;

// 배열
// let color = ["red", "green", "blue", "yellow", "skyblue"];
// let text = "";
// let i = 0;

// while (i < 5) {
//     text += "<span style='color: " + color[i] + "' > " + "안녕하세요" + "</span >" + "<br>";
//     i++;
// }

// var str = document.getElementById("result")
// str.innerHTML = text;


// document.write();

// let obj1 = [
//     name = "박정수",
//     age = 22,
//     address = "서울"
// ]
// let i = 0;

// while (i < 3) {
//     document.write(obj1[i] + "<br>");
//     i++;
// }

// function alertTest() {
//     alert("Test");
// }



function f() {
    const res = document.getElementById('res').value;
    num = Number(res);
    num = num * num;
    document.getElementById("result").innerHTML = num;
}

function f2() {
    const res = document.getElementById('res').value;
    document.getElementById("result").innerHTML = res;
}

function f3(e) {
    // while (true) {
    // let num = Number(prompt("숫자를 입력해주세요(0 입력 시 중단합니다.)"));
    if (window.event.keyCode == 13) {
        const res = document.getElementById('res').value;
        num = Number(res);
        if (num >= 3 && num <= 6) {
            document.getElementById("result").innerHTML = (`봄입니다.`);
        } else if (num >= 7 && num <= 9) {
            document.getElementById("result").innerHTML = (`여름입니다.`);
        } else if (num >= 10 && num <= 12) {
            document.getElementById("result").innerHTML = (`가을입니다.`);
        } else if (num >= 1 && num <= 2) {
            document.getElementById("result").innerHTML = (`겨울입니다.`);
        } else if (num == 0) {
            alert(`종료됩니다.`);
            window.close();
            // break;
        } else {
            document.getElementById("result").innerHTML = (`다시 입력 바랍니다.`);
        }
    }
    // }
}


function f4() {
    const res = document.getElementById('res').value;
    num = Number(res);
    num += 10;
    document.getElementById("result").innerHTML = num;
}

function f5() {
    const res = document.getElementById('res').value;
    num = Number(res);
    if (num == 0) {
        document.getElementById("result").innerHTML = `even`;
    } else if (num % 2 == 1) {
        document.getElementById("result").innerHTML = `odd`;
    }
    else if (num % 2 == 0) {
        document.getElementById("result").innerHTML = `zero`;
    } else alert(`error`);
}

function f6() {
    const res = document.getElementById('res').value;
    num = Number(res);
    // num = Number(prompt("입력"));
    sum = 0;

    while (num != 0) {
        sum += num;
        num--;
    }
    document.getElementById("result").innerHTML = sum;
    // alert(sum);
}

// let num = Number(prompt("입력"));

// function log2(num) {
//     let sum = 0;
//     for (i = 1; i <= num; i++) {
//         sum += i;
//     }
//     return sum;
// }

// alert(log2(num));


// let num = prompt("입력").split(" ");

// let num1 = Number(num[0]);
// let num2 = Number(num[1]);
// let num3 = Number(num[2]);

// function log2(num1, num2, num3) {
//     alert(Math.min(num1, num2, num3));
// }

// log2(num1, num2, num3);

// 모던 자바 스크립트
// ...배열명 < 스프레드 연산자를 사용하면 배열을 정수로 분리해줌.
// alert(Math.min(...num));

