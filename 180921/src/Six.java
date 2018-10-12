import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		song song; //song 선언
		
		String a,b,c,d; // 입력받을 값 저장할 변수 생성
		int e,f;
		
		System.out.print("노래 제목 : "); a = sc.nextLine(); 
		System.out.print("아티스트 : " ); b = sc.nextLine();
		System.out.print("앨범 : " ); c = sc.nextLine();
		System.out.print("작곡가 : " ); d = sc.nextLine();
		System.out.print("발표년도 : " ); e = sc.nextInt();
		System.out.print("트랙No. : " ); f = sc.nextInt();
		
		song = new song(a,b,c,d,e,f); // 객체 생성
		song.show(); // show메소드 호출
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
		System.out.println("노래 제목 : " + title);
		System.out.println("아티스트 : " + artist);
		System.out.println("앨범 : " + album);
		System.out.println("작곡가 : " + composer);
		System.out.println("발표년도 : " + year);
		System.out.println("트랙No. : " + track);
		System.out.println("----------------------");
		
	}
	
	
	
}