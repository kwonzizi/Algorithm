
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
      
        for(int z = 1; z <= 10; z++) {
              int answer = 0;
               int dump = sc.nextInt();  
              int[] arr = new int[100];
            for(int i = 0; i < 100; i++) {
                int A = sc.nextInt();
                arr[i] = A;
           
              }  
            for(int x = 0; x< dump ; x++) {
                Arrays.sort(arr);
                if(arr[99] - arr[0] == 0) { 
                     break;
                } else   {
                arr[0] = arr[0] + 1;
                arr[99] = arr[99] - 1;
                }
            }
            Arrays.sort(arr);
            answer =  arr[99] - arr[0];
    
            System.out.println("#" + z + " "+ answer );
        }
    
            
         }
}