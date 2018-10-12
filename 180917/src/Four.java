
public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("ȫ�浿", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());
		
		
		
	}

}



class Student {
	String name;
	int n1,n2,n3,n4,n5;
	int sum; float avg;
	public Student(String string, int i, int j, int k, int l, int m){
		name = string;
		n1 = i; n2 = j;
		n3 = k; n4 = l; n5 = m;
		sum = n1+n2+n3+n4+n5;
		avg = (n1+n2+n3+n4+n5)/5;
		
	}
	
	public String info() {
		
		
		return name +","+ n1 + "," + n2 + "," + n3 + "," + n4 + "," + n5 + "," + sum + "," + avg;
		
	}
	
}
