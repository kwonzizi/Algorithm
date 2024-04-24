
import java.util.Scanner;
import java.io.FileInputStream;


public class Solution
{
    
    static int find;
    static int[] v;
    static int[][] arr;
    
    public static void dfs(int x) {
        
        if(find == 1)
            return;
        if(x==99){
            find = 1;
         	return;
        }
        
        v[x] = 1;
        
        for(int i =0 ; i< 100; i++) {
           
            if(v[i] == 0 && arr[x][i] == 1) {
                
                dfs(i);
            }
        }
      	v[x] = 0;
    }
	public static void main(String args[]) 
	{
		
		Scanner sc = new Scanner(System.in);
        
        for(int tc = 1; tc <=10; tc++) {
      	    int T = sc.nextInt();
         	int n = sc.nextInt();
            
           	 arr = new int[100][100];
             v = new int[100];
            
            find = 0;
            
            for(int i = 0; i < n; i++) {
            	int x = sc.nextInt();
                int y = sc.nextInt();
                
                arr[x][y] = 1;
            }
            
            dfs(0);
           
            System.out.println("#" + tc + " " + find);
            
        }
	}
}