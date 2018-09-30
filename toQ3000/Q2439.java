package toQ3000;
import java.util.*;
public class Q2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = N - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int l = N; l >= N - i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
