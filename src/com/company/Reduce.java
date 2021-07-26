package com.company;

import java.util.Arrays;

public class Reduce {
    //find the reduced form of the given array
    static void convert(int arr[], int n){
        //store the sorted form of the given array
        int brr[] = new int[n];

        for (int i = 0; i < n; i++)
            brr[i] = arr[i];

        //sort the array brr
        Arrays.sort(brr);

        //Traverse/iterate the given array arr[]
        for (int i = 0; i < n; i++){
            int l =0, r = n-1, mid;

            //binary search
            while (l <= r) {
                //calculate value of mid
                mid = (l + r) / 2;

                if (brr[mid] == arr[i]){
                        //current index
                     System.out.println(mid + "");
                     break;
                }

                //update the value of l
                else if(brr[mid] < arr[i]){
                    l = mid + 1;
                }

                //update the value of r
                else {
                    r = mid - 1;
                }
            }
        }
    }
}
