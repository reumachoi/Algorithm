package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 3; i<=n-6; i+=3) {
            for (int j = 3; j<=n-i-3; j+=3){
               cnt++;
            }
        }

        if (n == 3 || n == 6) {
            bw.write("0");
        }
        else {
            bw.write(cnt + "");
        }
        bw.close();
    }
}
