"use strict";(self["webpackChunkfront_end"]=self["webpackChunkfront_end"]||[]).push([[245],{6245:function(e,t,a){a.r(t),a.d(t,{default:function(){return u}});var n=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",[a("div",{staticClass:"col-md-8"},[a("div",{staticClass:"input-group mb-3"},[a("div",{staticClass:"col-2"},[a("select",{directives:[{name:"model",rawName:"v-model",value:e.searchSelect,expression:"searchSelect"}],staticClass:"form-select",on:{change:function(t){var a=Array.prototype.filter.call(t.target.options,(function(e){return e.selected})).map((function(e){var t="_value"in e?e._value:e.value;return t}));e.searchSelect=t.target.multiple?a:a[0]}}},[a("option",[e._v("question")]),a("option",[e._v("questioner")])])]),a("div",{staticClass:"col-9"},[a("input",{directives:[{name:"model",rawName:"v-model",value:e.searchKeyword,expression:"searchKeyword"}],staticClass:"form-control",attrs:{type:"text",placeholder:"Search by Question"},domProps:{value:e.searchKeyword},on:{input:function(t){t.target.composing||(e.searchKeyword=t.target.value)}}})]),a("div",{staticClass:"input-group-append col-1"},[a("button",{staticClass:"btn btn-outline-secondary",attrs:{type:"button"},on:{click:function(t){e.page=1,e.retrieveQna()}}},[e._v(" Search ")])])])]),a("div",{staticClass:"col-md-12"},[a("div",{staticClass:"mb-3"},[e._v(" Items per Page: "),a("select",{directives:[{name:"model",rawName:"v-model",value:e.pageSize,expression:"pageSize"}],on:{change:[function(t){var a=Array.prototype.filter.call(t.target.options,(function(e){return e.selected})).map((function(e){var t="_value"in e?e._value:e.value;return t}));e.pageSize=t.target.multiple?a:a[0]},function(t){return e.handlePageSizeChange(t)}]}},e._l(e.pageSizes,(function(t){return a("option",{key:t,domProps:{value:t}},[e._v(" "+e._s(t)+" ")])})),0)]),a("b-pagination",{attrs:{"total-rows":e.count,"per-page":e.pageSize,"prev-text":"Prev","next-text":"Next"},on:{change:e.handlePageChange},model:{value:e.page,callback:function(t){e.page=t},expression:"page"}})],1),a("table",{staticClass:"table"},[e._m(0),e._l(e.qna,(function(t,n){return a("tbody",{key:n},[a("tr",[a("td",[e._v(e._s(t.question))]),a("td",[e._v(e._s(t.questioner))]),a("td",[e._v(e._s(t.answer))]),a("td",[e._v(e._s(t.answerer))]),a("td",[a("router-link",{attrs:{to:"/qna/"+t.qno}},[a("span",{staticClass:"badge bg-success"},[e._v("Edit")])])],1)])])}))],2)])},r=[function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("thead",[a("tr",[a("th",{attrs:{scope:"col"}},[e._v("Question")]),a("th",{attrs:{scope:"col"}},[e._v("Questioner")]),a("th",{attrs:{scope:"col"}},[e._v("Answer")]),a("th",{attrs:{scope:"col"}},[e._v("Answerer")])])])}],o=a(8569),s={data:function(){return{qna:[],searchKeyword:"",searchSelect:"question",page:1,count:0,pageSize:3,pageSizes:[3,6,9]}},methods:{retrieveQna:function(){var e=this;o.Z.getAll(this.searchSelect,this.searchKeyword,this.page-1,this.pageSize).then((function(t){var a=t.data,n=a.qna,r=a.totalItems;e.qna=n,e.count=r,console.log(t.data)})).catch((function(e){console.log(e)}))},handlePageChange:function(e){this.page=e,this.retrieveQna()},handlePageSizeChange:function(e){this.pageSize=e.target.value,this.page=1,this.retrieveQna()}},mounted:function(){this.retrieveQna()}},c=s,i=a(1001),l=(0,i.Z)(c,n,r,!1,null,null,null),u=l.exports},8569:function(e,t,a){var n=a(6133),r=a(2751),o=(a(2222),a(2327)),s=function(){function e(){(0,n.Z)(this,e)}return(0,r.Z)(e,[{key:"getAll",value:function(e,t,a,n){return o.Z.get("/qna?searchSelect=".concat(e,"&searchKeyword=").concat(t,"&page=").concat(a,"&size=").concat(n))}},{key:"get",value:function(e){return o.Z.get("/qna/".concat(e))}},{key:"create",value:function(e){return o.Z.post("/qna",e)}},{key:"update",value:function(e,t){return o.Z.put("/qna/".concat(e),t)}},{key:"delete",value:function(e){return o.Z["delete"]("/qna/deletion/".concat(e))}},{key:"deleteAll",value:function(){return o.Z["delete"]("/qna/all")}}]),e}();t["Z"]=new s}}]);
//# sourceMappingURL=245-legacy.37341aa3.js.map