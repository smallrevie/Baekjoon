package toQ5000;
import java.util.*;
public class Q4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			long A = sc.nextLong();
			long B = sc.nextLong();
			long C = sc.nextLong();
			if (A == 0 && B == 0 && C == 0) {
				break;
			}
			if ((A * A) + (B * B) == (C * C)
				|| (A * A) + (C * C) == (B * B)
				|| (C * C) + (B * B) == (A * A)) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
		sc.close();
	}
}
