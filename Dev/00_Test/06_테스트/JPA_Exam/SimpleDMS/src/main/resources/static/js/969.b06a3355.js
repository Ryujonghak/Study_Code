"use strict";(self["webpackChunkfront_end"]=self["webpackChunkfront_end"]||[]).push([[969],{1969:function(e,t,r){r.r(t),r.d(t,{default:function(){return i}});var s=function(){var e=this,t=e.$createElement,r=e._self._c||t;return e.currentCustomer?r("div",[r("div",{staticClass:"mb-3"},[r("label",{staticClass:"form-label",attrs:{for:"firstName"}},[e._v("First Name")]),r("input",{directives:[{name:"model",rawName:"v-model",value:e.currentCustomer.firstName,expression:"currentCustomer.firstName"}],staticClass:"form-control",attrs:{type:"text",id:"firstName",required:"",name:"firstName"},domProps:{value:e.currentCustomer.firstName},on:{input:function(t){t.target.composing||e.$set(e.currentCustomer,"firstName",t.target.value)}}})]),r("div",{staticClass:"mb-3"},[r("label",{staticClass:"form-label",attrs:{for:"lastName"}},[e._v("Last Name")]),r("input",{directives:[{name:"model",rawName:"v-model",value:e.currentCustomer.lastName,expression:"currentCustomer.lastName"}],staticClass:"form-control",attrs:{type:"text",id:"lastName",required:"",name:"lastName"},domProps:{value:e.currentCustomer.lastName},on:{input:function(t){t.target.composing||e.$set(e.currentCustomer,"lastName",t.target.value)}}})]),r("div",{staticClass:"mb-3"},[r("label",{staticClass:"form-label",attrs:{for:"email"}},[e._v("Email")]),r("input",{directives:[{name:"model",rawName:"v-model",value:e.currentCustomer.email,expression:"currentCustomer.email"}],staticClass:"form-control",attrs:{type:"email",id:"email",required:"",name:"email"},domProps:{value:e.currentCustomer.email},on:{input:function(t){t.target.composing||e.$set(e.currentCustomer,"email",t.target.value)}}})]),r("div",{staticClass:"mb-3"},[r("label",{staticClass:"form-label",attrs:{for:"phone"}},[e._v("Phone")]),r("input",{directives:[{name:"model",rawName:"v-model",value:e.currentCustomer.phone,expression:"currentCustomer.phone"}],staticClass:"form-control",attrs:{type:"text",id:"phone",required:"",name:"phone"},domProps:{value:e.currentCustomer.phone},on:{input:function(t){t.target.composing||e.$set(e.currentCustomer,"phone",t.target.value)}}})]),r("div",{staticClass:"mb-3"},[r("button",{staticClass:"btn btn-primary me-3",on:{click:e.updateCustomer}},[e._v("Update")]),r("button",{staticClass:"btn btn-danger",on:{click:e.deleteCustomer}},[e._v("Delete")])]),e.message?r("div",{staticClass:"alert alert-success",attrs:{role:"alert"}},[e._v(" "+e._s(e.message)+" ")]):e._e()]):e._e()},a=[],o=r(5963),u={data(){return{currentCustomer:null,message:""}},methods:{getCustomer(e){o.Z.get(e).then((e=>{this.currentCustomer=e.data,console.log(e.data)})).catch((e=>{console.log(e)}))},updateCustomer(){o.Z.update(this.currentCustomer.cid,this.currentCustomer).then((e=>{console.log(e.data),this.message="The Customer was updated successfully!"})).catch((e=>{console.log(e)}))},deleteCustomer(){o.Z["delete"](this.currentCustomer.cid).then((e=>{console.log(e.data),this.$router.push("/customer")})).catch((e=>{console.log(e)}))}},mounted(){this.message="",this.getCustomer(this.$route.params.cid)}},l=u,n=r(1001),m=(0,n.Z)(l,s,a,!1,null,null,null),i=m.exports},5963:function(e,t,r){var s=r(2327);class a{getAll(e,t,r){return s.Z.get(`/customer?email=${e}&page=${t}&size=${r}`)}get(e){return s.Z.get(`/customer/${e}`)}create(e){return s.Z.post("/customer",e)}update(e,t){return s.Z.put(`/customer/${e}`,t)}delete(e){return s.Z["delete"](`/customer/deletion/${e}`)}deleteAll(){return s.Z["delete"]("/customer/all")}}t["Z"]=new a}}]);
//# sourceMappingURL=969.b06a3355.js.map