package toQ12000;
import java.util.*;
public class Q11365 {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String code = sc.nextLine();
			if (code.equals("END")) {
				break;
			}
			for (int i = code.length() - 1; i >= 0; i--) {
				System.out.print(code.charAt(i));
			}
			System.out.println();
		}
		sc.close();
	}
}
