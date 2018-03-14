package com.jacques.target;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jacques.target.controller.ProductController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {

	@Autowired
	private ProductController productController;

	@Test
	public void contextLoads() {
		assertThat(productController).isNotNull();
	}

}
