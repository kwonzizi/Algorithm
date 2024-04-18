
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
     int tc = 1;
	 while( tc <= 10) {
         int T =sc.nextInt();
          int[][] arr = new int[100][100];
        for(int i = 0; i < 100; i++) {
           
            for(int j = 0; j < 100; j++) {
                
                int n = sc.nextInt();
                
                arr[i][j] = n;
           
            }
        }
        int[] garo = new int[100];
        int[] sero = new int[100];
        int rightDae = 0; 
        int leftDae = arr[49][49];
        for(int z = 0; z < 100; z++) {
            int garoHap = 0;
            int seroHap = 0;

            for(int x = 0; x< 100; x++) {
               garoHap += arr[z][x];
               seroHap += arr[x][z];
                garo[z] = garoHap;
                sero[z] = seroHap;
                if(z==x) {
                rightDae += arr[z][x];
                   
                }else if(z == 99 - x) {
                    leftDae += arr[z][x];

                }
            }
        }
          Arrays.sort(garo);
          Arrays.sort(sero);
  
        int answer = 0;
       
         //answer =Math.max( Math.max(garo[99],sero[99]) , Math.max(rightDae,leftDae));
         int[] hapArr = {garo[99], sero[99], rightDae, leftDae};
         Arrays.sort(hapArr);
          System.out.println("#" + T + " " + hapArr[3]);
         tc++;
     }
	}
}