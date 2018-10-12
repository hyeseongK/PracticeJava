
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable rn = new test();
		Thread thread = new Thread(rn);
		
		thread.start();
		
	}

}

class test implements Runnable{
	
	public void run() {
		for(int i = 0 ; i < 300 ; i++) {
			System.out.print('-');
		}
	}
	
}

/*class Thread1 extends Thread{
	
	public void run() {
		for(int i = 0 ; i < 300 ; i++) {
			System.out.print('-');
		}
	}
	
}*/