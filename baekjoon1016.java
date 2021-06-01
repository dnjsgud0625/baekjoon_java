package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon1016 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		long min = Long.parseLong(st.nextToken());
		long max = Long.parseLong(st.nextToken());
		int rst = (int) (max - min + 1);
		boolean[] arr = new boolean[(int) rst];

		for (long i = 2; i * i <= max; i++) {
			long sq = i * i;
			long start = min % sq == 0 ? min / sq : min / sq + 1;

			for (long j = start; j * sq <= max; j++) {
				arr[(int) (j * sq - min)] = true;
			}
		}
		int cnt = 0;
		for (int i = 0; i < rst; i++) {
			if (!arr[i])
				cnt++;
		}
		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}