package com.example.project.repository;

import com.example.project.model.entity.CartGoods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartGoodsRepository extends JpaRepository<CartGoods, Long> {
}
