package baekjoon;

import java.util.*;

public class baekjoon1966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			LinkedList<int[]> q = new LinkedList<>();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				q.add(new int[] { j, sc.nextInt() });
			}
			while (!q.isEmpty()) {
				int[] front = q.poll();
				boolean max = true;
				for (int[] arr : q) {
					if (arr[1] > front[1])
						max = false;
				}
				if (max) {
					cnt++;
					if (front[0] == m)
						break;
				} else
					q.add(front);
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}