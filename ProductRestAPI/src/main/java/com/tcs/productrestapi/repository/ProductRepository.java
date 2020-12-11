package com.tcs.productrestapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.productrestapi.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByCategory(String catName);
	// select * from product where price > pricevalue
	List<Product> findByPriceGreaterThan(float priceValue );
	List<Product> findByCategoryAndPriceLessThan(String category,float price);
	
	//("a%")
	List<Product> findByProductNameLike(String productName);
}
