package toQ5000;
import java.util.*;
public class Q4613 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int sum = 0;
			String s = sc.nextLine();
			if (s.equals("#")) {
				break;
			}
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 32) {
					continue;
				}
				else {
					sum += (s.charAt(i) - 64) * (i+1);
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
