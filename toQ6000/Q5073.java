package toQ6000;
import java.util.*;
public class Q5073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int max = Math.max((int) (Math.max(A, B)), C); 
			if (A == 0 && B == 0 && C == 0) {
				break;
			}
			if (A == B && B == C) {
				System.out.println("Equilateral");
			}
			else if (((A == B && B != C) || (A != B && B == C) || (A == C && A != B)) && ((A + B + C - max) > max) ) {
				System.out.println("Isosceles");
			}
			else if (A != B && B != C && C != A && ((A + B + C - max) > max)) {
				System.out.println("Scalene");
			}
			else {
				System.out.println("Invalid");
			}
		}
		sc.close();
	}
}
