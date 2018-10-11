package toQ2000;
import java.io.*;
import java.util.Arrays;
public class Q1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] arr = new int[26];
		int max = 0;
		int chr = 0;
		s = s.toUpperCase();
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'A']++;
		}
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				chr = i;
			}
		}
		Arrays.sort(arr);
		if (arr[24] == arr[25]) {
			System.out.println("?");
		}
		else {
			System.out.println((char)(chr + 'A'));
		}
	}
}
