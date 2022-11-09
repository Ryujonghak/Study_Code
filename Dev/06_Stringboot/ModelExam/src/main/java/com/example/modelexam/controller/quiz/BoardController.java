package com.example.modelexam.controller.quiz;

import com.example.modelexam.model.Board;
import com.example.modelexam.service.quiz.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.modelexam.controller.quiz
 * fileName : BoardController
 * author : ryujonghak
 * date : 2022/10/19
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/19         ryujonghak          최초 생성
 */
@Slf4j
@RestController
@RequestMapping("/quiz")
public class BoardController {
    @Autowired
    BoardService boardService;

    @GetMapping("/board")
    public ResponseEntity<Object> getBoardAll() {
        try {
            List<Board> list = boardService.findAll();
            if (list.isEmpty() == false) {
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.info(e.getMessage()); // 에러 로그 찍기
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/board/{id}")
    public ResponseEntity<Object> getBoardId(@PathVariable int id) {
        try {
            Optional<Board> optionalBoard = boardService.findById(id);

            if (optionalBoard.isPresent() == true) {
                return new ResponseEntity<>(optionalBoard.get(), HttpStatus.OK);
            } else {
//                데이터가 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.info(e.getMessage()); // 에러 로그 찍기
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/board")
    public ResponseEntity<Object> createBoard(@RequestBody Board board) {
        try {
            List<Board> list = boardService.save(board);

            return new ResponseEntity<>(list, HttpStatus.CREATED);

        } catch (Exception e) {
            log.info(e.getMessage()); // 에러발생시 에러 메세지 콘솔 출력
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // 서버 에러 메세지전송
        }
    }

    @PutMapping("/board/edit/{id}")
    public ResponseEntity<Object> updateBoard(@PathVariable int id, @RequestBody Board board) {
        try {
            List<Board> list = boardService.save(board);
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            log.info(e.getMessage()); // 에러발생시 에러 메세지 콘솔 출력
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // 서버 에러 메세지전송
        }
    }

    @DeleteMapping("/board/delete/{id}")
    public ResponseEntity<Object> deleteBoard(@PathVariable int id) {
        try {
            boolean isBoard = boardService.removeById(id);

            if (isBoard) {
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.info(e.getMessage()); // 에러발생시 에러 메세지 콘솔 출력
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // 서버 에러 메세지전송
        }
    }
}


