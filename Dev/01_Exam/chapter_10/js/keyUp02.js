// 성 + 이름을 입력받아 아래에 풀네임에 성 이름 출력하는 프로그램.
const famliyNameText = document.querySelector(`#famliyNameText`);
const FirstNameText = document.querySelector(`#FirstNameText`);
const fullname = document.querySelector(`#fullname`);

function onKeyUP() {
    const famliyName = famliyNameText.value;
    const FirstName = FirstNameText.value;
    const name = FirstName + `&nbsp` + famliyName;

    fullname.innerHTML = name;
}

famliyNameText.addEventListener(`keyup`, onKeyUP);
FirstNameText.addEventListener(`keyup`, onKeyUP);