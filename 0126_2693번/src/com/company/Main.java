package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] intArr = new int[10];
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String arr[] = br.readLine().split(" ");

            for (int j = 0; j < arr.length; j++) {
                intArr[j] = Integer.parseInt(arr[j]);
            }

            Arrays.sort(intArr);
            bw.write(intArr[7]+"\n");
            bw.flush();
        }
    }
}
