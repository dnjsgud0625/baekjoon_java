package baekjoon;

import java.util.*;

public class baekjoon1476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int s = sc.nextInt();
		int m = sc.nextInt();
		int year = 0;
		sc.close();

		while (true) {
			year++;
			if ((year - e) % 15 == 0 && (year - s) % 28 == 0 && (year - m) % 19 == 0) {
				System.out.println(year);
				break;
			}
		}
	}
}