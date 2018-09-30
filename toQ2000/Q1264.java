package toQ2000;
import java.util.*;
public class Q1264 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int count = 0;
			String s = sc.nextLine();
			if (s.equals("#")) {
				break;
			}
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'a' || s.charAt(i) == 'A' 
						|| s.charAt(i) == 'e' || s.charAt(i) == 'E' 
						|| s.charAt(i) == 'i' || s.charAt(i) == 'I'
						|| s.charAt(i) == 'o' || s.charAt(i) == 'O'
						|| s.charAt(i) == 'u' || s.charAt(i) == 'U') {
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}
