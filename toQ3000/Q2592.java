package toQ3000;
import java.util.*;
public class Q2592 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[101];
		for (int i = 0; i < 10; i++) {
			arr[sc.nextInt() / 10]++;
		}
		int result = 0;
		int count = 0;
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			if (arr[i] >= 1) {
				sum += (arr[i] * 10 * i);
			}
			if (count < arr[i]) {
			result = i * 10;
			count = arr[i];
			}
		}
		System.out.println(sum / 10);
		System.out.println(result);
		sc.close();
	}
}
