package toQ11000;
import java.util.*;
public class Q10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t;
		t = sc.nextInt();
		
		int [] [] array = new int [t] [2];
		for (int i = 0; i < t; i++) {
			 array [i] [0] = sc.nextInt();
			 array [i] [1] = sc.nextInt();
		}
		for (int j = 0; j < t; j++) {
			System.out.println(array [j][0] + array [j] [1]);
		}
		sc.close();
	}
}
