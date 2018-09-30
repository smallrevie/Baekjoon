package toQ2000;
import java.util.*;
public class Q1476 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		int count = 0;
		int A = 0;
		int B = 0;
		int C = 0;
		while (true) {
			A = (A + 1) % 16;
			if (A == 0) {
				A = 1;
			}
			B = (B + 1) % 29;
			if (B == 0) {
				B = 1;
			}
			C = (C + 1) % 20;
			if (C == 0) {
				C = 1;
			}
			count++;
			if (A == E && B == S && C == M) {
				break;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
