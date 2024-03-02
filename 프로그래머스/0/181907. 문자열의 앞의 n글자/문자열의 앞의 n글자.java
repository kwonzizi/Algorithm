class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] a = my_string.toCharArray();
        for(int i = 0; i< n; i++) {
            answer += a[i];
        }
        return answer;
        
        
        //  return my_string.substring(0, n);
    }
}