package com.company;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {

        //1,2,3번 수포자들이 찍는 패턴
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        //세명의 점수를 넣을 배열
        int[] score = new int[3];

        //점수 더해주기
        for (int i = 0; i < answers.length; i++) {
            if(one[i%5] == answers[i]){
                score[0]++;
            }
            if(two[i%8] == answers[i]){
                score[1]++;
            }
            if(three[i%10] == answers[i]) {
                score[2]++;
            }
        }

        //최고점수 구하기
        int Max = Math.max(score[0],Math.max(score[1],score[2]));

        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            if(Max==score[i]) {  //i번째 수포자의 점수와 최고점수와 같을때
                list.add(i+1);    //리스트에 수포자번호 넣어주기 ex.1번수포자(1)
            }
        }


        int[] answer = new int[list.size()];    //최고점수를 가진 사람수만큼 정답배열크기 지정

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);    //0번째부터 오름차순으로 수포자 번호 넣어주기
       }

        return answer;
    }
}