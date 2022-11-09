const userDataList = [
    {
        id: 123, name: `곰`
    },
    {
        id: 1021, name: `사자`
    },
    {
        id: 6021, name: `여우`
    }
];

const userid = document.querySelector(`#search-id-input`);

function findUser(searchid) {
    // targetData = 객체
    const targetData = userDataList.find(function (data) {
        // === : 값과 자료형이 같다.
        return data.id === searchid;
    })

    // alert(`test2`);
    // 에러 처리
    if (targetData == undefined) {
        document.querySelector(`#search-result`).innerHTML = `유저 검색 결과 없음`;
        return;
    }
    // 검색결과 표시
    document.querySelector(`#search-result`).innerHTML = targetData.name;
}

userid.addEventListener(`keyup`, () => {
    // 검색 ID 가져오기
    const uid = Number(userid.value);
    // alert(`test`);
    findUser(uid);
});
