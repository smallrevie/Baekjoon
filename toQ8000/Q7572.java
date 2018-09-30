package toQ8000;
import java.util.*;
public class Q7572 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N % 12 >= 4) {
			System.out.print((char) (((N % 12) - 4) + 'A'));
		}
		else if (N % 12 < 4) {
			System.out.print((char) (((N % 12) + 8) + 'A'));
		}
		if (N % 10 <= 3) {
			System.out.println(N % 10 + 6);
		}
		else if (N % 10 > 3) {
			System.out.print(N % 10 - 4);
		}
		sc.close();
	}
}
