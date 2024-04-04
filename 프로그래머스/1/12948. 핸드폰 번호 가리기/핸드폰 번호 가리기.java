import java.util.*;
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] arr = phone_number.toCharArray();
        int a = phone_number.length();
        int i = 0;
        while(i < a - 4) {
            arr[i] = '*';
            i++;
        }
        for(Character b : arr) answer += b;
        return answer;
    }
}