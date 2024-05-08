package Algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BFS {
	BFS() {
		ST(); // starting bfs traversal
	}

	void ST() {
		Scanner sc = new Scanner(System.in);
		int graph[][] = { { 0, 1, 1, 0 }, { 1, 0, 1, 0 }, { 1, 1, 0, 1 }, { 0, 0, 1, 0 } };

		int N = 4, E = 4; // number of nodes N, number of edges e
//		int N, E; // number of nodes N, number of edges e
//		int graph[][];
		int vis[], lev[]; // visited and level array
//		System.out.println("Enter Node number: ");
//		N = sc.nextInt();
//		System.out.println("Enter Edge number: ");
//		E = sc.nextInt();

//		graph = new int[N][N];
		vis = new int[N];
		lev = new int[N];
//		System.out.println("Enter graph edges: ");
//		for (int i = 0; i < E; i++) {
//			int u = sc.nextInt();
//			int v = sc.nextInt();
//			graph[u][v] = 1;
//			graph[v][u] = 1;
//		}
//
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				System.out.print(graph[i][j] + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < N; i++) // initialize the visited and level array
		{
			vis[i] = 0; // white
			lev[i] = 999999; // infinite
		}
		int s = 0; // source node
		vis[s] = 1; // gray
		lev[s] = 0;
		int parent[] = new int[N];

		Queue<Integer> q = new LinkedList<>();
		q.add(s);

		while (!q.isEmpty()) {
			int u = q.poll(); // this will work as parent node
			for (int v = 0; v < N; v++) {
				if (graph[u][v] == 1 && vis[v] == 0) // visit the child nodes v of parent node u

				{
					vis[v] = 1;
					lev[v] = lev[u] + 1;
					parent[v] = u;
					q.add(v);
				}
			}
			vis[u] = 2;
		}
		for (int i = 0; i < N; i++) {
			System.out.println("Node = " + i + " Parent = " + parent[i] + " Level = " + lev[i]);
		}
	}
}

public class Lab_1_BFS {
	static int[][] matrix;

	public static void main(String[] args) {
		BFS b = new BFS();
//		Lab1_AdjacencyMatrix.main(args);
//		Lab1_AdjacencyMatrix adjMat = new Lab1_AdjacencyMatrix();
//		Lab1_AdjacencyMatrix.Inmatrix(e);
//		adjMat.Inmatrix(e);

	}
}
