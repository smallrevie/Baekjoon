package toQ6000;
import java.util.*;
public class Q5054 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] result = new int[t];
		for (int i = 0; i < t; i++) {
			int N = sc.nextInt();
			int[] xi = new int[N];
			for (int j = 0; j < N; j++) {
				xi[j] = sc.nextInt();
			}
			Arrays.sort(xi);
			result[i] = ((xi[(xi.length - 1)] - xi[0]) * 2);
		}
		for (int k = 0; k < t; k++) {
			System.out.println(result[k]);
		}
		sc.close();
	}
}
