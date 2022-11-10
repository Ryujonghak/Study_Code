// http-common.js
// 목적: springboot 와 axios 통신을 위한 기본 설정
import axios from "axios";

export default axios.create({
    //springboot 연결주소
    baseURL: "http://localhost:8000/api",
    headers: {
        "Content-Type": "application/json"
    }
});
