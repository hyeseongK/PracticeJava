import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] Alphabet = new char[26];
		char [] alphabet = new char[26];
		char j = 65, k = 97;
		for(int i = 0 ; i < Alphabet.length ; i++) {
			Alphabet[i] = j;
			alphabet[i] = k;
			j++; k++;
		}
		
		char input; String str;
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input Character : ");
			str = sc.next();
			input = str.charAt(0);
			
			for(int i = 0 ; i < Alphabet.length ; i++) {
				if(input == Alphabet[i]) {
					System.out.println(alphabet[i]);
				}else if(input == alphabet[i]) {
					System.out.println(Alphabet[i]);
				}
			}
			break;
		}
		
		
		
		
	}

}
