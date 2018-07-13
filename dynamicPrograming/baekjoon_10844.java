package dynamicPrograming;

import java.util.Scanner;

public class baekjoon_10844 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum=0;
		int [][] arr = new int [n][10];
		for(int i=1; i<10; i++) {
			arr[0][i] = 1;
		}
		for(int i=1; i<n; i++) {
			arr[i][0] = arr[i-1][1];
			arr[i][9] = arr[i-1][8];
			for(int j=1; j<9; j++) {
				arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]);
				arr[i][j] %= 1000000000;
			}
		}
		
		for(int i=0; i<10; i++) {
			sum = (sum + arr[n-1][i]) % 1000000000;
		}
		System.out.println(sum);

	}
}
