
public class Num3 {

	public int price,weight;
	public FRUIT fruit;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Num3 num = new Num3();
		num.price = 2000;
		num.weight = 5;
		num.fruit = FRUIT.APPLE;
		
		System.out.println("가격 : " + num.price + "$");
		System.out.println("무게 : " + num.weight + "kg");
		System.out.println("종류 : " + num.fruit);
		
		
	}

}

enum FRUIT{
	APPLE, BANNA, MANGO
	
	
	
}