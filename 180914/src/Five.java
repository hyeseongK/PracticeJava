
public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str = "12345";
		int sum = 0;
		
		for(int i = 0 ; i < str.length() ; i++) {
			int j = str.charAt(i) - '0';
			System.out.print(j + "  ");
			sum += j;
		}
		System.out.println("Sum = " + sum);*/
		//���ڷ� �̷���� ���ڿ� str�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�.
		//���� ���ڿ��� "12345"���, ' 1+2+3+4+5 '�� ����� 15�� ��µǾ���Ѵ�. �� �ڵ带 �����϶�.
		
		String str = "12345";
		int sum = 0;
		
		for(int i = 0 ; i < str.length() ; i++) {
			int j = str.charAt(i) - '0';
			System.out.print(j + "  ");
			sum += j;
		}
		
		System.out.println("Sum = " + sum);
		
	}

}
