package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());


        for (int i = 0; i < t; i++) {
            String[] arr = br.readLine().split(" ");
            HashSet<Integer> hashSet = new HashSet<>();

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int min = Math.min(a,b);    //최대공약수는 둘중에 작은값보다 작거나 같다.
            int max = Math.max(a,b);    //최소공배수는 둘중에 큰값보다 크거나 같다.

            int gcd = 0;
            int lcm = 0;

            //최대공약수
            for (int j = min; j>0 ; j--) {
                if(a%j==0 && b%j==0){
                    gcd = j;
                    break;
                }
            }

            //최소공배수
            for (int j = max; j <= a*b; j++) {
                if(j%a==0 && j%b==0){
                    lcm = j;
                    break;
                }
            }

            bw.write(lcm + " " + gcd + "\n");
        }

        bw.close();
   }
}
