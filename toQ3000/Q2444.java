package toQ3000;
import java.util.*;
public class Q2444 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i < N; i++) {
			for (int j = i; j < N; j++) {
				System.out.print(" ");
			}
			for (int l = i * 2 - 1; l > i - i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = N; i > 0; i--) {
			for (int j = N - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int l = i * 2 - 1; l > i - i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
