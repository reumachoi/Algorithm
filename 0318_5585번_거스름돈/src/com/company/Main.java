package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


//https://www.acmicpc.net/problem/5585

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int mm = 1000-m;
        int cnt = 0;

        while(true){
            if(mm/500>0){
                cnt += mm/500;
                mm = mm%500;
            }else if(mm/100>0){
                cnt += mm/100;
                mm = mm%100;
            }else if(mm/50>0){
                cnt += mm/50;
                mm = mm%50;
            }else if(mm/10>0){
                cnt += mm/10;
                mm = mm%10;
            }else if(mm/5>0){
                cnt += mm/5;
                mm = mm%5;
            }else{
                cnt += mm/1;
                mm=0;
                break;
            }
        }
        bw.write(cnt+"");
        bw.close();
    }
}
