package toQ3000;
import java.util.*;
public class Q2445 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[][] arr = new String[2*N-1][2*N];
		for (int i = 0; i < 2*N-1; i++) {
			for (int j = 0; j < 2*N; j++) {
				arr[i][j] = "*";
			}
		}
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++) {
				arr[N-1-i][N-1-j] = " ";
				arr[N-1-i][N+j] = " ";
			}
		}
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++) {
				arr[N+i-1][N-1-j] = " ";
				arr[N+i-1][N+j] = " ";
			}
		}
		for (int i = 0; i < 2 * N - 1; i++) {
			for (int j = 0; j < 2 * N; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
