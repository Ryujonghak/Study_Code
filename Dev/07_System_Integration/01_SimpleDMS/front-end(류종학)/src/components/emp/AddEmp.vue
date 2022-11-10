<template>
  <div class="submit-form">
    <!-- 양식 폼 시작 -->
    <!-- 부서명 입력 -->
    <div v-if="!submitted">
      <div class="form-group">
        <label for="ename">Ename</label>
        <input
            type="text"
            class="form-control"
            id="ename"
            required
            v-model="emp.ename"
            name="ename"
        />
      </div>
      <!-- 위치 정보 -->
      <div class="form-group">
        <label for="job">Job</label>
        <input
            type="text"
            class="form-control"
            id="job"
            required
            v-model="emp.job"
            name="job"
        />
      </div>

      <div class="form-group">
        <label for="manager">Manager</label>
        <input
            type="text"
            class="form-control"
            id="manager"
            required
            v-model="emp.manager"
            name="manager"
        />
      </div>

      <div class="form-group">
        <label for="hiredate">Hiredate</label>
        <input
            type="text"
            class="form-control"
            id="hiredate"
            required
            v-model="emp.hiredate"
            name="hiredate"
        />
      </div>

      <div class="form-group">
        <label for="salary">Salary</label>
        <input
            type="number"
            class="form-control"
            id="salary"
            required
            v-model="emp.salary"
            name="salary"
        />
      </div>

      <div class="form-group">
        <label for="commission">Commission</label>
        <input
            type="number"
            class="form-control"
            id="commission"
            required
            v-model="emp.commission"
            name="commission"
        />
      </div>

      <div class="form-group">
        <label for="dno">Dno</label>
        <input
            type="number"
            class="form-control"
            id="dno"
            required
            v-model="emp.dno"
            name="dno"
        />
      </div>


      <button @click="saveEmp" class="btn btn-success">Submit</button>
    </div>
    <!-- 양식 폼 끝-->

    <div v-else>
      <h4>You submitted successfully!</h4>
      <button class="btn btn-success" @click="newEmp">Add</button>
    </div>

  </div>
</template>

<script>
import EmpDataService from "@/services/EmpDataService";

export default {
  name: "AddEmp",
  data() {
    return {
      emp: {
        eno: null,
        ename: "",
        job: "",
        manager: null,
        hiredate: "",
        salary: null,
        commission: null,
        dno: null,
      },
      submitted: false,
    }
  },
  methods: {
    saveEmp() {
      // 임시 객체 변수 -> springboot 전송
      // 사원번호는(eno) 자동생성되므로 빼고 전송함
      let data = {
        ename: this.emp.ename,
        job: this.emp.job,
        manager: this.emp.manager,
        hiredate: this.emp.hiredate,
        salary: this.emp.salary,
        commission: this.emp.commission,
        dno: this.emp.dno,
      };

      // insert 요청 함수 호출(axios 공통함수 호출)
      EmpDataService.create(data)
          // 성공하면 then() 결과가 전송됨
          .then(response => {
            this.emp.eno = response.data.eno;
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

    newEmp() {
      // 양식 초기화
      this.submitted = false;
      this.emp = {};
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