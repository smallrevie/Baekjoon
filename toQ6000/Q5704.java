package toQ6000;
import java.util.*;
public class Q5704 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int[] arr = new int[26];
			String s = sc.nextLine();
			if (s.equals("*")) {
			break;
			}
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 32) {
					continue;
				}
				arr[s.charAt(i) - 'a']++;
			}
			for (int j = 0; j < 26; j++) {
				if (arr[j] == 0) {
					System.out.println("N");
					break;
				}
				if (j == 25 && arr[j] >= 1) {
					System.out.println("Y");
				}
			}
		}
		sc.close();
	}
}
