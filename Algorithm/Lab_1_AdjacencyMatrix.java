package Algorithm;

import java.util.Scanner;

public class Lab_1_AdjacencyMatrix {
	static int[][] matrix;// 2D array that will contain the graph

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Vertices−");
		int n = sc.nextInt();
		matrix = new int[n][n];
		System.out.println("Enter Number of Edges−");
		int e = sc.nextInt();
		Inmatrix(e);
		System.out.println("Output:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}

	}

	static void Inmatrix(int e) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter The Edges:");
		int i;
		char j, k;

		for (i = 0; i < e; i++) {// this loop runs e times to take the all edges

			j = sn.next().charAt(0);
			k = sn.next().charAt(0);
			// An undirected edge has both ways access between the nodes.
			// If A to B has a way to go then B to A has the same way.
			matrix[(int) j - 65][(int) k - 65] = matrix[(int) k - 65][(int) j - 65] = 1;

		}
	}
}
