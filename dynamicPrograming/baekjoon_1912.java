package dynamicPrograming;

import java.util.Scanner;

public class baekjoon_1912 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max ,n = sc.nextInt();
		int [] arr = new int [n+1];
		for(int i=1; i<=n; i++) arr[i] = sc.nextInt();
		max = arr[1];
		for(int i=1; i<=n; i++) {
			if(arr[i-1] > 0 && arr[i] + arr[i-1] > 0) {
				arr[i] += arr[i-1];
			}
			
			if(max < arr[i]) {
				max = arr[i];
			}
			System.out.println(max);
		}
		System.out.println(max);
	}
}
