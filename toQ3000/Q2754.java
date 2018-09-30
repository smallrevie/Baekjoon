package toQ3000;
import java.util.*;
public class Q2754 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.charAt(0) == 'A') {
			if (s.charAt(1) == '+') {
				System.out.print("4.3");
			}
			else if (s.charAt(1) == '0') {
				System.out.print("4.0");
			}
			else if (s.charAt(1) == '-') {
				System.out.print("3.7");
			}
		}
		else if (s.charAt(0) == 'B') {
			if (s.charAt(1) == '+') {
				System.out.print("3.3");
			}
			else if (s.charAt(1) == '0') {
				System.out.print("3.0");
			}
			else if (s.charAt(1) == '-') {
				System.out.print("2.7");
			}
		}
		else if (s.charAt(0) == 'C') {
			if (s.charAt(1) == '+') {
				System.out.print("2.3");
			}
			else if (s.charAt(1) == '0') {
				System.out.print("2.0");
			}
			else if (s.charAt(1) == '-') {
				System.out.print("1.7");
			}
		}
		else if (s.charAt(0) == 'D') {
			if (s.charAt(1) == '+') {
				System.out.print("1.3");
			}
			else if (s.charAt(1) == '0') {
				System.out.print("1.0");
			}
			else if (s.charAt(1) == '-') {
				System.out.print("0.7");
			}
		}
		else if (s.charAt(0) == 'F') {
				System.out.print("0.0");
		}
		sc.close();
	}
}
