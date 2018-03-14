package com.jacques.target.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jacques.target.domain.Price;
import com.jacques.target.domain.ProductWrapper;
import com.jacques.target.service.PriceService;

@RestController
public class ProductController {
	private static final String URI_TEMPLATE = "https://redsky.target.com/v2/pdp/tcin/{productId}";

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	private PriceService priceService;

	@RequestMapping(value = "product/{id}", method = GET, produces = APPLICATION_JSON_VALUE)
	public ProductWrapper getProduct(@PathVariable Integer id) {

		Map<String, String> uriVariables = new HashMap<>(1);
		uriVariables.put("productId", id.toString());

		ProductWrapper productWrapper = restTemplate.getForObject(URI_TEMPLATE, ProductWrapper.class, uriVariables);

		Optional<Price> price = priceService.getPriceById(id);

		return productWrapper;
	}
}
