package baekjoon;

import java.util.*;

public class baekjoon1874 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		StringBuffer sb = new StringBuffer();
		int start = 0;

		int n = sc.nextInt();
		while (n-- > 0) {
			int num = sc.nextInt();
			if (num > start) {
				for (int j = start+1; j <= num; j++) {
					stack.push(j);
					sb.append('+').append('\n');
				}
				start = num;
			} else if (stack.peek() != num) {
				System.out.println("NO");
				return;
			}
			stack.pop();
			sb.append('-').append('\n');
		}
		System.out.println(sb);
	}
}