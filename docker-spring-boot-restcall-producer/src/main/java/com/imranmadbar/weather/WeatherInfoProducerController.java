package com.imranmadbar.weather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherInfoProducerController {
	
	@GetMapping("/")
	public String index() {
		return "Welcome to Weather Info Producer API !"
				+ " For Check info: http://localhost:8282/check-weather";
	}
	
	@GetMapping("/check-weather")
	public String checkWeather() {
		return "Under consruct";
	}

}

