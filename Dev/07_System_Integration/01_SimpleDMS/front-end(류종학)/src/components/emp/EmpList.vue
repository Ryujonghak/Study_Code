<template>
  <!-- EmpList.vue -->
  <div class="list row">
    <!-- 검색어 시작 -->
    <div class="col-md-8">
      <div class="input-group mb-3">
        <input type="text" class="form-control" placeholder="Search by ename"
               v-model="ename"/>
        <div class="input-group-append">
          <button class="btn btn-outline-secondary" type="button"
                  @click="searchEname"
          >
            Search
          </button>
        </div>
      </div>
    </div>
    <!-- 검색어 끝 -->

    <!-- 전체 목록 조회 시작 -->
    <div class="col-md-6">
      <h4>Emp List</h4>
      <ul class="list-group">
        <li class="list-group-item"
            :class="{ active: index == currentIndex }"
            v-for="(data, index) in emp"
            :key="index"
            @click="setActiveEmp(data, index)"
        >
          {{ data.ename }}
        </li>
      </ul>

      <button class="m-3 btn btn-sm btn-danger" @click="removeAllEmp">
        Remove All
      </button>
    </div>
    <!-- 전체 목록 조회 끝 -->

    <!-- 간략 상세 목록 시작 -->
    <div class="col-md-6">
      <div v-if="currentEmp">
        <h4>Emp</h4>
        <div>
          <label><strong>Eno:</strong></label> {{ currentEmp.eno }}
        </div>
        <div>
          <label><strong>Ename:</strong></label> {{ currentEmp.ename }}
        </div>
        <div>
          <label><strong>Job:</strong></label> {{ currentEmp.job }}
        </div>
        <div>
          <label><strong>Manager:</strong></label> {{ currentEmp.manager }}
        </div>
        <div>
          <label><strong>Hiredate:</strong></label> {{ currentEmp.hiredate }}
        </div>
        <div>
          <label><strong>Salary:</strong></label> {{ currentEmp.salary }}
        </div>
        <div>
          <label><strong>Commission:</strong></label> {{ currentEmp.commission }}
        </div>
        <div>
          <label><strong>Dno:</strong></label> {{ currentEmp.dno }}
        </div>

        <router-link :to="'/emp/' + currentEmp.eno"
        ><span class="badge bg-success">Edit</span></router-link
        >
      </div>
      <div v-else>
        <br />
        <p>Please click on a Emp…</p>
      </div>
    </div>
    <!-- 간략 상세 목록 끝 -->
  </div>
</template>

<script>
import EmpDataService from "@/services/EmpDataService";

export default {
  name: "EmpList",
  data() {
    return {
      emp: [],
      currentEmp: null,
      currentIndex: -1,
      ename: "",
    }
  },
  //  함수 정의
  methods: {
    //  axios , 모든 부서정보 조회 요청 함수
    retrieveEmp() {
      EmpDataService.getAll()
          //  성공하면 .then() 으로 결과가 전송됨.
          .then(response => {
            this.emp = response.data; // springboot 부서정보 데이터
            console.log(response.data); // 콘솔창에 정보 출력
          })
          //  실패하면 .catch() 에 에러가 전송됨.
          .catch(error => {
            console.log(error);
          })
    },
    setActiveEmp(data, index) { // 클릭한 현재 부서 객체, 인덱스 번호를 저장하는 함수
      this.currentEmp = data;
      this.currentIndex = index;
    },
    removeAllEmp() { // 모든 부서정보를 삭제하는 함수
      EmpDataService.deleteAll()
          .then(response => {
            console.log(response.data);
            // 삭제 후 재조회
            this.retrieveEmp();
            // 삭제 후 변수 초기화
            this.currentEmp = null;
            this.currentIndex = -1;
          })
          .catch(error => {
            console.log(error);
          })
    },
    searchEname() {
      EmpDataService.findByename(this.ename)
          .then(response => {
            this.emp = response.data;
            console.log(response.data);
          })
          .catch(error => {
            console.log(error);
          })
    }
  },
//  Vue 실행 시 실행되는 이벤트
  mounted() {
    this.retrieveEmp();
  }
}
</script>

<style scoped>
.list {
  text-align: left;
  max-width: 750px;
  margin: auto;
}
</style>