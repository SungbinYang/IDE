package me.sungbin.inflearn.intellij.chap7;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
}
