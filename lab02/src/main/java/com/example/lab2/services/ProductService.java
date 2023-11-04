package com.example.lab2.services;

import com.example.lab2.entities.Product;
import com.example.lab2.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> findAll(){
        List<Product> productList = productRepository.findAll();
        return productList;
    }
    @Transactional
    public Optional<Product> findById(int id){
        return productRepository.findById(id);
    }
    public void addAndUpdateProduct(Product product){
        productRepository.save(product);
    }

    public void deleteProductById(int id){
        productRepository.deleteById(id);
    }

    public List<Product> findByPriceGreaterThan(double minPrice){
       return  productRepository.findByPriceGreaterThan(minPrice);
    }

    public List<Product> findByCategoryAndPriceLessThan(String category, double maxPrice){
        return productRepository.findByCategoryNameAndPriceLessThan(category, maxPrice);
    }

    public List<Product> findByNameContaining(String keyword){
        return  productRepository.findByNameContaining(keyword);
    }


}
