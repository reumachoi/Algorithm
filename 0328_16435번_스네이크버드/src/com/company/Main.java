package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer s = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(s.nextToken());
        int l = Integer.parseInt(s.nextToken());

        String[] arr = br.readLine().split(" ");
        int[] arry = new int[n];
        for (int i = 0; i < n; i++) {
            arry[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(arry);
        for (int i = 0; i < n; i++) {
            if(arry[i]<=l){
                l++;
            }
        }

        bw.write(l+"");
        bw.close();
    }
}
