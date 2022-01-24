package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] arr = new String[2];


        String s = br.readLine();
        arr = s.split(" ");
        int a = Integer.parseInt(arr[1]);

        s = br.readLine();
        arr = s.split(" ");
        int b = a - Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);

        s = br.readLine();
        arr = s.split(" ");
        int c = b - Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);

        if (a > b && a > c) {    //a가 제일 많을때
            bw.write(Integer.toString(a));  bw.flush();
        } else if (b > a && b > c) {  //b가 제일 많을때
            bw.write(Integer.toString(b));  bw.flush();
        } else { //c가 제일 많을때
            bw.write(Integer.toString(c));  bw.flush();
        }


    }
}