import java.util.Scanner;

 

public class Division2 {

   

  private static int N;

  private static int cnt = 0;

  static int[] array = new int[100];

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();

    division(N, 0, 0);

    System.out.println(cnt);

  }




  private static void division(int n, int sum, int index) {

    for(int x=n; x>0; x--){

      if(index==0){ // ó�� ���� ����

        array[index] = x-1;

        division(n-(x-1), x-1, index+1);

      }

      else{ // �� ��

        array[index] = x;

        if(x<=array[index-1]) // ���� ���ڰ� ���� ���ں��� �۰ų� ���� ��츸

          division(n-x, sum+x, index+1);  

      }

    }   

    if(N == sum){

      print(index);

      System.out.println();

    }

  }

 

  private static void print(int index) {

    cnt++;

    for(int i=0; i<index; i++){

      System.out.print(array[i]);

      if(i!=index-1){

        System.out.print("+");

      }

    }

  }

}

