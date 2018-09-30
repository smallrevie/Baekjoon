package toQ6000;
import java.util.*;
public class Q5988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] arr = new String[N];
		
		for (int i = 0; i < arr.length; i++ ) {
			arr[i] = sc.next();
		}
		for (int j = 0; j < arr.length; j++) {
			if ((arr[j].charAt(arr[j].length() - 1) -'0') % 2 == 0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
		sc.close();
	}
}
