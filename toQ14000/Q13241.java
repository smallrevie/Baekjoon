package toQ14000;
import java.util.*;
public class Q13241 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("\\s");
		long a = Long.parseLong(s[0]);
		long b = Long.parseLong(s[1]);
		System.out.println(lcm(a, b));
		sc.close();
	}
	public static long gcd(long a, long b) {
		while (b != 0) {
			long r = a % b;
			a = b;
			b = r;
		}
			return a;
	}
	public static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}
}
