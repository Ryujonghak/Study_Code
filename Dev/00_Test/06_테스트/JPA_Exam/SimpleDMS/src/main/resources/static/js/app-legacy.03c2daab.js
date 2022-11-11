(function(){"use strict";var t={9874:function(t,e,n){n(6992),n(8674),n(9601),n(7727);var r=n(8935),a=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{attrs:{id:"app"}},[n("nav",{staticClass:"navbar navbar-expand navbar-dark bg-dark"},[n("router-link",{staticClass:"navbar-brand ms-3",attrs:{to:"/"}},[t._v("SimpleDMS")]),n("div",{staticClass:"navbar-nav mr-auto"},[n("li",{staticClass:"nav-item dropdown ms-5"},[n("a",{staticClass:"nav-link dropdown-toggle",attrs:{"data-bs-toggle":"dropdown",href:"#",role:"button","aria-expanded":"false"}},[t._v("Department Info")]),n("ul",{staticClass:"dropdown-menu"},[n("li",[n("router-link",{staticClass:"dropdown-item",attrs:{to:"/dept"}},[t._v("Dept")])],1),n("li",[n("router-link",{staticClass:"dropdown-item",attrs:{to:"/add/dept"}},[t._v("Add")])],1)])]),n("li",{staticClass:"nav-item dropdown ms-5"},[n("a",{staticClass:"nav-link dropdown-toggle",attrs:{"data-bs-toggle":"dropdown",href:"#",role:"button","aria-expanded":"false"}},[t._v("Employee Info")]),n("ul",{staticClass:"dropdown-menu"},[n("li",[n("router-link",{staticClass:"dropdown-item",attrs:{to:"/emp"}},[t._v("Emp")])],1),n("li",[n("router-link",{staticClass:"dropdown-item",attrs:{to:"/add/emp"}},[t._v("Add")])],1)])]),n("li",{staticClass:"nav-item dropdown ms-5"},[n("a",{staticClass:"nav-link dropdown-toggle",attrs:{"data-bs-toggle":"dropdown",href:"#",role:"button","aria-expanded":"false"}},[t._v("Faq")]),n("ul",{staticClass:"dropdown-menu"},[n("li",[n("router-link",{staticClass:"dropdown-item",attrs:{to:"/faq"}},[t._v("Faq")])],1),n("li",[n("router-link",{staticClass:"dropdown-item",attrs:{to:"/add/faq"}},[t._v("Add")])],1)])]),n("li",{staticClass:"nav-item dropdown ms-5"},[n("a",{staticClass:"nav-link dropdown-toggle",attrs:{"data-bs-toggle":"dropdown",href:"#",role:"button","aria-expanded":"false"}},[t._v("Customer Info")]),n("ul",{staticClass:"dropdown-menu"},[n("li",[n("router-link",{staticClass:"dropdown-item",attrs:{to:"/customer"}},[t._v("Customer")])],1),n("li",[n("router-link",{staticClass:"dropdown-item",attrs:{to:"/add/customer"}},[t._v("Add")])],1)])]),n("li",{staticClass:"nav-item dropdown ms-5"},[n("a",{staticClass:"nav-link dropdown-toggle",attrs:{"data-bs-toggle":"dropdown",href:"#",role:"button","aria-expanded":"false"}},[t._v("Q & A")]),n("ul",{staticClass:"dropdown-menu"},[n("li",[n("router-link",{staticClass:"dropdown-item",attrs:{to:"/qna"}},[t._v("Q & A")])],1),n("li",[n("router-link",{staticClass:"dropdown-item",attrs:{to:"/add/qna"}},[t._v("Add")])],1)])])])],1),n("div",{staticClass:"container mt-3"},[n("router-view")],1)])},o=[],i={name:"app"},s=i,d=n(1001),l=(0,d.Z)(s,a,o,!1,null,null,null),u=l.exports,c=n(7806),f=(n(3276),n(44),n(1539),n(8783),n(3948),n(2809));r["default"].use(f.Z);var p=[{path:"/",alias:"/dept",name:"dept",component:function(){return Promise.all([n.e(599),n.e(442)]).then(n.bind(n,442))}},{path:"/dept/:dno",name:"dept-details",component:function(){return Promise.all([n.e(599),n.e(957)]).then(n.bind(n,6957))}},{path:"/add/dept",name:"add-dept",component:function(){return Promise.all([n.e(599),n.e(934)]).then(n.bind(n,8934))}},{path:"/emp",name:"emp",component:function(){return Promise.all([n.e(599),n.e(910)]).then(n.bind(n,6910))}},{path:"/emp/:eno",name:"emp-details",component:function(){return Promise.all([n.e(599),n.e(919)]).then(n.bind(n,6919))}},{path:"/add/emp",name:"add-emp",component:function(){return Promise.all([n.e(599),n.e(893)]).then(n.bind(n,9893))}},{path:"/faq",name:"faq",component:function(){return Promise.all([n.e(599),n.e(281)]).then(n.bind(n,4281))}},{path:"/faq/:no",name:"faq-details",component:function(){return Promise.all([n.e(599),n.e(459)]).then(n.bind(n,6459))}},{path:"/add/faq",name:"add-faq",component:function(){return Promise.all([n.e(599),n.e(518)]).then(n.bind(n,8518))}},{path:"/customer",name:"customer",component:function(){return Promise.all([n.e(599),n.e(393)]).then(n.bind(n,2393))}},{path:"/customer/:cid",name:"customer-details",component:function(){return Promise.all([n.e(599),n.e(969)]).then(n.bind(n,1969))}},{path:"/add/customer",name:"add-customer",component:function(){return Promise.all([n.e(599),n.e(769)]).then(n.bind(n,6769))}},{path:"/qna",name:"qna",component:function(){return Promise.all([n.e(599),n.e(245)]).then(n.bind(n,6245))}},{path:"/qna/:qno",name:"qna-details",component:function(){return Promise.all([n.e(599),n.e(119)]).then(n.bind(n,5119))}},{path:"/add/qna",name:"add-qna",component:function(){return Promise.all([n.e(599),n.e(347)]).then(n.bind(n,1347))}}],m=new f.Z({mode:"history",base:"/",routes:p}),v=m,b=n(4665);r["default"].use(b.ZP);var h=new b.ZP.Store({state:{},getters:{},mutations:{},actions:{},modules:{}});r["default"].use(c.XG7),r["default"].config.productionTip=!1,new r["default"]({router:v,store:h,render:function(t){return t(u)}}).$mount("#app")}},e={};function n(r){var a=e[r];if(void 0!==a)return a.exports;var o=e[r]={exports:{}};return t[r].call(o.exports,o,o.exports,n),o.exports}n.m=t,function(){var t=[];n.O=function(e,r,a,o){if(!r){var i=1/0;for(u=0;u<t.length;u++){r=t[u][0],a=t[u][1],o=t[u][2];for(var s=!0,d=0;d<r.length;d++)(!1&o||i>=o)&&Object.keys(n.O).every((function(t){return n.O[t](r[d])}))?r.splice(d--,1):(s=!1,o<i&&(i=o));if(s){t.splice(u--,1);var l=a();void 0!==l&&(e=l)}}return e}o=o||0;for(var u=t.length;u>0&&t[u-1][2]>o;u--)t[u]=t[u-1];t[u]=[r,a,o]}}(),function(){n.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return n.d(e,{a:e}),e}}(),function(){n.d=function(t,e){for(var r in e)n.o(e,r)&&!n.o(t,r)&&Object.defineProperty(t,r,{enumerable:!0,get:e[r]})}}(),function(){n.f={},n.e=function(t){return Promise.all(Object.keys(n.f).reduce((function(e,r){return n.f[r](t,e),e}),[]))}}(),function(){n.u=function(t){return"js/"+t+"-legacy."+{119:"4de217f9",245:"37341aa3",281:"1a07b44b",347:"6038f7d6",393:"fa11f00c",442:"14ef4e9e",459:"072aad5b",518:"53155414",599:"c81ad6b8",769:"8a07834b",893:"5b6857f4",910:"1a5b6fb4",919:"68de307c",934:"f33baac6",957:"3e20b6fc",969:"84b5e85c"}[t]+".js"}}(),function(){n.miniCssF=function(t){return"css/"+t+"."+{281:"4445956f",442:"4445956f",459:"ba9419c9",518:"d2108c4b",893:"d2108c4b",910:"4445956f",919:"ba9419c9",934:"d2108c4b",957:"ba9419c9"}[t]+".css"}}(),function(){n.g=function(){if("object"===typeof globalThis)return globalThis;try{return this||new Function("return this")()}catch(t){if("object"===typeof window)return window}}()}(),function(){n.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)}}(),function(){var t={},e="front-end:";n.l=function(r,a,o,i){if(t[r])t[r].push(a);else{var s,d;if(void 0!==o)for(var l=document.getElementsByTagName("script"),u=0;u<l.length;u++){var c=l[u];if(c.getAttribute("src")==r||c.getAttribute("data-webpack")==e+o){s=c;break}}s||(d=!0,s=document.createElement("script"),s.charset="utf-8",s.timeout=120,n.nc&&s.setAttribute("nonce",n.nc),s.setAttribute("data-webpack",e+o),s.src=r),t[r]=[a];var f=function(e,n){s.onerror=s.onload=null,clearTimeout(p);var a=t[r];if(delete t[r],s.parentNode&&s.parentNode.removeChild(s),a&&a.forEach((function(t){return t(n)})),e)return e(n)},p=setTimeout(f.bind(null,void 0,{type:"timeout",target:s}),12e4);s.onerror=f.bind(null,s.onerror),s.onload=f.bind(null,s.onload),d&&document.head.appendChild(s)}}}(),function(){n.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})}}(),function(){n.p="/"}(),function(){var t=function(t,e,n,r){var a=document.createElement("link");a.rel="stylesheet",a.type="text/css";var o=function(o){if(a.onerror=a.onload=null,"load"===o.type)n();else{var i=o&&("load"===o.type?"missing":o.type),s=o&&o.target&&o.target.href||e,d=new Error("Loading CSS chunk "+t+" failed.\n("+s+")");d.code="CSS_CHUNK_LOAD_FAILED",d.type=i,d.request=s,a.parentNode.removeChild(a),r(d)}};return a.onerror=a.onload=o,a.href=e,document.head.appendChild(a),a},e=function(t,e){for(var n=document.getElementsByTagName("link"),r=0;r<n.length;r++){var a=n[r],o=a.getAttribute("data-href")||a.getAttribute("href");if("stylesheet"===a.rel&&(o===t||o===e))return a}var i=document.getElementsByTagName("style");for(r=0;r<i.length;r++){a=i[r],o=a.getAttribute("data-href");if(o===t||o===e)return a}},r=function(r){return new Promise((function(a,o){var i=n.miniCssF(r),s=n.p+i;if(e(i,s))return a();t(r,s,a,o)}))},a={143:0};n.f.miniCss=function(t,e){var n={281:1,442:1,459:1,518:1,893:1,910:1,919:1,934:1,957:1};a[t]?e.push(a[t]):0!==a[t]&&n[t]&&e.push(a[t]=r(t).then((function(){a[t]=0}),(function(e){throw delete a[t],e})))}}(),function(){var t={143:0};n.f.j=function(e,r){var a=n.o(t,e)?t[e]:void 0;if(0!==a)if(a)r.push(a[2]);else{var o=new Promise((function(n,r){a=t[e]=[n,r]}));r.push(a[2]=o);var i=n.p+n.u(e),s=new Error,d=function(r){if(n.o(t,e)&&(a=t[e],0!==a&&(t[e]=void 0),a)){var o=r&&("load"===r.type?"missing":r.type),i=r&&r.target&&r.target.src;s.message="Loading chunk "+e+" failed.\n("+o+": "+i+")",s.name="ChunkLoadError",s.type=o,s.request=i,a[1](s)}};n.l(i,d,"chunk-"+e,e)}},n.O.j=function(e){return 0===t[e]};var e=function(e,r){var a,o,i=r[0],s=r[1],d=r[2],l=0;if(i.some((function(e){return 0!==t[e]}))){for(a in s)n.o(s,a)&&(n.m[a]=s[a]);if(d)var u=d(n)}for(e&&e(r);l<i.length;l++)o=i[l],n.o(t,o)&&t[o]&&t[o][0](),t[o]=0;return n.O(u)},r=self["webpackChunkfront_end"]=self["webpackChunkfront_end"]||[];r.forEach(e.bind(null,0)),r.push=e.bind(null,r.push.bind(r))}();var r=n.O(void 0,[998],(function(){return n(9874)}));r=n.O(r)})();
//# sourceMappingURL=app-legacy.03c2daab.js.map