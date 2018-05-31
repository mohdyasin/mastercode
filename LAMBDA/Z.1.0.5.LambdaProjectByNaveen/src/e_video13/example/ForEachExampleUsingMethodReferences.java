package e_video13.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExampleUsingMethodReferences {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		
		list.forEach(ForEachExampleUsingMethodReferences::doubleIt);
	}
	
	public static void doubleIt(int i) {
		System.out.println(i*2);
	}
}
