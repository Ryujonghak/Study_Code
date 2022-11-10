<template>
  <div>

    <!-- 수정 양식 폼 시작 -->
    <div v-if="currentEmp" class="edit-form">
      <h4>Emp</h4>
      <form>
        <div class="form-group">
          <label for="ename">Ename</label>
          <input type="text" class="form-control" id="ename"
                 v-model="currentEmp.ename"
          />
        </div>
        <div class="mt-3 form-group">
          <label for="job">Job</label>
          <input type="text" class="form-control" id="job"
                 v-model="currentEmp.job"
          />
        </div>
        <div class="mt-3 form-group">
          <label for="manager">Manager</label>
          <input type="number" class="form-control" id="manager"
                 v-model="currentEmp.manager"
          />
        </div>
        <div class="mt-3 form-group">
          <label for="hiredate">Hiredate</label>
          <input type="text" class="form-control" id="hiredate"
                 v-model="currentEmp.hiredate"
          />
        </div>
        <div class="mt-3 form-group">
          <label for="salary">Salary</label>
          <input type="number" class="form-control" id="salary"
                 v-model="currentEmp.salary"
          />
        </div>
        <div class="mt-3 form-group">
          <label for="commission">Commission</label>
          <input type="number" class="form-control" id="commission"
                 v-model="currentEmp.commission"
          />
        </div>
        <div class="mt-3 form-group">
          <label for="dno">Dno</label>
          <input type="number" class="form-control" id="dno"
                 v-model="currentEmp.dno"
          />
        </div>
      </form>

      <button class="mt-3 btn btn-danger"
              @click="deleteEmp"
      >Delete
      </button>

      <button type="submit" class="ms-3 mt-3 btn btn-success"
              @click="updateEmp"
      >
        Update
      </button>
      <p>{{ message }}</p>
    </div>
    <!-- 수정 양식 폼 끝 -->

    <div v-else>
      <br/>
      <p>Please click on a Emp…</p>
    </div>

  </div>
</template>

<script>
import EmpDataService from "@/services/EmpDataService";

export default {
  name: "EmpDetail",
  data() {
    return {
      currentEmp: null,
      message: ""
    }
  },
  methods: {
    getEmp(eno){
      //.get() : 부서번호 조회하는 공통함수
      EmpDataService.get(eno)
          .then(response => {
            //springboot에서 결과를 리턴함 (부서객체)
            this.currentEmp = response.data;
            console.log(response.data) //뭐 들어왔는지 확인해보는 용도
          })
          .catch(e => {
            console.log(e);
          })
    },
    updateEmp() {
      EmpDataService.update(this.currentEmp.eno, this.currentEmp)
          .then(response => {
            this.message = "The Emp was updated successfully!"
            console.log(response.data);
          })
    },
    deleteEmp() {
      EmpDataService.delete(this.currentEmp.eno)
          .then(response => {
            this.$router.push("/emp");
            console.log(response.data);
          })
          .catch(e => {
            console.log(e);
          })
    }
  },
  mounted() {
    this.message = "";
    // URL 매개변수 전달 방법
    // $route -> params(매개변수) -> 매개변수명
    this.getEmp(this.$route.params.eno);
  }
}
</script>

<style scoped>

</style>