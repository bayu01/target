package com.jacques.target.service;

import java.util.Optional;

import com.jacques.target.domain.Price;

public interface PriceService {

	public Optional<Price> getPriceById(Integer id);

	// TODO: add Update method.
}
