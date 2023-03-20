public class Driver {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * Node head = new Node("A", null);
		 * Node n2 = new Node("B", null);
		 * Node n3 = new Node("C", null);
		 * 
		 * head.setNextNode(n2);
		 * n2.setNextNode(n3);
		 * 
		 * Node temp = head;
		 * 
		 * while (temp != null){
		 * System.out.println(temp.getData());
		 * temp = temp.getNextNode();
		 * }
		 * 
		 * 
		 */

		// Transform a string into a linkedlist
		/*
		 * 1. Iterate through the array of characters (String)
		 * 
		 * 2. For each character
		 * 2.1 The first character should be assigned to the head node (1st iteration in
		 * the loop)
		 * 2.2 Preceding characters are placed in a new node
		 * 2.3 The new node is set to the next node of the head
		 * 2.4 The tempNode will now go to the next node
		 * 
		 */

		String s1 = new String("Hello !");
		int length = s1.length();

		Node head = new Node(null, null);
		boolean executed = false;
		Node temp = head;

		for (int i = 0; i < length; i++) {

			String tempStr = String.valueOf(s1.charAt(i));

			if (head.getData() == null && executed == false) {
				head.setData(tempStr);
				executed = true;
			} else {
				Node newNode = new Node(tempStr, null);
				temp.setNextNode(newNode);
				temp = temp.getNextNode();

			}

		}

		Node test = head;

		while (test != null) {
			System.out.println(test.getData());
			test = test.getNextNode();
		}

		String testing = "-";
		System.out.println(testing.equals("-"));
	}

}