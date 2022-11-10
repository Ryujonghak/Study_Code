<template>
  <div>
    <!-- search 관련 div 시작 -->
    <div class="col-md-8">
      <div class="input-group mb-3">
        <!--            Todo : 수정 시작 -->
        <input
            type="text"
            class="form-control"
            placeholder="Search by Email"
            v-model="searchEmail"
        />
        <div class="input-group-append">
          <button
              class="btn btn-outline-secondary"
              type="button"
              @click="
              page = 1;
              retrieveCustomer();
            "
          >
            Search
          </button>
        </div>
        <!--            Todo : 수정 끝 -->
      </div>
    </div>
    <!-- search 관련 div 끝 -->

    <!--    Todo : page 바 시작 -->
    <div class="col-md-12">
      <div class="mb-3">
        Items per Page:
        <select v-model="pageSize" @change="handlePageSizeChange($event)">
          <option v-for="size in pageSizes" :key="size" :value="size">
            <!--            size : 3, 6, 9 -->
            {{ size }}
          </option>
        </select>
      </div>

      <b-pagination
          v-model="page"
          :total-rows="count"
          :per-page="pageSize"
          prev-text="Prev"
          next-text="Next"
          @change="handlePageChange"
      ></b-pagination>
    </div>
    <!-- Todo : page 바 끝 -->

    <table class="table">
      <thead>
      <tr>
        <th scope="col">Name</th>
        <!--
        <th scope="col">Last Name</th>
        -->
        <th scope="col">Email</th>
        <th scope="col">Phone</th>
        <th scope="col">Actions</th>
      </tr>
      </thead>
      <tbody v-for="(data, index) in customer" :key="index">
      <tr>
        <td>{{ data.last_NAME + " " + data.first_NAME }}</td>
        <!--
        <td>{{ data.lastName }}</td>
        -->
        <td>{{ data.email }}</td>
        <td>{{ data.phone }}</td>
        <td>
          <router-link :to="'/customer/' + data.cid"
          ><span class="badge bg-success">Edit</span></router-link
          >
        </td>
      </tr>
      </tbody>
    </table>
  </div>

</template>

<script>
import CustomerService  from "@/services/CustomerService";
export default {
  name: "CustomerList",
  data() {
    return {
      customer: [],
      searchEmail: "",
      // 페이징을 위한 변수 정의
      page: 1,     // 현재 페이지
      count: 0,    // 전체 데이터 건수
      pageSize: 3, // 한페이지당 몇개를 화면에 보여줄지 결정하는 변수
      pageSizes: [3, 6, 9] // select box 에 넣을 기본 데이터
    }
  },
  methods: {
    retrieveCustomer() {
      CustomerService.getAll(this.searchEmail, this.page -1, this.pageSize)
          .then((response) => {
            const { customer, totalItems } = response.data;
            this.customer = customer;
            this.count = totalItems;
            console.log(response.data);
          }).catch((error) => {
            console.log(error);
      })
    },
    handlePageSizeChange(event) {
      this.pageSize = event.target.value; // 현재 선택중인 이벤트. 타겟(이벤트). Value(값)
      this.page = 1;
      this.retrieveCustomer(); // 재조회 함수
    },
    handlePageChange(value) { // 페이지 번호 변경 시 실행되는 함수(재조회)}
      this.page = value;
      this.retrieveCustomer(); // 재조회 함수
    }
  },
  mounted() {
    this.retrieveCustomer();
  },
}
</script>

<style scoped>

</style>