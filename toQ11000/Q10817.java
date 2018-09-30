package toQ11000;
import java.util.*;
public class Q10817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		
		int array[] = {a, b, c};
		Arrays.sort(array);
		System.out.print(array[1]);
	}
}
