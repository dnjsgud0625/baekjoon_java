package baekjoon;

import java.util.*;

public class baekjoon9613 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int t = stdIn.nextInt();

		for (int i = 0; i < t; i++) {
			int n = stdIn.nextInt();
			int arr[] = new int[n];

			for (int j = 0; j < n; j++)
				arr[j] = stdIn.nextInt();

			long sum = 0;

			for (int j = 0; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					sum += GCD(arr[j], arr[k]);
				}
			}
			System.out.println(sum);
		}
		stdIn.close();
	}

	public static int GCD(int a, int b) {
		return b == 0 ? a : GCD(b, a % b);
	}
}