package toQ3000;
import java.util.*;
public class Q2010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int al = sc.nextInt();
			if (i == N-1) {
				sum += al;
				break;
			}
			sum += al - 1;
		}
		System.out.println(sum);
		sc.close();
	}
}
