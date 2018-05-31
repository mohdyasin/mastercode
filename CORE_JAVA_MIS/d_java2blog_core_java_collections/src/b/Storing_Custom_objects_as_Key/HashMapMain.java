package b.Storing_Custom_objects_as_Key;

import java.util.HashMap;

public class HashMapMain {
	public static void main(String args[]) {
		// HashMap with Country name as key and capital as value
		// HashMap stores elements in key value pairs
		HashMap<String, String> countryCapitalMap = new HashMap<String, String>();
		countryCapitalMap.put("India", "Delhi");
		countryCapitalMap.put("Japan", "Tokyo");
		countryCapitalMap.put("France", "Paris");
		countryCapitalMap.put("Russia", "Moscow");

		System.out.println("-----------------------------");
		// Iterating HashMap Using keySet() and for each loop
		System.out.println("Iterating HashMap Using keySet() and for each loop");
		for (String countryKey : countryCapitalMap.keySet()) {
			System.out.println("Country:" + countryKey + " and  Capital:" + countryCapitalMap.get(countryKey));

		}
		System.out.println("-----------------------------");
	}

}