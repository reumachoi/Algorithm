package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] st = br.readLine().split(" ");

        int n = Integer.parseInt(st[0]);
        int k = Integer.parseInt(st[1]);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for(int i = n-1; i>=0; i--) {
            if(k>=arr[i]) {    //배열값이 k보다 작아야 나눌수있음
                cnt += k / arr[i]; //몫=동전 수
                k = k % arr[i]; //나머지
            }
            if(k==0){
                break;
            }
        }
        bw.write(cnt+"");
        bw.flush();
    }
}
