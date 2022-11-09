package com.example.jpacustomexam.service;

import com.example.jpacustomexam.dto.BoardDto;
import com.example.jpacustomexam.model.Board;
import com.example.jpacustomexam.model.Comment;
import com.example.jpacustomexam.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.example.jpacustomexam.service
 * fileName : BoardService
 * author : ryujonghak
 * date : 2022/10/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/28         ryujonghak          최초 생성
 */
@Service
public class BoardService {
    @Autowired
    BoardRepository boardRepository;

    public Page<Board> FindAllOrderByBID(Pageable pageable) {
        Page<Board> page = boardRepository.FindAllOrderByBID(pageable);

        return page;
    }
    public Page<Board> FindBID(Pageable pageable, int bid) {
        Page<Board> page = boardRepository.FindBID(pageable, bid);

        return page;
    }

    public List<Board> ListFindAllOrderByBID() {
        List<Board> list = boardRepository.ListFindAllOrderByBID();

        return list;
    }

    public List<Comment> ListFindCommentByBID(int bid) {
        List<Comment> list = boardRepository.ListFindCommentByBID(bid);

        return list;
    }

    public Board save(Board board) {
        //        JPA .save() 함수의 특징
        Board board1 = (boardRepository.save(board));

        return board1;
    }

    public boolean removeById(int id) {
        if (boardRepository.existsById(id)) {
            boardRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public List<Board> ListFindBoardLike(String title, String content) {
        List<Board> list = boardRepository.ListFindBoardLike(title, content);

        return list;
    }
}
