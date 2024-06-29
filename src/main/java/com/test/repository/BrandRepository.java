package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
