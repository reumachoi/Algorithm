package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int clap = 0;
        //String answer ="";
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {

            String s = Integer.toString(i);
            String[] arr = s.split(""); //숫자 한자리씩 잘라서 배열

            if(s.length()>1){
                for (int j = 0; j < arr.length; j++) {
                   if(arr[j].equals("3") || arr[j].equals("6") || arr[j].equals("9")){
                       clap++;
                   }else{
                       //answer+="짝";
                   }
                }
            }else{  //한자릿수대
                if(i==3 || i==6 || i==9){
                    clap++;
                }else{
                    //answer+="짝";
                }
            }
        }

        bw.write(clap+"");
        //bw.write("\n"+answer);
        bw.close();
    }
}
