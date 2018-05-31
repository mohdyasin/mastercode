package C.Find_middle_element_of_a_linked_list_in_java;

public class Find_middle_element_of_a_linked_list_in_java {
	private Node head;

	public void addToTheLast(Node node) {

		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = node;
		}
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	// This function will find middle element in linkedlist
	public Node findMiddleNode(Node head) {
		Node slowPointer, fastPointer;
		slowPointer = fastPointer = head;

		while (fastPointer != null) {
			fastPointer = fastPointer.next;
			if (fastPointer != null && fastPointer.next != null) {
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next;
			}
		}

		return slowPointer;

	}

	public static void main(String[] args) {
		Find_middle_element_of_a_linked_list_in_java list = new Find_middle_element_of_a_linked_list_in_java();
		// Creating a linked list
		Node head = new Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));

		list.printList();
		// finding middle element
		Node middle = list.findMiddleNode(head);
		System.out.println("Middle node will be: " + middle.value);

	}

}