import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0; 
        
        Integer[] list = new Integer[score.length];
        Arrays.sort(score);
      
        for(int i =0; i< score.length; i++) {
            list[i] = new Integer(score[i]);
        }
      
        //332'2' 111
        //44'4' 44'4' 22'2' 21'1' 
        
        Arrays.sort(list, Collections.reverseOrder()); 
        // 두 번째 인자값이 Object, 객체로 되어있음
        // 사용될 배열의 타입이 Reference Type이어야 함
        // int 배열이라면 Integer, double배열이라면 Double 타입
        for(int i = m - 1; i < score.length; i += m) {
              answer +=  list[i]*m;
        }
    
        return answer;
    }
}
