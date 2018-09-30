package toQ3000;
import java.util.*;
public class Q2720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int quat = 0;
			int dime = 0;
			int nick = 0;
			int penn = 0;
			int price = sc.nextInt();
			while (price != 0) {
				if (price >= 25) {
					quat++;
					price -= 25;
				}
				else if (price >= 10 && price < 25) {
					dime++;
					price -= 10;
				}
				else if (price >= 5 && price < 10) {
					nick++;
					price -= 5;
				}
				else if (price >= 1 && price < 5) {
					penn++;
					price -= 1;
				}
			}
			System.out.println(quat + " " + dime + " " + nick + " " + penn);
		}
		sc.close();
	}
}
