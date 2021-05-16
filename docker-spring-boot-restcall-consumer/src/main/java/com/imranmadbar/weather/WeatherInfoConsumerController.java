package com.imranmadbar.weather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherInfoConsumerController {
	
	@GetMapping("/")
	public String index() {
		return "Welcome to Weather Info Consumer API !"
				+ " For Weather info: http://localhost:8282/get-weather-info";
	}
	
	@GetMapping("/get-weather-info")
	public String getWeatherInfo() {
		return "Under consruct";
	}

}
