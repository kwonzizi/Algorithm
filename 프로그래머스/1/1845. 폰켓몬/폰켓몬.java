import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int N = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i < N; i++) {
          if(hs.contains(nums[i]) == false) hs.add(nums[i]);
          
            if(hs.size() > N/2 ) answer = N/2;
            else answer =  hs.size() ;
        }
        return answer;
    }
}