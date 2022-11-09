function searchUser(targetID) {
    const userList = [
        { id: 1, name: `사자` },
        { id: 2, name: `곰` },
        { id: 3, name: `여우` }];
    // 함수형 프로그래밍 : find, map, reduce, forEach등
    const targetData = userList.find(function (data) {
        // === : 값과 자료형이 같다.
        return data.id === targetID;
    })
    if (targetData == undefined) {

        return `검색 결과 없음`;
    }

    return targetData.name;
}

document.querySelector(`#output`).innerHTML = searchUser(10);
document.querySelector(`#output02`).innerHTML = searchUser(20);
