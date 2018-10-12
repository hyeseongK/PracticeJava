import java.util.ArrayList;
import java.util.Scanner;

public class Num6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner ic = new Scanner(System.in);
		ArrayList<Sungjuk> su = new ArrayList<Sungjuk>(10);
		
		Loop : while(true) {
			System.out.println("1 : Input " + "\t" + "2 : Find " + "\t" + "3 : Delete" + "\t" + "4 : Print");
			int i = ic.nextInt();
			
			if(i == 1) {
				Sungjuk sj = new Sungjuk();
				System.out.print("Input Name : ");
				sj.setName(sc.nextLine());
				System.out.print("Input Kor : ");
				sj.setKor(ic.nextInt());
				System.out.print("Input Eng : ");
				sj.setEng(ic.nextInt());
				System.out.print("Input Mat : ");
				sj.setMat(ic.nextInt());
				sj.setSum(sj.getKor()+sj.getEng()+sj.getMat());
				sj.setAvg(sj.getSum() / 3.f);
				
				su.add(sj);
				System.out.printf("\n\n");
				continue;
				
			}else if(i == 2) {
				System.out.println("Input Name you want to find : ");
				String name = sc.nextLine();
				
				for(int j = 0 ; j < su.size() ; j++) {
					if(su.get(j).getName().equals(name)) {
						System.out.printf("%6s%3s\n %6s%3d\n %6s%3d\n %6s%3d\n %6s%3d\n %6s%3f \n\n"
														 ,"Name : ",su.get(j).getName()
														 ,"Kor : ", su.get(j).getKor()
														 ,"Eng : ", su.get(j).getEng()
														 ,"Math : ", su.get(j).getMat()
														 ,"Total : ", su.get(j).getSum()
														 ,"Average : ", su.get(j).getAvg());
					}
				}
				System.out.println("No data match with name inputed");
				System.out.println();
				continue;
				
			}else if(i == 3) {
				System.out.println("Input Name you want to delete : ");
				String name = sc.nextLine();
				if(su.size() == 0) {
					System.out.println("Data is empty");
					continue;
				}else {
					for(int j = 0 ; j < su.size() ; j++) {
						if(su.get(j).getName().equals(name)) {
							su.remove(j);
							System.out.println("Complete");
							System.out.println();
						}
					}
				continue;
				}
			}else if(i == 4) {
				if(su.size() == 0) {
					System.out.println("Data is empty");
					continue;
				}else {
					for(int j = 0 ; j < su.size() ; j++) {
						System.out.printf("%6s%3s %6s%3d %6s%3d %6s%3d %6s%3d %6s%3f \n"
									  ,"Name : ", su.get(j).getName()
									  ,"Korean : ", su.get(j).getKor()
									  ,"English : ", su.get(j).getEng()
									  ,"Math : " , su.get(j).getMat()
									  ,"Total : ", su.get(j).getSum()
									  ,"Average : " , su.get(j).getAvg()
									  );
					}
				}
				System.out.println();
				
			}else if(i != 1 || i != 2 || i != 3 || i != 4){
				if(i== 99999) {
					break Loop;
				}
			}

		}
		
		
		
		
	}

}

class Sungjuk {
	String name;
	int kor,eng,mat;
	int sum; float avg;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	
	
}



