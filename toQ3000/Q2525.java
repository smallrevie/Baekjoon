package toQ3000;
import java.util.*;
public class Q2525 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time = sc.nextLine().split("\\s");
        int A = Integer.parseInt(time[0]);
        int B = Integer.parseInt(time[1]);
        int C = sc.nextInt();
        B += C;
        A += B / 60;
        B = B % 60;
        if (A >= 24) {
        	A -= 24;
        }
        sc.close();
        System.out.print(A + " " + B);
    }
}
