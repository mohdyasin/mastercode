package d_video07.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachThroughLambdaExpressionExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		//Consumer<Integer> consumer = (Integer i) -> System.out.println(i);
		
		Consumer<Integer> consumer = (i) -> System.out.println(i);

		list.forEach(consumer);
		
		
		//Or
		list.forEach((i) -> System.out.println(i));
	}
}
