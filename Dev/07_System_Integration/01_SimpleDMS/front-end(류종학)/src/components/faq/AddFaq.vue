<template>
  <div class="submit-form">
    <!-- 양식 폼 시작 -->
    <!-- 부서명 입력 -->
    <div v-if="!submitted">
      <div class="form-group">
        <label for="title">Title</label>
        <input
            type="text"
            class="form-control"
            id="title"
            required
            v-model="faq.title"
            name="title"
        />
      </div>
      <!-- 위치 정보 -->
      <div class="form-group">
        <label for="content">Content</label>
        <input
            class="form-control"
            id="content"
            required
            v-model="faq.content"
            name="content"
        />
      </div>

      <button @click="saveFaq" class="btn btn-success">Submit</button>
    </div>
    <!-- 양식 폼 끝-->

    <div v-else>
      <h4>You submitted successfully!</h4>
      <button class="btn btn-success" @click="newFaq">Add</button>
    </div>

  </div>
</template>

<script>
import faqDataService from "@/services/FaqDataService";

export default {
  name: "FaqList",
  data() {
    return {
      faq: {
        no: null,
        title: "",
        content: "",
      },
      submitted: false,
    }
  },
  methods: {
    saveFaq() {
      // 임시 객체 변수 -> springboot 전송
      // 부서번호는(dno) 자동생성되므로 빼고 전송함
      let data = {
        title: this.faq.title,
        content: this.faq.content
      };

      // insert 요청 함수 호출(axios 공통함수 호출)
      faqDataService.create(data)
          // 성공하면 then() 결과가 전송됨
          .then(response => {
            this.faq.no = response.data.no;
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

    newFaq() {
      // 양식 초기화
      this.submitted = false;
      this.faq = {};
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