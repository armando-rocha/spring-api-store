package com.project.project1.domain.repository;

import com.project.project1.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productT);
    Product save (Product product);
    void delete(int productId);

}
