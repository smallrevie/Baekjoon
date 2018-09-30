package toQ3000;
import java.util.*;
public class Q2355 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long result = (a + b) * (Math.abs(a - b) + 1) / 2;
		System.out.print(result);
		sc.close();
	}
}
