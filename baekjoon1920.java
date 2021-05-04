package baekjoon;

import java.util.*;

public class baekjoon1920 {
	static int[] A;

	public static int bs(int start, int end, int input) {
		int mid = (start + end) / 2;

		if (mid >= end)
			return 0;
		if (A[mid] == input)
			return 1;
		else if (A[mid] < input)
			return bs(mid + 1, end, input);
		else
			return bs(start, mid, input);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		A=new int[n];
		for (int i = 0; i < n; i++)
			A[i] = sc.nextInt();
		Arrays.sort(A);

		int m = sc.nextInt();
		int x;

		for (int i = 0; i < m; i++) {
			x = sc.nextInt();
			System.out.println(bs(0, A.length, x));
		}
	}
}