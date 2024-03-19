import java.util.*;
class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        char[] spell = control.toCharArray();
        
        for(int i = 0; i<spell.length; i++) {
            if(spell[i] == 'w') n++;
            else if(spell[i] == 's') n--;
            else if(spell[i] == 'd') n = n + 10;
            else n = n - 10;
        }
        answer = n;
        return answer;
    }
}