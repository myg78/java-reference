package com.test.hackerrank.zigzag;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
public class Main {

    public static void main (String[] args) throws java.lang.Exception {
//        Scanner kb = new Scanner(System.in);
//        int test_cases = kb.nextInt();
//        for(int cs = 1; cs <= test_cases; cs++){
//            int n = kb.nextInt();
//            int a[] = new int[n];
//            for(int i = 0; i < n; i++){
//                a[i] = kb.nextInt();
//            }
//            findZigZagSequence(a, n);
//        }
        int[] arr = {2,3,5,1,4};
        findZigZagSequence(arr, 3);

    }

    public static void findZigZagSequence(int [] a, int n){

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int mid = (n + 1)/2;

        System.out.println(mid);

        int temp = a[mid];

        System.out.println("temp: " + temp);

        a[mid] = a[n - 1];
        System.out.println(a[mid]);

        a[n - 1] = temp;
        System.out.println(a[n - 1] );

        int st = mid + 1;
        int ed = n - 1;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed + 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println("end");
    }
}



