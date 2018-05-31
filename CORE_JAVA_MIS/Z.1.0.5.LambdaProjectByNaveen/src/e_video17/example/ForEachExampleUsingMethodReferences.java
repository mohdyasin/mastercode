package e_video17.example;

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
		Stream<Integer> stream1 = list.stream();
		
		Function<Integer, Integer> function1 = new Function<Integer, Integer>(){

			@Override
			public Integer apply(Integer t) {
				return t*2;
			}
			
		};
		
		BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		};
		
		Stream<Integer> stream2 = stream1.map(function1);
		
		int result = (Integer)stream2.reduce(0, binaryOperator);
		
		System.out.println(result);
	}
}
