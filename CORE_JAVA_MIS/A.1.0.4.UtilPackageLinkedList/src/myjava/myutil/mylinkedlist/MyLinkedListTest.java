package myjava.myutil.mylinkedlist;

public class MyLinkedListTest {

	public static void main(String[] args) {
		MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
		myLinkedList.add("one");
		myLinkedList.add("two");
		myLinkedList.add("three");

		Iterator<String> iterator = myLinkedList.descendingIterator();
		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}
	}
}
