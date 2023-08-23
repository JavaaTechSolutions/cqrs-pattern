package com.jtc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jtc.dto.CommandDTO;
import com.jtc.service.OrderService;

@RestController
@RequestMapping("/order")
public class CommandController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("place-order")
	public void placeOrder(@RequestBody CommandDTO dto) {
		orderService.placeOrder(dto);
	}

}
