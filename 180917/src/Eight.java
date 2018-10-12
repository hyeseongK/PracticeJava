import java.text.DecimalFormat;

public class Eight {

	public static void main(String[] args) {

	    String data  = "123,456,789.5"; // 원본 문자열
	    String s2;
	    s2 = data.replace(",", "");

	    long result2 =Math.round(Double.parseDouble(s2));
	    System.out.println(result2);
	    
	    DecimalFormat Commas = new DecimalFormat("#,####");
	    String result_int = (String)Commas.format(result2);
	    System.out.println(result_int);
	    
	    
	  }

}
