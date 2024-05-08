package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;

class Lab_6_Kruskal_2ndBest {

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
	Lab_6_Kruskal_2ndBest(int v, int e) {
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

	void KruskalMST(ArrayList<Integer> insrc, ArrayList<Integer> indest, ArrayList<Integer> inweight) {
		System.out.println("Inputed Graph: ");
		for (int i = 0; i < insrc.size(); i++) {
			System.out.print("Source: " + insrc.get(i) + "   " + "Dest: " + indest.get(i) + "   " + "Weight:   "
					+ inweight.get(i) + " \n");
		}

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
		System.out.println("Following are the edges in " + "the constructed MST"

		);

		int minimumCost = 0;
		int minimumCost2 = 0;
		for (i = 0; i < result.length; i++) {
			System.out.println("Res S: " + result[i].src + " Res D: " + result[i].dest + " Res W: " + result[i].weight);
			for (int j = 0; j < inweight.size(); j++) {
				if (insrc.get(j) == result[i].src && indest.get(j) == result[i].dest
						&& inweight.get(j) == result[i].weight) {
					System.out.println("I/P  S: " + insrc.get(j) + " I/P  D: " + indest.get(j) + " I/P   W: "
							+ inweight.get(j) + "\n");
					insrc.remove(j);
					indest.remove(j);
					inweight.remove(j);
//					KruskalMST(insrc, indest, inweight);
					break;
				}

			}
			minimumCost += result[i].weight;
		}
//		minimumCost2 += inweight.get(i);

		System.out.println("Minimum Cost Spanning Tree " + minimumCost);
		System.out.println("2nd MST:  " + minimumCost2);
		System.out.println("Remaining Graph Source, Destination, & Weight: ");
		for (int k = 0; k < inweight.size(); k++) {
			System.out.println("S:" + insrc.get(k) + "\tD:" + indest.get(k) + "\tW:" + inweight.get(k));
		}

	}

	// Driver Code
	public static void main(String[] args) {

		/*
		 * Let us create following weighted graph 10 0-------------1 | \ | 6| 5\ |15 | \
		 * | 2-------------3 4
		 */
		int V = 6; // Number of vertices in graph
		int E = 8; // Number of edges in graph
		Lab_6_Kruskal_2ndBest graph = new Lab_6_Kruskal_2ndBest(V, E);

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter source, destination, weight: ");
//		for (int i = 0; i < E; i++) {
//			int source = sc.nextInt();
//			int destination = sc.nextInt();
//			int weight = sc.nextInt();
//			graph.edge[i].src = source;
//			graph.edge[i].dest = destination;
//			graph.edge[i].weight = weight;
//		}

		// add edge 0-1
		graph.edge[0].src = 0;
		graph.edge[0].dest = 1;
		graph.edge[0].weight = 4;

		// add edge 0-2
		graph.edge[1].src = 0;
		graph.edge[1].dest = 2;
		graph.edge[1].weight = 4;

		// add edge 1-2
		graph.edge[2].src = 1;
		graph.edge[2].dest = 2;
		graph.edge[2].weight = 2;

		// add edge 2-3

		graph.edge[3].src = 2;
		graph.edge[3].dest = 3;
		graph.edge[3].weight = 3;

		// add edge 2-4
		graph.edge[4].src = 2;
		graph.edge[4].dest = 4;
		graph.edge[4].weight = 2;

		// add edge 2-5
		graph.edge[5].src = 2;
		graph.edge[5].dest = 5;
		graph.edge[5].weight = 4;

		// add edge 3-5
		graph.edge[6].src = 3;
		graph.edge[6].dest = 5;
		graph.edge[6].weight = 3;

		// add edge 4-5
		graph.edge[7].src = 4;
		graph.edge[7].dest = 5;
		graph.edge[7].weight = 3;

//		int[] insrc = new int[E];
//		int[] indest = new int[E];
//		int[] inweight = new int[E];
		ArrayList<Integer> insrc = new ArrayList<Integer>();
		ArrayList<Integer> indest = new ArrayList<Integer>();
		ArrayList<Integer> inweight = new ArrayList<Integer>();
		for (int i = 0; i < E; i++) {
//			insrc[i] graph.edge[i].src;
//			indest[i] = graph.edge[i].dest;
//			inweight[i] = graph.edge[i].weight;
			insrc.add(graph.edge[i].src);
			indest.add(graph.edge[i].dest);
			inweight.add(graph.edge[i].weight);
		}

		// Function call
		graph.KruskalMST(insrc, indest, inweight);
	}
}
