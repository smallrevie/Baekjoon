package toQ13000;
import java.util.*;
public class Q12813 {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		for (int i = 0; i < 10; i++) {
			if (s.charAt(i) == '1' && s1.charAt(i) == '1') {
				System.out.print('1');
			}
			else {
				System.out.print('0');
			}
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			if (s.charAt(i) == '1' || s1.charAt(i) == '1') {
				System.out.print('1');
			}
			else {
				System.out.print('0');
			}
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			if (s.charAt(i) != s1.charAt(i)) {
				System.out.print('1');
			}
			else {
				System.out.print('0');
			}
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			if (s.charAt(i) == '1') {
				System.out.print('0');
			}
			else {
				System.out.print('1');
			}
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			if (s1.charAt(i) == '1') {
				System.out.print('0');
			}
			else {
				System.out.print('1');
			}
		}
		sc.close();
	}
}