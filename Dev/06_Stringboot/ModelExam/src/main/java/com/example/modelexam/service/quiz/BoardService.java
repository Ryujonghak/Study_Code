package com.example.modelexam.service.quiz;

import com.example.modelexam.dao.BoardDao;
import com.example.modelexam.model.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.modelexam.service.quiz
 * fileName : BoardService
 * author : ryujonghak
 * date : 2022/10/19
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/19         ryujonghak          최초 생성
 */
@Service
public class BoardService {
    @Autowired
    BoardDao boardDao;

    public List<Board> findAll() {
        List<Board> list = boardDao.selectAll();

        return list;
    }

    public Optional<Board> findById(int id) {
        Board board = boardDao.selectById(id);

        Optional<Board> optionalBoard = Optional.ofNullable(board);

        return optionalBoard;
    }

    public  List<Board> save(Board board) {
        List<Board> list = null;

        if(board.getId() == null) {
            int count = boardDao.selectAll().size();
            int newId = count+1;
            board.setId(newId);

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            board.setInsertTime(LocalDateTime.now().format(dtf));

            list = boardDao.insert(board);
        } else {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            board.setUpdateTime(LocalDateTime.now().format(dtf)); // 현재 데이터 생성시간 넣기

            list = boardDao.update(board);
        }
        return list;
    }

    public boolean removeById(int id) {
        int iCount = boardDao.deleteById(id); // 회원번호에 해당하는 데이터 삭제

        return (iCount > 0)? true : false;
    }
}
