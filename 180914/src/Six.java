
public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345; // int Ÿ�� ���� num�� ���� �� �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�.
		int sum = 0;    

		int length = (int)(Math.log10(num)+1);	// num�� �ڸ��� ���
		int ten = 10;
		int j = 0;
		
		for(int i = 1 ; i <= length ; i++) {
			
			if(i == 1) {
				j = num % 10;
				sum += j;
			}else {
				j = (num / ten) % 10;
				ten = ten*10;
				
				sum += j;
			}
		}
		
		System.out.println("sum = " + sum);
		
	}

}
