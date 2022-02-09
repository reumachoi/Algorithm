package com.company;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {

        //1~9까지 더한 값
        int answer = 45;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < 10; j++) {
                if(numbers[i] == j){
                    answer -= j;    //없는값을 45에서 빼기
                    break;
                }
            }
        }

        return answer;
    }
}