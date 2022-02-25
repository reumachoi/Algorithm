package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String ss = br.readLine();  //ex) abc
        int n = ss.length();

        int t = Integer.parseInt(br.readLine());

        int cnt = 0;

        for (int j = 0; j < t; j++) {

            String st = br.readLine();  //ex) cflwdadcldfkeab
            String s = "";

            for (int i = 0; i < st.length(); i++) { //입력받은 글자의 마지막까지 비교해야함

                if(n+i>st.length()){    //입력된 글자 마지막부분과 맨첫부분을 합쳐야 할때 (마지막 ab에서 첫글자 c로 가는경우)
                    int plus = i-st.length()+n;
                    s = st.substring(i)+st.substring(0,plus);
                }else{  //입력된 글자순대로 흘러가고 갯수가 부족하지 않을 때
                    s = st.substring(i,n+i);
                }

                if(s.equals(ss)){
                    cnt++;  //원하는 문자열을 찾았을때 카운트 세고 종료
                    break;
                }
            }
        }

        bw.write(cnt + "");
        bw.close();

    }
}
