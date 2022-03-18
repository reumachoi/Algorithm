package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

import java.util.Collections;

//https://www.acmicpc.net/problem/1026 <보물>
public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");

        int[] a = new int[A.length];
        Integer[] b = new Integer[B.length];
        for (int i = 0; i < A.length; i++) {
            a[i] = Integer.parseInt(A[i]);
            b[i] = Integer.parseInt(B[i]);
        }

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i]*b[i];
        }

        bw.write(sum+"");
        bw.close();

    }
}
