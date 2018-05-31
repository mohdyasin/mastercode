package video24.example;

import java.util.Arrays;
import java.util.List;

import video22.example.Person;

public class StreamParallelExample {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), 
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), 
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));
		
		people.parallelStream().filter(p -> p.getLastName().startsWith("C")).forEach(p-> System.out.println(p));
	}
}
