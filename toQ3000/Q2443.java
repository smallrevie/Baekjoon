package toQ3000;
import java.util.*;
public class Q2443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
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
