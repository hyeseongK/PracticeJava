
public class Num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,5,6,7,8};
		int [] copy = new int[arr.length];
		
		int s = 2, t = 6; //s = 2, t = 6

		for(int i = 0 ; i < arr.length ; i++) {
			copy[i] = arr[i]; //copy �迭�� arr�迭 ����
			
			if(i == s) { //Index�� s�� ���� ��
				copy[i] = arr[t]; //arr�� Index t�� ������ ���� �ش� copy[i]�� ����
				for(int j = s+1 ; j <= t ; j++ ) { // s�ε��� �� + 1 ���� t������ ��ü �迭 ���� 
					copy[j] = arr[i++];
				}
				i = t; //������ �ܿ� �迭 ���縦 ���� for�� ������ i�� t�� �ٲ�
			}
			
		}
		
		for(int i = 0 ; i < copy.length ; i++) {
			System.out.print(copy[i] + " ");
		}
		
		
		
		
	}

}
