import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		song song; //song ����
		
		String a,b,c,d; // �Է¹��� �� ������ ���� ����
		int e,f;
		
		System.out.print("�뷡 ���� : "); a = sc.nextLine(); 
		System.out.print("��Ƽ��Ʈ : " ); b = sc.nextLine();
		System.out.print("�ٹ� : " ); c = sc.nextLine();
		System.out.print("�۰ : " ); d = sc.nextLine();
		System.out.print("��ǥ�⵵ : " ); e = sc.nextInt();
		System.out.print("Ʈ��No. : " ); f = sc.nextInt();
		
		song = new song(a,b,c,d,e,f); // ��ü ����
		song.show(); // show�޼ҵ� ȣ��
	}

}

class song{
	String title, artist,album,composer;
	int year, track;
	
	public song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	void show() {
		System.out.println("----------------------");
		System.out.println("�뷡 ���� : " + title);
		System.out.println("��Ƽ��Ʈ : " + artist);
		System.out.println("�ٹ� : " + album);
		System.out.println("�۰ : " + composer);
		System.out.println("��ǥ�⵵ : " + year);
		System.out.println("Ʈ��No. : " + track);
		System.out.println("----------------------");
		
	}
	
	
	
}