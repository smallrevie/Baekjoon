package toQ4000;
import java.util.*;
public class Q3460 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			String s = Integer.toBinaryString(sc.nextInt());
			List<Character> list = new ArrayList<Character>();
			for (int j = 0; j < s.length(); j++) {
				list.add(s.charAt(j));
			}
			Collections.reverse(list);
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j) == '1') {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
