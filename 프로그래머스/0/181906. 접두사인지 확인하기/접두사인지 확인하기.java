class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        char[] strChar = my_string.toCharArray();
        String charStr = "";
        for(int i = 0; i< strChar.length; i++) {
            charStr += strChar[i];
            if(charStr.equals(is_prefix) == true) return 1;
        }
    
        return answer;
    }
}