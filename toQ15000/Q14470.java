package toQ15000;
import java.io.*;
public class Q14470 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int start = Integer.parseInt(br.readLine());
		int goal = Integer.parseInt(br.readLine());
		int freezeUp = Integer.parseInt(br.readLine());
		int unFreeze = Integer.parseInt(br.readLine());
		int tempUp = Integer.parseInt(br.readLine());
		int makeZero = 0;
		int temperUp = (goal - start) * tempUp;
		if (start <= 0) {
			makeZero = freezeUp * Math.abs(start) + unFreeze;
			temperUp = goal * tempUp;
		}
		System.out.println((makeZero + temperUp));
	}
}