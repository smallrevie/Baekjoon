package toQ12000;
import java.util.*;
public class Q11006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int U = (2 * B) - A;
			int T = B - U;
			System.out.println(U + " " + T);
		}
		sc.close();
	}
}
