package toQ12000;
import java.util.*;
public class Q11966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 1;
		int[] arr = new int[31];
		for (int i = 0; i < 31; i++) {
			if (i == 0) {
				arr[i] = 1;
			}
			else {
				N *= 2;
				arr[i] = N;
			}
		}
		int M = sc.nextInt();
		int count = 0;
		for (int j = 0; j < 31; j++) {
			if (M == arr[j]) {
				System.out.println("1");
				count++;
				break;
			}
			if (j == 30) {
				if (count == 0) {
					System.out.println("0");
				}
			}
		}
		sc.close();
	}
}
