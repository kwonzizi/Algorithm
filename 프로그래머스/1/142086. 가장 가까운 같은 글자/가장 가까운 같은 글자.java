class Solution {
    public int[] solution(String s) {
        char[] chS = s.toCharArray();
        int[] answer = new int[chS.length];
        
        for(int i = 0; i< chS.length; i++) {
            
            if(i == 0) {
                answer[i] = -1; 
            }else if(i > 0) {
                int j = i - 1;
                while(j >= 0) {
                    if(chS[i] == chS[j]) {
                        answer[i] = i-j;
                        j--;
                        break;
                    } else {
                        answer[i] = -1;
                        j--;
                      //  break;
                        
                    }
                  
            
                   
                    
                    
                }
            }
            
        }
        
       
        return answer;
    }
}