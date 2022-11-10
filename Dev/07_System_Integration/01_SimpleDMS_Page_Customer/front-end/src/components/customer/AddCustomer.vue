<template>
  <!-- AddDept.vue -->
  <div class="submit-form">
    <!-- 새 양식 폼 시작 -->
    <div v-if="!submitted">
      <!-- 성 -->
      <div class="form-group">
        <label for="last_NAME">LAST_NAME</label>
        <input
            type="text"
            class="form-control"
            id="last_NAME"
            required
            v-model="customer.last_NAME"
            name="last_NAME"
        />
      </div>

      <!-- 이름 -->
      <div class="form-group">
        <label for="first_NAME">FIRST_NAME</label>
        <input
            type="text"
            class="form-control"
            id="first_NAME"
            required
            v-model="customer.first_NAME"
            name="first_NAME"
        />
      </div>

      <!-- 이메일 -->
      <div class="form-group">
        <label for="email">email</label>
        <input
            type="text"
            class="form-control"
            id="email"
            required
            v-model="customer.email"
            name="email"
        />
      </div>

      <!-- 전화번호 -->
      <div class="form-group">
        <label for="phone">PHONE</label>
        <input
            type="text"
            class="form-control"
            id="phone"
            required
            v-model="customer.phone"
            name="phone"
        />
      </div>

      <button @click="saveCustomer" class="btn btn-success">Submit</button>
    </div>
    <!-- 새 양식 폼 끝 -->

    <div v-else>
      <h4>You submitted successfully!</h4>
      <button class="btn btn-success" @click="newCustomer">Add</button>
    </div>
  </div>
</template>

<script>
import CustomerService from "@/services/CustomerService";
export default {
  name: "AddCustomer",
  data() {
    return {
      customer: {
        cid: null,
        last_NAME: "",
        first_NAME: "",
        email: "",
        phone: "",
      },
      submitted: false,
    }
  },
  methods: {
    saveCustomer() {
      let data = {
        last_NAME: this.customer.last_NAME,
        first_NAME: this.customer.first_NAME,
        email: this.customer.email,
        phone: this.customer.phone,
      };
      CustomerService.create(data)
          .then(response => {
            this.customer.cid = response.data.cid;
            console.log(response.data);
            this.submitted = true;
          })
          .catch(error => {
            console.log(error);
          })
      },
    newCustomer() {
      this.submitted = false;
      this.customer = {}
    }
  }
}
</script>

<style scoped>

</style>