package toQ11000;
import java.util.*;
public class Q10987 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int count = 0;
			String s = sc.nextLine();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'a' ||
						s.charAt(i) == 'e' || 
						s.charAt(i) == 'i' ||
						s.charAt(i) == 'o' ||
						s.charAt(i) == 'u') {
					count++;
				}
		}
		System.out.println(count);
		sc.close();
	}
}
