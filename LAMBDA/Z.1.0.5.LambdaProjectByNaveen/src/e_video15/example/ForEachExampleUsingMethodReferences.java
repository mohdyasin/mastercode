package e_video15.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExampleUsingMethodReferences {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		int result = 0;
		for (int i : list) {
			i = result + i * 10;
			System.out.println(i);
		}

		System.out.println(list.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
	}

}
