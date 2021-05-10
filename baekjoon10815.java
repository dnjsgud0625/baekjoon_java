package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon10815 {
	static int[] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(in.readLine());
		arr = new int[n];
		StringTokenizer s = new StringTokenizer(in.readLine().trim());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(s.nextToken());
		Arrays.sort(arr);

		int m = Integer.parseInt(in.readLine());
		StringTokenizer x = new StringTokenizer(in.readLine().trim());
		for (int i = 0; i < m; i++) {
			out.write(bs(0, arr.length, Integer.parseInt(x.nextToken())) + " ");
		}
		out.close();
	}
	
	public static int bs(int start, int end, int input) {
		int mid = (start + end) / 2;

		if (mid >= end)
			return 0;
		if (arr[mid] == input)
			return 1;
		else if (arr[mid] < input)
			return bs(mid + 1, end, input);
		else
			return bs(start, mid, input);
	}
}