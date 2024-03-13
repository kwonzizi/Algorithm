import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        ArrayList<Integer> pr = new ArrayList();
        
        for(int i = 1; i < n; i++) {
            if( n % i == 1) pr.add(i);
        }
        pr.sort(Comparator.naturalOrder()); 
            
        answer = pr.get(0);
       
        
        return answer;
    }
}