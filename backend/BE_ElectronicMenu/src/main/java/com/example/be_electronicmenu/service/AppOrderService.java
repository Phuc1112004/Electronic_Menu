package com.example.be_electronicmenu.service;


import com.example.be_electronicmenu.model.AppOrder;
import com.example.be_electronicmenu.repository.AppOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppOrderService {
    @Autowired
    private AppOrderRepository appOrderRepository;
    public List<AppOrder> findAll() {return appOrderRepository.findAll();}
    public Optional<AppOrder> findById(Long id) {return appOrderRepository.findById(id);}
    public AppOrder save(AppOrder appOrder) {return appOrderRepository.save(appOrder);}
    public void deleteById(Long id) {appOrderRepository.deleteById(id);}
}
