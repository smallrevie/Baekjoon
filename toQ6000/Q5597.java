package toQ6000;
import java.util.*;
public class Q5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[30];
		for (int i = 0; i < 28; i++) {
			int temp = sc.nextInt();
			arr[temp-1]++;
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == 0) {
				System.out.println(j+1);
			}
		}
		sc.close();
	}
}
