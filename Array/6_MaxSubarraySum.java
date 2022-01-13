/*
Kadanes Algo for Max subarray
This is optimum solution with 
Time Complexity O(n)
Space Complexity O(1)

*/

import java.io.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		int k = 4;
		int[] arr = {-5, 8, 9, -6, 10, 11, -15, 3};
		int result = maxSubarrayKadane(arr);
		System.out.println(result);
	}
	static int maxSubarrayKadane(int[] arr){
	    int final_mx = 0;
	    int curr_mx = 0;
	    for (int i = 0; i < arr.length; i++){
	        curr_mx = curr_mx + arr[i];
	        //if any point of time sum is -ve, assign 0
	        if (curr_mx < 0)
	           curr_mx = 0;
	        if (curr_mx > final_mx)
	           final_mx = curr_mx;
	    }
	    return final_mx;
	}
}
