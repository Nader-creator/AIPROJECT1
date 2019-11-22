import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Node implements Comparable {
	public String stationName;
	public String line;
	public List<Edge> connections;
	private Double distance = Double.MAX_VALUE;
	double x;
	double y;
	// We need Euclidian points if we are going to use A* search (Euclidian distance
	// will serve as our heuristic)
	private Double heuristic;
	private Node previous = null;

	public Node(String stationName, String line) {
		this.line = line;
		this.stationName = stationName;
		// TODO Auto-generated constructor stub
	}

	public int compareTo(Node n) {
		return Double.compare(heuristic + distance, n.heuristic + n.distance);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return stationName + " " + line;
	}

	public void setHeuristic(Node destination) {
		this.heuristic = Node.distanceFrom(this, destination);
	}

	private static Double distanceFrom(Node node, Node destination) {
		return Math.pow(Math.abs(node.x - destination.x), 2) + Math.pow(Math.abs(node.y - destination.y), 2);
	}

	public void setPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public static void printPath(Node destination) {
		System.out.println("Total distance traveled: " + destination.getDistance());
		Node current = destination;
		Stack path = new Stack();
		path.push(destination);

		// Enqueue all path nodes to a stack (so we can easily print in reverse order)
		while (current.getPrevious() != null) {
			current = current.getPrevious();
			path.push(current);
		}

		// Print out the path in the correct order
		int i = 0;
		do {
			System.out.println(++i + ": " + path.pop());
		} while (!path.isEmpty());
	}

	public Double getDistance() {
		return distance;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node n) {
		previous = n;
	}

	public void setDistance(Double d) {
		distance = d;
	}

	@Override
	public int compareTo(Object arg0) {
		Node n = (Node) arg0;
		return Double.compare(heuristic + distance, n.heuristic + n.distance);

	}

}