package baekjoon;

import java.util.*;

public class baekjoon7569 {
	static int[][][] box;
	static int n, m, h;
	static int[] dm = { 0, 0, -1, 0, 0, 1 };
	static int[] dn = { 0, -1, 0, 0, 1, 0 };
	static int[] dh = { -1, 0, 0, 1, 0, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt(); // 가로
		n = sc.nextInt(); // 세로
		h = sc.nextInt(); // 높이

		box = new int[h][n][m];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					box[i][j][k] = sc.nextInt();
				}
			}
		}
		bfs();
		sc.close();
	}

	public static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		int day = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					if (box[i][j][k] == 1)
						q.add(new int[] { i, j, k });
				}
			}
		}
		while (!q.isEmpty()) {
			int[] tmp = q.poll();
			for (int i = 0; i < 6; i++) {
				int nh = tmp[0] + dh[i];
				int nn = tmp[1] + dn[i];
				int nm = tmp[2] + dm[i];

				if (nh >= 0 && nn >= 0 && nm >= 0 && nh < h && nn < n && nm < m) {
					if (box[nh][nn][nm] == 0) {
						q.add(new int[] { nh, nn, nm });
						box[nh][nn][nm] = box[tmp[0]][tmp[1]][tmp[2]] + 1;
						day = box[nh][nn][nm];
					}
				}
			}
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					if (box[i][j][k] == 0)
						day = -1;
				}
			}
		}
		if (day > 0)
			System.out.println(day - 1);
		else
			System.out.println(day);
	}
}
