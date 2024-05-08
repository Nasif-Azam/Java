package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

class Lab_6_Kruskal {

	// A class to represent a graph edge
	class Edge implements Comparable<Edge> {

		int src, dest, weight;

		// Comparator function used for
		// sorting edgesbased on their weight
		public int compareTo(Edge compareEdge) {
			return this.weight - compareEdge.weight;
		}
	};

	int V, E; // V-> no. of vertices & E->no.of edges
	Edge edge[]; // collection of all edges

	// leader is the concept of maintaining the subtree.
	// initially each node will be its own leader
	// after union of 2 sub tree the leader of thoes tree will be same.
	int leader[];

	// Creates a graph with V vertices and E edges
	Lab_6_Kruskal(int v, int e) {
		V = v;
		E = e;
		leader = new int[V];
		edge = new Edge[E];

		for (int i = 0; i < e; ++i) {
			edge[i] = new Edge();
		}
	}

	// A function to find the leader of node n
	int Find(int n) {
		return leader[n];
	}

	// A function that does union of two subtree and sets the nodes under same
	// leader

	void Union(int rootU, int rootV) {
		int newLeader;
		if (rootU < rootV) {
			newLeader = rootU;
			for (int i = 0; i < V; i++) {
				if (leader[i] == rootV) {
					leader[i] = newLeader;
				}
			}
		} else {
			newLeader = rootV;

			for (int i = 0; i < V; i++) {
				if (leader[i] == rootU) {
					leader[i] = newLeader;
				}
			}
		}
	}

	void KruskalMST() {
		// Tnis will store the resultant MST
		Edge result[] = new Edge[V - 1];

		// An index variable, used for sorted edges
		int i = 0;
		for (i = 0; i < result.length; i++) {
			result[i] = new Edge();
		}
		// Step 1: Sort all the edges in non-decreasing
		// order of their weight. If we are not allowed to
		// change the given graph, we can create a copy of
		// array of edges
		Arrays.sort(edge);

// Assign each node as its own leader initially
		for (i = 0; i < V; ++i) {
			leader[i] = i;
		}

		i = 0; // Index used to pick next edge

		// Check all edge to construct the MST
		// Smallest weighted edge will be picked first
		for (int e = 0; e < edge.length; e++) {
			Edge next_edge = edge[e];

			// find the leader of the nodes in edge e
			int x = Find(next_edge.src);
			int y = Find(next_edge.dest);
			// If including this edge does’t cause cycle, include it in result and increment
			// the index
// of result for next edge
			if (x != y) {
				result[i++] = next_edge;
				Union(x, y);
			}
			// Else discard the next_edge
		}

		// print the contents of result[] to display
		// the built MST
		System.out.println("Following are the edges in " + "the constructed MST");

		int minimumCost = 0;
		for (i = 0; i < result.length; i++) {
			System.out.println(result[i].src + " -- " + result[i].dest + " == " + result[i].weight);

			minimumCost += result[i].weight;
		}
		System.out.println("Minimum Cost Spanning Tree " + minimumCost);
	}

	// Driver Code
	public static void main(String[] args) {

		/*
		 * Let us create following weighted graph 124 10 125 0--------1 126 | \ | 127 6|
		 * 5\ |15 128 | \ | 129 2--------3 130 4
		 */
		int V = 5; // Number of vertices in graph
		int E = 9; // Number of edges in graph
		Lab_6_Kruskal graph = new Lab_6_Kruskal(V, E);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source, destination, weight: ");
		for (int i = 0; i < E; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			int weight = sc.nextInt();
			graph.edge[i].src = source;
			graph.edge[i].dest = destination;
			graph.edge[i].weight = weight;
		}

//		// add edge 0-1
//		graph.edge[0].src = 0;
//		graph.edge[0].dest = 1;
//		graph.edge[0].weight = 10;
//
//		// add edge 0-2
//		graph.edge[1].src = 0;
//		graph.edge[1].dest = 2;
//		graph.edge[1].weight = 6;
//
//		// add edge 0-3
//		graph.edge[2].src = 0;
//		graph.edge[2].dest = 3;
//		graph.edge[2].weight = 5;
//
//		// add edge 1-3
//		graph.edge[3].src = 1;
//		graph.edge[3].dest = 3;
//		graph.edge[3].weight = 15;
//
//		// add edge 2-3
//		graph.edge[4].src = 2;
//		graph.edge[4].dest = 3;
//		graph.edge[4].weight = 4;

		// Function call
		graph.KruskalMST();
	}
}