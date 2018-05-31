package A.How_to_reverse_a_linked_list_in_java_USING_ITERATIVE_WAY;

public class How_to_reverse_a_linked_list_in_java {
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

	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	// Reverse linkedlist using this function
	public static Node reverseLinkedList(Node currentNode) {
		// For first node, previousNode will be null
		Node previousNode = null;
		Node nextNode;
		while (currentNode != null) {
			nextNode = currentNode.next;
			// reversing the link
			currentNode.next = previousNode;
			// moving currentNode and previousNode by 1 node
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}

	public static void main(String[] args) {
		How_to_reverse_a_linked_list_in_java list = new How_to_reverse_a_linked_list_in_java();
		// Creating a linked list
		Node head = new Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));

		list.printList(head);
		// Reversing LinkedList
		Node reverseHead = reverseLinkedList(head);
		System.out.println("After reversing");
		list.printList(reverseHead);

	}

}