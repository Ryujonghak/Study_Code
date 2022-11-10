import http from "../http-common";

class CustomerService {
    getAll(email, page, size) { // dname(부서명), page(현재 페이지), size(페이지당 화면에 보여줄 갯수)
        // get 방식 통신 요청 -> @GetMapping("/api/dept")
        // 전체 조회 및 개별 조회까지 같이 가능한 함수
        return http.get(`/customer?email=${email}&page=${page}&size=${size}`);
    }

    create(data) {
        console.log(data);
        return http.post("/customer", data);
    }

    get(cid) {
        return http.get(`/customer/${cid}`)
    }

    delete(cid) {
        return http.delete(`/customer/deletion/${cid}`)
    }

    update(cid, data) {
        return http.put(`/customer/${cid}`, data)
    }
}

export default new CustomerService();