package com.jacques.target.domain;

import org.springframework.data.annotation.Id;

public class Price {

	@Id
	public Integer id;
	// TODO: check MongoDb Types...
	public float price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
