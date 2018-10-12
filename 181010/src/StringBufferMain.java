
public class StringBufferMain {
	
	public static void main(String [] args) {
		StringBuffer sbl = new StringBuffer();
		//1 계속 붙이는 함수 mutable
		
		sbl.append("안녕하세요")
		   .append("또 만나요")
		   .append("모두들 기다려라.");
		System.out.println(sbl.toString() + sbl.hashCode());
		
		//2 replace
		sbl.replace(0,2, "나 보기가 역겨워");
		System.out.println(sbl.toString() + sbl.hashCode());
		
		//3 reverse
		sbl.reverse();
		System.out.println(sbl.toString());
		
		//4 delete
		sbl.delete(10, 15);
		System.out.println(sbl.toString());
		
		//5 cal by reference, shallow copy
		replaces(sbl);
		System.out.println(sbl.toString());
	}

	public static void replaces(StringBuffer sb) {
		sb.reverse();
		sb.replace(0, 3, "GOGO");
	}
	
}
