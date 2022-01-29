package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String s = br.readLine();

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == 'c') { //c로시작 크로아티아 알파벳 변경자
                if(i < s.length()-1) {
                    if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }else if(ch == 'd') { //d로시작 크로아티아 알파벳 변경자
                if(i < s.length()-1) {
                    if (s.charAt(i + 1) == 'z') {
                        if(i < s.length()-2){
                            if (s.charAt(i + 2) == '=') {
                                i+=2;
                            }
                        }
                    } else if (s.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }else if(ch == 'l') { //l로시작 크로아티아 알파벳 변경자
                if(i < s.length()-1) {
                    if (s.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }else if(ch == 'n') { //n로시작 크로아티아 알파벳 변경자
                if(i < s.length()-1) {
                    if (s.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }else if(ch == 's') { //s로시작 크로아티아 알파벳 변경자
                if(i < s.length()-1) {
                    if (s.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }else if(ch == 'z') { //z로시작 크로아티아 알파벳 변경자
                if(i < s.length()-1) {
                    if (s.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }

            sum++;
        }

        bw.write(sum+"");
        bw.flush();
    }
}