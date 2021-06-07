package baekjoon;

import java.util.*;

public class baekjoon7576 {
	static int n, m;
	static int[][] box;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		box = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				box[i][j] = sc.nextInt();
		}
		bfs();
		sc.close();
	}

	public static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		int day = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (box[i][j] == 1)
					q.add(new int[] { i, j });
			}
		}
		while (!q.isEmpty()) {
			int[] tmp = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = tmp[0] + dx[i];
				int ny = tmp[1] + dy[i];

				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (box[nx][ny] == 0) {
						q.add(new int[] { nx, ny });
						box[nx][ny] = box[tmp[0]][tmp[1]] + 1;
						day = box[nx][ny];
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (box[i][j] == 0)
					day = -1;
			}
		}
		if (day > 0)
			System.out.println(day - 1);
		else
			System.out.println(day);

	}
}