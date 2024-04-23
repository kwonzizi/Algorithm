
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
       
        for(int tc = 1 ; tc <= 10; tc++) {
            
                int T = sc.nextInt();
            
                char[][] arr = new char[8][8];
            for(int i = 0; i < 8; i++) {
                
                  String str = sc.next();
                
                for(int j = 0; j <8; j++) {
                    
                    arr[i][j] = str.charAt(j);
                   
                }
            }
            
            
            //가로
            int cnt = 0;
            for(int z = 0; z < 8; z++) {
              
                for(int v = 0; v < 8; v++) {
                     int hap = 0; 
                    for(int w = 0; w <T/2; w++) {
                      
                        if( (v+w) >= 8 || (v+T-w-1) >= 8) {
                        		break;
                        }
                       
                        if(arr[z][w+v] == arr[z][v+T-w-1])  {
                        	hap++;
                        }
                 

                    }
                       if(hap == T/2) 
                           cnt++;

                }
         
            }
            
             //세로
            
            for(int z = 0; z < 8; z++) {
                String a = "";
                for(int v = 0; v < 8; v++) {
                     int hap = 0; 
                    for(int w = 0; w <T/2; w++) {
                        
                      
                        if( (v+w) >= 8 || (v+T-w-1) >= 8) {
                        		break;
                        }
                       
                        if(arr[w+v][z] == arr[v+T-w-1][z])  {
                        	hap++;
                        }

                    }
                       if(hap == T/2) 
                           cnt++;

                }
         
            }

               System.out.println("#" + tc + " "+cnt);
         
        }
		
	


	}
}