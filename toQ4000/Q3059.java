package toQ4000;
import java.util.*;
public class Q3059 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int[] arr = new int[26];
			int sum = 0;
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				arr[s.charAt(j) -'A']++;
			}
			for (int k = 0; k < 26; k++) {
				if (arr[k] == 0) {
					sum += k+'A';
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
