<template>
  <div class="list row">
    <!-- 검색어 시작 -->
    <div class="col-md-8">
      <div class="input-group mb-3">
        <input type="text" class="form-control" placeholder="Search by Title"
               v-model="title"/>
        <div class="input-group-append">
          <button class="btn btn-outline-secondary" type="button"
                  @click="searchTitle"
          >
            Search
          </button>
        </div>
      </div>
    </div>
    <!-- 검색어 끝 -->

    <!-- 전체 목록 조회 시작 -->
    <div class="col-md-6">
      <h4>Faq List</h4>
      <ul class="list-group">
        <li class="list-group-item"
            :class="{ active: index == currentIndex }"
            v-for="(data, index) in faq"
            :key="index"
            @click="setActiveFaq(data, index)"
        >
          {{ data.title }}
        </li>
      </ul>

      <button class="m-3 btn btn-sm btn-danger" @click="removeAllFaq">
        Remove All
      </button>
    </div>
    <!-- 전체 목록 조회 끝 -->

    <!-- 간략 상세 목록 시작 -->
    <div class="col-md-6">
      <div v-if="currentFaq">
        <h4>Faq</h4>
        <div>
          <label><strong>No:</strong></label> {{ currentFaq.no }}
        </div>
        <div>
          <label><strong>Title:</strong></label> {{ currentFaq.title }}
        </div>
        <div>
          <label><strong>Content:</strong></label> {{ currentFaq.content }}
        </div>

        <router-link :to="'/faq/' + currentFaq.no"><span class="badge bg-success">Edit</span></router-link>
      </div>
      <div v-else>
        <br/>
        <p>Please click on a Faq...</p>
      </div>
    </div>
    <!-- 간략 상세 목록 끝 -->

  </div>
</template>

<script>
import faqDataService from "@/services/FaqDataService";

export default {
  name: "FaqList",
  // 변수 정의하는 자리, Data()
  data() {
    return {
      faq: [],
      currentFaq: null,
      currentIndex: -1,
      title: "",
    }
  },
//  함수 정의
  methods: {
    //  axios , 모든 부서정보 조회 요청 함수
    retrieveFaq() {
      faqDataService.getAll()
          //  성공하면 .then() 으로 결과가 전송됨.
          .then(response => {
            this.faq = response.data; // springboot 부서정보 데이터
            console.log(response.data); // 콘솔창에 정보 출력
          })
          //  실패하면 .catch() 에 에러가 전송됨.
          .catch(error => {
            console.log(error);
          })
    },
    setActiveFaq(data, index) { // 클릭한 현재 부서 객체, 인덱스 번호를 저장하는 함수
      this.currentFaq = data;
      this.currentIndex = index;
    },
    removeAllFaq() { // 모든 부서정보를 삭제하는 함수
      faqDataService.deleteAll()
          .then(response => {
            console.log(response.data);
            // 삭제 후 재조회
            this.retrieveFaq();
            // 삭제 후 변수 초기화
            this.currentFaq = null;
            this.currentIndex = -1;
          })
          .catch(error => {
            console.log(error);
          })
    },
    // like 검색 함수 : 부서명으로 조회하는 함수
    searchTitle() {
      faqDataService.findByTitle(this.title)
          // 성공하면 .then() 결과가 전송됨
          .then((response) => {
            // 디버깅 콘솔에 정보 출력
            this.faq = response.data; // like 검색 결과를 변수에 저장
            console.log(response.data);
          })
          // 실패하면 .catch() 에 에러가 전송됨
          .catch((e) => {
            console.log(e);
          });
    },

  },
//  Vue 실행 시 실행되는 이벤트
  mounted() {
    this.retrieveFaq();
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