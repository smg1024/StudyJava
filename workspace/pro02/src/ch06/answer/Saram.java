package ch06.answer;

// 접근 제한자 : public, private, protected(상속)
// 클래스 3대 속성 : 은닉화, 다형성, 상속성

public class Saram {
	private String name;
	private String address;
	private String phoneNumber;
	private String juminBunho;      //클래스 밖의 외부에서 접근 불가능
	                                         // 외부에서 접근은 함수로만 가능하다.
	public Saram(String name, String address, String phoneNumber, String juminBunho) {
		this.name=name;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.juminBunho=juminBunho;
	}
	
	public void disp() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(phoneNumber);
		System.out.println(juminBunho);
	}
	
	// 1시 10분
	
}
















