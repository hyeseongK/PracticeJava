
class Java200Math2 {
	//축약 048
	public static int sumEach(int n) {
		int tot = 0;
		while(n != 0) {
			tot += n%10; // 3->2->1
			n /= 10;
		}
		return tot;
	}
	
	//s049
	public static boolean isPrime(int n) {
		boolean isS = true;
		for(int i = 2 ; i <= (int)Math.sqrt(n) ; i++) {
			if(n%i == 0) {
				isS=false;
				break;
			}
		}
		return isS;
	}
	
	public static int sumSmith(int n) {
		int tot = 0;
		int a = 2;
		while(n != 1) {
			if(n%a == 0) {
				tot += sumEach(a);
				n /= a;
			}else {
				a++;
			}
		}
		return tot;
	}
}

//&&논리연산자
public class Smith{
	public static void printSmith(int t1, int t2) {
		for(int i = t1 ; i < t2 ; i++) {
			if(!Java200Math2.isPrime(i) && Java200Math2.sumEach(i) == Java200Math2.sumSmith(i)) {
				System.out.printf("%d는 스미스 수", i);
				
			}
		}
	}
	public static void main(String[] args) {
		//10000~20000사이의 스미스 수
		printSmith(10000,20000);
	}
}

