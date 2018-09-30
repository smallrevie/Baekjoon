package toQ3000;
import java.util.*;
public class Q2609 {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("\\s");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		System.out.println(gcd(a, b));
		System.out.println(lcm(a, b));
		sc.close();
	}
	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
}