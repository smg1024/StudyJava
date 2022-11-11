package ch05.object;

// 접근 제한자 : public, private, protected(상속)
// class의 3대 속성 : 은닉화, 다형성, 상속

public class Exam36 {

	public static void main(String[] args) {
		Person kim=new Person();
		
//		kim.name="홍길동";
//		kim.address="서울시 강남구 청담동";
//		kim.phoneNumber="010-9701-5637";
//		kim.id="981024-1111111";
		kim.input("홍길동", "서울시 강남구 청담동", "010-9701-5637", "981024-1111111");
		kim.disp();
		
		
	}

}
