package com.example.lab2.services;

import com.example.lab2.entities.Review;
import com.example.lab2.repositories.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public List<Review> findAll(){
        List<Review> reviewList = reviewRepository.findAll();
        return reviewList;
    }

    public List<Review> findByProductId(Integer id){
        return reviewRepository.findByProductId(id);
    }

    @Transactional
    public Optional<Review> findById(int id){
        return reviewRepository.findById(id);
    }
    public void addAndUpdateReview(Review user){
        reviewRepository.save(user);
    }

    public void deleteReviewById(int id){
        reviewRepository.deleteById(id);
    }
}
