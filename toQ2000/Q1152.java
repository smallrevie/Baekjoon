package toQ2000;
import java.util.*;
public class Q1152 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        
        if (str1.isEmpty()) {
            System.out.print("0");
        }
        else {
            System.out.print(str1.split(" ").length);
        }
        sc.close();
    }
}
