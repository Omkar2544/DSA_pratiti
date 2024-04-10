package com.om.dsa;

public class BusProblem {
	public static void main(String[] args) {
		int ary[] = {9,8,7,6,5,4,3,2,1};
		
		for(int i=0;i<ary.length-1;i++) {
			int min = i;
			for(int j=i+1;j<ary.length;j++) {
				if(ary[j]<ary[min]) {
					min = j;
				}
			}
			int temp = ary[i];
			ary[i] = ary[min];
			ary[min] = temp;
			
		}
		
		for(Integer it: ary) {
			System.out.println(it);
		}
	}
}
