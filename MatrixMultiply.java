package com.om.dsa;

import java.util.Scanner;

public class MatrixMultiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		int[][] mat1 = new int[r1][c1];
		int[][] mat2 = new int[r2][c2];
		int[][] ans = new int[r1][c2];
		
		if(c1 == r2) {
			for(int i = 0;i<3;i++) {
				for(int j=0;j<3;j++) {
					for(int k =0;k<3;k++) {
						ans[i][j] += mat1[i][k]*mat2[k][j]; 
					}
				}
			}
		}
		
	}
}
