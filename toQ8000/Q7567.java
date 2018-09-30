package toQ8000;
import java.util.*;
public class Q7567 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 10;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count += 5;
			}
			else {
				count += 10;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
