import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        
        ArrayList<String> aa = new ArrayList();
        for(int i = 0; i<names.length; i++) {
            if(i % 5 == 0) {
                aa.add(names[i]);
            }
        }
        answer = aa.toArray(new String[aa.size()]);
        
        return answer;
    }
}