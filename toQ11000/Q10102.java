package toQ11000;
import java.util.*;
public class Q10102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] arr;
		int A = 0;
		int B = 0;
		sc.nextLine();
		String s = sc.nextLine();
		arr = s.toCharArray();
		for (int i = 0; i < N; i++) {
			if ((char) arr[i] == 'A') {
				A++;
			}
			else if ((char) arr[i] == 'B') {
				B++;
			}
		}
		if (A < B) {
			System.out.print("B");
		}
		else if (A > B) {
			System.out.print("A");
		}
		else {
			System.out.print("Tie");
		}
		sc.close();
	}
}
