package com.practice.aws.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.practice.aws.lambda.domain.Order;
import com.practice.aws.lambda.repository.OrderDao;

@SpringBootApplication
public class SpringbootAwsLambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsLambdaApplication.class, args);
	}

	@Autowired
	OrderDao orderDao;

	@Bean
	public Supplier<List<Order>> getAllOrder() {
		return () -> orderDao.createOrders();

	}

	@Bean
	public Function<String, List<Order>> findOrderByName() {
		return (input) -> orderDao.createOrders().stream().filter(order -> order.getName().equals(input))
				.collect(Collectors.toList());
	}

}
