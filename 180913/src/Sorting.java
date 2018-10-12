import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> num = new ArrayList<>();
		IR ir = new IR();
		Print pr = new Print();
		
		ir.Insert(num);
		ir.Remove(num); //0제거
		ir.Hashset(num); //중복 제거
		
		
		Collections.sort(num);
		pr.Print(num);
		
		System.out.println();
		
		Collections.sort(num, new AscendingInteger());
		pr.Print(num);
		
	}

}

class AscendingInteger implements Comparator<Integer> { 
	
	public int compare(Integer a, Integer b) { 
		
		return b.compareTo(a); 
	
	}
}

class Print {
	public void Print(ArrayList<Integer> list) {
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.print(list.get(i)+ "  ");
		}
		
	}
	
}

class IR{
	void Remove(ArrayList<Integer> list) {
		for(int i = 0 ; i<list.size() ; i++) {
			if(list.get(i) == 0) {
				list.remove(i);
				i = -1;
			}
		}
	}
	void Insert(ArrayList<Integer> list) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < 10 ; i++) {
			list.add(sc.nextInt());
		}
	}
	void Hashset(ArrayList<Integer> list) {
		HashSet hs = new HashSet();
		hs.addAll(list); // ArryList를 HashSet에 담는다.
		list.clear(); // 기존 ArrayList를 비운다.
		list.addAll(hs); // HashSet을 ArrayList에 다시 담는다.
	}
	
}
