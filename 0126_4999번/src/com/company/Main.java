package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String j = br.readLine();
        String d = br.readLine();

        if(j.length() >= d.length()){
            bw.write("go");
            bw.flush();
        }else{
            bw.write("no");
            bw.flush();
        }


    }
}
