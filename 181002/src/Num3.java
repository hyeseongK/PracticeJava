
public class Num3 {

	public int price,weight;
	public FRUIT fruit;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Num3 num = new Num3();
		num.price = 2000;
		num.weight = 5;
		num.fruit = FRUIT.APPLE;
		
		System.out.println("���� : " + num.price + "$");
		System.out.println("���� : " + num.weight + "kg");
		System.out.println("���� : " + num.fruit);
		
		
	}

}

enum FRUIT{
	APPLE, BANNA, MANGO
	
	
	
}