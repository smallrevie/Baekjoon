package toQ2000;
import java.util.*;
public class Q1912 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int[] temp = new int[n];
		
		Q1912 test = new Q1912();
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			temp[i] = 0;
		}
		
		System.out.println(test.maxxum(arr, temp));
		sc.close();
	}
	
	public int maxxum(int[] arr, int[] brr) {
		brr[0] = arr[0];
		int max = brr[0];
		
		for (int i = 1; i < arr.length; i++) {
			brr[i] = Math.max(arr[i], arr[i] + brr[i-1]);
			max = Math.max(max, brr[i]);
		}
		return max;
	}
}
