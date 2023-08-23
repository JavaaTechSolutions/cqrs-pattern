package com.jtc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jtc.entity.OrderDetails;
import com.jtc.repository.OrderQueryDetailsRepository;

@Service
public class QueryService {

	@Autowired
	private OrderQueryDetailsRepository repository;

	public List<OrderDetails> getAllOrders() {
		return repository.findAll();
	}

}
