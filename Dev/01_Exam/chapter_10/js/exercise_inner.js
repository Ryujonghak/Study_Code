function get_pay(e0, e1, e2) {
    alert(`계산중`);
    let pay = e0 - (e0 * (e1 / 100)) + e2;
    document.querySelector(`#price`).innerHTML = e0 + `원`;
    document.querySelector(`#discount`).innerHTML = e1 + `%`;
    document.querySelector(`#shipping`).innerHTML = e2 + `원`;
    document.querySelector(`#pay`).innerHTML = pay + `원`;
}