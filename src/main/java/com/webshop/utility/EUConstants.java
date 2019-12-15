package com.webshop.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class EUConstants {
	
	public final static String EU ="EU";
	
	public final static Map<String, String> mapOfEUCountries = new HashMap<String, String>() {
		{ 
			 put("ES", "Spain");
			 put("SE", "Sweden");
		}
			
	};
	
	public final static List<String> listOfEUCountriesCode = new ArrayList<>(mapOfEUCountries.keySet());
	public final static List<String> listOfEUCountriesName = new ArrayList<>(mapOfEUCountries.values());
	
}
