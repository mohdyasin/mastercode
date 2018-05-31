package e_video21.example;

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
		
		Predicate<Integer> predicate  =new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t % 5 ==0;
			}
		};
		
		System.out.println(list.stream().filter(predicate).reduce(0, (c, e) -> (c + e)));
	}
}
