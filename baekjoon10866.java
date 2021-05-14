package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon10866 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> dq = new ArrayDeque<>();

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
			case "push_front":
				dq.offerFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				dq.offerLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				if (!dq.isEmpty())
					System.out.println(dq.pollFirst());
				else
					System.out.println(-1);
				break;
			case "pop_back":
				if (!dq.isEmpty())
					System.out.println(dq.pollLast());
				else
					System.out.println(-1);
				break;
			case "size":
				System.out.println(dq.size());
				break;
			case "empty":
				if (!dq.isEmpty())
					System.out.println(0);
				else
					System.out.println(1);
				break;
			case "front":
				if (!dq.isEmpty())
					System.out.println(dq.getFirst());
				else
					System.out.println(-1);
				break;
			case "back":
				if (!dq.isEmpty())
					System.out.println(dq.getLast());
				else
					System.out.println(-1);
				break;
			}
		}
		br.close();
	}
}