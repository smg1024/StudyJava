package ch05.object;


public class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String id;	// 클래스 밖 외부에서 접근하지 못하게 설정
	
	public void input(String Name, String Address, String PhoneNumber, String Id) {
		name=Name;
		address=Address;
		phoneNumber=PhoneNumber;
		id=Id;
	}
	
	public void disp() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(phoneNumber);
		System.out.println(id);
	}
}
