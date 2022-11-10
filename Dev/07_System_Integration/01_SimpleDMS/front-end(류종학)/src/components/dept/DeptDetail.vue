<template>
  <div>

    <!-- 수정 양식 폼 시작 -->
    <div v-if="currentDept" class="edit-form">
      <h4>Dept</h4>
      <form>
        <div class="form-group">
          <label for="dname">Dname</label>
          <input type="text" class="form-control" id="dname"
                 v-model="currentDept.dname"
          />
        </div>
        <div class="mt-3 form-group">
          <label for="loc">Loc</label>
          <input type="text" class="form-control" id="loc"
                 v-model="currentDept.loc"
          />
        </div>
      </form>

      <button class="mt-3 btn btn-danger"
              @click="deleteDept"
      >Delete
      </button>

      <button type="submit" class="ms-3 mt-3 btn btn-success"
              @click="updateDept"
      >
        Update
      </button>
      <p>{{ message }}</p>
    </div>
    <!-- 수정 양식 폼 끝 -->

    <div v-else>
      <br />
      <p>Please click on a Dept…</p>
    </div>

  </div>
</template>

<script>
import DeptDataService  from "@/services/DeptDataService";
export default {
  name: "DeptDetail",
  data() {
    return {
      currentDept: null,
      message: ""
    }
  },
  //부서번호로 조회 요청하는 함수 (dno)
  methods: {
    getDept(dno){
      //.get() : 부서번호 조회하는 공통함수
      DeptDataService.get(dno)
          .then(response => {
            //springboot에서 결과를 리턴함 (부서객체)
            this.currentDept = response.data;
            console.log(response.data) //뭐 들어왔는지 확인해보는 용도
          })
          .catch(e => {
            console.log(e);
          })
    },
  //  부서정보 수정요첨 함수
    updateDept() {
      DeptDataService.update(this.currentDept.dno, this.currentDept)
          .then(response => {
            this.message = "The Dept was updated successfully!"
            console.log(response.data);
          })
          .catch(e => {
            console.log(e);
          })
    },
    deleteDept() {
      DeptDataService.delete(this.currentDept.dno)
          .then(response => {
            // 첫 페이지 강제 이동
            this.$router.push("/dept");
            console.log(response.data);
          })
          .catch(e => {
            console.log(e);
          })
    },
  },
  mounted() {
    this.message = "";
    // URL 매개변수 전달 방법
    // $route -> params(매개변수) -> 매개변수명
    this.getDept(this.$route.params.dno);
  }
}
</script>

<style scoped>

</style>