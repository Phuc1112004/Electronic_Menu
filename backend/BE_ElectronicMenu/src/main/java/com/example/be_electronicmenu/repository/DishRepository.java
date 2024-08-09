package com.example.be_electronicmenu.repository;

import com.example.be_electronicmenu.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Long> {
}
