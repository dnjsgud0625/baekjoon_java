package baekjoon;

import java.util.*;

public class baekjoon1932 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int max = 0;
		arr[0][0] = sc.nextInt();
		
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][j] = sc.nextInt();

				if (j == 0)
					arr[i][j] += arr[i - 1][j];
				else if (j == i)
					arr[i][j] += arr[i - 1][j - 1];
				else
					arr[i][j] += Math.max(arr[i - 1][j - 1], arr[i - 1][j]);
				max = Math.max(max, arr[i][j]);
			}
		}
		System.out.println(max);
		sc.close();
	}
}
