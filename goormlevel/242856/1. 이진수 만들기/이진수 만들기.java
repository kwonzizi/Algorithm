import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List list = new ArrayList<>();
	  while(n > 0) {
			list.add(n % 2);
			n = n / 2;
		
		}
		StringBuilder str = new StringBuilder();
		for(int i = list.size()-1; i>= 0; i--) {
			str.append(list.get(i));
		}
		System.out.println(str);
	}
}