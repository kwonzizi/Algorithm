class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        // for(int i = 0; i< num_list.length; i++) {
        //     if(num_list[i] == n) {
        //         answer = 1;
        //         break;
        //     }else answer = 0;
        // }
        
        for (int x : num_list) {
            if(x == n) {
                return 1;
            }
        }
     
        return answer;
    }
}