public class Queue {

	private int n;
	private int count;
	private Node headNode;
	private Node tailNode;
	
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
}
