package toQ16000;
import java.util.*;
public class Q15881 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		char[] c = sc.next().toCharArray();
		int count = 0;
		for (int i = 0; i < T - 3; i++) {
			if (c[i] == 'p' && c[i+1] == 'P' && c[i+2] == 'A' && c[i+3] == 'p') {
				count++;
				i += 3;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
