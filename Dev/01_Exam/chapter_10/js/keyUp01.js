// 화면 텍스트영역에 글자를 치면 글자수가 나오게 만드는 프로그램.
// 텍스트 영역 선택
let textarea = document.querySelector(`.textarea`);
// 글자수 출력 영역
let string_num = document.querySelector(`.string_num`);
// keyUp : 키를 눌렸다가 뗐을 경우 발생 함수
function keyUp() {
    // 입력된 텍스트 (value(내용물))
    const inputText = textarea.value;
    // 글자수
    string_num.innerHTML = inputText.length;
}

textarea.addEventListener(`keyup`, keyUp);