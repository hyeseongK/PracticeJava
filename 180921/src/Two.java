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
		for(int i = 1 ; i <= 8 ; i++) { //MON~SUN까지 무한루프
			
			if(i == 8) { //index가 8일 경우 공백이므로 카운팅하지않음
				i = 0;	//i=0또한 공백이므로 for문으로 돌아갈시 i=1이 됨
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

	int daycalculator(int month, int day) { //입력받은 1월 1일부터 month, day까지의 일수 카운팅
		
		int count = 0;
		Loop1: for(int i = 1 ; i <= month ; i++) { // 1월부터 12일까지 반복 
			if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) { // 1,3,5,7,8,10,12월은 31일
				for(int j = 1 ; j <= 31 ; j++) {
					if(i == month && j ==day) { 
						count++;
						break Loop1; //해당 날짜시에 루프종료
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
		return count; //카운팅값 리턴
	}
	
}
