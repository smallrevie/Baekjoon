package toQ12000;
import java.util.*;
public class Q11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		char[] c = N.toCharArray();
		for (int i = 0; i < N.length(); i++) {
			System.out.print(c[i]);
			if (i % 10 == 9) {
				System.out.println();
			}
		}
		sc.close();
	}
}
