
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        for(int tc = 1; tc <=10; tc++) {
            int T;
            T=sc.nextInt();	
            sb.append("#" + tc + " ");
            Queue<Integer> q = new LinkedList<Integer>();
            for(int i = 0; i < 8; i++) {
                int n = sc.nextInt();
            	q.add(n);
            }
            int count = 1;
            while( true ){
                int temp = q.poll();
                temp -= count;
                if ( temp <= 0) {
                	q.add(0);
                    break;
                }
                q.add(temp);
                if( count + 1 > 5) {
                    
                    count = 1;
                
                }else 
                    count++;
        
        }
            String str = " ";
            for(int i = 0; i < 8; i++) {
           
                if(i ==7 ) {
                	sb.append(q.poll()+ "\n");
                }else
                    sb.append(q.poll()+ " ");
            }
     
        }
	       System.out.println(sb);	
	}
}