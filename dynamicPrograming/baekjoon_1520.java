package dynamicPrograming;

import java.util.Scanner;

public class baekjoon_1520 {
	static int [][] arr;
	static int [][] chk;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, x=0, y=0;
		m = sc.nextInt();
		n = sc.nextInt();
		arr = new int [m+1][n+1];
		chk = new int [m+1][n+1];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
				chk[i][j] = -1;
			}
		}
		dps(x, y, n, m);
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%6d", chk[i][j]);
			}
			System.out.println();
		}
		System.out.println(chk[0][0]);
	}
	public static int dps(int x, int y, int n, int m) {

		if(x==m-1 && y==n-1) return 1;
		if(chk[x][y] >= 0) return chk[x][y];
		chk[x][y] = 0;
		if(y+1 < n && arr[x][y] > arr[x][y+1]) {
			chk[x][y] += dps(x, y+1, n, m);

 		}
		if(x+1 <m &&arr[x][y] > arr[x+1][y]) {
			chk[x][y] += dps(x+1, y, n, m);

		}
		if(y-1 >= 0 && arr[x][y] > arr[x][y-1]) {
			chk[x][y] += dps(x, y-1, n, m);
		}
		if(x-1 >= 0 && arr[x][y] > arr[x-1][y]) {
			chk[x][y] += dps(x-1, y, n, m);

		}
		return chk[x][y];
		
	}
}








