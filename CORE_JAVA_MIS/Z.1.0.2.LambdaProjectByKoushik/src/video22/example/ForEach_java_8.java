package video22.example;

import java.util.Arrays;
import java.util.List;



public class ForEach_java_8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), 
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), 
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));
		//Sequential
		for(int i = 0 ; i < people.size();i++) {
			System.out.println(people.get(i));
		}
		//Sequential
		for(Person p: people) {
			System.out.println(p);
		}
		
		//Parallel [You are giving instruction to how to execute]
		people.forEach(p->System.out.println(p));
		//Or
		people.forEach(System.out::println);
	}
}
