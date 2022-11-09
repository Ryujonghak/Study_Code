// 모던 자바 스크립트 문법 : 구조분해 할당
let array = [1, 2];
let [first, second] = array;

console.log(first, second);

// 객체 구존분해 할당
let candyMachine = {
    name: '캔디',
    count: 5
}
// 객체의 속성명 === 변수명 일치해야함.
let { name, count } = candyMachine;

console.log(name, count);