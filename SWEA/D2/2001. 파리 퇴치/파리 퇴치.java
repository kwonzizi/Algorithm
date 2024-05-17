
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			int N = sc.nextInt();
            int M = sc.nextInt();
            
            int[][] arr = new int[N][N];
            
            for(int i = 0; i < N; i++){
            	for(int j =0; j < N; j++) {                    
                    int n = sc.nextInt();
                    arr[i][j] = n;
                }
            }
            
             int max = 0;
            
            for(int i =0; i < N-M+1; i++) {
                for(int j =0; j < N-M+1; j++) {
              		  int sum =0;
                    for(int x = i; x < i +M; x++) { 
                	    for(int y = j; y < j+M; y++) {
                    		sum += arr[x][y]; 
                        }
                    }
                    if(max < sum) {
                		max = sum;
               	 }
                }
                
            }
			
            System.out.println("#" + test_case + " " + max);
		}
	}
}