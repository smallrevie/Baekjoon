package toQ3000;
import java.util.*;
public class Q2998 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		while (s.length() % 3 != 0) {
			s = "0" + s;
		}
		for (int i = 0; i < s.length() / 3; i++) {
			String num = "";
			for (int j = i * 3; j < i * 3 + 3; j++) {
				num += s.charAt(j);
			}
			System.out.print(oct(num));
			sc.close();
		}
	}
	public static int oct(String a) {
		int result = 0;
		if (a.equals("000")) {
			result = 0;
		}
		else if (a.equals("001")) {
			result = 1;
		}
		else if (a.equals("010")) {
			result = 2;
		}
		else if (a.equals("011")) {
			result = 3;
		}
		else if (a.equals("100")) {
			result = 4;
		}
		else if (a.equals("101")) {
			result = 5;
		}
		else if (a.equals("110")) {
			result = 6;
		}
		else if (a.equals("111")) {
			result = 7;
		}
		return result;
	}
}
