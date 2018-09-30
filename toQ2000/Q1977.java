package toQ2000;
import java.util.*;
public class Q1977 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		int min = 0;
		int a = 0;
		int count = 0;
		for (int i = M; i <= N; i++) {
			double sqrt = Math.sqrt(i);
			if (i / sqrt == (int) (sqrt)) {
				sum += i;
				if (a == 0) {
					min = i;
					a++;
				}
				count++;
			}
		}
		if (count == 0) {
			System.out.println("-1");
		}
		else {
		System.out.println(sum);
		System.out.println(min);
		}
		sc.close();
	}
}
