package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon1927 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= n; i++)
			queue.offer(i);

		sb.append("<");
		while (queue.size() != 1) {
			for (int i = 0; i < k - 1; i++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll() + ", ");
		}
		sb.append(queue.poll() + ">");

		bw.write(sb.toString() + '\n');
		bw.flush();
		bw.close();
		br.close();
	}
}