package com.example.lab2.repositories;

import com.example.lab2.entities.Product;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends ListCrudRepository<Product, Integer> {
    List<Product> findByPriceGreaterThan(double minPrice);

    List<Product> findByCategoryNameAndPriceLessThan(String category, double maxPrice);

    List<Product> findByNameContaining(String keyword);

}
