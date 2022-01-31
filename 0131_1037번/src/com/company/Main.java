package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] ar = new int[N];

        for (int i = 0; i < N; i++) {
           ar[i] = Integer.parseInt(arr[i]);    //숫자형 배열로 변경
        }

        Arrays.sort(ar);    //오름차순 정렬

        //최소약수와 최대약수를 곱하면 배열에 있는 약수를 가진 숫자를 구할 수 있다.
        bw.write((ar[0]*ar[ar.length-1])+"");
        bw.flush();
    }
}