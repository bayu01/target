package com.jacques.target.domain;

public class ProductWrapper {

	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "ProductWrapper [product=" + product + "]";
	}
}
