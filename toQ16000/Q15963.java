package toQ16000;
import java.util.*;
public class Q15963 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n, m;
		n = sc.nextLong();
		m = sc.nextLong();
		sc.close();
		if (n == m) {
			System.out.print("1");
		}
		else {
			System.out.print("0");
		}
	}
}
