package baekjoon;

import java.util.*;

public class baekjoon10867 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		HashSet<Integer> arr = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		sc.close();
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>(arr);
		Collections.sort(arr2);

		for (int i : arr2)
			System.out.print(i + " ");
	}
}