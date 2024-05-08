package Algorithm;

public class Lab_2_DFS {

	static int N = 8;
	static char[] c = { 'S', 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
	static int list[][] = { { 1, 2, 3 }, { 0, 4 }, { 0, 5 }, { 0, 6 }, { 1, 7 }, { 2, 7 }, { 3, 7 }, { 4, 5, 6 } }; // adjacency

//		  	   S(0) 
//		  /	     |      \ 
//	 A(1)  B(2)	C(3) 
//	    |        |         | 
//	 D(4)  E(5)  F(6) 
//	    \        |       / 
//	          G(7)

	static int[] color = new int[N];
	static int[] prev = new int[N];
	static int f[] = new int[N];
	static int d[] = new int[N];
	static int time = 0;

	public static void main(String[] args) {
//		System.out.println(list[1][1]);
		for (int i = 0; i < N; i++) {
			color[i] = 0;
			prev[i] = -1;
			d[i] = f[i] = 999999;
		}

		for (int i = 0; i < N; i++) {
			if (color[i] == 0) { // Color white paisi DFS run korsi i index er jonne. Source node 0 index k dorsi
				runDFS(i);
			}
		}
	}

	private static void runDFS(int u) {
		System.out.print(c[u] + "  ");
		color[u] = 1; // Gray
		time++;
		d[u] = time;
		for (int i = 0; i < list[u].length; i++) {
			int v = list[u][i];
			if (color[v] == 0) {
				prev[v] = u;
				System.out.println(c[u] + "-->" + c[v]);
				runDFS(v);
			}
		}
		color[u] = 2;
		time++;
		f[u] = time;
//		System.out.println(f[u]);
	}
}
