
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	    String[] rr = {"0001101", "0011001", "0010011", "0111101", "0100011", "0110001", "0101111", "0111011", "0110111", "0001011"};
		for(int test_case = 1; test_case <= T; test_case++)
		{
		
		 	int n = sc.nextInt();
            int m = sc.nextInt();
            
            char[][] arr = new char[n][m];
           
            for(int i = 0; i < n; i++) {
                String str = sc.next();
                for(int j =0; j< m; j++) {
                    char c = str.charAt(j);
                	arr[i][j] = c;
                }
            
            }
             String str1 = "";
            
             for(int i = 0; i < n; i++) {
                
                for(int j = m-1; j >= 0; j--) {
                    
                   if( arr[i][j] == '1'){
                       
                     for(int x = j-55; x <= j; x++) {
                       		
                           	str1 += arr[i][x];            		  
                       }
						break;
                   }
                  
                }
                 if(str1.length() == 56) 
                     break;
            
            }
            String aa = "";
            
            for(int i = 0; i <= 49; i+=7) {
               String a = str1.substring(i,i+7);
                for(int j = 0; j <10; j++) {
                 	if(a.equals(rr[j])) {
                    	aa += j;
                    }
                }
            }
            int one = 0;
            int two = 0;
            for(int i = 0; i < aa.length(); i++) {
                if(i%2 == 0) {  
                    one += aa.charAt(i) -'0';
                } else if (i%2 == 1) {
                	two += aa.charAt(i) -'0';
                }
            
            }
            
         
            int  answer =one*3 + two;
            if(answer % 10 == 0) {
            System.out.println("#" + test_case + " " + (one+two));
            }else{
             System.out.println("#" + test_case + " " + 0);
            }
                
		}
	}
}