/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		int[] arr = {3,11,5,8,9,6,23,89};
		int key = 91;
		int result = linearSearch(arr, key);
		System.out.println(result);
	}
	static int linearSearch(int[] arr, int key){
	    for(int i = 0; i< arr.length; i++){
	        if (arr[i] == key)
	           return i;
	    }
	    return -1;
	}
}
