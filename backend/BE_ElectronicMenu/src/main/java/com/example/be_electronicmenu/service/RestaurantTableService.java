package com.example.be_electronicmenu.service;

import com.example.be_electronicmenu.model.RestaurantTable;
import com.example.be_electronicmenu.repository.RestaurantTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantTableService {
    @Autowired
    private RestaurantTableRepository restaurantTableRepository;
    public List<RestaurantTable> findAll() {return restaurantTableRepository.findAll();}
    public Optional<RestaurantTable> findById(Long id) {return restaurantTableRepository.findById(id);}
    public RestaurantTable save(RestaurantTable appOrder) {return restaurantTableRepository.save(appOrder);}
    public void deleteById(Long id) {restaurantTableRepository.deleteById(id);}

}
