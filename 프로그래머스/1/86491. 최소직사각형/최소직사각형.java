import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int prevMax = 0;
        int prevMin = 0; 
        
        for(int[] size: sizes) {  
             int curMax = Math.max(size[0],size[1]); 
             int curMin = Math.min(size[0],size[1]);
            
              prevMax = Math.max(curMax, prevMax);           
              prevMin = Math.max(curMin, prevMin);
            
        }
        answer = prevMax * prevMin;
        
        return answer;
    }
}

