package com.example.be_electronicmenu.service;

import com.example.be_electronicmenu.model.Rating;
import com.example.be_electronicmenu.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    public List<Rating> findAll() {return ratingRepository.findAll();}
    public Optional<Rating> findById(Long id) {return ratingRepository.findById(id);};
    public Rating save(Rating rating) {return ratingRepository.save(rating);};
    public void deleteById(Long id) { ratingRepository.deleteById(id);};
}
