class Solution {
    int answer = 0;
    int t = 0;
    
    public void dfs(int[] numbers, int depth, int sum) {
        if(depth == numbers.length) {
            if(sum == t) answer++;
        }else{
            dfs(numbers, depth+1, sum+ numbers[depth]);
            dfs(numbers, depth+1, sum - numbers[depth]);
        }
    }
    public int solution(int[] numbers, int target) {
        t = target;
        dfs(numbers, 0 , 0);
        return answer;
    }
}