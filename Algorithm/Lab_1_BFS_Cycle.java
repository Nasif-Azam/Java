package Algorithm;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Lab_1_BFS_Cycle {
	private int Ver;
	private LinkedList<Integer> adj[];

	// Create a graph
	Lab_1_BFS_Cycle(int v) {
		Ver = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	// Add edges to the graph
	void addEdge(int u, int v) {
		adj[u].add(v);
	}

	// BFS algorithm
	void BFS(int start) {
		boolean visited[] = new boolean[Ver];
		LinkedList<Integer> queue = new LinkedList();

		visited[start] = true;
		queue.add(start);

		while (queue.size() != 0) {
			start = queue.poll();
			System.out.print(start + " ");

			Iterator<Integer> i = adj[start].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of vertex: ");
		int numVer = scan.nextInt();
		System.out.print("Enter the Number of edge: ");
		int numEdg = scan.nextInt();
		Lab_1_BFS_Cycle graph = new Lab_1_BFS_Cycle(numVer);
		System.out.println("Enter the Source & Destination");
		for (int i = 0; i < numEdg; i++) {
			int source = scan.nextInt();
			int destination = scan.nextInt();
			graph.addEdge(source, destination);
		}
//		graph.addEdge(0, 1);
//		graph.addEdge(0, 2);
//		graph.addEdge(1, 2);
//		graph.addEdge(2, 0);
//		graph.addEdge(2, 3);
//		graph.addEdge(3, 3);
		System.out.print("Enter the starting vertex: ");
		int startNode = scan.nextInt();
		System.out.print("BFS Cycle: ");
		graph.BFS(startNode);
	}
}