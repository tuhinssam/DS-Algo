/* k elements subarray sum */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[] arr = {2,3,5,5,5,5, 5, 5, 11,15};
	    int key = 5;
	    int result1 = binSerFirOcc(arr,key);
	    System.out.println("First Occurance is at: "+result1);
	    int result2 = binSerLastOcc(arr,key);
	    System.out.println("Last Occurance is at: "+result2);
	}
    static int binSerFirOcc( int[] arr, int key){
	    int result = -1;
	    int s = 0;
	    int e = arr.length - 1;
	    while (s <= e){
	        int m = s + (e-s)/2;
	        if(key > arr[m]){
	            s = m + 1;
	        }
	        else if(key < arr[m]){
	            e = m - 1;
	        }
	        else{
	            result = m; 
	            e = m -1;
	        }
	   }
	   return result;
	}
	static int binSerLastOcc( int[] arr, int key){
	    int result = -1;
	    int s = 0;
	    int e = arr.length - 1;
	    while (s <= e){
	        int m = s + (e-s)/2;
	        if(key > arr[m]){
	            s = m + 1;
	        }
	        else if(key < arr[m]){
	            e = m - 1;
	        }
	        else{
	            result = m; 
	            s = m + 1;
	        }
	   }
	   return result;
	}
}
