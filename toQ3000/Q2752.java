package toQ3000;
import java.util.*;
public class Q2752 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
		}
		sc.close();
	}
}
