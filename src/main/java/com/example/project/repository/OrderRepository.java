package com.example.project.repository;

import com.example.project.model.entity.Cart;
import com.example.project.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByUserIdx(Long userIdx);
}
