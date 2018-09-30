package toQ15000;
import java.util.*;
public class Q14720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int count = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int curr = 999;
		for (int i = 0; i < N; i++) {
			if (arr[0] == 0 && i == 0) {
				count++;
				curr = 0;
			}
			if (curr == 0 && arr[i] == 1) {
				count++;
				curr = 1;
			}
			else if (curr == 1 && arr[i] == 2) {
				count++;
				curr = 2;
			}
			else if (curr == 2 && arr[i] == 0) {
				count++;
				curr = 0;
			}
			else if (curr == 999 && arr[i] == 0) {
				curr = 0;
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
