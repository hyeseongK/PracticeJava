import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Input A size : ");
		int [] A = new int[sc.nextInt()];
		System.out.print("Input X : ");
		int X = sc.nextInt();
	
		if(A.length < 1 || X > 10000) { //A,X�� �Է�����
			System.out.println("should be A >= 1 and X <= 10000 ");
			System.exit(1);
		}
		
		Loop1:for(int i = 0 ; i < A.length ; i++) { //�Էµ� A�� ���� �迭�� ũ��� �����ϰ� �� �ε��� �� ����
			System.out.print("Input " + (i+1) + " : ");
			int j = sc.nextInt();
			if(j > 10000) {
				System.out.println("must be i <= 10000");
				break Loop1;
			}else {
				A[i] = j;
			}
			
		}
		
		System.out.print("Result : ");
		for(int i = 0 ; i < A.length ; i++) {
			if(A[i] < X) { // �迭 �� �ε��� ���� ��Ұ� X���� �����͵��� ���
				System.out.print(A[i] + " ");
			}
		}
		
		
	}

}
