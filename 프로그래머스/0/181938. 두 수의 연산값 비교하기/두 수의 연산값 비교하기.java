class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        
        int aa = Integer.parseInt(str1+str2);
        int bb = 2*a*b;
        if(aa >= bb) {
            answer = aa;
        }else {
            answer = bb;
        }
        return answer;
    }
}