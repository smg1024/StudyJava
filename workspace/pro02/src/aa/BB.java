package aa;

public class BB {

	public static void main(String[] args) {
		AA aa=new AA();
		System.out.println(aa.z);
		System.out.println(aa.y);	// 동일 패키지 안에서는 상속 없이 사용할 수 있다
	}

}
