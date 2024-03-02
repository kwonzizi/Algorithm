
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0, s); //짜르고
        
        String after = my_string.substring(s + overwrite_string.length()); //짜르고
        return before + overwrite_string + after;
    }
}
