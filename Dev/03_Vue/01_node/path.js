// 경로(path) 관련된 속성, 힘수 소개
// 라이브러리 가져오기
// 1) require(라이브러리 이름)
// 2) cf) import 라이브러리 이름
const path = require('path');
// 경로 +  파일명
const string = __filename;

// 경로의 구분자 : os마다 틀림
console.log('path.sep:', path.sep);
// 결과는 windows : \ , linux, mac : /

console.log('path.dirname():', path.dirname(string));
// 결과 : /Users/ryujonghak/Library/CloudStorage/OneDrive-개인/Dev/03_Vue/01_node

console.log('path.extname():', path.extname(string));
// 결과 : .js
