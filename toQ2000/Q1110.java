package toQ2000;
import java.util.*;
public class Q1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int res = 0;
		int sum = 0;
		int count = 0;
		int val = Integer.parseInt(num);
		if (val < 10) {
			num = "0" + num;
		}
		if (val == 0) {
			count = 1;
		}
		else {
			while (res != val) {
				int a = num.charAt(0) - '0';
				int b = num.charAt(1) - '0';
				sum = (a+b) % 10;
				num = String.valueOf(b) + String.valueOf(sum);
				count++;
				res = Integer.parseInt(num);
			}
		}
		System.out.println(count);
		sc.close();
	}
}
