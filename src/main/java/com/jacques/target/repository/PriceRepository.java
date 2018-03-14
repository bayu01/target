package com.jacques.target.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jacques.target.domain.Price;

public interface PriceRepository extends MongoRepository<Price, Integer> {

}
