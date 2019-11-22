public class Edge {
	public Node start;
	public Node end;
	public double weight;
	public String direction;

	public Edge(Node start, Node end, double weight, String direction) {
		this.start = start;
		this.end = end;
		this.weight = weight;
		this.direction = direction;
	}

	public Edge(Node start, Node end, double weight) {
		this.start = start;
		this.end = end;
		this.weight = weight;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return start + " to " + end + " " + "with weight " + weight + " in direction of " + direction;
	}
}