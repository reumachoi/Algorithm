package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       String[] ss = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};

       String s = br.readLine();

       int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(ss[0].contains(s.charAt(i)+"")){
                sum += 3;
            }else if(ss[1].contains(s.charAt(i)+"")){
                sum += 4;
            }else if(ss[2].contains(s.charAt(i)+"")){
                sum += 5;
            }else if(ss[3].contains(s.charAt(i)+"")){
                sum += 6;
            }else if(ss[4].contains(s.charAt(i)+"")){
                sum += 7;
            }else if(ss[5].contains(s.charAt(i)+"")){
                sum += 8;
            }else if(ss[6].contains(s.charAt(i)+"")){
                sum += 9;
            }else{
                sum += 10;
            }
        }

        bw.write(sum+"");
        bw.flush();
    }
}
