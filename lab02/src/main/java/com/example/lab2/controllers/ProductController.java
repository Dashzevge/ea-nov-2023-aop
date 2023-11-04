package com.example.lab2.controllers;

import com.example.lab2.entities.Product;
import com.example.lab2.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    @GetMapping
    public List<Product> findAll() {
        return this.productService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> findById(@PathVariable int id) {
        return this.productService.findById(id);
    }


    @GetMapping("/byMinPrice")
    public List<Product> getProductsByMinPrice(@RequestParam double minPrice) {
        return this.productService.findByPriceGreaterThan(minPrice);
    }

    @GetMapping("/byCategoryAndMaxPrice")
    public List<Product> getProductsByCategoryAndMaxPrice(@RequestParam String category, @RequestParam double maxPrice) {
        return this.productService.findByCategoryAndPriceLessThan(category, maxPrice);
    }

    @GetMapping("/byKeyword")
    public List<Product> getProductsByKeyword(@RequestParam String keyword) {
        return this.productService.findByNameContaining(keyword);
    }

    @PostMapping
    public void save(@RequestBody Product product) {
        this.productService.addAndUpdateProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        this.productService.deleteProductById(id);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Product product) {
        this.productService.addAndUpdateProduct(product);
    }
}
