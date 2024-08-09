package com.example.be_electronicmenu.repository;

import com.example.be_electronicmenu.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}
