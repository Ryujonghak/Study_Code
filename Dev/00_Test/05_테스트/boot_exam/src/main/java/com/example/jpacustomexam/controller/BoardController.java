package com.example.jpacustomexam.controller;

import com.example.jpacustomexam.dto.BoardDto;
import com.example.jpacustomexam.model.Board;
import com.example.jpacustomexam.model.Comment;
import com.example.jpacustomexam.service.BoardService;
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
 * fileName : BoardController
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
public class BoardController {
    @Autowired
    BoardService boardService;

//    전체검색
    @GetMapping("/boards/pageing")
    public ResponseEntity<Object> FindAllOrderByBID(Pageable pageable) {
        try {
            Page<Board> page = boardService.FindAllOrderByBID(pageable);

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

//    검색
    @GetMapping("/boards/{bid}")
    public ResponseEntity<Object> FindAllOrderByBID(Pageable pageable, @PathVariable int bid) {
        try {
            Page<Board> page = boardService.FindBID(pageable, bid);

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

//    전체검색
    @GetMapping("/boards")
    public ResponseEntity<Object> selectNativeJoin() {
        try {
            List<Board> list = boardService.ListFindAllOrderByBID();

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

//    상세 검색
    @GetMapping("/boards2/{bid}")
    public ResponseEntity<Object> ListFindCommentByBID(@PathVariable int bid) {
        try {
            List<Comment> list = boardService.ListFindCommentByBID(bid);

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

//    삭제 하기
    @DeleteMapping("/boards/delete/{bid}")
    public ResponseEntity<Object> deleteBoard(@PathVariable int bid) {
        try {
            boolean success = boardService.removeById(bid);
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

//    글수정
    @PutMapping("/Board/edit/{bid}")
    public ResponseEntity<Object> updateDept(@PathVariable int bid, @RequestBody Board board) {
        try {
            return new ResponseEntity<>(boardService.save(board), HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    글 추가
    @PostMapping("/Board/add")
    public ResponseEntity<Object> createDept(@RequestBody Board board) {
        try {
            return new ResponseEntity<>(boardService.save(board), HttpStatus.CREATED);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    제목 검색
    @GetMapping("/boards/title/{title}/content/{content}")
    public ResponseEntity<Object> ListFindBoardLike(@PathVariable String title, @PathVariable String content) {
        try {
            List<Board> list = boardService.ListFindBoardLike(title, content);

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

}
