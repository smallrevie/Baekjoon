package toQ11000;
import java.util.*;
public class Q10156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("\\s");
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		int C = Integer.parseInt(s[2]);
		int result = 0;
		if (C - (A * B) < 0) {
			result = (A * B) - C;
			System.out.print(result);
		}
		else {
			System.out.print("0");
		}
		sc.close();
	}
}
