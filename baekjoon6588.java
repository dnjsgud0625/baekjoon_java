package baekjoon;

import java.util.*;

public class baekjoon6588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[1000001];
		arr[0] = true;
		arr[1] = true;
		for (int i = 2; i < 1000001; i++) {
			if (!arr[i]) {
				for (int j = i * 2; j < 1000001; j += i) {
					arr[j] = true;
				}
			}
		}

		while (true) {
			int t = sc.nextInt();
			boolean wrong = false;
			if (t == 0)
				break;
			for (int i = 3; i <= t; i++) {
				if (!arr[i] && !arr[t - i]) {
					System.out.println(t + " = " + i + " + " + (t - i));
					wrong = true;
					break;
				}
			}
			if (!wrong)
				System.out.println("Goldbach's conjecture is wrong.");
		}
		sc.close();
	}
}