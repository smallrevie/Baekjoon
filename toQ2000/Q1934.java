package toQ2000;
import java.util.*;
public class Q1934 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a * b / GCD(a, b));
		}
			sc.close();
	}
	public static int GCD(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
