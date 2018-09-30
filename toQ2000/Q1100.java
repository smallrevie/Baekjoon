package toQ2000;
import java.util.*;
public class Q1100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < 8; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < 8; j++) {
				char c = s.charAt(j);
				if (i % 2 == 0 && j % 2 == 0 && c == 'F') {
					count++;
				}
				else if (i % 2 == 1 && j % 2 == 1 && c == 'F' ) {
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
