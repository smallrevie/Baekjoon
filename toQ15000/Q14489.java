package toQ15000;
import java.util.*;
public class Q14489 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("\\s");
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		int C = sc.nextInt();
		if ((A + B) >= (C * 2)) {
			System.out.println((A + B) - (C * 2));
		}
		else {
			System.out.println(A + B);
		}
		sc.close();
	}
}
