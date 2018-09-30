package toQ16000;
import java.util.*;
public class Q15873 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		String tmp = "";
		if (c.length == 2) {
			System.out.println((c[0] - '0') + (c[1] - '0'));
		}
		else if (c.length == 3) {
			if (c[1] == '0') {
				for (int i = 0; i < 2; i++) {
					tmp += c[i];
				}
				System.out.println(Integer.parseInt(tmp) + c[2] - '0');
			}
			else if (c[2] == '0') {
				for (int i = 1; i < 3; i++) {
					tmp += c[i];
				}
				System.out.println(Integer.parseInt(tmp) + c[0] - '0');
			}
		}
		else if (c.length == 4) {
			System.out.println(20);
		}
		sc.close();
	}
}
