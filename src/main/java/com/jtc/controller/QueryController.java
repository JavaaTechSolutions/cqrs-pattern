package com.jtc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jtc.entity.OrderDetails;
import com.jtc.service.QueryService;

@RestController
@RequestMapping("/query-order")
public class QueryController {
	
	@Autowired
	private QueryService orderService;
	
	@GetMapping("get-all-orders")
	public List<OrderDetails> getAllOrders() {
		return orderService.getAllOrders();
	}

}
