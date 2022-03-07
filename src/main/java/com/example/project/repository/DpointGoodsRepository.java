package com.example.project.repository;

import com.example.project.model.entity.DpointGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DpointGoodsRepository extends JpaRepository<DpointGoods, Long> {
}
