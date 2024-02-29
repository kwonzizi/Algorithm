class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        
        
        int aa = Integer.valueOf(str1+str2).intValue();
        int bb = Integer.valueOf(str2+str1).intValue();
        
        if(aa >= bb) {
            answer = aa;  
        }else {
            answer = bb;
        }
        
        return answer;
    }
}