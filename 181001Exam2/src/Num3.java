import java.util.Scanner;

public class Num3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int idx = 0;
		Loop1:for(int i = 0 ; i< input.length() ; i++) { // ���� ���� �ε��� ã��
			if(input.charAt(i) == ' ') {
				idx = i;
				break Loop1;
			}
		}
		
		String num = "";
		for(int i = 0 ; i < idx ; i++) { //�ε��� ������ string �߰�
			num += String.valueOf(input.charAt(i));
		}
		String num2 = "";
		for(int i = idx+1 ; i < input.length() ; i++) { // �ε����� �������� �Է°� ������ String �߰�
			num2 += input.charAt(i);
		}
		int Natural = Integer.parseInt(num); //�������� �Է°��� parsing
		int Jinsu = Integer.parseInt(num2);
		
		if(Jinsu == 2) { //�������� ��ȯ ���
			System.out.println(Integer.toBinaryString(Natural));
		}else if(Jinsu == 8) {
			System.out.println(Integer.toOctalString(Natural));
		}else if(Jinsu == 16) {
			System.out.println(Integer.toHexString(Natural));
		}else {
			System.out.println("2,8,16���� �� �Է�");
			System.exit(1);
		}
		
		
		
	}

}
