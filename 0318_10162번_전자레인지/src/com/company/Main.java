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

        int[] arr = {300,60,10};

        int t = Integer.parseInt(br.readLine());

        int[] answer = new int[3];
        int i = 0;

        while(t!=0){
            if(i==3) {
                bw.write("-1");
                break;

            }else if(t >= arr[i]){
                answer[i] += t / arr[i];
                t %= arr[i];
            }
            i++;
        }

        if(t==0){
            for (int j = 0; j < answer.length; j++) {
                bw.write(answer[j]+" ");
            }
        }

        bw.close();

    }
}
