package com.example.jpacustomexam.repository;

import com.example.jpacustomexam.model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * packageName : com.example.jpacustomexam.repository
 * fileName : CommentRepository
 * author : ryujonghak
 * date : 2022/10/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/28         ryujonghak          최초 생성
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    @Query(value = "SELECT c.* " +
            "FROM TB_comment c " +
            "where cid = :cid ", nativeQuery = true)
    List<Comment> ListFindCommentByCID(@Param("cid") Integer cid);

    @Query(value = "SELECT c.* " +
            "FROM TB_comment c " +
            "where cid = :cid ", nativeQuery = true)
    Page<Comment> PageFindCommentByCID(@Param("cid") Integer cid);
}
