
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Hello Java4Android";
		String com = "HEllo java4Android";
		
		System.out.println(text.charAt(2));
		System.out.println(text.concat("s"));
		System.out.println(text.contains("And"));
		System.out.println(text.equals(com));
		System.out.println(text.equalsIgnoreCase(com));
		System.out.println(text.indexOf("a"));
		System.out.println(text.lastIndexOf("a"));
		System.out.println(text.trim());
		System.out.println(text.length());
		System.out.println(text.substring(7));
		System.out.println(text.substring(7, 11));
		System.out.println(text.replace(" `", "-"));
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		
		
		
		
		
	}

}
