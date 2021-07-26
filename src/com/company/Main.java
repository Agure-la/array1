package com.company;

import java.sql.Array;

import static com.company.Reduce.convert;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[] = new int[] {5, 10, 40, 30, 20 };
        int N = arr.length;
        //convert(arr, N);
        convert(arr, N);

        int bj[] = new int[]{10, 40, 20};
        int k = bj.length;
        convert(bj, k);

    }
}
