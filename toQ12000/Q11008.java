package toQ12000;
import java.util.*;
public class Q11008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			Vector<Character> vc = new Vector<Character>(1,1);
			String[] s = sc.nextLine().split("\\s");
			count = 0;
			for (int j = 0; j < s[0].length(); j++) {
				vc.add(s[0].charAt(j));
			}
			if (s.length == 1) {
				System.out.println(vc.size());
			}
			else {
				for (int j = 0; j < vc.size() + 2 - s[1].length(); j++) {
					if (vc.size() < s[1].length()) {
						break;
					}
					if (vc.elementAt(j) == s[1].charAt(0) && j + s[1].length() <= vc.size()) {
						for (int k = 0; k < s[1].length(); k++) {
							if (vc.elementAt(j + k) != s[1].charAt(k)) {
								break;
							}
							else if (k == s[1].length() - 1) {
								count++;
								for (int l = 0; l < s[1].length(); l++) {
									vc.remove(j);
								}
								j = -1;
							}
						}
					}
				}
				System.out.println(s[0].length() - (count * s[1].length()) + count);
			}
		}
		sc.close();
	}
}