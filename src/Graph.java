import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;


class Graph {
	HashMap<Node, ArrayList<Edge>> Map;
	ArrayList<Node> Nodes;

	static Stack st = new Stack();

	public Graph() {
		Map = new HashMap<Node, ArrayList<Edge>>();
		Nodes = new ArrayList<Node>();

	}

	public void addNode(Node n) {
		Map.put(n, new ArrayList<Edge>());
		Nodes.add(n);
	}

	public void addEdge(Node n1, Node n2, Edge e) {
		if (Map.containsKey(n1))
			Map.get(n1).add(e);
		if (Map.containsKey(n2))
			Map.get(n2).add(e);

	}

	public void addEdge(Node n1, Node n2, double weight) {
		Edge e1 = new Edge(n1, n2, weight);
		Edge e2 = new Edge(n2, n1, weight);

		if (Map.containsKey(n1))
			Map.get(n1).add(e1);
		if (Map.containsKey(n2))
			Map.get(n2).add(e2);

	}

	public void addEdge(Node n1, Node n2, double weight, String direction1, String direction2) {
		Edge e1 = new Edge(n1, n2, weight, direction2);
		Edge e2 = new Edge(n2, n1, weight, direction1);

		if (Map.containsKey(n1))
			Map.get(n1).add(e1);
		if (Map.containsKey(n2))
			Map.get(n2).add(e2);

	}

	public void addEdge(Node n1, Node n2, double weight, String direction1) {
		Edge e1 = new Edge(n1, n2, weight, direction1);

		if (Map.containsKey(n1))
			Map.get(n1).add(e1);

	}

	public ArrayList getNeighbors(Node n) {
		ArrayList<Node> neighbors = new ArrayList<Node>();
		for (Edge e : Map.get(n))
			neighbors.add(e.end);

		return neighbors;
	}

	public Double getWeight(Node start, Node end) {

		for (Edge e : Map.get(start)) {
			if (e.start == start && e.end == end)
				return e.weight;
		}
		return 0.0;
	}

	// A function used by DFS
	void DFSUtil(Node startNode, Node goalNode, HashMap<Node, Boolean> visited) {
		if (startNode.stationName.equals(goalNode.stationName) && startNode.line == goalNode.line) {
			System.out.println(st);

			return;
		}
		// Mark the current node as visited and print it
		visited.put(startNode, true);
		st.push(startNode);

		// Recur for all the vertices adjacent to this vertex
		for (Edge e : Map.get(startNode)) {
			Node second = e.end;
			st.push(second);
			if (!visited.get(second))
				DFSUtil(second, goalNode, visited);
			st.pop();
		}
	}

	public void show() {
		for (Node n : Nodes) {
			System.out.println(n);
			for (Edge e : Map.get(n))
				System.out.println(e + " ");
		}
	}

	// The function to do DFS traversal. It uses recursive DFSUtil()
	void DFS(String start, String line1, String destination, String line2) {
		Node startNode = getNode(start, line1);
		Node goalNode = getNode(destination, line2);
		System.out.println(startNode);
		System.out.println(goalNode);

		// Mark all the vertices as not visited(set as
		// false by default in java)
		HashMap<Node, Boolean> visited = new HashMap<Node, Boolean>();

		for (Node n : Nodes)
			visited.put(n, false);

		// Call the recursive helper function to print DFS traversal
		DFSUtil(startNode, goalNode, visited);
	}

	void Astar(String start, String line1, String destination, String line2) {
		Node startNode = getNode(start, line1);
		Node goalNode = getNode(destination, line2);
		Astar astar = new Astar(this);
		astar.run(startNode, goalNode);
	}

	void BFS(String start, String line1, String destination, String line2) {
		Node startNode = getNode(start, line1);
		Node goalNode = getNode(destination, line2);

		// Mark all the vertices as not visited(set as
		// false by default in java)
		HashMap<Node, Boolean> visited = new HashMap<Node, Boolean>();

		for (Node n : Nodes)
			visited.put(n, false);

		// Create a queue for BFS
		LinkedList<Node> queue = new LinkedList<Node>();

		// Mark the current node as visited and print it
		visited.put(startNode, true);
		queue.add(startNode);
		Node last = null ;
		startNode.setPrevious(last);
		boolean found  = false;
		while (queue.size() != 0) {
			// Dequeue a vertex from queue and print it
			startNode = queue.poll();
			visited.put(startNode, true);
			last=startNode;
			if(startNode.stationName.equals(goalNode.stationName) && startNode.line.equals(goalNode.line))
				found =true;
			
        	
			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it
			// visited and enqueue it
			for (Edge e : Map.get(startNode)) {
				Node second = e.end;
				if (!visited.get(second)) {
					queue.add(second);
					second.setPrevious(last);
				}
			}

		}
		Stack stack = new Stack();
		if(found) {
			while(goalNode!=null) {
				st.push(goalNode);
				goalNode=goalNode.getPrevious();
			}

		}
		if(found) {
			while(st.size()>0) {
				System.out.println(st.pop());
			}

		}
	}

	private Node getNode(String destination, String line) {
		for (Node n : Nodes)
			if (n.stationName.equals(destination) && n.line.equals(line))
				return n;
		return null;
	}

}
