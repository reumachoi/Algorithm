package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer s = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(s.nextToken());
        String b = s.nextToken();

        int[] arr = new int[a];
        int cnt = 0;


        for (int i = 1; i <= a; i++) {
            arr[i-1] = i;

            String ss = i+"";

            //방법1.
            for (int j = 0; j < ss.length(); j++) {
                if(ss.charAt(j)==b.charAt(0)){
                    cnt++;
                }
            }

            //방법2.
            /*String[] arr2 = ss.split("");
            for (int j = 0; j < arr2.length; j++) {
                if(arr2[j].equals(b)){
                    cnt++;
                }
            }*/
        }
        bw.write(cnt+"");
        bw.close();
    }
}
