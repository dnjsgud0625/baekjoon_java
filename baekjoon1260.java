package baekjoon;

import java.util.*;

public class baekjoon1260 {
	static int n, m, v;
	static ArrayList<TreeMap<Integer, Integer>> alt;
	static int map[][];
	static boolean visit[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		v = sc.nextInt();
		map = new int[n + 1][n + 1];
		visit = new boolean[n + 1];
		alt = new ArrayList<>();

		for (int i = 0; i < n + 1; i++) {
			Arrays.fill(map[i], 0);
			alt.add(new TreeMap<Integer, Integer>());
		}
		Arrays.fill(visit, false);

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a][b] = 1;
			map[b][a] = 1;
			alt.get(a).put(b, a);
			alt.get(b).put(a, b);
		}
		dfs(v);
		System.out.println();
		Arrays.fill(visit, false);
		bfs(v);
		sc.close();
	}

	public static void dfs(int v) {
		visit[v] = true;
		System.out.print(v + " ");
		TreeMap<Integer, Integer> tmp = alt.get(v);
		for (int i : tmp.keySet()) {
			if (visit[i] == false) {
				dfs(i);
			}
		}
	}

	public static void bfs(int v) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(v);
		visit[v] = true;

		while (!q.isEmpty()) {
			int tmp = q.poll();
			System.out.print(tmp + " ");

			for (int i = 1; i <= n; i++) {
				if (map[tmp][i] == 1 && visit[i] == false) {
					q.offer(i);
					visit[i] = true;
				}
			}
		}
	}
}