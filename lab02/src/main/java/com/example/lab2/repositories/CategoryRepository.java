package com.example.lab2.repositories;

import com.example.lab2.entities.Category;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends ListCrudRepository<Category, Integer> {

}
