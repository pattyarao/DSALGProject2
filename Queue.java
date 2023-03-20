public class Queue {

	private int n;
	private int count;
	private Node headNode;
	private Node tailNode;

	public Queue(int n) {
		this.n = n;
		this.count = 0;
		this.headNode = null;
		this.tailNode = null;
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
	public Node getHeadNode() {
		return headNode;
	}
	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}
	public Node getTailNode() {
		return tailNode;
	}
	public void setTailNode(Node tailNode) {
		this.tailNode = tailNode;
	}

	//Queue Implementation

	public boolean isQueueEmpty(){
		if (this.headNode == null && this.tailNode == null){
			return true;
		}
		else {
			return false;
		}
	}

	public boolean isQueueFull(){
		if (this.count == this.n - 1){
			return true;
		}
		else {
			return false;
		}
	}

	public void enqueue(String data){
		if (!isQueueFull()){
			if (isQueueEmpty()){
				Node newNode = new Node(data, null);
				this.headNode = newNode;
				this.tailNode = newNode;
				this.count++;
			}
			else {
				Node newNode = new Node(data, null);
				this.tailNode.setNextNode(newNode);
				this.tailNode = this.tailNode.getNextNode();
				this.count++;
			}
		}
		else {
			System.out.println("Queue is full. Cannot Add more");
		}
	}
	public String dequeue(){
		if (!isQueueEmpty()){

			if (this.count == 1){
				String retVal = this.headNode.getData();
				this.headNode = null;
				this.tailNode = null;
				return retVal;
			}
			else {
				String retVal = this.headNode.getData();
				this.headNode = this.headNode.getNextNode();
				this.count--;
				return retVal;
			}

		}

		return null;
	}

	public void displayQueue() {
		Node temp = this.headNode;
		System.out.println("QUEUE: ");
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNextNode();
		}
	}



	public String head(){
		if (!isQueueEmpty()){
			return this.headNode.getData();
		}

		return "None";
	}

	public String tail(){
		if (!isQueueEmpty()){
			return this.tailNode.getData();
		}

		return "None";
	}

}
