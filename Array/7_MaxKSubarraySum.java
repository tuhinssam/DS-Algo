/*max k element subarray sum*/

import java.io.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		int k = 3;
		int[] arr = {-5, 8, 9, -6, 10, -15, 3};
		int result = maxKSubarrayBF(arr, k);
		System.out.println(result);
	}
    static int maxKSubarrayBF(int[] arr, int k){
        int mx_sum = 0;
	    for(int i = 0; i< arr.length - k; i++){
	        int curr_sum = arr[i];
	        for(int j=i+1; j<i+k; j++){
	            curr_sum = curr_sum + arr[j];
	        }
	        if(curr_sum > mx_sum)
	           mx_sum = curr_sum;
	    }
	    return mx_sum;
	}
}
