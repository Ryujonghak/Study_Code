<template>
  <div class="submit-form">
    <!-- 양식 폼 시작 -->
    <!-- 부서명 입력 -->
    <div v-if="!submitted">
      <div class="form-group">
        <label for="dname">Dname</label>
        <input
            type="text"
            class="form-control"
            id="dname"
            required
            v-model="dept.dname"
            name="dname"
        />
      </div>
      <!-- 위치 정보 -->
      <div class="form-group">
        <label for="loc">Loc</label>
        <input
            class="form-control"
            id="loc"
            required
            v-model="dept.loc"
            name="loc"
        />
      </div>

      <button @click="saveDept" class="btn btn-success">Submit</button>
    </div>
    <!-- 양식 폼 끝-->

    <div v-else>
      <h4>You submitted successfully!</h4>
      <button class="btn btn-success" @click="newDept">Add</button>
    </div>

  </div>
</template>

<script>
// Axios import
import DeptDataService from "@/services/DeptDataService";

export default {
  name: "AddDept",
  data() {
    return {
      dept: {
        dno: null,
        dname: "",
        loc: "",
      },
      submitted: false,
    }
  },
  methods: {
    saveDept() {
      // 임시 객체 변수 -> springboot 전송
      // 부서번호는(dno) 자동생성되므로 빼고 전송함
      let data = {
        dname: this.dept.dname,
        loc: this.dept.loc
      };

      // insert 요청 함수 호출(axios 공통함수 호출)
      DeptDataService.create(data)
          // 성공하면 then() 결과가 전송됨
          .then(response => {
            this.dept.dno = response.data.dno;
            // 콘솔 로그 출력(response.data)
            console.log(response.data);
            // 변수 submitted
            this.submitted = true;
          })
          // 실패하면 .catch() 결과가 전송됨
          .catch(e => {
            console.log(e);
          })

    },

    newDept() {
      // 양식 초기화
      this.submitted = false;
      this.dept = {};
    }
  }

}
</script>

<style scoped>
.submit-form {
  max-width: 300px;
  margin: auto;
}
</style>