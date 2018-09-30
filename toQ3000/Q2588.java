package toQ3000;
import java.util.*;
public class Q2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		String s = sc.next();
		System.out.println(A * (s.charAt(2) - '0'));
		System.out.println(A * (s.charAt(1) - '0'));
		System.out.println(A * (s.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(s));
		sc.close();
	}
}
