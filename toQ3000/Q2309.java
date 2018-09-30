package toQ3000;
import java.util.*;
public class Q2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int sum = 0;
		int[] arr1 = new int[2];
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (k == j) {
					continue;
				}
				if (sum - (arr[j] + arr[k]) == 100) {
					arr1[0] = arr[j];
					arr1[1] = arr[k];
				}
			}
		}
		Arrays.sort(arr);
		for (int l = 0; l < 9; l++) {
			if (arr[l] == arr1[0] || arr[l] == arr1[1]) {
				continue;
			}
			System.out.println(arr[l]);
		}
		sc.close();
	}
}
