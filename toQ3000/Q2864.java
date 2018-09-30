package toQ3000;
import java.io.*;
import java.util.*;
public class Q2864 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		
		System.out.println(min(a, b) + " " + max(a, b));
	}
	public static int max(String a, String b) {
		String str = "";
		String str1 = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '5') {
				str += "6";
				continue;
			}
			str += a.charAt(i);
		}
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '5') {
				str1 += "6";
				continue;
			}
			str1 += b.charAt(i);
		}
		return Integer.parseInt(str) + Integer.parseInt(str1);
	}
	public static int min(String a, String b) {
		String str = "";
		String str1 = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '6') {
				str += "5";
				continue;
			}
			str += a.charAt(i);
		}
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '6') {
				str1 += "5";
				continue;
			}
			str1 += b.charAt(i);
		}
		return Integer.parseInt(str) + Integer.parseInt(str1);
	}
}
