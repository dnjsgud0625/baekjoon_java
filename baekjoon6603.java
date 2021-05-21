package baekjoon;

import java.util.*;

public class baekjoon6603 {
	static int k;
	static int[] arr;
	static boolean[] arr2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			k = sc.nextInt();
			if (k == 0)
				break;
			arr = new int[k];
			arr2 = new boolean[k];
			for (int j = 0; j < k; j++)
				arr[j] = sc.nextInt();
			loto(0, 0);
			System.out.println();
		}
		sc.close();
	}

	public static void loto(int start, int depth) {
		if (depth == 6) {
			for (int i = 0; i < k; i++) {
				if (arr2[i]) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
		}
		for (int i = start; i < k; i++) {
			arr2[i] = true;
			loto(i + 1, depth + 1);
			arr2[i] = false;
		}
	}
}