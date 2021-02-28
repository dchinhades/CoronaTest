package com.example.FirstSBapplication.Controller;

import com.example.FirstSBapplication.Entity.Product;
import com.example.FirstSBapplication.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @RequestMapping(path = "/products/{name}", method = RequestMethod.GET)
    public Optional<Product> getProductByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }

    @RequestMapping(path = "/products/{id}", method = RequestMethod.GET)
    public Optional<Product> getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @RequestMapping(path = "/products", method = RequestMethod.POST)
    public void addNewProduct(@RequestBody Product product) {
        productService.addNewProduct(product);
    }

    @RequestMapping(path = "/products/{id}", method = RequestMethod.PUT)
    public void updateProduct(@RequestBody Product product, @PathVariable int id) {
        productService.updateProduct(product,id);
    }

    @RequestMapping(path = "/products/{id}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }
}
