package com.om.dsa;

public class DynaminPrograming {

	
	public static void main(String[] args) {
		
		int[] dp = new int[10];
		for(int  i=0;i<dp.length;i++) {
			dp[i]=-1;
		}
		System.out.println(fibonaci(5,dp));
//		System.out.println("Omkar Kanase Hushar ahe!");
		
//		Space optimisation in fibonacci
		
		int ans=0,prev1,prev2;
	    prev1 =0; 
	    prev2 =1;
	    for(int i=0;i<5;i++) {
	    	ans = prev1 + prev2;
	    	prev2 = prev1;
	    	prev1 = ans;
	    }
	    
	    System.out.println(ans);
		
	}

	private static int fibonaci(int i,int[] dp) {
		
		
		if(i==1 || i==0)return 1;
		
		if(dp[i] != -1)return dp[i];
		return dp[i]=fibonaci(i-1,dp)+fibonaci(i-2,dp);
	}
}
