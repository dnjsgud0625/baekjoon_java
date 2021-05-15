package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon1406 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<String> st1 = new Stack<>();
		Stack<String> st2 = new Stack<>();

		String str = br.readLine();
		String[] arr = str.split("");
		int m = Integer.parseInt(br.readLine());

		for (String s : arr)
			st1.push(s);

		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String c = st.nextToken();
			switch (c) {
			case "L":
				if (!st1.empty())
					st2.push(st1.pop());
				break;
			case "D":
				if (!st2.empty())
					st1.push(st2.pop());
				break;
			case "B":
				if (!st1.empty())
					st1.pop();
				break;
			case "P":
				st1.push(st.nextToken());
				break;
			}
		}
		while (!st1.empty())
			st2.push(st1.pop());
		while (!st2.empty())
			bw.write(st2.pop());
		bw.flush();
		br.close();
	}
}