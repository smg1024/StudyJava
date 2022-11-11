package ch07.quiz;

class Song{
	private String name;
	public Song(String name) {
		this.name=name;
	}
	
	public String getTitle() {
		return this.name;
	}
}

public class Quiz22 {

	public static void main(String[] args) {
		Song mySong=new Song("Let it go");
		Song yourSong=new Song("강남스타일");
		System.out.println("내 노래는 " + mySong.getTitle());
		System.out.println("네 노래는 " + yourSong.getTitle());
	}

}
