package com.gilbarco.controller;

import java.time.Instant;
import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gilbarco.service.CounterEnum;
import com.gilbarco.vo.CounterData;

@Controller
public class CounterController {
	
	@GetMapping("/nijish-gilbarco/getCount")
    @ResponseBody
    public CounterData getCount() {
		CounterEnum singleton = CounterEnum.INSTANCE;
		int counter = singleton.getValue();
		counter++;
		singleton.setValue(counter);
    	CounterData counterData= new CounterData();
    	counterData.setCalls(counter);
    	counterData.setTimestamp(LocalDateTime.now());
    	return counterData;
    }
	

}
