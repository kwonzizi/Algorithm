class Solution {
    static int result = 0;
    public int solution(int[] numbers, int target) {
       
        dfs(0, numbers, target, 0);
 
        return result;
    }
    
    public static void dfs(int index, int[] arr, int target, int sum) {
        if(index == arr.length) {
            
            if(sum == target) {
                result++;
            }
             return;
        }
        
        dfs(index+1, arr, target, sum + arr[index]);
        dfs(index+1, arr, target, sum - arr[index]);
       
    }
}
