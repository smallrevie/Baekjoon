package toQ3000;
import java.util.*;
public class Q2857 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = new String[5];
		int count = 0;
		for (int i = 0; i < 5; i++) {
			s[i] = sc.nextLine();
		}
		for (int j = 0; j < 5; j++) {
			for (int k = 0; k < s[j].length(); k++) {
				if (s[j].charAt(k) == 'F' && s[j].charAt(k+1) == 'B' && s[j].charAt(k+2) == 'I') {
					System.out.print(j+1 + " ");
					count++;
					break;
				}
			}
		}
		if (count == 0) {
			System.out.print("HE GOT AWAY!");
		}
		sc.close();
	}
}
