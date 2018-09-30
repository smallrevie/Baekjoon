package toQ11000;
import java.util.*;
public class Q10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 1;
		int N = sc.nextInt();
		if (N >= 0 && N <= 12) {
			for (int i = N; i > 0; i--) {
				sum = sum * i;
				
			}
		}
		System.out.print(sum);
		sc.close();
		}
	}

