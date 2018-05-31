package e_video19.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class ForEachExampleUsingMethodReferences {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		//System.out.println(list.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
		
		System.out.println(list.stream().map(i -> i * 2).reduce(0, (c, e) -> Integer.sum(c, e)));
		

		System.out.println(list.stream().map(i -> i * 2).reduce(0, Integer::sum));
		
		
	}
}
