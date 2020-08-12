package com.practice.aws.lambda.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.practice.aws.lambda.domain.Order;

@org.springframework.stereotype.Repository
public class OrderDao {
	
	public List<Order> createOrders(){
		return Stream.of(
				
				new Order (101,"Mobile",8000.00, 1),
				new Order (102,"TV",25000.00, 1),
				new Order (278,"TV",22000.00, 1),
				new Order (953,"Fan",2200.00, 1)).collect(Collectors.toList());
	
	}
	
	

}
