package toQ2000;
import java.util.*;
public class Q1673 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a = n/k;
			int c = n%k + a;
			n += a;
			while (true) {
				if (c < k) {
					break;
				}
				n += c / k;
				a = c/k;
				c = c%k + a;
			}
			System.out.println(n);
		}
		sc.close();
	}
}