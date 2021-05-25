package baekjoon;

import java.util.*;

public class baekjoon1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int min = 0, max = 0;
		for (int i = 0; i < n; i++) {
			min = arr[0];
			max = arr[n - 1];
		}
		System.out.println(min * max);
		sc.close();
	}
}