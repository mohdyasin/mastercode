package video14.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class V_14_Examples_Java8Examples {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), 
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), 
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		// Step: Sort list by last name
		/*
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}

		});
		*/
		//Or
		Collections.sort(people, (Person p1, Person p2) -> {
			return p1.getLastName().compareTo(p2.getLastName());
		});
		//Or
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		//Or
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		// Step 2: Create a method that prints all elements in the list
		System.out.println(":::::::::::::::::::::::::::Printing all persons:::::::::::::::::::::::::::");
		System.out.println();
		//printAll(people);
		//Or
		printConditionally(people, p -> true);

		// Step 3:Create a method that prints all people that have last name begining
		// with "C"
		System.out.println();
		System.out.println( ":::::::::::::::::::::::::::Printing persons whose last name begins with C:::::::::::::::::::::::::::");
		System.out.println();
		/*
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
		*/
		//Or
		//printConditionally(people, (Person p) -> p.getLastName().startsWith("C"));
		//Or
		printConditionally(people, p -> p.getLastName().startsWith("C"));
		
		System.out.println();
		System.out.println(
				":::::::::::::::::::::::::::Printing persons whose first name begins with C:::::::::::::::::::::::::::");
		System.out.println();
		/*
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
		});
		*/
		//Or
		//printConditionally(people, (Person p) -> p.getFirstName().startsWith("C"));
		//Or
		printConditionally(people, p -> p.getFirstName().startsWith("C"));
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}

	}
	//No Longer would be needed
	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}

	}

	interface Condition {
		boolean test(Person p);
	}
}
