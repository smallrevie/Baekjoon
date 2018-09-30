package toQ2000;
import java.util.*;
public class Q1748 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int r = 0;
		for (int i = 1; i <= N; i *= 10) {
			r += N - i + 1;
		}
		System.out.println(r);
		sc.close();
	}
}
