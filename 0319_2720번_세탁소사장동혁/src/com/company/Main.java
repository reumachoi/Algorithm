package com.company;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] m = {25,10,5,1};


        int t = Integer.parseInt(br.readLine());

        for (int j = 0; j < t; j++) {
            int n = Integer.parseInt(br.readLine());
            int[] r = new int[4];

            for (int i = 0; i < m.length; i++) {
                if(n>=m[i]){
                    r[i]=n/m[i];
                    n%=m[i];
                }else if(n==0){
                    break;
                }
            }

            for (int i = 0; i < r.length; i++) {
                bw.write(r[i]+" ");
            }
            bw.write("\n");
        }

        bw.close();
    }
}
