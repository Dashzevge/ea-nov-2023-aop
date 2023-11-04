package com.example.lab2.repositories;

import com.example.lab2.entities.Address;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends ListCrudRepository<Address,Integer> {

}
