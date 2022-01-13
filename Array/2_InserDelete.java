/*
Insert at specific position
return array size after insert
*/

import java.io.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		int pos = 4;
		int val = 15;
		int cap = 4;
		int[] arr = new int[9];
		arr[0] = -5;
		arr[1] = 4;
		arr[2] = 3;
		arr[3] = -2;
		//int result = insert(arr, pos, val, cap);
		//System.out.println(result);
		//for (int i=0; i<arr.length; i++)
		    //System.out.print(arr[i] + " ");
		int result = deleteElm(arr, 3);
		for (int i=0; i<arr.length; i++)
		    System.out.print(arr[i] + " ");
	}
	static int insert(int[] arr, int pos, int val, int cap){
	    int idx = pos -1;
	    if(cap == arr.length)
	           return cap; 
	    for(int i=cap; i >= idx; i--)
	    {
	       arr[i+1]= arr[i];
	    }
	    arr[idx] = val; 
	    
	    return cap + 1;
	}
	static int deleteIdx(int[] arr, int pos){
	    int idx = pos -1;
	    
	    for(int i=idx+1; i < arr.length; i++)
	    {
	       arr[i-1]= arr[i];
	    }
	    return arr.length - 1;
	}
	static int deleteElm(int[] arr, int elm){
	    int i=0;
	    for (i =0; i<arr.length; i++){
	        if (arr[i]== elm)
	           break;
	    }
	    if (i == arr.length)
	       //element not Found
	       return -1;
	    for(int j =i; j < arr.length -1; j++)
	       arr[j] = arr[j+1];
	    return arr.length - 1;
	  }
	  

}
