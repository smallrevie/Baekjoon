package toQ4000;
import java.util.*;
public class Q3047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int[] arr2 = new int[3];
		for (int i = 0; i < 3; i++) {
			int temp = sc.nextInt();
			arr[i] = temp;
		}
		String s = sc.next();
		Arrays.sort(arr); // 1 3 5
		for (int j = 0; j < 3; j++) {
			if (s.charAt(0) - 'A' == 0) {
				arr2[0] = arr[0];
				if (s.charAt(1) - 'A' == 1) {
					arr2[1] = arr[1];
					if (s.charAt(2) - 'A' == 2) {
						arr2[2] = arr[2];
					}
				}
				else if (s.charAt(1) - 'A' == 2) {
					arr2[1] = arr[2];
					if (s.charAt(2) - 'A' == 1) {
						arr2[2] = arr[1];
					}
				}
			}
			else if (s.charAt(0) - 'A' == 1) {
				arr2[0] = arr[1];
				if (s.charAt(1) - 'A' == 2) {
					arr2[1] = arr[2];
					if (s.charAt(2) - 'A' == 0) {
						arr2[2] = arr[0];
					}
				}
				else if (s.charAt(1) - 'A' == 0) {
					arr2[1] = arr[0];
					if (s.charAt(2) - 'A' == 2) {
						arr2[2] = arr[2];
		}
	}
}
			if (s.charAt(0) - 'A' == 2) {
				arr2[0] = arr[2];
				if (s.charAt(1) - 'A' == 1) {
					arr2[1] = arr[1];
					if (s.charAt(2) - 'A' == 0) {
						arr2[2] = arr[0];
					}
				}
				else if (s.charAt(1) - 'A' == 0) {
					arr2[1] = arr[0];
					if (s.charAt(2) - 'A' == 1) {
						arr2[2] = arr[1];
					}
				}
			}
		}
		for (int k = 0; k < 3; k++) {
			System.out.print(arr2[k] + " ");
		}
		sc.close();
	}
}