package com.company;

class Solution {
    public int solution(int n) {
        int answer = 0;


        for (int i = 1; i <= n; i++) {
            if(n%i==0){ //i가 약수인 경우
                answer += i;
            }
        }
        return answer;
    }
}