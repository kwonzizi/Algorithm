import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] aa = new int[k];
        
        ArrayList<Integer> bb = new ArrayList();
        
        for(int i = 0; i<score.length; i++) {    
            if(i < k) {
                bb.add(score[i]);
                bb.sort(Comparator.naturalOrder());
                answer[i] = bb.get(0);
            } else {
            
                if(bb.get(0) < score[i] ){
                    bb.remove(bb.get(0));
                    bb.add(score[i]);
                    bb.sort(Comparator.naturalOrder());
                    answer[i] = bb.get(0);
                } 
            
                else answer[i] = bb.get(0);
    
            }   
        } 
        
        return answer;
    }
}
