package toQ16000;
import java.util.*;
public class Q15857 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String [8];
		arr[0] = "a";
		arr[1] = "b";
		arr[2] = "b";
		arr[3] = "c";
		arr[4] = "d";
		arr[5] = "d";
		arr[6] = "d";
		arr[7] = "c";
		
		int i = sc.nextInt();
		System.out.print(arr[i-1]);
		
		sc.close();
	}
}
