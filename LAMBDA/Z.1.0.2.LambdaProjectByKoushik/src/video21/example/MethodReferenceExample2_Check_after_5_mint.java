package video21.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import video14.example.Person;

public class MethodReferenceExample2_Check_after_5_mint {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), 
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), 
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		
		printConditionally(people, p -> true,  System.out::println);
	
	}
	//Third parameter we are introducing here as Consumer arguments
		private static void printConditionally(List<Person> people, Predicate<Person> person, Consumer<Person> consumerPerson) {
			for (Person p : people) {
				if (person.test(p)) {
					consumerPerson.accept(p);
				}
			}

		}

		// No Longer would be needed
		private static void printAll(List<Person> people) {
			for (Person p : people) {
				System.out.println(p);
			}
		}
}
