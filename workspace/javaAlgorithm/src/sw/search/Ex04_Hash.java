package sw.search;

public class Ex04_Hash {

	public static void main(String[] args) {
		System.out.println(new Person().toString());
		String name = "홍길동";
		String name2 = "홍길동";
		System.out.println(name.hashCode());
		System.out.println(name2.hashCode());
		
		Integer age = 30;
		Integer age2 = 30;
		System.out.println(age.hashCode());
		System.out.println(age2.hashCode());
	}

}

class Person{
	
}