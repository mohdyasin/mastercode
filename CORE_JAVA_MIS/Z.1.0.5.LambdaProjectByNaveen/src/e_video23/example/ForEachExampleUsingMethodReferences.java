package e_video23.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ForEachExampleUsingMethodReferences {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 20, 35, 46, 55, 68, 75);
		//System.out.println(list.stream().filter(i -> i % 5 == 0).reduce(0, (c, e) -> (c + e)));
		

		int result = 0;
		for(int i : list) {
			if(i%5==0) {
				result =i*2;
				break;
			}
		}
		System.out.println(result);
		
		
		System.out.println(list.stream()
				.filter(t -> t % 5 ==0)
				.map(t -> t * 2)
				.findFirst().orElse(0));
	}
}
