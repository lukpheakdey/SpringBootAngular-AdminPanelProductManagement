package com.pheakdey.serverproductmanagement.repository;

import com.pheakdey.serverproductmanagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
