package toQ17000;
import java.util.*;
import java.io.*;
public class Q16165 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<String, String[]> hm = new HashMap<String, String[]>();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String[] name = new String[N+30];
		for (int i = 0; i < N; i++) {
			String temp = br.readLine();
			name[i] = temp;
			int T = Integer.parseInt(br.readLine().trim());
			String[] arr = new String[T];
			for (int j = 0; j < T; j++) {
				arr[j] = br.readLine();
			}
			Arrays.sort(arr);
			hm.put(temp, arr);
		}
		for (int i = 0; i < M; i++) {
			String Que = br.readLine();
			int Q = Integer.parseInt(br.readLine());
			if (Q == 0) {
				String[] tmp = hm.get(Que);
				for (int j = 0; j < tmp.length; j++) {
					System.out.println(tmp[j]);
				}
			}
			else {
				for (int j = 0; j < N; j++) {
					String[] tmp = hm.get(name[j]);
					for (int k = 0; k < tmp.length; k++) {
						if (tmp[k].equals(Que)) {
							System.out.println(name[j]);
							continue;
						}
					}
				}
			}
		}
	}
}