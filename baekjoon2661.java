package baekjoon;

import java.util.*;

public class baekjoon2661 {
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		backtrack("");
		sc.close();
	}

	public static void backtrack(String str) {
		if (str.length() == n) {
			System.out.println(str);
			System.exit(0);
			;
		} else {
			for (int i = 1; i <= 3; i++) {
				if (able(str + i)) {
					backtrack(str + i);
				}
			}
		}
	}

	public static boolean able(String str) {
		int len = str.length() / 2;

		for (int i = 1; i <= len; i++) {
			if (str.substring(str.length() - i).equals(str.substring(str.length() - 2 * i, str.length() - i))) {
				return false;
			}
		}
		return true;
	}
}