
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		Scanner sc = new Scanner(System.in);
	
		for(int test_case = 1; test_case <= 10; test_case++)
		{
		
			int T=sc.nextInt();
            String str = sc.next();
            
            char[] arr = str.toCharArray();
            List<Integer> list = new ArrayList<>();
        	StringBuilder sb = new StringBuilder();
            for(int i = 0; i < T; i++) {   
                int a= arr[i]-'0';
                list.add(a);
              }
            int j = 0;
            while(j < list.size()-1) {
                int y = 0;
              if(j>=0 && list.get(j) == list.get(j+1)) {
                  while(y<2){
                      list.remove(j);  
                      y++;
                  }
           		   j--;
              }else        
                   j++;

            }
           
            for(int i = 0; i < list.size(); i++) {
       		      sb.append(list.get(i));
            }
            
          System.out.println( "#" + test_case + " " +sb);
  			

		}
	}
}