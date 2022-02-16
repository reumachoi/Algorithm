package com.company;

import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2; //최대로 가져갈 수 있는 폰켓몬 수

        HashSet<Integer> hash = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            hash.add(nums[i]);
        }

        if(hash.size()==1){ //배열의 모든 값이 같은 숫자일때 최대 1종류
            answer=1;
        }else if(hash.size()<nums.length/2){  //중복 제외 종류수가 최대 가능 수보다 작을때
            answer -= answer-hash.size();   //(최대 가능수)-(중복제외 종류 수) 차이수를 answer에서 빼줌
        }   //hash.size() >= answer 이경우엔 answer이 이미 최대 가능한 폰켓몬 수기 때문에 다루지 않음

        return answer;
    }
}