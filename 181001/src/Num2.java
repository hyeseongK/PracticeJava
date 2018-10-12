import java.util.Scanner;

public class Num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input array size : ");
		int input = sc.nextInt();
		ArrayQueue a = new ArrayQueue(input);

		while(true) {
			System.out.println("1 : insert 2 : peek 3 : remove 4 : entire array");
			int i = sc.nextInt();
			
			if(i == 1) {
				System.out.print("input : ");
				a.insert(sc.nextInt());
			}else if(i == 2) {
				System.out.println(a.peek());
			}else if(i == 3) {
				a.remove();
			}else if(i == 4) {
				for(int j = 0 ; j < a.getQueueArray().length ; j++) {
					System.out.println(a.getQueueArray()[j]);
				}
				
			}else {
				System.exit(1);
			}
			
		}
		
	}

}

class ArrayQueue {
	
	 private int front;
	 private int rear;
	 private int maxSize;
	 private Object[] queueArray;
	    
	 // ť �迭 ����
	 public ArrayQueue(int maxSize){
	        
		 this.front = 0;
	     this.rear = -1;
	     this.maxSize = maxSize;
	     this.setQueueArray(new Object[maxSize]);
	 }
	    
	 // ť�� ����ִ��� Ȯ��
	 public boolean empty(){
	     return (front == rear+1);
	 }
	    
	 // ť�� �� á���� Ȯ��
	 public boolean full(){
	     return (rear == maxSize-1);
	 }
	    
	 // ť rear�� ������ ���
	 public void insert(Object item){
	        
	     if(full()) throw new ArrayIndexOutOfBoundsException();
	        
	     getQueueArray()[++rear] = item;
	 }
	    
	 // ť���� front ������ ��ȸ
	 public Object peek(){
	        
	     if(empty()) throw new ArrayIndexOutOfBoundsException();
	        
	     return getQueueArray()[front];
	 }
	    
	 // ť���� front ������ ����
	 public Object remove(){
	        
	     Object item = peek();
	     front++;
	     return item;
	 }

	public Object[] getQueueArray() {
		return queueArray;
	}

	public void setQueueArray(Object[] queueArray) {
		this.queueArray = queueArray;
	}


	
	
}