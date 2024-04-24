
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
            int a = 0;
            int a1= 0;
            int b = 0;
            int b1 = 0;
            int c = 0;
            int c1 = 0;
            int d = 0;
            int d1 = 0;
            for(int i = 0; i< str.length(); i++) {
                
                if(str.charAt(i) =='(' ) {
                    a++;
                }else if(str.charAt(i) ==')' ){
                    a1++;
                }else if (str.charAt(i) =='[' ) {
                    b++;
                } else if (str.charAt(i) ==']' ) {
                    b1++;
                } else if(str.charAt(i) =='{' ) {
                    c++;
                } else if (str.charAt(i) =='}' ) {
                    c1++;
                }else if (str.charAt(i) =='<' ) {
                    d++;
                }else if (str.charAt(i) =='>' ) {
                    d1++;
                }
               
            }
            
            if((a == a1) && (b == b1) && (c==c1)&& (d==d1) ){
            	System.out.println("#" + tc + " 1");
            }else 
                System.out.println("#" + tc + " 0");
            
            
        }

	
	}
}