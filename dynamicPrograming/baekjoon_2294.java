package dynamicPrograming;

import java.util.Scanner;
import java.util.Arrays;

public class baekjoon_2294 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int [] arr = new int [n+1];
		int [] tmp = new int [k+1];

		for(int i=1; i<=n; i++) {
			arr[i] = sc.nextInt();
		}

		for(int i=1; i<=k; i++) {
			tmp[i] = 10001;
		}
		for(int i=1; i<=k; i++) {
			for(int j=1; j<=n; j++) {
				if(arr[j] <= k)
					tmp[arr[j]] = 1;
				if(tmp[i] != k && i+arr[j] <= k && tmp[i+arr[j]] > tmp[i] + 1) {
					tmp[i+arr[j]] = tmp[i] + 1;
				}
			}
		}
		if(tmp[k] == 10001) System.out.println(-1);
		else System.out.println(tmp[k]);
	}
}
