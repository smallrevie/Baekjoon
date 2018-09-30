package toQ2000;
import java.util.*;
public class Q1871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String[] s = sc.next().split("-");
			char[] c = s[0].toCharArray();
			long lResult = ((c[0] - 'A') * (26 * 26)) + ((c[1] - 'A') * (26)) + ((c[2] - 'A'));
			int dResult = Integer.parseInt(s[1]);
			if (Math.abs(lResult - dResult) <= 100) {
				System.out.println("nice");
			}
			else {
				System.out.println("not nice");
			}
		}
		sc.close();
	}
}
