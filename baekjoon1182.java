package baekjoon;

import java.util.*;

public class baekjoon1182 {
	static int[] arr;
	static int n, s, cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		s = sc.nextInt();

		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		sc.close();

		dfs(0, 0);
		System.out.print(s == 0 ? --cnt : cnt);
	}

	public static void dfs(int start, int depth) {
		if (start == n) {
			if (depth == s)
				cnt++;
			return;
		}
		dfs(start + 1, depth + arr[start]);
		dfs(start + 1, depth);
	}
}