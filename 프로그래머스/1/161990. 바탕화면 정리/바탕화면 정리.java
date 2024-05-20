import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        char[][] arr = new char[wallpaper.length][wallpaper[0].length()];
        
        
        
        for(int i =0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[i].length(); j++) {
                
                arr[i][j] = wallpaper[i].charAt(j);
             
            }
            
        }
       
         int xmax = 0;
         int ymax = 0;
        List<Integer> xmin = new ArrayList<>();
        List<Integer> ymin = new ArrayList<>();
      
       
    
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                
                if(arr[i][j] == '#') {
                   
                    xmin.add(i);
                    ymin.add(j);
                    if(xmax <= i) {
                        xmax = i;
                        
                    }
                    if(ymax <= j) {
                        ymax = j;
                       
                    }
                }
            }
        
        }
        
         xmin.sort(Comparator.naturalOrder());
        ymin.sort(Comparator.naturalOrder());
       
        
        answer[0] = xmin.get(0);
        answer[1] = ymin.get(0);
        answer[2] = xmax+1;
        answer[3] = ymax+1;
      
    
        return answer;
    }
}