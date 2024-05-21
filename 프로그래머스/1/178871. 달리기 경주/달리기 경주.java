import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        int len = players.length;

        Map<String, Integer> map = new HashMap<>();
        
        for(int t = 0; t < len; t++) {
            map.put(players[t], t);
        }
        for(int i = 0; i < callings.length; i++) {
            String temp = callings[i];
            int dn = map.get(temp);
            String fronttemp = players[dn-1];
            
          
            players[dn-1] = players[dn];
            players[dn] = fronttemp;
           
            
            map.put(temp, dn-1);
            map.put(fronttemp, dn);

            
        } 
        return players;
    }
}