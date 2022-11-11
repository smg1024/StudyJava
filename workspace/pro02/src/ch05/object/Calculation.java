package ch05.object;

public class Calculation {
	public int su1;
	public int su2;
	public int sumResult;
	public int subResult;
	public int multResult;
	public float divResult;
	
	public void sum() {
		sumResult=su1+su2;
	}
	public void sub() {
		subResult=su1-su2;
	}
	public void mult() {
		multResult=su1*su2;
	}
	public void div() {
		divResult=(float) su1/su2;
	}
	public void disp() {
		System.out.println(sumResult);
		System.out.println(subResult);
		System.out.println(multResult);
		System.out.println(divResult + "\n");
		
	}
}