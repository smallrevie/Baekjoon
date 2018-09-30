package toQ4000;
import java.util.*;
public class Q3449 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			int count = 0;
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			for (int j = 0; j < s1.length(); j++) {
				if (s1.charAt(j) != s2.charAt(j)) {
					count++;
				}
				else {
					continue;
				}
			}
			System.out.println("Hamming distance is " + count + ".");
		}
		sc.close();
	}
}
