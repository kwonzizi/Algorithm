import java.util.*;
class Solution {
    public int[] solution(long n) {
       
        List<Long> nlist = new ArrayList<>();
        while( n > 0) {
            nlist.add(n % 10) ;
            n /= 10;
        }
       // nlist.sort(Comparator.naturalOrder());
        int[] answer = new int[nlist.size()];
        for(int i = 0; i < nlist.size(); i++ ) answer[i] += nlist.get(i);
       
        return answer;
    }
}