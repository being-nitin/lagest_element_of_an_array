package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// To find the largest element of an array:
    int arr[] = new int[]{1,4,7,9,2,3};
    int max = arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
        System.out.println(max);
    }
}
