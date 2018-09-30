package toQ3000;
import java.util.*;
public class Q2954 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				i += 2;
				ans += s.charAt(i);
			}
			else {
				ans += s.charAt(i);
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
