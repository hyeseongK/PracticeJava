
public class StringArray {

	public static void main(String[] args) {
		
		String[] myNum = new String[] {"2016-08-17", "2016-09-17", "2016-03-17"};
		String[] myNum2 = {"2016-08-17", "2016-09-17", "2016-03-17"};
		System.out.println(myNum2[0]);
		print(myNum);
		
		//myNum2 = {"2016-08-17", "2016-09-17", "2016-03-17", "2016-04-17"}; //�ٽ� �ʱ�ȭ �Ұ�
		myNum2 = new String[] {"2016-08-17", "2016-09-17", "2016-03-17", "2016-04-17"};
		String [] tos = new String[myNum.length];
		System.arraycopy(myNum, 0, tos, 0, myNum.length);
		print(tos);
		
		
	}

	private static void print(String[] myNum) {
		// TODO Auto-generated method stub
		for(String ss: myNum) {
			System.out.print(ss + "\t");
		}
		System.out.println();
	}

}
