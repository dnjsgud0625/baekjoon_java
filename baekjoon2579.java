package baekjoon;

import java.util.*;

public class baekjoon2579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		int[] cache = new int[n+1];
		for(int i=1;i<=n;i++)
			arr[i]=sc.nextInt();
		
		cache[1]=arr[1];
		cache[2]=arr[1]+arr[2];
		cache[3]=Math.max(arr[1]+arr[3], arr[2]+arr[3]);
		for(int i=4;i<=n;i++)
			cache[i]=Math.max(cache[i-3]+arr[i]+arr[i-1], cache[i-2]+arr[i]);
		
		System.out.println(cache[n]);
	}
}