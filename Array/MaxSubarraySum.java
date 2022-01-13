/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		int[] arr = {-5, 8, 9, -6, 10, -15, 3};
		int result = maxSubarrayBF(arr);
		System.out.println(result);
	}
	static int maxSubarrayBF(int[] arr){
	    int curr_mx= arr[0];
	    for(int i = 0; i< arr.length; i++){
	        int mx = arr[i];
	        for(int j=i+1; j< arr.length; j++){
	            mx = mx + arr[j];
	            if (mx > curr_mx){
	                curr_mx = mx;
	            }
	        }
	    }
	    return curr_mx;
	}
}
