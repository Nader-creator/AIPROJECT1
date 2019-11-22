import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(System.out);
		Scanner sc = new Scanner("stations.txt");
		Graph G = new Graph();

		for (int i = 1; i <= 4; i++) {
			String line = sc.nextLine();
			String[] ary = line.split(",");

			String line2 = sc.nextLine();
			String[] ary2 = line2.split(",");
			ArrayList<Node> list = new ArrayList<Node>();

			for (int j = 1; j < ary.length; j++) {
				Node cnt = new Node(ary[j].trim(), ary[0].trim());
				G.addNode(cnt);
				list.add(cnt);
			}

			for (int j = 1; j < ary2.length - 1; j++) {
				int weight = Math.abs(Integer.parseInt(ary2[j]) - Integer.parseInt(ary2[j + 1]));
				Node node1 = list.get(j - 1);
				Node node2 = list.get(j);
				G.addEdge(node1, node2, weight, ary[1], ary[ary.length - 1]);

			}

		}

		// locations
		sc = new Scanner("locations.text");
		for (int i = 1; i <= 4; i++) {
			String line = sc.nextLine();
			String[] ary = line.split(",");
			String stationName = ary[0];
			double x = Double.parseDouble(ary[1]);
			double y = Double.parseDouble(ary[2]);

			for (Node n : G.Nodes) {
				if (n.stationName.equalsIgnoreCase(stationName))
					n.setPoint(x, y);
			}

		}

		// we will start connecting lines
		for (int i = 0; i < G.Nodes.size(); i++) {
			for (int j = 0; j < G.Nodes.size(); j++) {
				Node first = G.Nodes.get(i);
				Node second = G.Nodes.get(j);
				if (first.stationName.equals(second.stationName) && first.line != second.line) {
					G.addEdge(first, second, 5, "Change Lines from " + first.line + " to " + second.line);

				}

			}
		}

		G.BFS("U Uhlandstr","U1", "U Gleisdreieck","U1");

//		G.Astar("U Kurfürstenstr", "U1", "U Gleisdreieck", "U3");

	}

}

class Scanner {
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream s) {
		br = new BufferedReader(new InputStreamReader(s));
	}

	public Scanner(String f) throws FileNotFoundException {
		br = new BufferedReader(new FileReader(f));
	}

	public String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	public String nextLine() throws IOException {
		return br.readLine();
	}

	public double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

	public boolean ready() throws IOException {
		return br.ready();
	}

	public int[] nextIntArray(int n) throws IOException {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public int[] nextIntArray1(int n) throws IOException {
		int[] a = new int[n + 1];
		for (int i = 1; i <= n; i++)
			a[i] = nextInt();
		return a;
	}

	public int[] shuffle(int[] a, int n) {
		int[] b = new int[n];
		for (int i = 0; i < n; i++)
			b[i] = a[i];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			int j = i + r.nextInt(n - i);
			int t = b[i];
			b[i] = b[j];
			b[j] = t;
		}
		return b;
	}

	public int[] nextIntArraySorted(int n) throws IOException {
		int[] a = nextIntArray(n);
		a = shuffle(a, n);
		Arrays.sort(a);
		return a;
	}

	public long[] nextLongArray(int n) throws IOException {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}

	public long[] nextLongArray1(int n) throws IOException {
		long[] a = new long[n + 1];
		for (int i = 1; i <= n; i++)
			a[i] = nextLong();
		return a;
	}

	public long[] nextLongArraySorted(int n) throws IOException {
		long[] a = nextLongArray(n);
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			int j = i + r.nextInt(n - i);
			long t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		Arrays.sort(a);
		return a;
	}
}
