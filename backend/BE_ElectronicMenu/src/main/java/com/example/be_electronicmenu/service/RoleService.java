package com.example.be_electronicmenu.service;

import com.example.be_electronicmenu.model.Role;
import com.example.be_electronicmenu.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> findAll() {return roleRepository.findAll();}
    public Optional<Role> findById(Long id) {return roleRepository.findById(id);}
    public Role save(Role appOrder) {return roleRepository.save(appOrder);}
    public void deleteById(Long id) {roleRepository.deleteById(id);}
}
