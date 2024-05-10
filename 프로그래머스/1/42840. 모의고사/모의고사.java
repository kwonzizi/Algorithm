import java.util.*;

class Solution {
    
    public static int qu(int[] arr, LinkedList<Integer> list){
        int result = 0;
        LinkedList<Integer> queue = new LinkedList<>();
         for(int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
    for(int i = 0; i < arr.length; i++) {
     // while(!queue.isEmpty()) {
        if(queue.poll() == list.get(i%list.size())) {
                result++;
            }
            
         //}
        }
        return result;
    }
    public int[] solution(int[] answers) {
        
        LinkedList<Integer> list1 = new LinkedList<>(List.of(1,2,3,4,5)); 
        LinkedList<Integer> list2 = new LinkedList<>(List.of(2,1,2,3,2,4,2,5)); 
        LinkedList<Integer> list3 = new LinkedList<>(List.of(3,3,1,1,2,2,4,4,5,5)); 
        
        int a = qu(answers, list1);
        int b = qu(answers, list2);
        int c = qu(answers, list3);
        List<Integer> aa = new ArrayList<>();
        int[] st = {a,b,c};
        int max = Math.max(st[0], Math.max(st[1], st[2]));
        if(st[0] == max) {
            aa.add(1);            
        }
        if(st[1] == max) {
            aa.add(2);
        }
        if(st[2] == max){
            aa.add(3);
        }
        int len = aa.size();
    
        int[] answer = new int[len];
        
        for(int i = 0; i < len; i++) {
            answer[i] = aa.get(i);
            
        }
      
        return answer;
        
    }
}