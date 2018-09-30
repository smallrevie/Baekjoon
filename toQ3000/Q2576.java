package toQ3000;
import java.util.*;
public class Q2576 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[1][7];
		int tmp = 0;
		int sum = 0;
		int smallest = 0;
		for (int i = 0; i < 7; i++) {
			int temp = sc.nextInt();
			
			if (temp % 2 == 1) {
				arr[0][tmp] = temp;
				tmp++;
			}
		}
		Arrays.sort(arr[0]);
		for (int j = 0; j < 7; j++) {
			if (arr[0][j] != 0); {
				sum += arr[0][j];
			}
		}
		int a = 0;
		while(true) {
			if (arr[0][a] != 0) {
				smallest = arr[0][a];
				break;
			}
			else {
				a++;
			}
			if (a == 7) {
				break;
			}
		}
		if (a == 7) {
			System.out.println("-1");
		}
		else {
		System.out.println(sum);
		System.out.println(smallest);
		}
		sc.close();
	}
}
