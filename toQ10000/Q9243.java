package toQ10000;
import java.util.*;
public class Q9243 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		boolean succeed = true;
		if (N % 2 == 0) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != s1.charAt(i)) {
					System.out.println("Deletion failed");
					succeed = false;
					break;
				}
			}
			if (succeed == true) {
				System.out.println("Deletion succeeded");
			}
		}
		else if (N % 2 != 0) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == s1.charAt(i)) {
					System.out.println("Deletion failed");
					succeed = false;
					break;
				}
			}
			if (succeed == true) {
				System.out.println("Deletion succeeded");
			}
		}
		sc.close();
	}
}
