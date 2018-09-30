package toQ3000;
import java.util.*;
public class Q2145 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String s = sc.next();
			if (s.equals("0")) {
				break;
			}
			while (s.length() != 1) {
				int sum = 0;
				for (int i = 0; i < s.length(); i++) {
					sum += s.charAt(i) - '0';
				}
				s = String.valueOf(sum);
			}
			System.out.println(s);
		}
		sc.close();
	}
}
