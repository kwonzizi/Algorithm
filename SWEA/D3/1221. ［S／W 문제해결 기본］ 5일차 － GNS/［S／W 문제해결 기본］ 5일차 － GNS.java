
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
        String[] arr = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN" };
        
        for(int tc =1; tc <=10 ; tc++) {
            
            List<Integer> list = new ArrayList<Integer>();
            List<String> strList = new ArrayList<String>();
       		String a = sc.next(); // #1 받기
            int t = sc.nextInt();
            String[] b = new String[t];
            for(int i = 0; i < t; i++) {
                String n = sc.next();
            	b[i] = n;
            }
            
            for(int i = 0; i < t; i++) {
            	for(int j = 0; j < 10; j++) {
                    
                    if(b[i].equals(arr[j])) {
                    	list.add(j);
                    }
         
                }
                
            }
            
             Collections.sort(list);
            
            for(int i = 0; i < t; i++) {
            	if(list.get(i) == 0) {
                    strList.add("ZRO");
                }else if(list.get(i) == 1) {
                     strList.add("ONE");
                }else if(list.get(i) == 2) {
                     strList.add("TWO");
                }else if(list.get(i) == 3) {
                     strList.add("THR");
                }else if(list.get(i) == 4) {
                     strList.add("FOR");
                }else if(list.get(i) == 5) {
                     strList.add("FIV");
                }else if(list.get(i) == 6) {
                     strList.add("SIX");
                }else if(list.get(i) == 7) {
                     strList.add("SVN");
                }else if(list.get(i) == 8) {
                     strList.add("EGT");
                }else if(list.get(i) == 9) {
                     strList.add("NIN");
                }
            }
      
            String answer = "";
            for(int i = 0; i < t ; i++) {
            	answer += strList.get(i) + " ";
            }
            System.out.println("#" + tc);
            System.out.print(answer); 
         
 
        }
	
	}
}