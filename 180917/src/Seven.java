import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

public class Seven {
	public static void main(String[] args) throws ParseException {
		Seven du = new Seven();

		String[] days = du.getDiffDays("20100101", "20101231");
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date date;
		Calendar calendar = Calendar.getInstance();

		for( int i = 0; i < days.length; i++ ) {
		
			date = dateFormat.parse(days[i]);
		
			String a = new SimpleDateFormat("F").format(date);
			int j = Integer.parseInt(a);
		
			calendar.setTime(date);
			int k = calendar.get(Calendar.DAY_OF_WEEK);
		
			if(j == 2 && k == 1) {
				System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date) + "은 " + "2번째 일요일 입니다.");
			}else {
				continue;
			}
		}
	
	}

	/**
	* 시작일부터 종료일까지 사이의 날짜를 배열에 담아 리턴 ( 시작일과 종료일을 모두 포함한다 )
	* 
	* @param fromDate
	* yyyyMMdd 형식의 시작일
	* @param toDate
	* yyyyMMdd 형식의 종료일
	* @return yyyyMMdd 형식의 날짜가 담긴 배열
	*/
	public static String[] getDiffDays(String fromDate, String toDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		Calendar cal = Calendar.getInstance();

		try {
			cal.setTime(sdf.parse(fromDate));
			} catch (Exception e) {
		}

		int count = getDiffDayCount(fromDate, toDate);

		// 시작일부터
		cal.add(Calendar.DATE, -1);

		// 데이터 저장
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i <= count; i++) {
			cal.add(Calendar.DATE, 1);

			list.add(sdf.format(cal.getTime()));
		}

		String[] result = new String[list.size()];

		list.toArray(result);

		return result;
	}

	/**
	* 두날짜 사이의 일수를 리턴
	* 
	* @param fromDate
	* yyyyMMdd 형식의 시작일
	* @param toDate
	* yyyyMMdd 형식의 종료일
	* @return 두날짜 사이의 일수
	*/
	public static int getDiffDayCount(String fromDate, String toDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		try {
			return (int) ((sdf.parse(toDate).getTime() - sdf.parse(fromDate)
					.getTime()) / 1000 / 60 / 60 / 24);
		} catch (Exception e) {
			return 0;
		}
	}
}