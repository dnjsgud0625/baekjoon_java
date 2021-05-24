package baekjoon;

import java.util.*;

public class baekjoon9663 {
	static int n, cnt = 0;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			int[] col = new int[n + 1];
			col[1] = i;
			nqueen(col, 1);
		}
		System.out.println(cnt);
	}

	public static void nqueen(int[] col, int row) {
		if (row == n)
			cnt++;
		else {
			for (int i = 1; i <= n; i++) {
				col[row + 1] = i;
				if (can(col, row + 1))
					nqueen(col, row + 1);
			}
		}
	}

	public static boolean can(int[] col, int row) {
		for (int i = 1; i < row; i++) {
			if (col[i] == col[row])
				return false;
			if (Math.abs(i - row) == Math.abs(col[i] - col[row]))
				return false;
		}
		return true;
	}
}
