package baekjoon;

import java.util.*;

public class baekjoon9466 {
	static int[] pick;
	static boolean[] check, end;
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			pick = new int[n + 1];
			check = new boolean[n + 1];
			end = new boolean[n + 1];
			cnt = 0;

			for (int j = 1; j <= n; j++)
				pick[j] = sc.nextInt();

			for (int j = 1; j <= n; j++) {
				dfs(j);
			}
			System.out.println(n - cnt);
		}

		sc.close();
	}

	public static void dfs(int now) {
		if (check[now])
			return;

		check[now] = true;
		int next = pick[now];

		if (check[next] != true)
			dfs(next);
		else {
			if (end[next] != true) {
				cnt++;
				for (int i = next; i != now; i = pick[i])
					cnt++;
			}
		}
		end[now] = true;
	}
}
