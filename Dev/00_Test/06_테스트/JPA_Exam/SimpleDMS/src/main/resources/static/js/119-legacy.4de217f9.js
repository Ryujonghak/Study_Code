"use strict";(self["webpackChunkfront_end"]=self["webpackChunkfront_end"]||[]).push([[119],{5119:function(e,t,n){n.r(t),n.d(t,{default:function(){return l}});var a=function(){var e=this,t=e.$createElement,n=e._self._c||t;return e.currentQna?n("div",[n("div",{staticClass:"mb-3"},[n("label",{staticClass:"form-label",attrs:{for:"question"}},[e._v("Question")]),n("input",{directives:[{name:"model",rawName:"v-model",value:e.currentQna.question,expression:"currentQna.question"}],staticClass:"form-control",attrs:{type:"text",id:"question",required:"",name:"question"},domProps:{value:e.currentQna.question},on:{input:function(t){t.target.composing||e.$set(e.currentQna,"question",t.target.value)}}})]),n("div",{staticClass:"mb-3"},[n("label",{staticClass:"form-label",attrs:{for:"questioner"}},[e._v("Questioner")]),n("input",{directives:[{name:"model",rawName:"v-model",value:e.currentQna.questioner,expression:"currentQna.questioner"}],staticClass:"form-control",attrs:{type:"questioner",id:"questioner",required:"",name:"questioner"},domProps:{value:e.currentQna.questioner},on:{input:function(t){t.target.composing||e.$set(e.currentQna,"questioner",t.target.value)}}})]),n("div",{staticClass:"mb-3"},[n("label",{staticClass:"form-label",attrs:{for:"answer"}},[e._v("Answer")]),n("input",{directives:[{name:"model",rawName:"v-model",value:e.currentQna.answer,expression:"currentQna.answer"}],staticClass:"form-control",attrs:{type:"text",id:"answer",required:"",name:"answer"},domProps:{value:e.currentQna.answer},on:{input:function(t){t.target.composing||e.$set(e.currentQna,"answer",t.target.value)}}})]),n("div",{staticClass:"mb-3"},[n("label",{staticClass:"form-label",attrs:{for:"answerer"}},[e._v("Answerer")]),n("input",{directives:[{name:"model",rawName:"v-model",value:e.currentQna.answerer,expression:"currentQna.answerer"}],staticClass:"form-control",attrs:{type:"text",id:"answerer",required:"",name:"answerer"},domProps:{value:e.currentQna.answerer},on:{input:function(t){t.target.composing||e.$set(e.currentQna,"answerer",t.target.value)}}})]),n("div",{staticClass:"mb-3"},[n("button",{staticClass:"btn btn-primary me-3",on:{click:e.updateQna}},[e._v("Update")]),n("button",{staticClass:"btn btn-danger",on:{click:e.deleteQna}},[e._v("Delete")])]),e.message?n("div",{staticClass:"alert alert-success",attrs:{role:"alert"}},[e._v(" "+e._s(e.message)+" ")]):e._e()]):e._e()},r=[],s=n(8569),o={data:function(){return{currentQna:null,message:""}},methods:{getQna:function(e){var t=this;s.Z.get(e).then((function(e){t.currentQna=e.data,console.log(e.data)})).catch((function(e){console.log(e)}))},updateQna:function(){var e=this;s.Z.update(this.currentQna.qno,this.currentQna).then((function(t){console.log(t.data),e.message="The Qna was updated successfully!"})).catch((function(e){console.log(e)}))},deleteQna:function(){var e=this;s.Z["delete"](this.currentQna.qno).then((function(t){console.log(t.data),e.$router.push("/qna")})).catch((function(e){console.log(e)}))}},mounted:function(){this.message="",this.getQna(this.$route.params.qno)}},u=o,c=n(1001),i=(0,c.Z)(u,a,r,!1,null,null,null),l=i.exports},8569:function(e,t,n){var a=n(6133),r=n(2751),s=(n(2222),n(2327)),o=function(){function e(){(0,a.Z)(this,e)}return(0,r.Z)(e,[{key:"getAll",value:function(e,t,n,a){return s.Z.get("/qna?searchSelect=".concat(e,"&searchKeyword=").concat(t,"&page=").concat(n,"&size=").concat(a))}},{key:"get",value:function(e){return s.Z.get("/qna/".concat(e))}},{key:"create",value:function(e){return s.Z.post("/qna",e)}},{key:"update",value:function(e,t){return s.Z.put("/qna/".concat(e),t)}},{key:"delete",value:function(e){return s.Z["delete"]("/qna/deletion/".concat(e))}},{key:"deleteAll",value:function(){return s.Z["delete"]("/qna/all")}}]),e}();t["Z"]=new o}}]);
//# sourceMappingURL=119-legacy.4de217f9.js.map