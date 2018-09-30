package toQ9000;
import java.util.*;
public class Q8974 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[1050];
		int sum = 0;
		boolean con = true;
		for (int i = 1; ; i++) {
			sum += i - 1;
			for (int j = sum; j < sum + i; j++) {
				arr[j] = i;
				if (j > 1010) {
					con = false;
					break;
				}
			}
				if (!con) {
					break;
			}
		}
		int A = sc.nextInt();
		int B = sc.nextInt();
		int res = 0;
		for (int i = A-1; i < B; i++) {
			res += arr[i];
		}
		System.out.println(res);
		sc.close();
	}
}
