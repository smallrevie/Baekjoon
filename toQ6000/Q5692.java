package toQ6000;
import java.util.*;
public class Q5692 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String num = sc.next();
			if (num.equals("0")) {
				break;
			}
			System.out.println(factor(num));
		}
		sc.close();
	}
	public static int factor (String a) {
		int sum = 0;
		for (int i = 0; i < a.length(); i++) {
			sum += (int) (a.charAt(i) - '0') * factorial(a.length() - i);
		}
		return sum;
	}
	public static int factorial (int a) {
		int summary = 0;
			if (a == 1) {
				summary = 1;
			}
			else {
				summary = a * factorial(a - 1);
			}
		return summary;
	}
}
