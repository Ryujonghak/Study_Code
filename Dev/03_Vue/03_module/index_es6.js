// 사용하기 위하여 import{}를 통해 불러옴.
import {
    odd,
    even
} from "./var_es6.js";
import checkNumber from "./func_es6.js";
// import 할 시 함수명이 일치하지 않더라도 불러와 사용이 가능함.

function checkStringOddOrEven(str) {
    if (str.length % 2) {
        return odd;
    }
    return even;
}
// checkNumber 함수 : 숫자를 매개변수로 받아서 홀/짝 판정
// checkStringOddOrEven 함수 : 문자를 매개변수로 받아서 홀/짝 판정

console.log(checkNumber(10));
console.log(checkStringOddOrEven(`hello`));