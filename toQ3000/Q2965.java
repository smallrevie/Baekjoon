package toQ3000;
import java.util.*;
public class Q2965 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("\\s");
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		int C = Integer.parseInt(s[2]);
		if (Math.abs(B - A) >= Math.abs(C - B)) {
			System.out.println(Math.abs(B - A) - 1);
		}
		else if (Math.abs(B - A) < Math.abs(C - B)) {
			System.out.println(Math.abs(C - B) - 1);
		}
		sc.close();
	}
}
