package toQ3000;
import java.util.*;
public class Q2744 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] arr;
		arr = s.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 65 && arr[i] <= 92) {
				arr[i] = (char) ((arr[i]) + 32);
			}
			else if (arr[i] >= 97 && arr[i] <= 122) {
				arr[i] = (char) (arr[i] - 32);
			}
		}
		System.out.print(arr);
		sc.close();
	}
}
