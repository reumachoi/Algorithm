package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int arr1[] = new int[3];

        while(true){
            String st = br.readLine();
            if (st.equals("0 0 0")) {
                break;
            }else{
                String[] str = st.split(" ");

                arr1[0] = Integer.parseInt(str[0]);
                arr1[1] = Integer.parseInt(str[1]);
                arr1[2] = Integer.parseInt(str[2]);
                Arrays.sort(arr1);

                if(((arr1[0]*arr1[0])+(arr1[1]*arr1[1])) == arr1[2]*arr1[2]) {
                    bw.write("right\n");
                    bw.flush();

                }else {
                    bw.write("wrong\n");
                    bw.flush();

                }
            }
        }
    }
}

