package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        Integer[] arrs = new Integer[n];

        for (int i = 0; i < arr.length; i++) {
            arrs[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(arrs, Collections.reverseOrder());
        int max = 0;
        for (int i = 0; i < n; i++) {
            arrs[i] = arrs[i]+i+1;
            if(arrs[i]>max){
                max = arrs[i];
            }
        }
        max=max+1;
        bw.write(max+"");
        bw.close();
    }
}
