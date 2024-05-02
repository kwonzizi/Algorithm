import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		
        for(int test_case = 1; test_case <=10; test_case++)
		{
            
           
              StringBuilder sb = new StringBuilder();
            List<Integer> list = new ArrayList<>();
            
             int n = sc.nextInt();
            
            for(int i = 0; i < n; i++) {
                
                int x = sc.nextInt();
                list.add(x);
            
            }
            
            int t = sc.nextInt();
            
            for(int j = 0; j < t; j++) {
                
                char c = sc.next().charAt(0);
                
                
                if( c == 'I') {
                    
                    int a = sc.nextInt();
               		 int b = sc.nextInt();
                    for(int i = 0; i < b; i++) {
                        
                        int v = sc.nextInt();
                        
                        list.add(a+i, v);
                    
                    }
                
                }else if(c == 'A') {
                    
                     int a = sc.nextInt();
                    
                    for( int i = 0; i < a; i++) {
                        int v = sc.nextInt();
                        list.add(v);
                    }
                
                }else if(c == 'D') {
                    
                     int a = sc.nextInt();
                     int b = sc.nextInt();
                	for(int i = 0; i < b; i++) {
                    	list.remove(a);
                    }
                }
            
            }
            

            
            for(int i = 0; i < 10; i++) {
                sb.append(list.get(i) + " " );  
            }
            
            System.out.println("#" + test_case + " " + sb);
            

		}
	}
}