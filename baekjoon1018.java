package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon1018 {
	static int m, n;
	static String[] input;
	static final String[] whitestart = { "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW",
			"WBWBWBWB", "BWBWBWBW" };

	static final String[] blackstart = { "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB",
			"BWBWBWBW", "WBWBWBWB" };

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		input = new String[n];
		for (int i = 0; i < n; i++)
			input[i] = br.readLine();

		int sum1 = 0;
		int sum2 = 0;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int i = 0; i < m - 7; i++) {
			for (int j = 0; j < n - 7; j++) {
				for (int k = j; k < j + 8; k++) {
					String line = input[k].substring(i, i + 8);
					if (!input.equals(whitestart[k - j])) {
						for (int l = i; l < i + 8; l++) {
							if (line.charAt(l - i) != whitestart[k - j].charAt(l - i))
								sum1++;
						}
					}
					if (!input.equals(blackstart[k - j])) {
						for (int l = i; l < i + 8; l++) {
							if (line.charAt(l - i) != blackstart[k - j].charAt(l - i))
								sum2++;
						}
					}
				}
				min1 = min1 > sum1 ? sum1 : min1;
				min2 = min2 > sum2 ? sum2 : min2;
				sum1 = 0;
				sum2 = 0;
			}
		}
		int min = min1 > min2 ? min2 : min1;
		System.out.println(min);
		br.close();
	}
}
