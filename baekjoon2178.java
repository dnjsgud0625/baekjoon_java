package baekjoon;

import java.util.*;

public class baekjoon2178 {
	static int[][] map;
	static boolean[][] visit;
	static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { -1, 0, 1, 0 };
	static int n, m;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n][m];
		visit = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < m; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}

		visit[0][0] = true;
		bfs(0, 0);
		System.out.println(map[n - 1][m - 1]);
		sc.close();
	}

	public static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { x, y });

		while (!q.isEmpty()) {
			int loc[] = q.poll();
			visit[x][y] = true;

			for (int i = 0; i < 4; i++) {
				int nx = loc[0] + dx[i];
				int ny = loc[1] + dy[i];

				if (nx >= 0 && ny >= 00 && nx < n && ny < m) {
					if (map[nx][ny] != 0 && !visit[nx][ny]) {
						q.offer(new int[] { nx, ny });
						visit[nx][ny] = true;
						map[nx][ny] = map[loc[0]][loc[1]] + 1;
					}
				}
			}
		}
	}
}