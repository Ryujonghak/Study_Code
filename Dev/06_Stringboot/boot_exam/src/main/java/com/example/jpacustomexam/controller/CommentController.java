package com.example.jpacustomexam.controller;

import com.example.jpacustomexam.model.Board;
import com.example.jpacustomexam.model.Comment;
import com.example.jpacustomexam.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * packageName : com.example.jpacustomexam.controller
 * fileName : CommentController
 * author : ryujonghak
 * date : 2022/10/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/28         ryujonghak          최초 생성
 */
@Slf4j
@RestController
@RequestMapping("/api")
public class CommentController {
    @Autowired
    CommentService commentService;

    // 댓글 추가
    @PostMapping("/Comment/add")
    public ResponseEntity<Object> createDept(@RequestBody Comment comment) {
        try {
            return new ResponseEntity<>(commentService.save(comment), HttpStatus.CREATED);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//        댓글 보기
    @GetMapping("/boards/comment/{cid}")
    public ResponseEntity<Object> PageFindCommentByCID(@PathVariable int cid, Pageable pageable) {
        try {
            Page<Comment> page = commentService.PageFindCommentByCID(cid);

//            페이지 정보를 맵 자료구조에 저장해서 전송
            Map<String, Object> response = new HashMap<>();
            response.put("board", page.getContent());
            response.put("currentPage", page.getNumber());
            response.put("totalItems", page.getTotalElements());
            response.put("totalPages", page.getTotalPages());

            if (page.isEmpty() == false) {
//                성공
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
//            서버 에러
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/boards/comment/{cid}")
    public ResponseEntity<Object> ListFindCommentByCID(@PathVariable int cid) {
        try {
            List<Comment> list = commentService.ListFindCommentByCID(cid);

            if (list.isEmpty() == false) {
//                성공
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
//            서버 에러
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    //    댓글 삭제
    @DeleteMapping("/Comment/delete/{cid}")
    public ResponseEntity<Object> deleteBoard(@PathVariable int cid) {
        try {
            boolean success = commentService.removeById(cid);
            if (success) {
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //    댓글 수정
    @PutMapping("/Comment/edit/{cid}")
    public ResponseEntity<Object> updateDept(@PathVariable int cid, @RequestBody Comment comment) {
        try {
            return new ResponseEntity<>(commentService.save(comment), HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
