package com.weather;

import org.junit.Test;

public class WeatherTest {

	@Test
	public String  getWeather(String city,String country) {

		GlobalWeather globalWeatherService=new GlobalWeather();
		GlobalWeatherSoap port=globalWeatherService.getGlobalWeatherSoap();
		
//		 System.out.println("WEATHER IS:::"+ port.getWeather("Thiruvananthapuram",
//		 "India"));
//		 String str=port.getCitiesByCountry("India");
//		 System.out.println(str);
		 
		String response=port.getWeather(city, country);
		
		//assertEquals(str2,"Data Not Found");
		return response;
	}

}
