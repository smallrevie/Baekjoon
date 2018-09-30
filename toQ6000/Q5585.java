package toQ6000;
import java.util.*;
public class Q5585 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int def = 1000;
		int price = sc.nextInt();
		int left = def - price;
		int count = 0;
		while (left != 0) {
			if (left >= 500 && left < 1000) {
				count++;
				left -= 500;
			}
			else if (left < 500 && left >= 100) {
				count++;
				left -= 100;
			}
			else if (left < 100 && left >= 50) {
				count++;
				left -= 50;
			}
			else if (left < 50 && left >= 10) {
				count++;
				left -= 10;
			}
			else if (left < 10 && left >= 5) {
				count++;
				left -= 5;
			}
			else if (left < 5 && left >= 1) {
				count++;
				left -= 1;
			}
		}
		sc.close();
		System.out.print(count);
	}
}
