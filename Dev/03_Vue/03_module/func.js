// 가져오기
const { odd, even } = require("./var.js");

function checkOddOrEven(num) {
    if (num % 2) {
        return odd;
    } else {
        return even;
    }
}

// 내보내기
module.exports = checkOddOrEven;