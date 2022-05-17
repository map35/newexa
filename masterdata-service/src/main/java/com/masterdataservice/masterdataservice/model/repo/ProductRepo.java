package com.masterdataservice.masterdataservice.model.repo;

import javax.transaction.Transactional;

import com.masterdataservice.masterdataservice.model.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface ProductRepo extends JpaRepository<Product, Integer> {
    
    Product getById(String id);
}
