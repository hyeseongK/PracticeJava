import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueTest {
	    
	public static void main(String [] args) {
		
		Queue<String> q = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1 : offer  2 : poll  3 : peek  4 : print");
			int i = sc.nextInt();
			
			if(i == 1) {
				System.out.print("offer : ");
				q.add(sc.next());
			}else if(i == 2) {
				q.poll();
				System.out.println("Poll Success");
				System.out.println();
			}else if(i == 3) {
				System.out.println("Front is " + q.peek());
				System.out.println();
			}else if(i == 4) {
				if(q.isEmpty() == true) {
					System.out.println("Queue is empty");
				}else {
					while(q.isEmpty() == false) {
						System.out.println(q.poll());
					}
				}
			}else {
				break;
			}
		}
	

	}
	
}
