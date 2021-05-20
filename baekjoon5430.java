package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon5430 {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String cmd = br.readLine();
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
			ArrayDeque<Integer> dq = new ArrayDeque<Integer>();

			for (int j = 0; j < n; j++) {
				dq.add(Integer.parseInt(st.nextToken()));
			}
			AC(cmd, dq);
		}
		System.out.println(sb);
		br.close();
	}

	public static void AC(String cmd, ArrayDeque<Integer> dq) {
		boolean right = true;

		for (char c : cmd.toCharArray()) {
			if (c == 'R') {
				right = !right;
				continue;
			}
			if (right) {
				if (dq.pollFirst() == null) {
					sb.append("error\n");
					return;
				}
			} else {
				if (dq.pollLast() == null) {
					sb.append("error\n");
					return;
				}
			}
		}
		print(dq, right);
	}

	public static void print(ArrayDeque<Integer> dq, boolean right) {
		sb.append('[');

		if (dq.size() > 0) {
			if (right) {
				sb.append(dq.pollFirst());
				while (!dq.isEmpty())
					sb.append(',').append(dq.pollFirst());

			} else {
				sb.append(dq.pollLast());
				while (!dq.isEmpty())
					sb.append(',').append(dq.pollLast());
			}
		}
		sb.append(']').append('\n');
	}
}