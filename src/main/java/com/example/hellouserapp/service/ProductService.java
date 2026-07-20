package com.example.hellouserapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hellouserapp.entity.Product;
import com.example.hellouserapp.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    // Add Product
    public Product addProduct(Product product) {
        return repository.save(product);
    }

    // Get All Products
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    // Get Product By ID
    public Optional<Product> getProductById(Long id) {
        return repository.findById(id);
    }

    // Update Product
    public Product updateProduct(Long id, Product product) {
        product.setId(id);
        return repository.save(product);
    }

    // Delete Product
    public String deleteProduct(Long id) {
        repository.deleteById(id);
        return "Product Deleted Successfully";
    }
}