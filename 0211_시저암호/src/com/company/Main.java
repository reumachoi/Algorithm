package com.company;

class Solution {
    public String solution(String s, int n) {
        String answer = "";


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);


            if(Character.isLowerCase(ch)){
                ch = (char)((ch-'a'+n)%26+'a');
                //z->a로 넘어가는 경우도 있으니까 알파벳 26으로 나눠서 나머지
            }else if(Character.isUpperCase(ch)){
                ch = (char)((ch-'A'+n)%26+'A');
            }

            answer += ch;

        }
        return answer;
    }
}