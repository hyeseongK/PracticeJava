import java.util.Arrays;
public class ArrayInit {

	public static void main(String[] args) {
		//�⺻ Ÿ���� �迭 ��� ��� 1 ����
		int [] a;	//����
		//a = [1,2,3] //���� �ϸ鼭 �ʱ�ȭ�� ���� ���
		//����
		a = new int[5]; //�ʱ�ȭ
		a[0]=2; a[1]=5;
		a[2]=3; a[3]=9;
		a[4]=8;
		
		int[] b = new int[] {2,5,3,9,8}; //���� �迭 �ٽ� �ʱ�ȭ ����
		int [] c = {2,5,3,9,8};
		int [] e = new int[5];
		
		Arrays.fill(e, -1);
		
		System.arraycopy(c, 0, e, 0, c.length);
		Arrays.sort(e);
		print(e);
		
		e = new int[] {1,2,3,4,5,6};
		int index = Arrays.binarySearch(e,5);
		System.out.println(index);
		
	}

	private static void print(int[] e) {
		for(int i = 0 ; i < e.length ; i++) {
			System.out.print(e[i] + "\t");
		}
		System.out.println();
	}

}