package com.neeraj.practice;

import java.util.Scanner;

public class RotateAndDelete {
	
	public static void main (String[] args) {
		//code
//		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		RotateAndDelete rad = new RotateAndDelete();
		int t = sc.nextInt();
		int arr[];
		int arraySize;
		
		for(int i=0; i<t; i++) {
		    
		    arraySize = sc.nextInt();
		    arr = new int[arraySize];
		    for(int j=0; j<arraySize; j++)
		        arr[j] = sc.nextInt();
		    rad.rotateAndDelete(arr, arraySize);
		    
		}
	}
	
	public void rotateAndDelete(int arr[], int arraySize) {
	    int count = 1, size = arraySize, temp;
	    while(count <= arraySize) {
	        temp = arr[size-1];
	        for(int i=size-1; i>0; i--) {
	            arr[i] = arr[i-1];
	        }
	        arr[0] = temp;
	        
	        if(size == 1)
	            break;
	        else if(count<=size) {
	            size--;
	            for(int j=size-count+1; j<size; j++)
	                arr[j] = arr[j+1];
	        }
	        else if(count>size) {
	            size--;
	            for(int k=0; k<size; k++)
	                arr[k] = arr[k+1];
	        }
	        count++;
	    }
	    System.out.println(arr[0]);
	}

}
