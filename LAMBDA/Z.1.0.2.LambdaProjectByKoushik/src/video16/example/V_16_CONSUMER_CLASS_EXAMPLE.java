package video16.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import video14.example.Person;

public class V_16_CONSUMER_CLASS_EXAMPLE {
	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), 
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), 
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		// Step: Sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		// Step 2: Create a method that prints all elements in the list
		System.out.println(":::::::::::::::::::::::::::Printing all persons:::::::::::::::::::::::::::");
		System.out.println();
		printConditionally(people, p -> true, p-> System.out.println(p));

		// Step 3:Create a method that prints all people that have last name begining
		// with "C"
		System.out.println();
		System.out.println( ":::::::::::::::::::::::::::Printing persons whose last name begins with C:::::::::::::::::::::::::::");
		System.out.println();
		//printConditionally(people, (Person p) -> p.getLastName().startsWith("C"));
		//Or
		printConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println("Last Name :: " + p.getLastName()));
		
		System.out.println();
		System.out.println(":::::::::::::::::::::::::::Printing persons whose first name begins with C:::::::::::::::::::::::::::");
		System.out.println();
		//Or
		printConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p));
	
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
	//Predicate<t> will take care
	/*
	interface Condition {
		boolean test(Person p);
	}
	*/
}
