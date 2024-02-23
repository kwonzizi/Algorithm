import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] aa = a.toCharArray();
        
        for(int i = 0; i < aa.length; i++){
            System.out.println(aa[i]);
        }
    }
}