document.querySelector(`p`).innerHTML = `글쓰기 버튼을 보여줄까요?`;
function f1(e) {
    if (window.event.keyCode == 13) {
        const res = document.getElementById('res').value;
        // alert(res);
        if (res == `y` || res == `Y`) {
            document.querySelector(`#app`).innerHTML = `<button>글쓰기</button>`;
        } else {
            document.querySelector(`#app`).innerHTML = `<button>글수정</button>`;
            // alert(`다시 입력하세요.`);
        }
    }
}