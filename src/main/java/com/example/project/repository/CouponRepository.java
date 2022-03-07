package com.example.project.repository;

import com.example.project.model.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long> {

}
