<template>
  <!-- DeptList.vue -->
  <div class="list row">

    <!-- 검색어 시작 -->
    <div class="col-md-8">
      <div class="input-group mb-3">
        <!--  검색어 입력 -->
        <input
            type="text"
            class="form-control"
            placeholder="Search by Dname"
            v-model="searchDname"
        />
        <!--  검색어 버튼 -->
        <div class="input-group-append">
          <button
              class="btn btn-outline-secondary"
              type="button"
              @click="
              page = 1;
              retrieveDept();
            "
          >
            Search
          </button>
        </div>
      </div>
    </div>
    <!-- 검색어 끝 -->


    <!-- 페이징 + 전체 목록 시작  -->
    <!-- 페이징 양식 시작  -->
    g


    <!-- 전체 목록 시작  -->
    <div class="col-md-6">
      <h4>Dept List</h4>
      <ul class="list-group" id="dept-list">
        <li
            class="list-group-item"
            :class="{ active: index == currentIndex }"
            v-for="(data, index) in dept"
            :key="index"
            @click="setActiveDept(data, index)"
        >
          {{ data.dname }}
        </li>
      </ul>
      <!-- 전체 목록 끝  -->

      <!-- 삭제 버튼 시작  -->
      <button class="m-3 btn btn-sm btn-danger" @click="removeAllDept">
        Remove All
      </button>
      <!-- 삭제 버튼 끝  -->
    </div>
    <!-- 페이징 + 전체 목록 끝  -->


    <!-- 간략 상세 목록 시작 -->
    <div class="col-md-6">
      <div v-if="currentDept">
        <h4>Dept</h4>
        <div>
          <label><strong>Dname:</strong></label> {{ currentDept.dname }}
        </div>
        <div>
          <label><strong>Loc:</strong></label> {{ currentDept.loc }}
        </div>

        <router-link :to="'/dept/' + currentDept.dno"
        ><span class="badge bg-success">Edit</span></router-link
        >
      </div>
      <div v-else>
        <br/>
        <p>Please click on a Dept...</p>
      </div>
    </div>
    <!-- 간략 상세 목록 끝 -->
  </div>
</template>

<script>
// axios 공통함수 import
import DeptDataService from "../../services/DeptDataService";

export default {
  // 변수 정의하는 곳 : data(), 초기화
  data() {
    return {
      dept: [],
      currentDept: null,
      currentIndex: -1,
      // dname: "",
      searchDname: "",
      //  페이징을 위한 변수 정의
      page: 1, // page init
      count: 0, // 데이터 건수 init
      pageSize: 3, // 한 페이징당 화면에 보여줄 갯수.
      pageSizes: [3, 6, 9], // selectBox에 넣을 변수
    };
  },
  // 함수 정의하는 곳 : methods:
  methods: {
    // axios , 모든 부서 정보 조회 요청 함수
    retrieveDept() {
      DeptDataService.getAll(this.searchDname, this.page -1 , this.pageSize) // 전체 조회 및 개별 조회 함수
          // 성공하면 .then() 결과가 전송됨
          .then((response) => {
            // this.dept = response.data -> 데이터만 받을 경우
            const {dept, totalItems} = response.data;
            // this.dept = response.data ->(변경) const { dept, totalItems } = response.data
            // let(const) {속성명, 속성명2} = 데이터객체배열 (모던자바문법 구조분해할당)
            this.dept = dept; // springboot 의 전송된 부서 정보
            this.count = totalItems; // springboot 에서 전송한 페이지 정보(총 건수)
            // 디버깅 콘솔에 정보 출력
            console.log(response.data);
          })
          // 실패하면 .catch() 에 에러가 전송됨
          .catch((e) => {
            console.log(e);
          });
    },
    // 목록을 클릭했을때 현재 부서객체, 인덱스번호를 저장하는 함수
    setActiveDept(data, index) {
      this.currentDept = data;
      this.currentIndex = index;
    },
    // axios, 모든 부서 정보 삭제 요청 함수
    removeAllDept() {
      DeptDataService.deleteAll()
          // 성공하면 .then() 결과가 전송됨
          .then((response) => {
            // 디버깅 콘솔에 정보 출력
            console.log(response.data);
            // 전체 목록 재조회
            this.retrieveDept();
            // currentDept, currentIndex 초기화
            this.currentDept = null;
            this.currentIndex = -1;
          })
          // 실패하면 .catch() 에 에러가 전송됨
          .catch((e) => {
            console.log(e);
          });
    },
    handlePageSizeChange(event) { // SelectBox 값 변경 시 실행되는 함수(재조회)
      this.pageSize = event.target.value; // 현재 선택중인 이벤트. 타겟(이벤트). Value(값)
      this.page = 1;
      this.retrieveDept(); // 재조회 함수
    },
    handlePageChange(value) { // 페이지 번호 변경 시 실행되는 함수(재조회)
      this.page = value;
      this.retrieveDept(); // 재조회 함수
    },
  },
  // 화면이 뜨자마자 실행되는 이벤트(라이프 사이클 함수) : mounted(), created()
  mounted() {
    this.retrieveDept(); // 화면 로딩시 전체 조회함수 실행
  },
};
</script>

<style>
.list {
  text-align: left;
  max-width: 750px;
  margin: auto;
}
</style>
