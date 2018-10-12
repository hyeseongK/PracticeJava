
public class StringBufferMain {
	
	public static void main(String [] args) {
		StringBuffer sbl = new StringBuffer();
		//1 ��� ���̴� �Լ� mutable
		
		sbl.append("�ȳ��ϼ���")
		   .append("�� ������")
		   .append("��ε� ��ٷ���.");
		System.out.println(sbl.toString() + sbl.hashCode());
		
		//2 replace
		sbl.replace(0,2, "�� ���Ⱑ ���ܿ�");
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
