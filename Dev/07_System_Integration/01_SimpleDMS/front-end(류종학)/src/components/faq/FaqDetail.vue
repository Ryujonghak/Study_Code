<template>
  <!-- 수정 양식 폼 시작 -->
  <div v-if="currentFaq" class="edit-form">
    <h4>Faq</h4>
    <form>
      <div class="form-group">
        <label for="title">Title</label>
        <input type="text" class="form-control" id="title"
               v-model="currentFaq.title"
        />
      </div>
      <div class="mt-3 form-group">
        <label for="content">Content</label>
        <input type="text" class="form-control" id="content"
               v-model="currentFaq.content"
        />
      </div>
    </form>

    <button class="mt-3 btn btn-danger"
            @click="deleteFaq"
    >Delete
    </button>

    <button type="submit" class="ms-3 mt-3 btn btn-success"
            @click="updateFaq"
    >
      Update
    </button>
    <p>{{ message }}</p>
  </div>
  <!-- 수정 양식 폼 끝 -->

  <div v-else>
    <br/>
    <p>Please click on a Faq…</p>
  </div>

</template>

<script>
import FaqDataService from "@/services/FaqDataService";

export default {
  name: "FaqDetail",
  data() {
    return {
      currentFaq: null,
      message: ""
    }
  },
  //부서번호로 조회 요청하는 함수 (dno)
  methods: {
    getFaq(no){
      //.get() : 부서번호 조회하는 공통함수
      FaqDataService.get(no)
          .then(response => {
            //springboot에서 결과를 리턴함 (부서객체)
            this.currentFaq = response.data;
            console.log(response.data) //뭐 들어왔는지 확인해보는 용도
          })
          .catch(e => {
            console.log(e);
          })
    },
    //  부서정보 수정요첨 함수
    updateFaq() {
      FaqDataService.update(this.currentFaq.no, this.currentFaq)
          .then(response => {
            this.message = "The Faq was updated successfully!"
            console.log(response.data);
          })
          .catch(e => {
            console.log(e);
          })
    },
    deleteFaq() {
      FaqDataService.delete(this.currentFaq.no)
          .then(response => {
            // 첫 페이지 강제 이동
            this.$router.push("/faq");
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
    this.getFaq(this.$route.params.no);
  }
}
</script>

<style scoped>

</style>