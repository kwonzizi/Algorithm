import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < 10; i++) {
			String n  = st.nextToken();
			if(i > 0) {
				str.append(n.charAt(1));
				str.append(n.charAt(2));
			}else{
				str.append(n);
			}
			
		}
		System.out.println(str);
		
	}
}