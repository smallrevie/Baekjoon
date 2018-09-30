package toQ3000;
import java.util.*;
public class Q2822 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		int[] arr1 = new int[8];
		int sum = 0;
		for (int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
			arr1[i] = arr[i];
			sum += arr[i];
		}
		Arrays.sort(arr1);
		sum = sum - arr1[0] - arr1[1] - arr1[2];
		System.out.println(sum);
		for (int j = 0; j < 8; j++) {
			if (arr[j] == arr1[0] || arr[j] == arr1[1] || arr[j] == arr1[2]) {
				continue;
			}
			System.out.print(j+1 + " ");
		}
		sc.close();
	}
}
