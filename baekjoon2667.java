package baekjoon;

import java.util.*;

public class baekjoon2667 {
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };
	static int[][] arr;
	static boolean[][] visit;
	static int cnt;
	static int n;
	static ArrayList<Integer> rst;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n][n];
		visit = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			String input = sc.next();
			for (int j = 0; j < n; j++) {
				arr[i][j] = input.charAt(j) - '0';
			}
		}
		cnt = 0;
		rst = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 1 && !visit[i][j]) {
					cnt = 1;
					dfs(i, j);
					rst.add(cnt);
				}
			}
		}
		Collections.sort(rst);
		System.out.println(rst.size());
		for (int i : rst)
			System.out.println(i);
		sc.close();
	}

	public static int dfs(int x, int y) {
		visit[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
				if (arr[nx][ny] == 1 && !visit[nx][ny]) {
					dfs(nx, ny);
					cnt++;
				}
			}
		}
		return cnt;
	}
}