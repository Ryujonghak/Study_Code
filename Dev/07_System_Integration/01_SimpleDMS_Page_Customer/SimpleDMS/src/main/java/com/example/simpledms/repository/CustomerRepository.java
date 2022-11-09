package com.example.simpledms.repository;

import com.example.simpledms.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName : com.example.simpledms.repository
 * fileName : CustomerRepository
 * author : ryujonghak
 * date : 2022/11/08
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/08         ryujonghak          최초 생성
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Page<Customer> findAllByEMAILContaining(String email, Pageable pageable);
}
