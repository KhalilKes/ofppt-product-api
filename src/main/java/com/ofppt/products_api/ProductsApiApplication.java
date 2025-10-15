package com.ofppt.products_api;

import com.ofppt.products_api.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.ofppt.products_api.repo.ProductRepo;


@SpringBootApplication
public class ProductsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsApiApplication.class, args);
	}

    @Autowired
    private ProductRepo repository;
    Product p1 = new Product("HP LAPTOP", 6999);
    Product p2 = new Product("SAMSUNG", 1500);


    @Bean
    CommandLineRunner init() {
        return args -> {
            repository.save(p1);
            repository.save(p2);
        };
    }
}
