package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[n][2];
        String[] st = new String[2];
        for (int i = 0; i < n; i++) {
            st = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(st[0]);
            arr[i][1] = Integer.parseInt(st[1]);
        }

        int rank = 1;
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            rank = 1;
            for (int j = 0; j < n; j++) {
                if(i != j){ //같은값이 아닐때 
                    if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                        rank++;
                        r[i] = rank;
                    }else{
                        r[i] = rank;
                    }
                }
            }
        }

        for (int i: r) {
            bw.write(i+" ");
            bw.flush();
        }
    }
}
