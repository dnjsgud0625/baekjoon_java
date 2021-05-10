package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon10816 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		int[] cnt = new int[20_000_001];
		StringTokenizer s = new StringTokenizer(in.readLine().trim());
		for (int i = 0; i < n; i++) {
			cnt[Integer.parseInt(s.nextToken()) + 10_000_000]++;
		}
		int m = Integer.parseInt(in.readLine());
		StringTokenizer x = new StringTokenizer(in.readLine().trim());
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < m; i++) {
			sb.append(cnt[Integer.parseInt(x.nextToken()) + 10_000_000] + " ");
		}
		System.out.println(sb);
	}
}