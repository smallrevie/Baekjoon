package toQ2000;
import java.util.*;
public class Q1919 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumleng1 = 0;
		int sumleng2 = 0;
		char[] c1 = sc.next().toCharArray();
		char[] c2 = sc.next().toCharArray();
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c2.length; j++) {
				if (c1[i] == c2[j]) {
					c1[i] = '0';
					c2[j] = '0';
				}
			}
		}
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != '0') {
				sumleng1++;
			}
		}
		for (int i = 0; i < c2.length; i++) {
			if (c2[i] != '0') {
				sumleng2++;
			}
		}
		System.out.println(sumleng1 + sumleng2);
		sc.close();
	}
}
