package toQ2000;
import java.util.*;
public class Q1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		Arrays.sort(c);
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
		sc.close();
	}
}
