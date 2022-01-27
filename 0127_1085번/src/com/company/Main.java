package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] arr = br.readLine().split(" ");
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);
        int w = Integer.parseInt(arr[2]);
        int h = Integer.parseInt(arr[3]);


        int dw = Math.abs(w-x); //어차피 x는 w보다 작기때문에 절대값 필요없을듯
        int dh = Math.abs(h-y); //y도 h보다 작음 (다풀고알았다...)

        int[] arr2 = {x,y,dw,dh};
        Arrays.sort(arr2);

        bw.write(Integer.toString(arr2[0]));
        bw.flush();


    }
}
