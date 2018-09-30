package toQ3000;
import java.util.*;
public class Q2789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'C' || c[i] == 'A' || c[i] == 'M' 
				|| c[i] == 'B' || c[i] == 'R' || c[i] == 'I'
				|| c[i] == 'D' || c[i] == 'G' || c[i] == 'E') {
				continue;
			}
			System.out.print(c[i]);
		}
		sc.close();
	}
}
