package toQ3000;
import java.util.*;
public class Q2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int [] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		max = arr[0];
		int arrnum = 1;
		for (int j = 1; j < 9; j++) {
			if (arr[j] > max) {
				max = arr[j];
				arrnum = j+1;
			}
		}
		System.out.println(max);
		System.out.println(arrnum);
		
		sc.close();
	}
}
