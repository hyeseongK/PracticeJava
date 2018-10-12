import java.util.Scanner;

public class Num3 {

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
				try {
					a.remove();
				}catch(Exception e) {
					System.out.println("empty");
					continue;
				}
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

class CircularQueue {
    
    // ť �迭�� front�� rear �׸��� maxSize�� ������.
        private int front;
        private int rear;
        private int maxSize;
        private Object[] queueArray;
        
        // ť �迭 ����
        public CircularQueue(int maxSize){
            
            this.front = 0;
            this.rear = -1;
            
            // ���� ũ�⺸�� �ϳ� ũ�� �����Ѵ� (����� ��ȭ�� ���� ����)
            this.maxSize = maxSize+1;    
            this.queueArray = new Object[this.maxSize];
        }
        
        // ť�� ����ִ��� Ȯ��
        public boolean empty(){
            return (front == rear+1) || (front+maxSize-1 == rear);
        }
        
        // ť�� �� á���� Ȯ��
        public boolean full(){
            return (rear == maxSize-1) || (front+maxSize-2 == rear);
        }
        
        // ť rear�� ������ ���
        public void insert(Object item){
            
            if(full()) throw new ArrayIndexOutOfBoundsException();
            
            // rear �� �迭�� �������̸� rear �����͸� ������ ������.
            if(rear == maxSize-1){
                rear = -1;
            }
            queueArray[++rear] = item;
        }
        
        // ť���� front ������ ��ȸ
        public Object peek(){
            
            if(empty()) throw new ArrayIndexOutOfBoundsException();
            
            return queueArray[front];
        }
        
        // ť���� front ������ ����
        public Object remove(){
            
            Object item = peek();
            front++;
            
            // front�� ���� index�� �迭ũ��+1 �̸� ó������ ���ư���
            if(front==maxSize){
                front = 0;
            }
            return item;
        }

}

