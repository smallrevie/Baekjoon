package toQ2000;
import java.util.*;
public class Q1225 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = sc.next();
		long result = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s1.length(); j++) {
				result += ((s.charAt(i) - '0') * (s1.charAt(j) - '0'));
			}
		}
		System.out.println(result);
		sc.close();
	}
}
