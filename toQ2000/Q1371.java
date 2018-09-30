package toQ2000;
import java.util.*;
public class Q1371 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		char[] c;
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			c = s.toCharArray();
			for (int i = 0; i < c.length; i++) {
				if (c[i] >= 97 && c[i] <= 122) {
					arr[c[i] - 'a']++;
				}
			}
		}
		int max = 0;
		for (int j = 0; j < 26; j++) {
			if (arr[j] > max) {
				max = arr[j];
			}
		}
		for (int k = 0; k < 26; k++) {
			if (arr[k] == max) {
				System.out.print((char) (k+'a'));
			}
		};
		sc.close();
	}
}
