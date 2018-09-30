package toQ16000;
import java.util.*;
public class Q15667 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		N -= 1;
		if (N == 2) {
			System.out.println(1);
		}
		else {
			for (int i = 0; i < N / 2; i++) {
				if (i + Math.pow(i, 2) == N) {
					System.out.println((int) (i));
				}
				else {
					continue;
				}
			}
		}
		sc.close();
	}
}
