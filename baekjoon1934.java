package baekjoon;

import java.util.*;

public class baekjoon1934 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int t = stdIn.nextInt();

		for (int i = 0; i < t; i++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int gcd = GCD(Math.max(a, b), Math.min(a, b));
			System.out.println(a * b / gcd);
		}
		stdIn.close();

	}

	public static int GCD(int a, int b) {
		while (b > 0) {
			int tmp = a;
			a = b;
			b = tmp % b;
		}
		return a;
	}
}