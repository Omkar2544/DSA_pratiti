package com.om.dsa;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
        int[] ary= new int[1000000];
        for(int i=ary.length-1; i>=0; i--) {
        	ary[i]=i;
        }
        long start  = System.nanoTime();
//        bubbleSort(ary);
        Arrays.sort(ary);
        long end =  (System.nanoTime()-start)/1000000;
        System.out.println();
        System.out.println("duration to sort "+ end);
        
        
	}

	private static void bubbleSort(int[] ary) {
		for(int i=0;i<ary.length-1;i++) {
			for(int j=0;j<ary.length-i-1;j++) {
				if(ary[j]>ary[j+1]) {
					int temp = ary[j];
					ary[j] =  ary[j+1];
					ary[j]=temp;
				}
			}
		}
		
		for(Integer it: ary) {
        	System.out.print(it);
        	if(it>10)break;
        }
		
	}

	private static int binarySearch(int[] ary, int target) {
		int low = 0;
		int high = ary.length-1;
		
		while(low<=high) {
			int mid = low + (high-low)/2;
			
			if(ary[mid] == target) return mid;
			else if(ary[mid]<target) low = mid+1;
			else high = mid-1;
		}
		
		return -1;
	}
}
