package toQ13000;
import java.util.*;
public class Q12790 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int hp = sc.nextInt();
			int mp = sc.nextInt();
			int atk = sc.nextInt();
			int def = sc.nextInt();
			int ihp = sc.nextInt();
			int imp = sc.nextInt();
			int iatk = sc.nextInt();
			int idef = sc.nextInt();
			System.out.println(parameter(hp, mp, atk, def, ihp, imp, iatk, idef));
		}
		sc.close();
	}
	
	public static int parameter(int hp, int mp, int atk, int def, int ihp, int imp, int iatk, int idef) {
		int reshp = hp + ihp;
		if (reshp < 1) {
			reshp = 1;
		}
		int resmp = mp + imp;
		if (resmp < 1) {
			resmp = 1;
		}
		int resatk = atk + iatk;
		if (resatk < 0) {
			resatk = 0;
		}
		int resdef = def + idef;
		
		return reshp + resmp * 5 + resatk * 2 + resdef * 2;
	}
}
