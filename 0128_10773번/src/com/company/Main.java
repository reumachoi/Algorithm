package com.company;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<String> stack = new Stack<>();
        int K = Integer.parseInt(br.readLine());

        String s;
        for (int i = 0; i < K; i++) {
            s = br.readLine();
            if(s.equals("0")){  //0으로 들어오면 바로 전 값 삭제
                stack.pop();
            }else{  //0이 아니면 스택에 추가
                stack.push(s);
            }
        }

        int sum = 0;
        while(stack.empty() != true){   //스택이 빌때까지
            sum += Integer.parseInt(stack.peek());  //상단값 출력
            stack.pop();    //그리고 출력한 상단값 삭제
        }

        bw.write(sum+"");
        bw.flush();
    }
}