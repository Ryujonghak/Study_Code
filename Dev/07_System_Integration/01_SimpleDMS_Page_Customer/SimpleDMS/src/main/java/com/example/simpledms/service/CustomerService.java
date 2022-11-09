package com.example.simpledms.service;

import com.example.simpledms.model.Customer;
import com.example.simpledms.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * packageName : com.example.simpledms.service
 * fileName : CustomerService
 * author : ryujonghak
 * date : 2022/11/08
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/08         ryujonghak          최초 생성
 */
@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Page<Customer> findAllByEMAILContaining(String email, Pageable pageable) {
        Page<Customer> page = customerRepository.findAllByEMAILContaining(email, pageable);

        return page;
    }

    public Customer save(Customer customer) {
        Customer customer2 = customerRepository.save(customer);

        return customer2;
    }

    //    부서번호로 조회하는 함수
    public Optional<Customer> findById(int cid) {
//        findById(기본키속성)
        Optional<Customer> optionalCustomer = customerRepository.findById(cid);

        return optionalCustomer;
    }

    public boolean removeById(int cid) {
//        existsById(기본키) 있으면 삭제 실행 + true 리턴
        if(customerRepository.existsById(cid) == true) {
            customerRepository.deleteById(cid);
            return true;
        }

//        없으면 그냥 false 리턴
        return false;
    }
}
