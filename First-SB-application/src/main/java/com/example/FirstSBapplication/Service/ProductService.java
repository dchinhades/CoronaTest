package com.example.FirstSBapplication.Service;


import com.example.FirstSBapplication.Entity.Product;
import com.example.FirstSBapplication.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }

    public Product addNewProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product, int id) {
        return productRepository.save(product);
    }

    public String deleteProduct(int id) {
        productRepository.deleteById(id);
        return "Product removed "+id;
    }

    public Optional<Product> getProductByName(String name) {
        return productRepository.findByName(name);
    }
}
