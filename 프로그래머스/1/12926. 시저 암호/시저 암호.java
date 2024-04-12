import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        
        char ch = 'a' ;
        char cH = 'A' ;
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for(int z = 1; z <= 26; z++) {
            list1.add(ch);
            list2.add(cH);
            ch++;
            cH++;
            
        }
        
        for(int i = 0; i < s.length(); i++) {
            int ind = 0;
             int inD = 0;
            if(s.charAt(i) == ' ') {
                answer += ' ';
            }else {
                 ind = list1.indexOf(s.charAt(i));

                if(ind == -1) {
                    inD = list2.indexOf(s.charAt(i));
                    inD =  (inD + n) % list2.size() ;
                    answer += list2.get(inD);
                }else {
                    ind = (ind + n) % list1.size();
                    answer += list1.get(ind);
                }
            }
           

        }
        
        
       
       
        return answer;
    }
}