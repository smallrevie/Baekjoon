package toQ11000;
import java.util.*;
public class Q10984 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int sum = 0;
			double avr = 0.0d;
			sc.nextLine();
			for (int j = 0; j < N; j++) {
				String[] s = sc.nextLine().split("\\s");
				sum += Integer.parseInt(s[0]);
				avr += (Double.parseDouble(s[1]) * Integer.parseInt(s[0]));
			}
			avr = avr / sum;
			System.out.println(sum + " " + Math.round(avr * 10) / 10.0);
		}
		sc.close();
	}
}
