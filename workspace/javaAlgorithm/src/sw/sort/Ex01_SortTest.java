package sw.sort;

public class Ex01_SortTest {
	private String alumni;
	private String name;
	private int score;
	
	public Ex01_SortTest(String alumni, String name, int score) {
		super();
		this.alumni = alumni;
		this.name = name;
		this.score = score;
	}

	public String getAlumni() {
		return this.alumni;
	}
	
	public void setAlumni(String alumni) {
		this.alumni = alumni;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
}
