
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
			
      		  int T = sc.nextInt();
               StringBuilder str = new StringBuilder();
                for(int i = 1; i <= T; i++) {
					int cnt = 0;
                    if(i < 10) {
                        if( i % 3 == 0) {
                            str.append('-');
                        }else
                            str.append(i);
                        
                       str.append(' ');
                    }else {
                        
                    	String a = "";
                        a += i;
                       char[] arr = a.toCharArray();
                        for(int j = 0; j < arr.length; j++) {
                          if(arr[j] - '0' != 0) {
                               if(arr[j] % 3 == 0) {
                                cnt++;
                            }
                          }
                           
                          
                        }
                        
                        if(cnt == 2) {
                           
                            for(int t = 0; t <2; t++) {
                                str.append('-');
                            }
                       		 
                        }else if(cnt == 1) {
                            str.append('-');
                        }else {
                            str.append(i);
                        }
                    str.append(' ');
                    }
                    

            }
            System.out.println(str);
   
	}
}