
public class Num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,5,6,7,8};
		int [] copy = new int[arr.length];
		
		int s = 2, t = 6; //s = 2, t = 6

		for(int i = 0 ; i < arr.length ; i++) {
			copy[i] = arr[i]; //copy 배열에 arr배열 복사
			
			if(i == s) { //Index가 s와 같을 시
				copy[i] = arr[t]; //arr의 Index t를 가지는 값을 해당 copy[i]에 저장
				for(int j = s+1 ; j <= t ; j++ ) { // s인덱스 값 + 1 부터 t값까지 전체 배열 복사 
					copy[j] = arr[i++];
				}
				i = t; //다음의 잔여 배열 복사를 위해 for문 끝나고 i를 t로 바꿈
			}
			
		}
		
		for(int i = 0 ; i < copy.length ; i++) {
			System.out.print(copy[i] + " ");
		}
		
		
		
		
	}

}
