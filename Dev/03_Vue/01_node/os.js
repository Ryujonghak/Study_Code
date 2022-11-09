// os정보 출력
// os 라이브러리 가져오기
const os = require('os');

console.log('운영체제 정보');
console.log('os.platform():', os.platform());
// 결과 : 운영체제 정보, os.platform(): darwin

console.log('os.arch():', os.arch());
// 결과 : os.arch(): arm64 

console.log('os.hostname():', os.hostname());
// 결과 : os.hostname(): lyujonghag-ui-MacBookPro.local

console.log('os.release():', os.release());
// 결과 : os.release(): 21.6.0

console.log('cpu정보');
console.log('os.cpus():', os.cpus());
// 결과 : cpu정보,
// os.cpus(): [
//     {
//       model: 'Apple M1 Pro',
//       speed: 24,
//       times: { user: 13361380, nice: 0, sys: 10867150, idle: 51492680, irq: 0 }
//     },
//     {
//       model: 'Apple M1 Pro',
//       speed: 24,
//       times: { user: 13383740, nice: 0, sys: 10043670, idle: 52289890, irq: 0 }
//     },
//     {
//       model: 'Apple M1 Pro',
//       speed: 24,
//       times: { user: 5610510, nice: 0, sys: 2136320, idle: 67970470, irq: 0 }
//     },
//     {
//       model: 'Apple M1 Pro',
//       speed: 24,
//       times: { user: 3610620, nice: 0, sys: 1211490, idle: 70895200, irq: 0 }
//     },
//     {
//       model: 'Apple M1 Pro',
//       speed: 24,
//       times: { user: 2254650, nice: 0, sys: 681590, idle: 72781100, irq: 0 }
//     },
//     {
//       model: 'Apple M1 Pro',
//       speed: 24,
//       times: { user: 1897750, nice: 0, sys: 446100, idle: 73373490, irq: 0 }
//     },
//     {
//       model: 'Apple M1 Pro',
//       speed: 24,
//       times: { user: 1107030, nice: 0, sys: 258830, idle: 74351500, irq: 0 }
//     },
//     {
//       model: 'Apple M1 Pro',
//       speed: 24,
//       times: { user: 776550, nice: 0, sys: 179100, idle: 74761710, irq: 0 }
//     }
//   ]

console.log('os.totalmem():', os.totalmem());
// 결과 : os.totalmem(): 17179869184 (메모리 용량, size: byte)
