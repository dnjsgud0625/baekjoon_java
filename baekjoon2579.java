package baekjoon;

import java.io.*;

public class baekjoon2579 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];
		int[] cache = new int[n + 1];
		for (int i = 1; i <= n; i++)
			arr[i] = Integer.parseInt(br.readLine());

		cache[1] = arr[1];
		cache[2] = arr[1] + arr[2];
		cache[3] = Math.max(arr[1] + arr[3], arr[2] + arr[3]);
		for (int i = 4; i <= n; i++)
			cache[i] = Math.max(cache[i - 3] + arr[i] + arr[i - 1], cache[i - 2] + arr[i]);

		System.out.println(cache[n]);
	}
}