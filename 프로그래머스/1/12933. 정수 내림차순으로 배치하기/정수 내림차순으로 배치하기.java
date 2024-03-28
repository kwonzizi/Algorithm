import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        List<Long> nlist = new ArrayList<>();
        while(n > 0) {
           nlist.add(n % 10);
            n = n / 10;
        }
        nlist.sort(Comparator.naturalOrder()); //내림차순 정렬
        
        for(int i = 0; i < nlist.size(); i++) {
            answer += nlist.get(i) * Math.pow(10, i) ;
        }
        
        return answer;
    }
}