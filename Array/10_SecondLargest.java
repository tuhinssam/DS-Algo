
/*
Get Second Largest Element in an array
Time O(n)
Space O(1)
*/

import java.io.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		int[] arr = {-5, -8, 9, 3, 7};
		int result = secondLargest(arr);
		System.out.print(result);
	}
	static int secondLargest(int[] arr){
	   int largest = getLargest(arr);
	   int secondLargest = -1;
	   for(int i=0; i<arr.length; i++){
	      if (arr[i]!=largest){
	          if(arr[i]>secondLargest){
	              secondLargest = arr[i];
	          }
	      }
	   }
	   return secondLargest;
	}
	static int getLargest(int[] arr){
	   int largest = -1;
	   for(int i=0; i<arr.length; i++){
	          if(arr[i]>largest){
	              largest = arr[i];
	          }
	      }
	      return largest;
	   }
}
