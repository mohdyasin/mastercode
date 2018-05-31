package c.How_HashMap_works_in_java;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapStructure {

	/**
	 * @author Arpit Mandliya
	 */
	public static void main(String[] args) {

		Country india = new Country("India", 1000);
		Country japan = new Country("Japan", 10000);

		Country france = new Country("France", 2000);
		Country russia = new Country("Russia", 20000);
		
		System.out.println(india.hashCode());
		System.out.println(japan.hashCode());
		System.out.println(france.hashCode());
		System.out.println(russia.hashCode());

		HashMap countryCapitalMap = new HashMap();
		countryCapitalMap.put(india, "Delhi");
		

		Iterator countryCapitalIter = countryCapitalMap.keySet().iterator();// put debug point at this line
		while (countryCapitalIter.hasNext()) {
			Country countryObj = (Country) countryCapitalIter.next();
			String capital = (String) countryCapitalMap.get(countryObj);
			System.out.println(countryObj.getName() + "----" + capital);
		}
	}
}
