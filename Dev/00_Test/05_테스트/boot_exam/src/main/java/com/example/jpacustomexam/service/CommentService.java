package com.example.jpacustomexam.service;

import com.example.jpacustomexam.model.Board;
import com.example.jpacustomexam.model.Comment;
import com.example.jpacustomexam.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.example.jpacustomexam.service
 * fileName : CommentService
 * author : ryujonghak
 * date : 2022/10/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/28         ryujonghak          최초 생성
 */
@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    public Comment save(Comment comment) {
        //        JPA .save() 함수의 특징
        Comment comment1 = (commentRepository.save(comment));

        return comment1;
    }

    public boolean removeById(int id) {
        if (commentRepository.existsById(id)) {
            commentRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public List<Comment> ListFindCommentByCID(int cid) {
        List<Comment> list = commentRepository.ListFindCommentByCID(cid);

        return list;
    }
    public Page<Comment> PageFindCommentByCID(int cid) {
        Page<Comment> page = commentRepository.PageFindCommentByCID(cid);

        return page;
    }
}

