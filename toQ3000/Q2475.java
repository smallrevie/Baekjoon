package toQ3000;
import java.util.*;
public class Q2475 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int sum = 0;
		 for (int i = 0; i < 5; i++) {
			 int temp = sc.nextInt();
			 sum += temp * temp;
		 }
		 System.out.print(sum % 10);
		 sc.close();
	}
}
