package day14;
import java.util.Scanner;
public class task8{
    public static void main(String[] args) {
    	
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i <= str.length(); i++) {
            if (i<str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
            
        }
        System.out.println(sb.toString());
    }
}
