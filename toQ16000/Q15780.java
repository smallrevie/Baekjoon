package toQ16000;
import java.util.*;
public class Q15780 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("\\s");
		int available = 0;
		String[] plug = sc.nextLine().split("\\s");
		for (int i = 0; i < Integer.parseInt(s[1]); i++) {
			available += Math.round(Integer.parseInt(plug[i]) / 2.0);
		}
		if (available >= Integer.parseInt(s[0])) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		sc.close();
	}
}
