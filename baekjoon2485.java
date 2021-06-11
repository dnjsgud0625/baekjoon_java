package baekjoon;

import java.util.*;

public class baekjoon2485 {
	static int[] dst;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] tree = new int[n];
		dst = new int[n - 1];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			tree[i] = sc.nextInt();
			if (i > 0) {
				dst[i - 1] = tree[i] - tree[i - 1];
				sum += dst[i - 1];
			}
		}

		for (int i = 0; i <= dst.length - 2; i++) {
			dst[i + 1] = gcd(dst[i], dst[i + 1]);
		}

		int gcd = dst[dst.length - 1];
		System.out.println(sum / gcd - (n - 1));

		sc.close();
	}

	public static int gcd(int a, int b) {
		while (true) {
			int r = a % b;
			if (r == 0)
				return b;

			a = b;
			b = r;
		}
	}
}