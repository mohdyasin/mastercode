package e_video18.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class ForEachExampleUsingMethodReferences2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		//System.out.println(list.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
		Stream<Integer> stream1 = list.stream();
		
		
		
		Stream<Integer> stream2 = stream1.map(i->i*2);
		
		//int result = (Integer)stream2.reduce(0, (Integer i, Integer j)-> (i+j));
		//int result = (Integer)stream2.reduce(0, (i, j)-> (i+j));
		
		System.out.println((Integer)stream2.reduce(0, (i, j)-> (i+j)));
	}
}
