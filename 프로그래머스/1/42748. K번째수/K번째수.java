import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
             int[] arr = new int[(commands[i][1] - commands[i][0]) + 1]; //4 
            List<Integer> list = new ArrayList<>();
           for(int j = commands[i][0] - 1; j < commands[i][1]; j++) {

               list.add(array[j]);
          
              
           }
             list.sort(Comparator.naturalOrder());
            answer[i] = list.get(commands[i][2] - 1);
           
        }
        return answer;
    }
}