package toQ2000;
import java.util.*;
public class Q1453 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				if (arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
