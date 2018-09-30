package toQ2000;
import java.util.*;
public class Q1598 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int count = 0;
		int B_left;
		if (A < B) {
			if (A % 4 == 0 && B % 4 != 0 && B/4 - A/4 == 0) {
				B_left = 1;
			}
			else if (B % 4 == 0 && A % 4 != 0) {
				B_left = B / 4 - A / 4 - 1; // B
			}
			else if (A % 4 == 0 && B % 4 != 0) {
				B_left = B / 4 - A / 4 + 1;
			}
			else {
				B_left = B / 4 - A / 4;
			}
			count += B_left;
			A = (A + 4 * B_left);
			while (A != B) {
				if (A > B) {
					A--;
					count++;
				}
				else if (A < B) {
					A++;
					count++;
				}
			}
		}
		else if (B < A) {
			if (B % 4 == 0 && A % 4 != 0 && A / 4 - B / 4 == 0) {
				B_left = 1;
			}
			else if (A % 4 == 0 && B % 4 != 0) {
				B_left = A / 4 - B / 4 - 1; // B
			}
			else if (B % 4 == 0 && A % 4 != 0) {
				B_left = A / 4 - B / 4 + 1;
			}
			else {
				B_left = A / 4 - B / 4;
			}
			count += B_left;
			B = (B + 4 * B_left);
			while (B != A) {
				if (B > A) {
					B--;
					count++;
				}
				else if (B < A) {
					B++;
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
