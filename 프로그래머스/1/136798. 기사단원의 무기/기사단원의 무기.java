class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int knight = 1; knight <= number; knight++) {
            int count = 0;
        
            for(int k = 1; k * k <= knight; k++) {
                if(k * k  == knight) {
                    count += 1;
                } else if(knight % k == 0) {
                    count += 2;
                }
            }
            
                if(count > limit){
                    count = power;
                }
            
             answer += count; 
        }

        return answer;
    }
}