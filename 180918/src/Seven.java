
public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintTest pt = new PrintTest();
		
		pt.Print1();
		System.out.println();
		pt.Print2();
		System.out.println();
		pt.Print3();
		System.out.println();
		
	}
}

class PrintTest{
	
	void Print1() {
		int count = 1;
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = i ; j < 5-1 ; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k <= i + count ; k++) {
				System.out.print(k);
			}
			System.out.println();
			count++;
		}
		count = 1; int count2 = 7;
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = i ; j < i + count ; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k <= count2 ; k++) {
				System.out.print(k);
			}
			System.out.println();
			count++;
			count2-=2;
		}
	}
	
	void Print2() {
		int count1 = 1;
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 4-i ; j > 0 ; j--) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < i + count1 ; k++) {
				if(k == 0 || k == (i+count1)-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			count1++;
		}
		count1 = 7;
		for(int i = 0 ; i < 5-1 ; i++) {
			for(int j = 0 ; j < i+1 ; j++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < count1 ; k++) {
				if(k == 0 || k == count1-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			count1 -= 2;
		}
	}
	
	void Print3() {
		
		for(int i = 1 ; i <= 5 ; i++) {
			if(i == 1 || i == 5) {
				for(int j = 0 ; j < 10 ; j++) {
					System.out.print("*");
				}
				System.out.println();
				
			}else{
				for(int j = 0 ; j < 10 ; j++) {
					if(j == 0 || j == 10-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
	}
	
}


