import java.util.Scanner;

public class Two {

	public static void main(String [] args) {
		cal cal = new cal();
		Scanner sc = new Scanner(System.in);
		System.out.print("Month : ");
		int month = sc.nextInt(); //month
		System.out.print("Day : ");
		int day = sc.nextInt(); //day
		
		final String [] str = {"","MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN",""};

		int daycount = cal.daycalculator(month, day);
		
		int count = 0;
		for(int i = 1 ; i <= 8 ; i++) { //MON~SUN���� ���ѷ���
			
			if(i == 8) { //index�� 8�� ��� �����̹Ƿ� ī������������
				i = 0;	//i=0���� �����̹Ƿ� for������ ���ư��� i=1�� ��
			}else if(count == daycount){
				System.out.println(str[i-1]);
				break;
			}else {
				count++;
			}
		}
		
		
	}

}

class cal {

	int daycalculator(int month, int day) { //�Է¹��� 1�� 1�Ϻ��� month, day������ �ϼ� ī����
		
		int count = 0;
		Loop1: for(int i = 1 ; i <= month ; i++) { // 1������ 12�ϱ��� �ݺ� 
			if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) { // 1,3,5,7,8,10,12���� 31��
				for(int j = 1 ; j <= 31 ; j++) {
					if(i == month && j ==day) { 
						count++;
						break Loop1; //�ش� ��¥�ÿ� ��������
					}
					count++;
				}
			}else if(i==2) {
				for(int j = 1 ; j <= 28 ; j++) {
					if(i == month && j ==day) {
						count++;
						break Loop1;
					}
					count++;
				}
			}else {
				for(int j = 1 ; j <= 30 ; j++) {
					if(i == month && j ==day) {
						count++;
						break Loop1;
					}
					count++;
				}
			}
		}
		return count; //ī���ð� ����
	}
	
}
