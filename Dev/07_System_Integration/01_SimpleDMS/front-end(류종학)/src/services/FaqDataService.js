// 목적: axios로 CRUD를 하는 공통함수들의 모음
import http from "../http-common";

class FaqDataService {
    getAll() {
        return http.get("/faq"); // get 방식 통신 -> @getMapping("/api/faq")
    }

//    부서번호로 조회 요청 함수
    get(no) {
        return http.get(`/faq/${no}`); // get 방식 통신 -> @getMapping("/api/faq/{eno}")
    }

//    부서정보 생성 요청 함수
    create(data) {
        return http.post("/faq", data); // post 방식 통신 -> @postMapping("/api/faq")
    }


    update(no, data) {
        return http.put(`/faq/${no}`, data); // put 방식 통신 -> @putMapping("/faq/{eno}"), Key값과 데이터를 같이 넘김.
    }


    delete(no) {
        return http.delete(`/faq/deletion/${no}`); // delete 방식 통신 -> @deleteMapping("/faq/{eno}")
    }

//    부서정보 전체 삭제 요청 함수
    deleteAll() {
        return http.delete("/faq/all") // delete 방식 통신 -> @deleteMapping("/faq/all")
    }

//    부서명 검색 요청 함수(쿼리 스트링 방식(url: ?변수명=값?변수명2=값2...)
    findByTitle(title) {
        return http.get(`/faq?title=${title}`); // get 방식 통신 -> @getMapping("/faq"), @RequestParam
    }
}

export default new FaqDataService();