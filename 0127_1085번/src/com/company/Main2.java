package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {

        //첫번째 방법으로 풀고나서 다른풀이방법도 알아보다가
        //토커나이저와 Math.min을 활용해서 간단하게 비교가능하길래 사용해봤다!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer s = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(s.nextToken());
        int y =  Integer.parseInt(s.nextToken());
        int w =  Integer.parseInt(s.nextToken());
        int h =  Integer.parseInt(s.nextToken());

        int minX = Math.min(x, w-x);
        int minY = Math.min(y, h-y);

        bw.write(Math.min(minX, minY));
        bw.flush();
    }
}
