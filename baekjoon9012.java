package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			sb.append(vps(br.readLine())).append('\n');
		}
		System.out.println(sb);
	}

	public static String vps(String A) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < A.length(); i++) {
			char c = A.charAt(i);

			if (c == '(')
				stack.push(c);
			else if (stack.empty())
				return "NO";
			else
				stack.pop();
		}
		if (stack.empty())
			return "YES";
		else
			return "NO";
	}
}