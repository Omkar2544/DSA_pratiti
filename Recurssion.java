package com.om.dsa;

public class Recurssion {

	public static void main(String[] args) {
		
		
		long start = System.nanoTime();
		int ans = fact(11);
		long end = (System.nanoTime()-start);
		System.out.println("Time required is "+end);
		System.out.println(ans);
		
	}
	public static int  fact(int n) {
		if(n == 1) return 1;
		else {
			return n*fact(n-1);
		}
	}
}
