
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <= 10; tc++) {
      	    int T = sc.nextInt();
            String str = sc.next();
            int answer = 0;
            for(int i = 0; i < T; i++) {
                
                if(str.charAt(i) == '+') {
                     answer += 0;
                   
                }else {
                    answer += Integer.valueOf(Character.toString(str.charAt(i)));
                   
                }
            
            }
            
            System.out.println( "#" + tc + " " + answer);
            
        }
		
	}
}