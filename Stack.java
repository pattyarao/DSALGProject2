
public class Stack {

	private int n;
	private int count;
	private Node topNode;

	public Stack(int n) {
		this.n = n;
		this.count = 0;
		this.topNode = null;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Node getTopNode() {
		return topNode;
	}

	public void setTopNode(Node topNode) {
		this.topNode = topNode;
	}

	// Stack Functions

	public boolean isStackEmpty() {
		if (this.topNode == null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isStackFull() {
		if (this.n == this.count) {
			return true;
		} else {
			return false;
		}
	}

	public void push(String data) {
		if (!isStackFull()) {

			if (isStackEmpty()) {
				this.count++;
				this.topNode = new Node(data, null);
			} else {
				Node newNode = new Node(data, null);
				newNode.setNextNode(this.topNode);
				this.topNode = newNode;
				this.count++;
			}
		}
	}

	public String pop() {
		if (!isStackEmpty()) {
			String retVal = this.topNode.getData();
			this.topNode = this.topNode.getNextNode();
			this.count--;
			return retVal;
		} else {
			return "Cannot Pop. Stack Already Empty";
		}
	}

	public void displayStack() {
		Node temp = this.topNode;
		System.out.println("STACK: ");
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNextNode();
		}
	}

	public String top() {

		if (isStackEmpty()) {
			System.out.println("Error!");
			return "Stack is empty.";
		} else {
			return this.topNode.getData();
		}
	}
}
