package com.example.onlineshop.repository;

import com.example.onlineshop.entity.document.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepository extends MongoRepository<Address, String> {
}
