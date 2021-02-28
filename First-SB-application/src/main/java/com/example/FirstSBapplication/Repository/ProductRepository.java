package com.example.FirstSBapplication.Repository;

import com.example.FirstSBapplication.Entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    Optional<Product> findByName(String name);
}
