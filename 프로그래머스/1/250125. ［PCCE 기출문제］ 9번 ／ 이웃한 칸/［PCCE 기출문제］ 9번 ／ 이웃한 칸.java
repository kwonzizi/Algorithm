class Solution {
    public int solution(String[][] board, int h, int w) {
        int count = 0;
        int n = board.length;
        
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        int h_check = 0;
        int w_check = 0;
    
        String kan = board[h][w];
        
        for(int i = 0; i < 4; i++) {
            
                h_check = h + dh[i]; 
                w_check = w + dw[i]; 
            
                if( h_check >= 0 && h_check < n && w_check >= 0 && w_check <n) {
                    
                        if(kan.equals(board[h_check][w_check])) count++;
                   
            } 
        
         
        }
      
        return count;
    }
}