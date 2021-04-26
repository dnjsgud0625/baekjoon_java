package baekjoon;

import java.util.*;

public class baekjoon10972 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		if (next(arr)) {
			for (int i : arr)
				System.out.print(i + " ");
		} else
			System.out.println(-1);
	}

	public static boolean next(int[] arr) {
		int i = arr.length - 1;
		while (i > 0 && arr[i] < arr[i - 1]) {
			i--;
		}
		if (i == 0)
			return false;

		int j = arr.length - 1;
		while (arr[i - 1] > arr[j]) {
			j--;
		}
		swap(arr, i - 1, j);
		j = arr.length - 1;
		while (i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
		return true;
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}