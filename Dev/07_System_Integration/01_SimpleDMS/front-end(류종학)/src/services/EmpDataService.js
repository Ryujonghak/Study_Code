// EmpDataService.js
// 목적: axios로 CRUD를 하는 공통함수들의 모음
import http from "../http-common";

class EmpDataService {
//    모든 부서정보 조회 요청 함수
    getAll() {
        return http.get("/emp"); // get 방식 통신 -> @getMapping("/api/emp")
    }

//    부서번호로 조회 요청 함수
    get(eno) {
        return http.get(`/emp/${eno}`); // get 방식 통신 -> @getMapping("/api/emp/{eno}")
    }

//    부서정보 생성 요청 함수
    create(data) {
        return http.post("/emp", data); // post 방식 통신 -> @postMapping("/api/emp")
    }

//    부서정보 수정 요청 함수
    update(eno, data) {
        return http.put(`/emp/${eno}`, data); // put 방식 통신 -> @putMapping("/emp/{eno}"), Key값과 데이터를 같이 넘김.
    }

    // 부서정보 삭제 요청 함수
    delete(eno) {
        return http.delete(`/emp/deletion/${eno}`); // delete 방식 통신 -> @deleteMapping("/emp/{eno}")
    }

//    부서정보 전체 삭제 요청 함수
    deleteAll() {
        return http.delete("/emp/all") // delete 방식 통신 -> @deleteMapping("/emp/all")
    }

//    부서명 검색 요청 함수(쿼리 스트링 방식(url: ?변수명=값?변수명2=값2...)
    findByename(ename) {
        return http.get(`/emp?ename=${ename}`); // get 방식 통신 -> @getMapping("/emp"), @RequestParam
    }
}

export default new EmpDataService();