let clock = document.querySelector(`#current`);

function time() {
    var now = new Date();
    var t = now.toString().split(" ");
    let i = 0;
    var dis = "";
    while (i < 5) {
        dis += t[i] + "&nbsp";
        i++;
    }
    clock.innerHTML = "<br>" + dis;
}

setInterval(time, 1000)

let p = document.querySelector(`p`);
p.style.textAlign = "center";