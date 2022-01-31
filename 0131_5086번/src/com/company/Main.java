package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

         String[] arr;

         int res = 0;
         String msg;

        while(true){
            String s = br.readLine();
            if(s.equals("0 0")){    //0 0 들어오면 종료
                break;
            }else{
               arr = s.split(" ");
            }

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            if(a<b){    //앞수가 뒷수보다 작을때
                res = b%a;  //앞수로 뒷수를 나눠 나머지가 0이되면
               if(res == 0){
                    msg = "factor\n";   //약수
                    bw.write(msg);
                    bw.flush();
                }else{
                    msg = "neither\n";
                    bw.write(msg);
                    bw.flush();
                }
            }else if(a>b){   //앞수가 뒷수보다 클때
                res = a%b;
                if(res == 0){    //뒷수로 앞수를 나눠 나머지가 0이되면
                    msg = "multiple\n";     //배수
                    bw.write(msg);
                    bw.flush();
                }else{
                    msg = "neither\n";
                    bw.write(msg);
                    bw.flush();
                }
            }


        }
    }
}