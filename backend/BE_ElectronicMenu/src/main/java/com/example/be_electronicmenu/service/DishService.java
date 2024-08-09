package com.example.be_electronicmenu.service;


import com.example.be_electronicmenu.model.Dish;
import com.example.be_electronicmenu.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DishService {
    @Autowired
    private DishRepository dishRepository;

    public List<Dish> findAll() {return dishRepository.findAll();}
    public Optional<Dish> findById(Long id) {return dishRepository.findById(id);}
    public Dish save(Dish appOrder) {return dishRepository.save(appOrder);}
    public void deleteById(Long id) {dishRepository.deleteById(id);}
}
