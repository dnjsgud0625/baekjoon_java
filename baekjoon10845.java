package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon10845 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int last = 0;
		Queue<Integer> q = new LinkedList<>();

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
			case "push":
				int t = Integer.parseInt(st.nextToken());
				last = t;
				q.offer(t);
				break;
			case "pop":
				if (!q.isEmpty())
					System.out.println(q.poll());
				else
					System.out.println(-1);
				break;
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				if (!q.isEmpty())
					System.out.println(0);
				else
					System.out.println(1);
				break;
			case "front":
				if (!q.isEmpty())
					System.out.println(q.peek());
				else
					System.out.println(-1);
				break;
			case "back":
				if (!q.isEmpty())
					System.out.println(last);
				else
					System.out.println(-1);
			}
		}
		br.close();
	}
}