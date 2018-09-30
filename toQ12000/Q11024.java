package toQ12000;
import java.util.*;
public class Q11024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			String[] s = sc.nextLine().split("\\s");
			int sum = 0;
			for (int j = 0; j < s.length; j++) {
				sum += Integer.parseInt(s[j]);
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
