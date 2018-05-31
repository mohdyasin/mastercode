package c_video06.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachConsumerExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Consumer<Integer> consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		};
		
		list.forEach(consumer);
	}
}
