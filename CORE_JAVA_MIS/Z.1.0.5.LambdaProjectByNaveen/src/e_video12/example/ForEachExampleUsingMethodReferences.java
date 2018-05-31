package e_video12.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExampleUsingMethodReferences {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		
		list.forEach(System.out::println);
	}
}
