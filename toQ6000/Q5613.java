package toQ6000;
import java.util.*;
public class Q5613 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean res = true;
		long result = 0;
		long A;
		int a = 0;
		while (res) {
			if (a == 0) {
				A = sc.nextLong();
			}
			else {
				A = result;
			}
			String opr = sc.next();
			if (opr.equals("=")) {
				System.out.println(result);
				res = false;
				break;
			}
			long B = sc.nextLong();
			if (opr.equals("+")) {
				result = A + B;
			}
			else if (opr.equals("-")) {
				result = A - B;
			}
			else if (opr.equals("*")) {
				result = A * B;
			}
			else if (opr.equals("/")) {
				result = A / B;
			}
			a+=1;
		}
		sc.close();
	}
}
