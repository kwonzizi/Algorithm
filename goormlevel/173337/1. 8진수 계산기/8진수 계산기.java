import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		int sum = 0;
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			sum += num;
		}
		StringBuilder str = new StringBuilder();
		List list = new ArrayList();
	  while(sum > 0) {
			list.add(sum % 8);
			sum = sum / 8;
		}
		for(int i = list.size()-1; i >= 0; i--) {
			str.append(list.get(i));
		}
		System.out.println(str);  
	}
}
