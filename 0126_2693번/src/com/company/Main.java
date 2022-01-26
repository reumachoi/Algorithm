package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = new String[10];
        int N = 3;

        int T = Integer.parseInt(br.readLine());
        String[] str = new String[T];

        for (int i = 0; i < T; i++) {
            str[i] = br.readLine();
            arr = str[i].split(" ");


            int[] intArr = new int[10];
            for (int j = 0; j < arr.length; j++) {
                intArr[j] = Integer.parseInt(arr[j]);
            }

            Arrays.sort(intArr);
            System.out.println(intArr[7]);
        }


    }
}
