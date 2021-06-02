package baekjoon;

import java.io.*;

public class baekjoon1003 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		int[] arr = new int[t];
		int[] cnt0 = new int[41];
		int[] cnt1 = new int[41];

		cnt0[0] = 1;
		cnt0[1] = 0;
		cnt1[0] = 0;
		cnt1[1] = 1;

		for (int i = 2; i < 41; i++) {
			cnt0[i] = cnt0[i - 1] + cnt0[i - 2];
			cnt1[i] = cnt1[i - 1] + cnt1[i - 2];
		}
		for (int i = 0; i < t; i++)
			arr[i] = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++)
			System.out.println(cnt0[arr[i]] + " " + cnt1[arr[i]]);
		br.close();
	}
}