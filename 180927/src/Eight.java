
public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(-2,2,-7,4); 
		Rectangle s = new Rectangle(-2,2,-7,4);
		
		r.show();
		s.show();
		System.out.println("s.square[s객체 넓이] 결과 : " + s.square());
		
		r.set(11, -2, 3, 32);
		System.out.println("\n*r 객체에 -11,-2,3,32 세팅");
		
		r.show();
		System.out.println("r.square[s객체 넓이] 결과 : " + s.square());
		
		if(r.equals(s)) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
		
	}

}


class Rectangle{
	int x1, y1, x2, y2;
	int horizen, vertical, square;
	
	public Rectangle() {
		
	}
	public Rectangle(int a,int b,int c,int d) {
		x1 = a; y1 = b; x2 = c; y2 = d;
	}
	
	void set(int a,int b,int c,int d) {
		x1 = a; y1 = b; x2 = c; y2 = d;
	}
	
	int square() {
		horizen = (x1)-(x2);
		horizen = Math.abs(horizen);
		vertical = (y1)-(y2);
		vertical = Math.abs(vertical);
		square = horizen * vertical;
		return square;
	}
	
	boolean equals(Rectangle r) {
		if(this.square() == r.square()) {
			return true;
		}else {
			return false;
		}
	}
	
	void show() {
		System.out.println("-------------------------------------");
		System.out.printf("%s%s%d%s%s%s%d%s%s%s%d%s%s%s%d","x1"," = ",x1,", ","y1"," = ",y1,", ","x2"," = ", x2, ", ","y2"," = ",y2);
		System.out.println();
		System.out.println("직사각형의 가로길이 : " + Math.abs(((x1)-(x2))));
		System.out.println("직사각형의 세로길이 : " + Math.abs(((y1)-(y2))));
		System.out.println("-------------------------------------");
	}
	
}