package com.jtc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jtc.dto.CommandDTO;
import com.jtc.entity.OrderDetails;
import com.jtc.repository.OrderDetailsRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderDetailsRepository repository;
	
	public void placeOrder(CommandDTO dto) {
		OrderDetails orderDetails = new OrderDetails();
		orderDetails.setUserId(dto.getUserId());
		orderDetails.setProductId(dto.getProductId());
		
		repository.save(orderDetails);
	}

}
