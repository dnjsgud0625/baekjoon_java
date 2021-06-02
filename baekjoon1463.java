package baekjoon;

import java.io.*;

public class baekjoon1463 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());

		System.out.println(dp(x, 0));
	}

	static int dp(int x, int cnt) {
		if (x < 2)
			return cnt;
		return Math.min(dp(x / 2, cnt + 1 + (x % 2)), dp(x / 3, cnt + 1 + (x % 3)));
	}
}