import java.util.Scanner;


public class Solution
{
    
    public static int pow(int x, int y) {
        
        if(y==0) 
            return 1;
        return x*pow(x,y-1);
    
    }
	public static void main(String args[]) 
	{
		
		Scanner sc = new Scanner(System.in);
        int tc = 1;
        while(tc <= 10) {
            int T =sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            System.out.println("#" + tc+ " " + pow(a,b));
            
            tc++;
        }
      
	}
}