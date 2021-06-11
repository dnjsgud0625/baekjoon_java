package baekjoon;

import java.util.*;

public class baekjoon2579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		int[] cache = new int[n + 1];
		for (int i = 1; i <= n; i++)
			arr[i] = sc.nextInt();

		cache[1] = arr[1];
		if (n >= 2)
			cache[2] = arr[1] + arr[2];
		for (int i = 3; i <= n; i++)
			cache[i] = Math.max(cache[i - 2], cache[i - 3] + arr[i - 1]) + arr[i];

		System.out.println(cache[n]);
		sc.close();
	}
}