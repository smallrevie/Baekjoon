package toQ5000;
import java.util.*;
public class Q4458 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] c;
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			c = s.toCharArray();
			if (c[0] >= 97 && c[0] <= 122) {
			c[0] = (char) (c[0] - 32);
			}
			System.out.println(c);
		}
		sc.close();
	}
}
