
public class ArrayTwolnit {
	public static void main(String [] args) {
		System.out.println("//2차원 배열 방법 1");
		int [][] a = new int[4][3];
		a[0][0] = 1;
		a[0][1] = 2;
		println(a);
		
		System.out.println("//2차원 배열 방법(JigJagged도 가능)");
		int [][] b = new int[3][];
		b[0] = new int[4];
		b[1] = new int[5];
		b[2] = new int[3];
		println(b);
		
		System.out.println("//2차원 배열 방법 3");
		int [][] c = new int[][] {{1,2,3,4,5},{2,3,4,5,6},{6,7,8,9,0}};
		println(c);
		
		System.out.println("copy 1");
		int [][]d = new int[c.length][c[0].length];
		for(int i = 0 ; i < c.length ; i++) {
			System.arraycopy(c[i], 0, d[i], 0, d[i].length);
		}
		println(d);
		
	}

	private static void println(int[][] b) {
		for(int i = 0 ; i < b.length ; i++) {
			for(int j = 0 ; j < b[i].length ; j++) {
				System.out.print("[" + b[i][j] +"]");
			}
			System.out.println();
		}
		
	}
}
