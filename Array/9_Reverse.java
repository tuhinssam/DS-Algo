/*
Reverse an Array
Time O(n)
Space O(1)
*/

import java.io.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		int[] arr = {-5, 8, 9, 3, 7};
		Reverse(arr);
		for(int i:arr){
		  System.out.print(i+ " ");  
		}
	}
	static void Reverse(int[] arr){
	   int s =0;
	   int e = arr.length - 1;
	   while (s<e){
	       int t = arr[s];
	       arr[s]=arr[e];
	       arr[e]=t;
	       s++;
	       e--;
	   }
	}
}
