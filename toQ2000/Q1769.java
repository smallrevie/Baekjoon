package toQ2000;
import java.util.*;
public class Q1769 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		int result = 0;
		if (s.length() > 1) {
			while (s.length() != 1) {
				int sum = 0;
				for (int i = 0; i < s.length(); i++) {
					sum += s.charAt(i) - '0';
				}
				s = String.valueOf(sum);
				count++;
				result = sum;
			}
		}
		else {
			result = Integer.parseInt(s);
		}
		System.out.println(count);
		if (result % 3 == 0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		sc.close();
	}
}
