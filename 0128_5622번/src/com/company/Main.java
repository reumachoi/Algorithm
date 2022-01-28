package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ss = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};

        String s = br.readLine();

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(ss[0].contains(s.charAt(i)+"")){ //2번누르기(배열로는0번 "ABC")
                sum += 3; //1을 누를때 2초소요 그이후로는 숫자만큼 1초씩 증가 (2+1)
            }else if(ss[1].contains(s.charAt(i)+"")){
                sum += 4; //(2+2)
            }else if(ss[2].contains(s.charAt(i)+"")){
                sum += 5; //(2+3)
            }else if(ss[3].contains(s.charAt(i)+"")){
                sum += 6; //(2+4)
            }else if(ss[4].contains(s.charAt(i)+"")){
                sum += 7; //(2+5)
            }else if(ss[5].contains(s.charAt(i)+"")){
                sum += 8; //(2+6)
            }else if(ss[6].contains(s.charAt(i)+"")){
                sum += 9; //(2+7)
            }else{
                sum += 10; //(2+8)
            }
        }

        bw.write(sum+"");
        bw.flush();
    }
}