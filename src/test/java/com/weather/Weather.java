package com.weather;



import static org.junit.Assert.assertEquals;

public class Weather {

	public static void main(String[] args) {
		GetCitiesByCountryResponse getCitiesByCountryResponse=new GetCitiesByCountryResponse();
		// TODO Auto-generated method stub

		GlobalWeather globalWeatherService=new GlobalWeather();
		try {
			
			GlobalWeatherSoap port=globalWeatherService.getGlobalWeatherSoap();
			
			 System.out.println("WEATHER IS:::"+ port.getWeather("Thiruvananthapuram",
			 "India"));
			 String str=port.getCitiesByCountry("India");
			 System.out.println(str);
			 
			String str2=port.getWeather("Columbus", "USA");
			assertEquals(str2,"Data Not Found");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
	}


