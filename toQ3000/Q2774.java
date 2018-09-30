package toQ3000;
import java.util.*;
public class Q2774 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			Set<Character> hs = new HashSet<Character>();
			char[] c = sc.nextLine().toCharArray();
			for (int j = 0; j < c.length; j++) {
				hs.add(c[j]);
			}
			System.out.println(hs.size());
		}
		sc.close();
	}
}
