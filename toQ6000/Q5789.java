package toQ6000;
import java.util.*;
public class Q5789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			String s = sc.nextLine();
			if (s.charAt(s.length() / 2) == s.charAt(s.length() / 2 - 1)) {
				System.out.println("Do-it");
			}
			else if (s.charAt(s.length() / 2) != s.charAt(s.length() / 2 - 1)) {
				System.out.println("Do-it-Not");
			}
		}
		sc.close();
	}
}
