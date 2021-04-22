package baekjoon;

import java.util.*;

public class baekjoon2309 {

	public static void main(String[] args) {
		int[] tall = new int[9];
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		int total = 0;

		for (int i = 0; i < 9; i++) {
			tall[i] = sc.nextInt();
			total += tall[i];
		}
		sc.close();

		for (int i = 0; i < 9; i++) {
			if (check)
				break;
			for (int j = 0; j < 9; j++) {
				if (i == j)
					continue;
				if (total - tall[i] - tall[j] == 100) {
					tall[i] = 0;
					tall[j] = 0;
					check = true;
					break;
				}
			}
		}
		Arrays.sort(tall);
		for (int i = 0; i < 9; i++) {
			if (tall[i] != 0)
				System.out.println(tall[i]);
		}
	}
}