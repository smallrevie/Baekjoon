package toQ12000;
import java.util.*;
public class Q11050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(factorial(A) / (factorial(A - B) * factorial(B)));
		sc.close();
	}
	public static int factorial(int a) {
		if (a == 1 || a == 0) {
			return 1;
		}
		else {
			return factorial(a - 1) * a;
		}
	}
}
