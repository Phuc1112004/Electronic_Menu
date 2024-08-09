package com.example.be_electronicmenu.repository;

import com.example.be_electronicmenu.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
