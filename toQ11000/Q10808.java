package toQ11000;
import java.util.*;
public class Q10808 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		String S = sc.next();
		char[] c = S.toCharArray();
		for (int i = 0; i < c.length; i++) {
			arr[c[i] - 'a']++;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		sc.close();
	}
}
