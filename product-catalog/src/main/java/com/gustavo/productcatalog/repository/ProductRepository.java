package com.gustavo.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;

import com.gustavo.productcatalog.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
