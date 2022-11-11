package ch07.quiz;
class Test1{
	public String str;
	public static void change(String str) {
		System.out.println("str: " + str);
	}
}
public class Quiz18 {

	public static void main(String[] args) {
		String msg="안녕하세요";
		Test1.change(msg);
		

	}

}
