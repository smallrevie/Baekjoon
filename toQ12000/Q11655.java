package toQ12000;
import java.util.*;
public class Q11655 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 32) {
				continue;
			}
			else if (c[i] <= 77 && c[i] >= 65) {
				c[i] += 13;
			}
			else if (c[i] >= 78 && c[i] <= 90) { 
				c[i] -= 13;
			}
			else if (c[i] <= 109 && c[i] >= 97) {
				c[i] += 13;
			}
			else if (c[i] >= 110 && c[i] <= 122) {
				c[i] -= 13;
			}
		}
		sc.close();
		System.out.print(c);
	}
}

