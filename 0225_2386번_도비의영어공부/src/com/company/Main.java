package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> list = new ArrayList<>();

        while(true){
            String s = br.readLine().replace(" ","");

            int cnt = 0;
            if(!s.equals("#")){
                String[] ss = s.split("");
                for (int i = 1; i < ss.length; i++) {
                    if(ss[i].toLowerCase().equals(ss[0])){
                        cnt++;
                    }
                }
                bw.write(ss[0]+" "+cnt+"\n");
            }else{
                break;
            }
        }
        br.close();
        bw.close();
    }
}
