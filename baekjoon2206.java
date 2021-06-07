package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon2206 {
	static int[][] map, visit;
	static int n, m;
	static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { -1, 0, 1, 0 };
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int [n][m];
		visit = new int [n][m];

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
				visit[i][j]=Integer.MAX_VALUE;
			}
		}
		System.out.println(bfs(0, 0));
		br.close();
	}

	public static int bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { x, y, 1, 0 });
		visit[x][y]=0;
		
		while (!q.isEmpty()) {
			int[] tmp = q.poll();

			if (tmp[0] == n - 1 && tmp[1] == m - 1)
				return tmp[2];
			
			for (int i = 0; i < 4; i++) {
				int nx = tmp[0] + dx[i];
				int ny = tmp[1] + dy[i];

				if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if (visit[nx][ny] > tmp[3]) {
						if (map[nx][ny] == 0) {
							q.offer(new int[] { nx, ny, tmp[2] + 1, tmp[3] });
							visit[nx][ny] = tmp[3];
						} else {
							if (tmp[3] == 0) {
								q.offer(new int[] { nx, ny, tmp[2] + 1, tmp[3] + 1 });
								visit[nx][ny] = tmp[3]+1;
							}
						}
					}
				}
			}
		}
		return -1;
	}
}
