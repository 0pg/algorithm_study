package dynamicPrograming;

import java.util.Scanner;

import java.util.Scanner;

public class baekjoon_1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [1000001];
		arr[1] = 0;
		for(int i=2; i<=n; i++) {
			arr[i] = arr[i-1] + 1;
			if(i % 2 == 0)
				arr[i] = Math.min(arr[i/2] +1, arr[i]);
			if(i % 3 == 0)
				arr[i] = Math.min(arr[i/3] +1, arr[i]);
		}
		System.out.println(arr[n]);
	}
}
