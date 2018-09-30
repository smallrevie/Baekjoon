package toQ6000;
import java.util.*;
public class Q5656 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cas = 1;
		while (true) {
			String[] s = sc.nextLine().split("\\s");
			if (s[1].equals("E")) {
				break;
			}
			int A = Integer.parseInt(s[0]);
			int B = Integer.parseInt(s[2]);
			if (s[1].equals(">")) {
				System.out.println("Case " + cas + ": " + (A > B));
			}
			else if (s[1].equals(">=")) {
				System.out.println("Case " + cas + ": " + (A >= B));
			}
			else if (s[1].equals("<")) {
				System.out.println("Case " + cas + ": " + (A < B));
			}
			else if (s[1].equals("<=")) {
				System.out.println("Case " + cas + ": " + (A <= B));
			}
			else if (s[1].equals("==")) {
				System.out.println("Case " + cas + ": " + (A == B));
			}
			else if (s[1].equals("!=")) {
				System.out.println("Case " + cas + ": " + (A != B));
			}
			cas++;
		}
		sc.close();
	}
}
