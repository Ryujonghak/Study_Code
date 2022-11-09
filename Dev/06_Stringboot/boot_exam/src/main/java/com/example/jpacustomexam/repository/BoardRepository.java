package com.example.jpacustomexam.repository;

import com.example.jpacustomexam.dto.BoardDto;
import com.example.jpacustomexam.model.Board;
import com.example.jpacustomexam.model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * packageName : com.example.jpacustomexam.repository
 * fileName : BoardRepository
 * author : ryujonghak
 * date : 2022/10/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/28         ryujonghak          최초 생성
 */
@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {

//    글쓰기

//    목록보기
    @Query(value = "SELECT b.* " +
            "FROM TB_Board b " +
            "ORDER BY b.bid desc", nativeQuery = true)
    Page<Board> FindAllOrderByBID(Pageable pageable);

    @Query(value = "SELECT b.* " +
            "FROM TB_Board b " +
            "ORDER BY b.bid desc ", nativeQuery = true)
    List<Board> ListFindAllOrderByBID();

    @Query(value = "SELECT b.* " +
            "FROM TB_Board b " +
            "WHERE b.bid = :bid", nativeQuery = true)
    Page<Board> FindBID(Pageable pageable, @Param("bid") Integer bid);
    @Query(value = "SELECT c.* " +
            "FROM TB_board b, TB_comment c " +
            "where b.bid = c.bid " +
            "AND b.bid = :bid ", nativeQuery = true)
    List<Comment> ListFindCommentByBID(@Param("bid") Integer bid);

//    제목검색(LIKE 검색, 동적쿼리)
    @Query(value = "SELECT b.* " +
            "FROM TB_Board b " +
            "where b.board_title LIKE %:title% AND b.board_content LIKE %:content% ", nativeQuery = true)
    List<Board> ListFindBoardLike(@Param("title") String title, @Param("content") String content);
}
