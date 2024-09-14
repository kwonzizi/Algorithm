import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        HashSet<Integer> set = new HashSet<>();
       
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        // Integer[] intArray = set.toArray(new Integer[0]);
        int[] answer = new int[set.size()];
//         for(int i = 0; i < set.size(); i++)  {
//             answer[i] = intArray[i]; 
//         }
        
        
        int index = 0;
        for(Integer tmp : set){
            answer[index] = tmp;
            index++;
        }
        Arrays.sort(answer);
        return answer;
    }
}