package toQ17000;
import java.io.*;
import java.util.*;
public class Q16171 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		Vector<Character> vc = new Vector<Character>(arr.length, 10);
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] - 'A' <= 25 && arr[i] - 'A' >= 0) || (arr[i] - 'a' <= 25 && arr[i] - 'a' >= 0)) {
				vc.add(arr[i]);
			}
		}
		String s = "";
		for (int i = 0; i < vc.size(); i++) {
			s += vc.elementAt(i);
		}
		String temp = br.readLine();
		if (s.contains(temp)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
}
