package com.example.lab2.repositories;

import com.example.lab2.entities.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends ListCrudRepository<User, Integer>{

    @Override
    Optional<User> findById(Integer id);

}
