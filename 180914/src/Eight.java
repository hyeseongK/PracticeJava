
public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "12o34"; // ���ڿ��� ���������� �Ǻ��ϴ� ���α׷��ۼ�
		char ch = ' ';
		boolean isNumber = true;

		//�ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ��� ���ڸ�
		//�ϳ��� �о �˻��Ѵ�
		for(int i = 0 ; i < value.length() ; i++) {
			ch = value.charAt(i);
			if( ch < 48 || ch > 57){ //�ƽ�Ű �ڵ� ���� 48 ~ 57���̸� 0�� 9������ �����̴�.
				isNumber = false;
				break;
			}
		}
		
		if(isNumber) {
			System.out.println(value + "�� �����Դϴ�.");
		}else {
			System.out.println(value + "�� ���ڰ� �ƴմϴ�."); 
		}
		
	}
}
