class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char aa[] = my_string.toCharArray();
        
        for(int i = aa.length - n; i<aa.length; i++) {
            answer += aa[i];
        }

        return answer;
    }
}