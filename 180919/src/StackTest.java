import java.util.Scanner;

public class StackTest {
	   public static void main(String[] args){
	     
		// 스택 동작 테스트
		   Stack st = new Stack(100);
		   Scanner sc = new Scanner(System.in);
		   System.out.println("1 : push  2 : pop  3 : peek  4 : print");
		   
		   while(true) {
			   int i = sc.nextInt();
			   if(i == 1 ) {
				   System.out.print("Insert : ");
				   
				   while(true) {
					   int j = sc.nextInt();
					   if(j == 100) {
						   break;
					   }else {
						   st.push(j);
					   }
				   }
				   
			   }else if(i == 2) {
				   try {
					   st.pop();
				   }catch(Exception e) {
					   System.out.println("Stack Underflow");
				   }
				   
			   }else if(i == 3) {
				   System.out.println("Top : " + st.peek());
				   
			   }else if(i == 4) {
				   st.printStack();
				   
			   }else {
				   break;
				   
			   }

		   }
	}

}

class Stack {

	int top;
	int[] stack;
	int size;

	public Stack(int size) {
		top = -1;
		stack = new int[size];
		this.size = size;
	}

	public int peek() {
		return stack[top];        
	}

	public void push(int value) {
		stack[++top] = value;
		System.out.println(stack[top] + " PUSH !");
	}

	public int pop() {
		System.out.println(stack[top] + " POP !");
		return stack[top--];
	}

	public void printStack() {
		System.out.println("-- STACK LIST --");
		for (int i = top; i >= 0; i--)
			System.out.println(stack[i]);
		System.out.println("-- END OF LIST --");
	}
}


