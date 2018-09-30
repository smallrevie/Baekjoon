package toQ3000;
import java.util.*;
public class Q2903 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 2;
		long result = 0;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			sum += (sum - 1);
			result = sum * sum;
		}
		System.out.println(result);
		sc.close();
	}
}
