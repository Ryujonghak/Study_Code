// DeptDataService.js
// 목적: axios로 CRUD를 하는 공통함수들의 모음
import http from '../http-common';

class DeptDataService {
//    모든 부서정보 조회 요청 함수
    getAll() {
        return http.get("/dept"); // get 방식 통신 -> @getMapping("/api/dept")
    }

//    부서번호로 조회 요청 함수
    get(dno) {
        return http.get(`/dept/${dno}`); // get 방식 통신 -> @getMapping("/api/dept/{dno}")
    }

//    부서정보 생성 요청 함수
    create(data) {
        return http.post("/dept", data); // post 방식 통신 -> @postMapping("/api/dept")
    }

//    부서정보 수정 요청 함수
    update(dno, data) {
        return http.put(`/dept/${dno}`, data); // put 방식 통신 -> @putMapping("/dept/{dno}"), Key값과 데이터를 같이 넘김.
    }

    // 부서정보 삭제 요청 함수
    delete(dno) {
        return http.delete(`/dept/deletion/${dno}`); // delete 방식 통신 -> @deleteMapping("/dept/{dno}")
    }

//    부서정보 전체 삭제 요청 함수
    deleteAll() {
        return http.delete("/dept/all") // delete 방식 통신 -> @deleteMapping("/dept/all")
    }

//    부서명 검색 요청 함수(쿼리 스트링 방식(url: ?변수명=값?변수명2=값2...)
    findByDname(dname) {
        return http.get(`/dept?dname=${dname}`); // get 방식 통신 -> @getMapping("/dept"), @RequestParam
    }
}

export default new DeptDataService();