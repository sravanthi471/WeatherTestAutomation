package com.weather;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeatherTest {

	@Test
	public void test() {
		GetCitiesByCountryResponse getCitiesByCountryResponse=new GetCitiesByCountryResponse();
		// TODO Auto-generated method stub

		GlobalWeather globalWeatherService=new GlobalWeather();
		GlobalWeatherSoap port=globalWeatherService.getGlobalWeatherSoap();
		
		 System.out.println("WEATHER IS:::"+ port.getWeather("Thiruvananthapuram",
		 "India"));
		 String str=port.getCitiesByCountry("India");
		 System.out.println(str);
		 
		String str2=port.getWeather("Columbus", "USA");
		assertEquals(str2,"Data Not Found");
	}

}
