package toQ10000;
import java.util.*;
public class Q9325 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int sum = 0;
			int price = sc.nextInt();
			int optional = sc.nextInt();
			sc.nextLine();
			for (int j = 0; j < optional; j++) {
				String[] s = sc.nextLine().split("\\s");
					sum += (Integer.parseInt(s[0]) * Integer.parseInt(s[1]));
			}
			System.out.println(price + sum);
		}
		sc.close();
	}
}
