package toQ11000;
import java.util.*;
public class Q10101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a+b+c == 180 && a == b && b == c) {
			System.out.println("Equilateral");
		}
		else if (a+b+c == 180 && (a == b && b != c) || (a != b && b == c) || (a != b && c == a)) {
			System.out.println("Isosceles");
		}
		else if (a+b+c == 180 && a != b && b != c && c != a) {
			System.out.println("Scalene");
		}
		else {
			System.out.println("Error");
		}
		sc.close();
	}
}
