package baekjoon;

import java.util.*;

public class baekjoon2609 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		stdIn.close();

		int gcd = GCD(Math.max(A, B), Math.min(A, B));

		System.out.println(gcd);

		int lcm = LCM(A, B, gcd);

		System.out.println(lcm);
	}

	public static int GCD(int A, int B) {
		while (B > 0) {
			int tmp = A;
			A = B;
			B = tmp % B;
		}
		return A;
	}

	public static int LCM(int A, int B, int gcd) {
		return A * B / gcd;
	}
}