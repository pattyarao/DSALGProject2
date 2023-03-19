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



	public String head(){
		if (!isQueueEmpty()){
			return this.headNode.getData();
		}

		return null;
	}

	public String tail(){
		if (!isQueueEmpty()){
			return this.tailNode.getData();
		}

		return null;
	}

}
