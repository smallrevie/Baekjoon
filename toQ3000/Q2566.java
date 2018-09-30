package toQ3000;
import java.util.*;
public class Q2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] arr = new int[9][9];
		int max = arr[0][0];
		int maxx = 0;
		int maxy = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
				if (arr[i][j] > max) {
					max = arr[i][j];
					maxx = i+1;
					maxy = j+1;
				}
			}
		}
		System.out.println(max);
		System.out.print(maxx + " ");
		System.out.print(maxy);
		sc.close();
	}
}
