package f.a.hashcode_and_equals_method_in_java_one;

public class EqualityCheckMain {

	/**
	 * @author arpit mandliya
	 */
	public static void main(String[] args) {

		Country india1 = new Country();	
		india1.setName("India");
		Country india2 = new Country();
		india2.setName("India");
		System.out.println("Is india1 is equal to india2:  " + india1.equals(india2));
	}

}