import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Nine {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요. (입력예 : 2001/05/11)");
		String str = sc.next();
		String s = str.replace("/", "-");
		
		try {
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = dateFormat.parse(s);
			
			System.out.println(dateFormat.format(date));
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);

			switch(calendar.get(Calendar.DAY_OF_WEEK)) {
		 		case 1: 
		 			System.out.println("일요일");
		 			break;
		 		case 2: 
		 			System.out.println("월요일"); 
		 			break;
		 		case 3: 
		 			System.out.println("화요일");
		 			break;
		 		case 4: 
		 			System.out.println("수요일");
		 			break;
		 		case 5: 
		 			System.out.println("목요일");
		 			break;
		 		case 6: 
		 			System.out.println("금요일"); 
		 			break;
		 		case 7: 
		 			System.out.println("토요일");
		 			break;
			}
			
		}catch(Exception e) {
			System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.");
		}
		
		
	}

}
