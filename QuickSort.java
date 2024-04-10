package com.om.dsa;

public class QuickSort {

	public static void main(String[] args) {
		int ary[] = {1,7,6,5,4,3,2,8};
		for(int it: ary) {
			System.out.print(it+" ");
		}
		int len = ary.length-1;
		quick(ary,0,len);
		System.out.println();
		for(int it: ary) {
			System.out.print(it+" ");
		}
	}

	private static void quick(int[] ary, int start, int end) {
		
		if(start<end) {
			int p = partition(ary,start,end);
			System.out.println("partition at "+ p);
			quick(ary,0,p);
			quick(ary, p+1, end);
		}
		
	}

	private static int partition(int[] ary, int start, int end) {
		
		int pivot = ary[end];
		
		int i= start-1;       // {8,7,6,5,4,3,2,1};
		
		for(int j=0;j<end-1;j++) {
			
			if(ary[j]<pivot) {
				
				i++;
				System.out.println("swap between "+ary[i]+" "+ary[j]);
				int temp = ary[i];
				ary[i] = ary[j];
				ary[j] = temp;
				
				
				
			}
			
			
		}
		
		int temp = ary[i+1];
		ary[i+1]=ary[end];
		ary[end]=temp;
		
		
		return i+1;
	}
}
