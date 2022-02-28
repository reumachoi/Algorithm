package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer s = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(s.nextToken());
        int b = Integer.parseInt(s.nextToken());
        int min = Math.min(a,b);

        List<String> list = new ArrayList<>();

        for (int i = 1; i<=min; i++) {  //사과, 바나나중에 작은수만큼 최대 인원
            if(a%i==0 && b%i==0){   //인원으로 과일갯수를 나눴을때 0이 되면 가능
                list.add(i + " " + a/i + " " + b/i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i)+"\n");

        }
        bw.close();
    }
}
