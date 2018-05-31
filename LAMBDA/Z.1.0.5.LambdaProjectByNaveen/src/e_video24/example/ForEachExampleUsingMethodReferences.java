package e_video24.example;

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
				.filter(ForEachExampleUsingMethodReferences::isDivisable)
				.map(ForEachExampleUsingMethodReferences::mapDouble)
				.findFirst().orElse(0));
	}
	
	public static boolean isDivisable(int i) {
		System.out.println("In Div " + i);
		return i %5 == 0;
	}
	
	public static int mapDouble(int i) {
		System.out.println("In Map Double " + i);
		return i *2;
	}
}
