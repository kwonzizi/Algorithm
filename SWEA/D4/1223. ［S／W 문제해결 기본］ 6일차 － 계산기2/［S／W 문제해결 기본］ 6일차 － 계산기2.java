
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class Solution
{
    
    public static int get_prior(char c) {
        
        if(c == '*') 
            return 1;
        else if(c == '+')
            return 3;
        else
            return -1;
    }
    
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <=10; tc++) {
            int T;
			T=sc.nextInt();
            
            String str = sc.next();
          //  int answer = 0;
            Stack<Character> c_stack = new Stack();
            String s = "";
            Stack<Integer> i_stack = new Stack();
          //   System.out.println(str.length());
            for(int i = 0; i < str.length(); i++) {

            	char c = str.charAt(i);
                
                if( c - '0' >= 0 && c- '0' <= 9) {
                    
                    s += String.valueOf(c);       
                }else {
                    if(c_stack.isEmpty()) {
                    	c_stack.push(c);
                    }else {
                        
                        if( get_prior(c_stack.peek()) <= get_prior(c) ) {
                        	s += String.valueOf(c_stack.pop());       
                            c_stack.push(c);
                        } else {
                        	c_stack.push(c);
                        }
                    
                    }
                
                }
            }
           
            while(!c_stack.isEmpty()) {
                	s += String.valueOf(c_stack.pop());
              
            }
                          
            
            
            for(int j = 0; j < s.length(); j++) {
            
                char c = s.charAt(j);
                
                if(c-'0' >= 0 && c-'0' <= 9) {
             		   i_stack.push(c -'0');
                }else {
                		int temp1 = i_stack.pop();
                        int temp2 = i_stack.pop();
                    	int result = 0;
                  		
                    if(c == '*') {
                        result = temp1 * temp2;
                        i_stack.push(result);
                    
                    }else if(c == '+') {
                        
                        result = temp1 + temp2;
                        i_stack.push(result);
                    
                    }
                    
                    
                }
                
                  
            }
                  
            System.out.println("#" + tc + " " + i_stack.pop());
        }

		
	}
}