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
	    
	 // 큐 배열 생성
	 public ArrayQueue(int maxSize){
	        
		 this.front = 0;
	     this.rear = -1;
	     this.maxSize = maxSize;
	     this.setQueueArray(new Object[maxSize]);
	 }
	    
	 // 큐가 비어있는지 확인
	 public boolean empty(){
	     return (front == rear+1);
	 }
	    
	 // 큐가 꽉 찼는지 확인
	 public boolean full(){
	     return (rear == maxSize-1);
	 }
	    
	 // 큐 rear에 데이터 등록
	 public void insert(Object item){
	        
	     if(full()) throw new ArrayIndexOutOfBoundsException();
	        
	     getQueueArray()[++rear] = item;
	 }
	    
	 // 큐에서 front 데이터 조회
	 public Object peek(){
	        
	     if(empty()) throw new ArrayIndexOutOfBoundsException();
	        
	     return getQueueArray()[front];
	 }
	    
	 // 큐에서 front 데이터 제거
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