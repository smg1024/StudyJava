package ch08.quiz;

abstract class Study{
	public abstract void printMsg();
}

class Study_Sub extends Study{

	@Override
	public void printMsg() {
		System.out.println("Java는 참 재밌습니다.");		
	}
	
}

public class Quiz19 {

	public static void main(String[] args) {
		Study s=new Study_Sub();
		s.printMsg();
	}

}
