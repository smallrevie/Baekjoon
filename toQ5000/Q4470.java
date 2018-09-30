package toQ5000;
import java.util.*;
public class Q4470 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] s = new String[t+1];
        for (int i = 0; i < t+1; i++) {
            s[i] = sc.nextLine();
        }
        for (int j = 1; j < t+1; j++) {
            System.out.println(j + ". " + s[j]);
        }
       sc.close();
    }
}
