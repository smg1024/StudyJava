package ch07.answer;

/**
 * @Data : 2022. 9. 27
 * @Author : 강사
 * @Description : 상속 - 함수재정의(Overriding)
 */

class CParents{
	public void aa(){ }
	public void bb(){ }
	public void cc(){ }
	public void dd(){ }
	
	public void disp(){						// 함수재정의(Overriding), 함수중복(Overloading, Overload)
		System.out.println("ParentsE class");
	}
}

class CSon extends CParents{
	public void disp(){
		System.out.println("SonE class");
	}
}
 
public class Exam45 {
	public static void main(String[] args) {
		CParents a=new CParents();
		a.disp();
		
		CSon b=new CSon();
		b.disp();
		
		CParents c=new CSon();		
		c.disp();
	}
}
