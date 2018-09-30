package toQ12000;
import java.util.*;
public class Q11320 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			String[] s = sc.nextLine().split("\\s");
			int A = Integer.parseInt(s[0]);
			int B = Integer.parseInt(s[1]);
			System.out.println((A / B) * (A / B));
		}
		sc.close();
	}
}
