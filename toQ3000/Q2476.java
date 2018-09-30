package toQ3000;
import java.util.*;
public class Q2476 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		int max_value = 0;
		int result = 0;
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int[] arr = new int[3];
			if (a == b && b == c) {
				result = (10000+(a*1000));
			}
			else if ((a == b && a != c) || (b == c && a != c) || (a == c && b != c)) {
				arr[0] = a;
				arr[1] = b;
				arr[2] = c;
				Arrays.sort(arr);
				result = (1000+(arr[1]*100));
			}
			else {
				max = Math.max(a, b);
				max = Math.max(max, c);
				
				result = (max*100);
			}
			if (max_value < result) {
				max_value = result;
			}
		}
		System.out.print(max_value);
		sc.close();
	}
}
