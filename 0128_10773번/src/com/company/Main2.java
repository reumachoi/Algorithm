package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();

        int K = Integer.parseInt(br.readLine());

        int t = 0;
        for (int i = 0; i < K; i++) {
            t = Integer.parseInt(br.readLine());
            if (t==0) {  // 0으로 들어오면 바로전 인덱스 값 지우기
                list.remove(list.size()-1); //마지막 인덱스 값 지우기
            } else {
                list.add(t);
            }
        }


        int sum = 0;
        for (int j = 0; j < list.size(); j++) {
            sum += list.get(j);//리스트 하나씩 가져와서 더하기
        }
        bw.write(sum+"");
        bw.flush();
    }
}