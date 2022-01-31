package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            boolean[] boo = new boolean[26];
            boolean chk = true;

            for (int j = 0; j < s.length(); j++) {
                int idx = s.charAt(j)-'a';
                if(boo[idx]){   //이전에 이미 같은 알파벳이 사용됨
                    if(s.charAt(j)!=s.charAt(j-1)){ //바로앞 글자와 현글자가 같지않다면 떨어져서 나왔음으로 그룹단어가 아님
                        chk = false;
                        break;
                    }
                }else{  //이전에 사용되지 않았던 알파벳이라면 체크표시
                    boo[idx] = true;
                }
            }
            if(chk){count++;}   //chk==true 그룹단어 체크되면 카운트 1증가
        }
        bw.write(count+"");
        bw.flush();
    }
}
