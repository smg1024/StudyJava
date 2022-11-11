package ch06.object;

public class Pay {
	private String name;
	private int salary;
	
	private int tax;
	private int netSalary;
	
//	public void input(String n, int s) {
//		name=n;
//		salary=s;
//	}
	public Pay(String name, int salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public void NetSalary() {
		tax=(int) (salary*0.045 + 0.5);
		netSalary=salary-tax;
	}
	
	public void disp() {
		System.out.println(name + "\t" + salary + "\t" + tax + "\t" + netSalary);
		System.out.println();
	}

}
