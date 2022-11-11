package ch05.object;

public class Exam38 {

	public static void main(String[] args) {
		
		Pay a=new Pay();
		a.input("왕눈이", 40000000);
		a.NetSalary();
		a.disp();
		
		Pay b=new Pay();
		b.input("아로미", 35000000);
		b.NetSalary();
		b.disp();
	}

}
