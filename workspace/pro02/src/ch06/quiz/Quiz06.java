package ch06.quiz;

class Member{
	private String name;
	private String id;
	private String password;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean login(String id, String password) {
		if(id=="hong" && password=="1234") {
			return true;
		}
		return false;
	}
	
	public void logout(String id) {
		System.out.println("hong 로그아웃되었습니다.");
	}
}


public class Quiz06 {

	public static void main(String[] args) {
		
		Member m=new Member();
		
		boolean check=m.login("hong", "1234");
		if(check==true) {
			m.logout("hong");
		}
		
	}

}
