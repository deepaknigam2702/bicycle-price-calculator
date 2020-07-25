package com.nineone.social.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineone.social.model.Bicycle;
import com.nineone.social.model.ChainAssembly;
import com.nineone.social.model.Frame;
import com.nineone.social.model.HandleBar;
import com.nineone.social.model.Seat;
import com.nineone.social.model.Wheel;

@Service
public class PriceCalculatorServices {
	
	@Autowired
	Bicycle bicycle;

	@Autowired
	Frame frame;
	
	@Autowired
	Wheel wheel;
	
	@Autowired
	Seat seat;
	
	@Autowired
	ChainAssembly chainAssembly;
	
	@Autowired
	HandleBar handleBar;
	
	@Autowired
	BicyclePrice bicyclePrice;
	
	public Integer calculatePrice(Map<String, Object> requestBody) {
		frame.setFrameType((String) requestBody.get("frameType"));
		frame.setHeight((Integer) requestBody.get("frameHeight"));
		wheel.setTyreType((String) requestBody.get("tyreType"));
		wheel.setWheelType((String) requestBody.get("wheelType"));
		seat.setType((String)requestBody.get("seatType"));
		seat.setHeight((Integer)requestBody.get("seatHeight"));
		chainAssembly.setNumberOfGears((Integer) requestBody.get("numberOfGears"));
		chainAssembly.setAutoGear((Boolean)requestBody.get("autoGear"));
		handleBar.setType((String) requestBody.get("handleBarType"));
		
		bicycle.setChainAssembly(chainAssembly);
		bicycle.setFrame(frame);
		bicycle.setHandleBar(handleBar);
		bicycle.setSeat(seat);
		bicycle.setWheel(wheel);
		
		String dateOfPurchaseStr = (String) requestBody.get("dateOfPurchase");
		
		DateFormat format = new SimpleDateFormat("MM-dd-yyyy", Locale.ENGLISH);
		Date dateOfPurchase = null;
		try {
			dateOfPurchase = format.parse(dateOfPurchaseStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(dateOfPurchase);
		
		return bicyclePrice.calculatePrice(bicycle, dateOfPurchase);
	}
}