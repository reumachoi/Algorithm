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

        HashSet hash = new HashSet();

        for (int b = 1; b <= 500 ; b++) {
            for (int a = 1; a <= 500 ; a++) {
                if(a*a==b*b+n){
                    String s = a+b+"";
                    hash.add(s);
                }
            }
        }

        bw.write(hash.size()+"");
        bw.close();
    }
}
