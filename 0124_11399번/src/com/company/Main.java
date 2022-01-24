package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] arr = new String[N];
        arr = s.split(" ");



        int[] arr2 = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(arr2);
        int sum = 0;
        int p = 0;

        for (int i = 0; i < arr2.length; i++) {
            p += arr2[i];
            sum += p;
        }

        bw.write(Integer.toString(sum));
        bw.flush();
    }
}