import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char ch = 'a';
        
        List<Character> list = new ArrayList<>();
  
        for(int i = 1; i <= 26; i++) {
             list.add(ch);
             ch++;
        }
    
          for (int i = 0; i < skip.length(); i++) {
            list.remove(list.indexOf(skip.charAt(i)));
        }

//        System.out.println(list);
        for(int z = 0; z < s.length(); z++) {
            
            int ind = list.indexOf(s.charAt(z));
            
            ind = (ind + index) % list.size() ;
            answer += list.get(ind);
            
        }
    
        return answer;
        
    }
}