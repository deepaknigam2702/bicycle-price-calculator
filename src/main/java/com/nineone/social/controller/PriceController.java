package com.nineone.social.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nineone.social.service.PriceCalculatorServices;

@RestController
public class PriceController {

	@Autowired
	PriceCalculatorServices priceCalculatorServices;
	
	@GetMapping("/calculatePrice")
	public Integer calculatePrice(@RequestBody Map<String,Object> requestBody) {
		System.out.println("========inside calculatePrice=========="+requestBody);
		return priceCalculatorServices.calculatePrice(requestBody);
	}
}