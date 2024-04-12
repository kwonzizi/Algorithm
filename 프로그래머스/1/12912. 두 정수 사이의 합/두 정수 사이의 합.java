class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a >= b) {
           for(int t = a; t >= b; t--){
            answer += t;
         } 
        } else {
            for(int t = a; t <= b; t++){
            answer += t;
            }
        } 
        return answer;
    }
}