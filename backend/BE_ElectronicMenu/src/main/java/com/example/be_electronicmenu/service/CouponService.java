package com.example.be_electronicmenu.service;

import com.example.be_electronicmenu.model.Coupon;
import com.example.be_electronicmenu.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CouponService {
    @Autowired
    private CouponRepository couponRepository;

    public List<Coupon> findAll() {return couponRepository.findAll();}
    public Optional<Coupon> findById(Long id) {return couponRepository.findById(id);}
    public Coupon save(Coupon coupon) {return couponRepository.save(coupon);}
    public void deleteById(Long id) {couponRepository.deleteById(id);}
}
