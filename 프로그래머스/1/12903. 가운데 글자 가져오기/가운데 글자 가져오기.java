class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        
        int a = s.length() / 2;
        if(s.length() % 2 == 0 ) { 
            for(int j = a-1; j <= a; j++) {
                answer += c[j];
            }
            
        }else {
            answer += c[a];
        }
        return answer;
    }
}