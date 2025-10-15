package com.ofppt.products_api.controller;

import com.ofppt.products_api.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ofppt.products_api.repo.ProductRepo;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepo repository;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return repository.findAll();
    }
}
