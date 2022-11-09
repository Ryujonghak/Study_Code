import { odd, even } from "./var_es6.js";

function checkOddOrEven(num) {
    if (num % 2) {
        return odd;
    } else {
        return even;
    }
}

// export default : 하나의 함수 또는 변수를 다른 파일에서 사용할 수 있도록 함.
export default checkOddOrEven;