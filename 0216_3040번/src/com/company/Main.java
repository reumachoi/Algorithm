package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int who = sum - 100;
        int nan1 = 0;
        int nan2 = 0;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==who){
                    nan1 = arr[i];
                    nan2 = arr[j];
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=nan1 && arr[i]!=nan2){
               bw.write(arr[i]+"\n");
            }
        }
        bw.close();
    }
}
