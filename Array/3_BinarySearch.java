/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[] arr = {2,3,5,8,9,11,15};
	    int key = 9;
	    int result = binarySearch(arr,key);
	    System.out.println(result);
	}
    static int binarySearch( int[] arr, int key){
	    int s = 0;
	    int e = arr.length - 1;
	    while (s <= e){
	        int m = (s + e)/2;
	        if(arr[m] == key)
	          return m;
	        else if(key < arr[m]){
	            e = m - 1;
	        }
	        else
	        {
	            s = m + 1;
	        }
	   }
	   return -1;
	}
}
