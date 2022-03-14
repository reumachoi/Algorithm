package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[7];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
           arr[i] = Integer.parseInt(br.readLine());
           if(arr[i]%2!=0){
               list.add(arr[i]);
           }
        }

        int sum = 0;
        int min = 0;

        if(list.size()>0){
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            bw.write(sum + "\n" + Collections.min(list));
        }else{
            bw.write("-1");
        }

        bw.close();


    }
}
