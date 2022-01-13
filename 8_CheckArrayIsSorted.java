/*check if array is sorted*/

import java.io.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		int[] arr = {-5, 8, 9, 10, 15};
		String result = maxKSubarrayBF(arr);
		System.out.println(result);
	}
    static String maxKSubarrayBF(int[] arr){
        for(int i = 1; i< arr.length; i++){
            if (arr[i-1]>arr[i])
               return "not sorted";
        }
        return "sorted";
	}
}
