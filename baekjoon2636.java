package baekjoon;

import java.util.*;

public class baekjoon2636 {
	static int n, m, time, cnt;
	static int[][] box;
	static boolean[][] visit;
	static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { -1, 0, 1, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		box = new int[n][m];
		visit = new boolean[n][m];
		int cheese = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				box[i][j] = sc.nextInt();
				if (box[i][j] == 1)
					cheese++;
			}
		}
		while (true) {
			bfs();
			time++;

			boolean flag = true;
			cnt = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (box[i][j] != 0) {
						flag = false;
						cnt++;
					}
				}
			}
			if (flag)
				break;
			visit = new boolean[n][m];
			cheese = cnt;
		}
		System.out.println(time);
		System.out.println(cheese);
		sc.close();
	}

	public static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { 0, 0 });

		while (!q.isEmpty()) {
			int[] tmp = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = tmp[0] + dx[i];
				int ny = tmp[1] + dy[i];

				if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visit[nx][ny]) {
					if (box[nx][ny] == 0) {
						q.add(new int[] { nx, ny });
						visit[nx][ny] = true;
					} else {
						box[nx][ny] = 0;
						visit[nx][ny] = true;
					}
				}
			}
		}
	}
}
