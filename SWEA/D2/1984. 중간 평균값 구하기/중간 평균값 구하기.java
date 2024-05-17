
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
		 
            int[] arr = new int[10];
            for(int i = 0; i < 10; i++) {
                 int n = sc.nextInt();
                 arr[i] = n;
            }
           Arrays.sort(arr);
            double sum = 0;
            for(int j = 1; j <9; j++) {
                sum += arr[j];  
            }
            double avg = sum / 8;
            long avg2 = Math.round(avg);
            
            System.out.println("#" + test_case + " " + avg2);
            

		}
	}
}