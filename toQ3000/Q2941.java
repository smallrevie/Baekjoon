package toQ3000;
import java.io.*;
public class Q2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int N = s.length();
		for (int i = 0; i < s.length()-1; i++) {
			if (i+3 < s.length()-1 && s.substring(i, i+3).equals("dz=")) {
				N -= 2;
				i += 2;
				continue;
			}
			else if (s.substring(i,  i+2).equals("c=") || 
					s.substring(i,  i+2).equals("c-") ||
					s.substring(i,  i+2).equals("d-") ||
					s.substring(i,  i+2).equals("lj") ||
					s.substring(i,  i+2).equals("nj") ||
					s.substring(i,  i+2).equals("s=") ||
					s.substring(i,  i+2).equals("z=")) {
				N--;
				i++;
			}
		}
		System.out.println(N);
	}
}
