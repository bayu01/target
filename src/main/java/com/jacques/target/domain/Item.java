package com.jacques.target.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

	@JsonProperty("product_description")
	private ProductDescription productDescription;

	public ProductDescription getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(ProductDescription productDescription) {
		this.productDescription = productDescription;
	}

	@Override
	public String toString() {
		return "Item [productDescription=" + productDescription + "]";
	}
}
