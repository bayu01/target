package com.jacques.target.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacques.target.domain.Price;
import com.jacques.target.repository.PriceRepository;

@Service
public class PriceServiceImpl implements PriceService {

	@Autowired
	PriceRepository priceRepository;

	@Override
	public Optional<Price> getPriceById(Integer id) {
		return priceRepository.findById(id);
	}
}
