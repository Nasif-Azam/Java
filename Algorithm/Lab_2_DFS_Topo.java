package Algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

//This class represents a directed graph
//using adjacency list representation
public class Lab_2_DFS_Topo {

	// No. of vertices
	private int V;

	// Adjacency List as ArrayList of ArrayList's
	private ArrayList<ArrayList<Integer>> adj;

	// Constructor
	Lab_2_DFS_Topo(int v) {
		V = v;
		adj = new ArrayList<ArrayList<Integer>>(v);
		for (int i = 0; i < v; ++i)
			adj.add(new ArrayList<Integer>());
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w) {
		adj.get(v).add(w);
	}

	// A recursive function used by topologicalSort
	void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack) {
		// Mark the current node as visited.
		visited[v] = true;
		Integer i;

		// Recur for all the vertices adjacent
		// to thisvertex
		Iterator<Integer> it = adj.get(v).iterator();
		while (it.hasNext()) {
			i = it.next();
			if (!visited[i])
				topologicalSortUtil(i, visited, stack);
		}

		// Push current vertex to stack
		// which stores result
		stack.push(new Integer(v));
	}

	// The function to do Topological Sort.
	// It uses recursive topologicalSortUtil()
	void topologicalSort() {
		Stack<Integer> stack = new Stack<Integer>();

		// Mark all the vertices as not visited
		boolean visited[] = new boolean[V];
		for (int i = 0; i < V; i++)
			visited[i] = false;

		// Call the recursive helper
		// function to store
		// Topological Sort starting
		// from all vertices one by one
		for (int i = 0; i < V; i++)
			if (visited[i] == false)
				topologicalSortUtil(i, visited, stack);

		// Print contents of stack
		while (stack.empty() == false)
			System.out.print(stack.pop() + " ");
	}

	// Driver code
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		// Create a graph given in the above diagram
		Lab_2_DFS_Topo graph = new Lab_2_DFS_Topo(6);

		System.out.println("Enter the Source & Destination");
		for (int i = 0; i < 6; i++) {
			int source = scan.nextInt();
			int destination = scan.nextInt();
			graph.addEdge(source, destination);
		}

//		graph.addEdge(5, 2);
//		graph.addEdge(5, 0);
//		graph.addEdge(4, 0);
//		graph.addEdge(4, 1);
//		graph.addEdge(2, 3);
//		graph.addEdge(3, 1);

		System.out.println("Following is a Topological " + "sort of the given graph");
		// Function Call
		graph.topologicalSort();
	}
}
