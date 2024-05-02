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
		
            StringBuilder sb = new StringBuilder();
			int T = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < T ; i++) {
                int n = sc.nextInt();
                list.add(n);
            }
            
            int n = sc.nextInt(); //11
            for(int j = 0; j < n; j++) {
            	char c = sc.next().charAt(0);
                //System.out.println(c);
                int a = sc.nextInt();
                int b = sc.nextInt();
                if( c == 'I') {
                	for(int i = 0; i < b; i++) {
                        int x = sc.nextInt();
                        list.add(a+i, x);
                    }
                }else if( c == 'D'){
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