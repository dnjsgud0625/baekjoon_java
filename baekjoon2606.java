package baekjoon;

import java.util.*;

public class baekjoon2606 {
	static int[][] map;
	static boolean[] visit;
	static int cnt = 0;
	static ArrayList<TreeMap<Integer, Integer>> alt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		map = new int[n + 1][n + 1];
		visit = new boolean[n + 1];
		alt = new ArrayList<>();

		for (int i = 0; i < n + 1; i++) {
			Arrays.fill(map[i], 0);
			alt.add(new TreeMap<Integer, Integer>());
		}
		Arrays.fill(visit, false);

		for (int i = 0; i < l; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a][b] = 1;
			map[b][a] = 1;
			alt.get(a).put(b, a);
			alt.get(b).put(a, b);
		}
		System.out.println(dfs(1));
		sc.close();
	}

	public static int dfs(int v) {
		visit[v] = true;
		TreeMap<Integer, Integer> tmp = alt.get(v);
		for (int i : tmp.keySet()) {
			if (visit[i] == false) {
				dfs(i);
				cnt++;
			}
		}
		return cnt;
	}
}
