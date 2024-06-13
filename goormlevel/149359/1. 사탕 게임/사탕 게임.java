import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		
		int one = 0;
		int two = 0;
		
		for(int i = 0; i < n; i++) {
			int x = Integer.parseInt(st.nextToken());
			if( x % 2 == 0) {
				one++;
			}else {
				two++;
			}
		}
			if(one > two){
				System.out.println(one);
			}else if(one < two) {
				System.out.println(two);
			}else {
				System.out.println("tie");
			}
	}
}