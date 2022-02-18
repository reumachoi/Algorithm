package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] st = br.readLine().split(" "); //n과 m
        int n = Integer.parseInt(st[0]);    //k의 배수를 어디까지 구할지 판단하는 기준

        String[] st2 = br.readLine().split(" ");    //두번째줄로 들어오는 수 배열

        HashSet<Integer> set = new HashSet<>(); //자연수 k들의 공통배수 -> 중복을 피하기 위함

        for (int i = 0; i < st2.length; i++) {  //들어온 자연수 k 수 만큼 반복
            int k = Integer.parseInt(st2[i]);
            for(int j = 1; k*j <= n; j++){  //배수를 구하기 때문에 j는 자연수 1부터
                                            //k*j(k의배수)가 n이하인 수까지를 구함
                if(k*j>n){  //n을 넘으면 중단
                    break;
                }else{
                    set.add(k*j);   //k의 배수가 n이하인경우 저장
                }
            }
        }

        int sum = 0;

        //해쉬셋 하나씩 꺼내오기
        Iterator it=set.iterator();
        while(it.hasNext()){
            sum += Integer.parseInt(it.next().toString());
        }

        bw.write(sum+"");
        bw.close();
    }
}
